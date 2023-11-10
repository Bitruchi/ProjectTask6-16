package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static void openBrowserLaunchApp(){
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch(ConfigReader.getPropertyValue("browser")){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        initializePageObjects();
    }
    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait;
    }
    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static void waitForClickability(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }


    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static byte[] screenshot(String fileName){
        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        byte[] picByte = takeScreenshot.getScreenshotAs(OutputType.BYTES);
        File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(source, new File(Constants.SCREENSHOT_FILEPATH + fileName + " " + getTimeStamp("yyyy-MM-dd-HH-mm") + ".png"));
        } catch (FileNotFoundException e){
            e.fillInStackTrace();
            e.getStackTrace();
        } catch (IOException e){
            e.fillInStackTrace();
            e.getStackTrace();
        }
        return picByte;
    }

}
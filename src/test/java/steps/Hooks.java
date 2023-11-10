package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){openBrowserLaunchApp();}

    @After
    public void end(Scenario scenario){
        byte[] pic;

        if(scenario.isFailed()) {
            pic = screenshot("failed/"+scenario.getName());
        }else{
            pic = screenshot("passed/"+scenario.getName());
        }
        scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }

}

package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualificationPage extends CommonMethods {

    @FindBy(xpath ="//input[@id='addWorkExperience']")
    public WebElement addWorkExperienceButton;

    @FindBy(id="experience_employer")
    public WebElement companyTextField;

    @FindBy(id="experience_jobtitle")
    public WebElement jobTitleTextField;

    @FindBy(id="experience_from_date")
    public WebElement fromLocator;

    @FindBy(id="experience_to_date")
    public WebElement toLocator;

    @FindBy(id="experience_comments")
    public WebElement commentTextField;

    @FindBy(id="btnWorkExpSave")
    public WebElement saveButtonWorkExperience;

    @FindBy(id="delWorkExperience")
    public WebElement delWorkExperienceLocator;
    //(Tester to add more locators as needed)/
    @FindBy(id="addLanguage")
    public WebElement addLanguageButton;

    @FindBy(id="language_code")
    public WebElement languageDropDown;

    @FindBy(xpath="//span[@for='language_code']")
    public WebElement requiredLanguageError;

    @FindBy(id="language_lang_type")
    public WebElement fluencyDropDown;

    @FindBy(xpath="//span[@for='language_lang_type']")
    public WebElement requiredFluencyError;

    @FindBy(id="language_competency")
    public WebElement competencyDropDown;

    @FindBy(xpath="//span[@for='language_competency']")
    public WebElement requiredCompetencyError;

    @FindBy(id="language_comments")
    public WebElement commentsTextFieldLanguage;

    @FindBy(id="btnLanguageSave")
    public WebElement saveButtonLanguage;

    @FindBy(id="delLanguage")
    public WebElement deleteLanguageLocator;

    public QualificationPage(){
        PageFactory.initElements(driver, this);
    }
}

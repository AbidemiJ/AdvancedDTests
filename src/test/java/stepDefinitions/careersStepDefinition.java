package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;


public class careersStepDefinition {
    public static WebDriver driver;

    public careersStepDefinition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Given("I navigate to the ReteIcons Website")
    public void i_navigate_to_the_rete_icons_website() {
        driver.get("https://dev2.reteicons.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]/div/div/div[2]/button[1]")).click();
    }

    @And("I click on the resources hyperlink on the header")
    public void iClickOnTheResourcesHyperlinkOnTheHeader() {
        driver.findElement(By.xpath("//*[@id=\"menu-item-1702\"]/div/a")).click();
    }

    @And("I click on careers from the resources drop down menu")
    public void iClickOnCareersFromTheResourcesDropDownMenu() {
        driver.findElement(By.xpath("//*[@id=\"menu-item-1704\"]/a")).click();
    }

    @And("I am redirected to another page with a form")
    public void iAmRedirectedToAnotherPageWithAForm() {
        driver.findElement(By.xpath("//*[@id=\"post-2304\"]/div/div/div[1]/div/div/div/h4")).isDisplayed();
    }

    @And("I fill the first name field")
    public void iFillTheFirstNameField() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-name-1_65620062cf0f7\"]")).sendKeys("Abidemi");
    }

    @And("I fill the last name field")
    public void iFillTheLastNameField() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-name-2_65620062cf0f7\"]")).sendKeys("Adelakun");
    }

    @And("I enter email address")
    public void iEnterEmailAddress() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-email-1_65620062cf0f7\"]")).sendKeys("abidemi.josiah@gmail.com");
    }

    @And("I enter phone number")
    public void iEnterPhoneNumber() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-phone-1_65620062cf0f7\"]")).sendKeys("07458909000");
    }

    @And("I upload my CV")
    public void iUploadMyCV() {
        // public void fileUploadTest() {
        // driver.get("https://the-internet.herokuapp.com/upload");
        // driver.findElement(By.xpath("//*[@id=\"upload-1\"]/div/div/div")).click();
        //   File uploadFile = new File("Abidemi Sample QA CV.pdf");
        //  "C:\Users\User\OneDrive\Documents\4808094_Agile_Scrum_Foundation_4306130-1 ABIDEMI ADELAKUN.pdf"
    }

    @And("I see a text under the CV upload bar that says that We accept MS Word PDF & Rich Text Format")
    public void iSeeATextUnderTheCVUploadBarThatSaysThatWeAcceptMSWordPDFRichTextFormat() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-upload-1_6562395c7d2fe-description\"]")).isDisplayed();
    }

    @And("I fill the role field")
    public void iFillTheRoleField() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-text-1_6562395c7d2fe\"]")).sendKeys("Quality Assurance Analyst");
    }

    @And("I fill the LinkedIn url field")
    public void iFillTheLinkedInUrlField() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-url-1_6562395c7d2fe\"]")).sendKeys("https://www.linkedin.com/inxyz");
    }

    @And("I type a message in the cover letter field")
    public void iTypeAMessageInTheCoverLetterField() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-textarea-1_6562395c7d2fe\"]")).sendKeys("I am the best for the role");
    }

    @And("I tick the privacy policy check box")
    public void iTickThePrivacyPolicyCheckBox() {
        driver.findElement(By.xpath("//*[@id=\"forminator-field-checkbox-1-1-6562395c7d2fe-label\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"forminator-field-checkbox-1-1-6562395c7d2fe-label\"]/span[1]")).click();
    }

    @When("I click on the submit button")
    public void iClickOnTheSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"forminator-module-2328\"]/div[17]/div/div/button")).click();
    }

    @Then("the form is successfully submitted and cv uploaded successfully message is displayed")
    public void theFormIsSuccessfullySubmittedAndCvUploadedSuccessfullyMessageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"forminator-module-2328\"]/div[1]/p")).isDisplayed();

    }





}



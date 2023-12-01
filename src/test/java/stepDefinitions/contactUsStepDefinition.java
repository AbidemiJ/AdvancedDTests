package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import java.util.Collection;

import static org.junit.Assert.assertThat;
import static org.openqa.selenium.By.className;

public class contactUsStepDefinition {
    public static WebDriver driver;

    public contactUsStepDefinition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }
        @Given("I navigate to the ReteIcons website")
        public void i_navigate_to_the_rete_icons_website() {
            driver.get("https://dev2.reteicons.com/");
            driver.manage().window().maximize();
        //    driver.findElement(By.xpath("*[@id=\"cmplz-manage-consent\"]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]/div/div/div[2]/button[1]")).click();
        //    driver.manage().timeouts().wait(Long.parseLong("5, timeUnits.SECONDS"));

            //*[@id="cmplz-manage-consent"]/button
           // driver.findElement(By.className("cmplz-btn cmplz-accept")).click();
            // cmplz-btn cmplz-accept
            //driver.findElement(By.xpath("//*[@id="cmplz-cookiebanner-container"]/div/div[6]/button[1]")).click();
        }

        @And("I scroll to the footer of the website")
        public void iScrollToTheFooterOfTheWebsite() {
          //  String script = "window.scrollTo(0, 4500);";
         //   ((JavascriptExecutor) driver).executeScript(script);
          //   driver.findElement(By.id("cmplz-btn cmplz-accept")).click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/div/div[4]/div/div/ul/li[1]/a")));

            // driver.findElement(By.xpath("//*[@id=\"cmplz-cookiebanner-container\"]/div/div[6]/button[1]")).click();
        }

        @When("I click on the Contact Us icon")
        public void iClickOnTheContactUsIcon() {
              driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/div/div[4]/div/div/ul/li[1]/a/span")).click();
           // WebElement contactUsIcon = driver.findElement(className("elementor-icon-list-text")); contactUsIcon.click();// Replace with the actual element locator
           // driver.findElement(By.xpath("elementor-icon-list-text")).sendKeys();
        }

        @Then("I should be redirected to the Contact Us page")
        public void iShouldBeRedirectedToTheContactUsPage() {
           // driver.get("https://dev2.reteicons.com/contact-us");
            driver.findElement(By.xpath("//*[@id=\"wpforms-form-6\"]/div[1]/div[1]")).isDisplayed();
           // WebElement contactUsIcon = driver.findElement(className("elementor-icon-list-text")); contactUsIcon.isDisplayed();
          //  Assert.assertEquals("https://dev2.reteicons.com/contact-us", driver.getCurrentUrl());
           // assertThat(driver.getCurrentUrl()).contains("contact-us");
        }

    @Given("I am a user on the contact us page of the ReteIcons website")
    public void iAmAUserOnTheContactUsPageOfTheReteIconsWebsite() {
        driver.get("https://dev2.reteicons.com/");
        driver.manage().window().maximize();
    }

    @When("I fill out all the mandatory fields \\(title, name, email address, phone number and message)")
    public void iFillOutAllTheMandatoryFieldsTitleNameEmailAddressPhoneNumberAndMessage() {
        driver.findElement(By.xpath("//*[@id=\"wpforms-6-field_4\"]")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"wpforms-6-field_8\"]")).sendKeys("Abidemi Adelakun");
        driver.findElement(By.xpath("//*[@id=\"wpforms-6-field_9\"]")).sendKeys("abidemi.josiah@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"wpforms-6-field_20\"]")).sendKeys("08106662500");
        driver.findElement(By.xpath("//*[@id=\"wpforms-6-field_11\"]")).sendKeys("Hi there, please tell me more about your QA training");
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/div/div[4]/div/div/ul/li[1]/a/span")).click();
    }


    @Then("I should see a Message sent successfully displayed")
    public void iShouldSeeAMessageSentSuccessfullyDisplayed() {
        driver.findElement(By.xpath("")).isDisplayed();

    }
}



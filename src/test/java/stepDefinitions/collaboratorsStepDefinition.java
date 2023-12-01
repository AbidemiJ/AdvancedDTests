package stepDefinitions;

import io.cucumber.java.After;
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

import java.util.List;

import static org.openqa.selenium.By.className;
public class collaboratorsStepDefinition {

    public static WebDriver driver;

    public collaboratorsStepDefinition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Given("I am on the ReteIcons website")
    public void i_am_on_the_rete_icons_website() {
        driver.get("https://dev2.reteicons.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]/div/div/div[2]/button[1]")).click();
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("I scroll to the middle of the home page")
    public void iScrollToTheMiddleOfTheHomePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/section[3]/div[2]/div/div/section[3]/div/div/div/div[1]/div/h2")));

        // String script = "window.scrollTo(0, 2800);";
       // ((JavascriptExecutor) driver).executeScript(script);
    }

    @And("I view the collaborators section")
    public void iViewTheCollaboratorsSection() {
        driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/section[3]/div[2]/div/div/section[3]/div/div/div/div[1]/div/h2")).isDisplayed();
    }

    @Then("I should see the logo of all collaborators")
    public void iShouldSeeTheLogoOfAllCollaborators() {
        driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/div[1]/div/div[1]/div/div/div/div/a/div/div/img")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/div[1]/div/div[2]/div/div/div/div/a/div/div/img")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/div[1]/div/div[3]/div/div/div/div/a/div/div/img")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"post-1463\"]/div/div/div[1]/div/div[4]/div/div/div/div/a/div/div/img")).isDisplayed();
        //   List<WebElement> logos; // Replace with the appropriate CSS selector for logos
      //  logos = driver.findElements(By.cssSelector("hfe-site-logo-img elementor-animation-"));

      //  List<WebElement> logos; // Replace with the appropriate CSS selector for logos
     //   logos = driver.findElements(By.cssSelector("hfe-site-logo-img elementor-animation-"));

      //  logos = driver.findElements(By.cssSelector("hfe-site-logo-img elementor-animation-"));

      //  logos = driver.findElements(By.cssSelector("hfe-site-logo-img elementor-animation-"));

      //  for (WebElement logo : logos) {
            // You can add validation logic here to check if each logo is displayed or any other criteria
       //     if (logo.isDisplayed()) {
                // Logo is displayed
      //      } else {
                // Logo is not displayed
       //     }
      //  }
    }

    // Close the browser after the scenario is finished
  //  @After
 //   public void closeBrowser() {
  //      driver.quit();
 //   }
}
   // Make sure you replace "path/to/chromedriver.exe" with the actual path to your ChromeDriver executable, and "https://example.com" with the URL of the website you want to test. Also, replace ".logo-class" with the correct CSS selector that matches the logos on the website.

     //   This example uses the Chrome WebDriver for Selenium. You will need to download the ChromeDriver executable compatible with your Chrome browser version and specify its path in System.setProperty. Additionally, you'll need to include the necessary Selenium dependencies in your project's build configuration.

 //       Please note that this is a basic example, and you can add more validation logic as needed to check the logos' presence and other properties. You can also use other WebDriver implementations (e.g., Firefox WebDriver) based on your preferences.







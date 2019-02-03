package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class LoginStep {
    WebDriver driver = new ChromeDriver();
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

@Test
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        driver.get("https://news.ycombinator.com/news");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='login']")).click();
        Thread.sleep(1000);


        System.out.println(" Navigate Login Page ");

    }


    @And("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String username, String Password) throws Throwable {
        driver.findElement(By.name("acct")).click();
        driver.findElement(By.name("acct")).clear();
        driver.findElement(By.name("acct")).sendKeys("Neotest1");
        driver.findElement(By.name("pw")).click();
        driver.findElement(By.name("pw")).clear();
        driver.findElement(By.name("pw")).sendKeys("password");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[1]/following::input[2]")).click();
        driver.findElement(By.id("me")).click();
        System.out.println("This step enter the Username and Password on the Login page" + username + Password);

    }

    @And("^The I should be able to update my \"([^\"]*)\"$")
    public void theIShouldBeAbleToUpdateMy(String arg0) throws Throwable {
        driver.findElement(By.name("uemail")).click();
        driver.findElement(By.name("uemail")).clear();
        driver.findElement(By.name("uemail")).sendKeys("neo_1@hotmail.com");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(shared)'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("Hacker News")).click();
    }

    @Then("^I should then log out of my account$")
    public void iShouldThenLogOutOfMyAccount() {
        driver.findElement(By.id("logout")).click();

    }

    @When("^I can enter a new \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCanEnterANewAnd(String username, String Password) throws Throwable {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[2]/following::input[2]")).click();
        driver.findElement(By.name("acct")).click();
        driver.findElement(By.name("acct")).clear();
        driver.findElement(By.name("acct")).sendKeys("Neotest2");
        driver.findElement(By.name("pw")).click();
        driver.findElement(By.name("pw")).clear();
        driver.findElement(By.name("pw")).sendKeys("password");
        System.out.println("This step enter the Username and Password on the Login page" + username + Password);
    }

    @And("^clicks the create account button$")
    public void clicksTheCreateAccountButton() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[1]/following::input[2]")).click();
    }

    @Then("^a HackerNews account is created$")
    public void aHackerNewsAccountIsCreated() {
        driver.findElement(By.linkText("Hacker News")).click();

    }

    @And("^account name is set as Neotest(\\d+)$")
    public void accountNameIsSetAsNeotest(int arg0) {
        driver.findElement(By.id("logout")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }

    @Then("^should be able to update the about section$")
    public void shouldBeAbleToUpdateTheAboutSection() {
        driver.findElement(By.name("about")).click();
        driver.findElement(By.name("about")).clear();
        driver.findElement(By.name("about")).sendKeys("@Given(\"^that i am on the shopping website$\")\npublic void that_i_am_on_the_shopping_website() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();\n}\n\n@When(\"^i add an item to the basket$\")\npublic void i_add_an_item_to_the_basket() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();\n}\n\n@Then(\"^i can view the item in my basket$\")\npublic void i_can_view_the_item_in_my_basket() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();");
    }

    @And("^select from the drop list of showdead and noprocrast list$")
    public void selectFromTheDropListOfShowdeadAndNoprocrastList() {
        driver.findElement(By.name("showd")).click();
        new Select(driver.findElement(By.name("showd"))).selectByVisibleText("yes");
        driver.findElement(By.name("showd")).click();
        driver.findElement(By.name("nopro")).click();
        new Select(driver.findElement(By.name("nopro"))).selectByVisibleText("yes");
        driver.findElement(By.name("nopro")).click();
    }

    @And("^able to select my maxvisit$")
    public void ableToSelectMyMaxvisit() {
        driver.findElement(By.name("maxv")).clear();
        driver.findElement(By.name("maxv")).sendKeys("400");
    }

    @And("^change my minaway$")
    public void changeMyMinaway() {
        driver.findElement(By.name("mina")).click();
        driver.findElement(By.name("mina")).clear();
        driver.findElement(By.name("mina")).sendKeys("200");
    }

    @Then("^select my delay$")
    public void selectMyDelay() {
        driver.findElement(By.name("delay")).clear();
        driver.findElement(By.name("delay")).sendKeys("2");
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }

    }
}


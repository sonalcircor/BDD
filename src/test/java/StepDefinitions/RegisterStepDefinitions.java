package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinitions {
WebDriver driver;
    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");

    }
    @Then("^User click on register Link$")
    public void user_click_on_register_Link()  {
        driver.findElement(By.className("ico-register")).click();
    }
    @Then("^User on register page and  verify register page title$")
    public void user_on_register_page_and_verify_register_page_title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }
    @Then("^Select Gender$")
    public void select_Gender() {
        driver.findElement(By.id("gender-female"));
    }
    @Then("^Enter First name and Last name$")
    public void enter_First_name_and_Last_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Ketan");
        driver.findElement(By.id("LastName")).sendKeys("Patel");}
    @Then("^Enter Date of Birth$")
    public void enter_Date_of_Birth() {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("25");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2008");

    }
    @Then("^Email id$")
    public void email_id()  {
        driver.findElement(By.id("Email")).sendKeys("xyz@hotmail.com");

    }
    @Then("^Company Name$")
    public void company_Name()  {
        driver.findElement(By.id("Company")).sendKeys("Unify Testing");

    }

    @Then("^select mark on Newsletter$")
    public void select_mark_on_Newsletter()  {
        driver.findElement(By.id("Newsletter")).click();

    }

    @Then("^Enter Password$")
    public void enter_Password() {
        driver.findElement(By.id("Password")).sendKeys("xyz12345678910");

    }

    @Then("^Confirm Password$")
    public void confirm_Password()  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz12345678910");

    }

    @Then("^Click on Register button$")
    public void click_on_Register_button()  {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^User able to register successfuly$")
    public void user_able_to_register_successfuly() {

    }

    @Then("^User close the browser$")
    public void user_close_the_browser()  {
      driver.close();

    }


}
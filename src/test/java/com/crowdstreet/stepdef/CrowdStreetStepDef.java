package com.crowdstreet.stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.base.Crowd_Street_POM;
import com.util.TextReader;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrowdStreetStepDef {
	
	WebDriver driver;
	Crowd_Street_POM csp;
	WebDriverWait wait;
	SoftAssert soft;
	
	@Given("User able to open browser")
	public void user_able_to_open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		soft = new SoftAssert();
	}

	@Given("User able to go to URL")
	public void user_able_to_go_to_url() throws Throwable {
		driver.navigate().to(TextReader.readFile("URL"));

	}

	@When("User able to click Signin Button")
	public void user_able_to_click_signin_button() {
		csp = new Crowd_Street_POM(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(csp.getListElementWaiter_1().get(0)));
		csp.getClickSignin().click();
	}

	@When("User able to Enter UserName and Password")
	public void user_able_to_enter_user_name_and_password() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(csp.getEnterEmailAddress()));
		csp.getEnterEmailAddress().sendKeys(TextReader.readFile("SigninEmail"));
		csp.getEnterYourPassword().sendKeys(TextReader.readFile("SigninPass"));
	}

	@When("User able to Click Login Button")
	public void user_able_to_click_login_button() {
		csp.getClickLogin().click();
	}

	@Then("User able to Login successfully and Verify Login Success")
	public void user_able_to_login_successfully_and_verify_login_success() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(csp.getWebinarDisplay()));
		soft.assertTrue(csp.getSignOutButton().isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		soft.assertAll();

	}
}

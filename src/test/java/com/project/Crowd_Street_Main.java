package com.project;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Crowd_Street_POM;
import com.util.TextReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crowd_Street_Main {

	WebDriver driver;
	Crowd_Street_POM csp;

	public void goSignUp() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		csp = new Crowd_Street_POM(driver);
		driver.navigate().to(TextReader.readFile("URL"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(csp.getListElementWaiter_1().get(0)));

		csp.getClickCreateAccount().click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		csp.getEnterFirstName().sendKeys(TextReader.readFile("FirstName"));
		csp.getEnterLastName().sendKeys(TextReader.readFile("LastName"));
		csp.getEnterEmail().sendKeys(TextReader.readFile("Email"));
		csp.getEnterPassword().sendKeys(TextReader.readFile("Password"));
		csp.getConfirmPassword().sendKeys(TextReader.readFile("Password"));
		csp.getListInvestorOrNot_2().get(1).click();
		csp.getClickTerms().click();

//		((JavascriptExecutor)driver).executeScript("arguments[0].click", csp.getReCaptcha());

		csp.getSubmitButton().click();

		Thread.sleep(3000);
		driver.quit();

	}
}

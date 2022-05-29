package com.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crowd_Street_POM {

	public Crowd_Street_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='Open for investing'])[1]")
	private WebElement ElementWaiter;

	@FindBy(xpath = "//*[text()='Open for investing']")
	private List<WebElement> ListElementWaiter_1;

	@FindBy(xpath = "//a[@href='/invexp/accounts/create-account']")
	private WebElement ClickCreateAccount;

	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement EnterFirstName;

	@FindBy(xpath = "//*[@name='lastName']")
	private WebElement EnterLastName;

	@FindBy(xpath = "//*[@name='email']")
	private WebElement EnterEmail;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement EnterPassword;

	@FindBy(xpath = "//*[@name='confirmPassword']")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "(//*[@type='radio'])[2]")
	private WebElement InvestorOrNot;

	@FindBy(xpath = "//*[@type='radio']")
	private List<WebElement> ListInvestorOrNot_2;

	@FindBy(xpath = "//*[@name='hasAgreedTos']")
	private WebElement ClickTerms;

	@FindBy(xpath = "//*[text()='Create an account']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//*[@id='recaptcha-anchor']")
	private WebElement reCaptcha;

	@FindBy(xpath = "(//a[@href='/invexp/accounts/login/'])[1]")
	private WebElement clickSignin;

	@FindBy(xpath = "//a[@href='/invexp/accounts/login/']")
	private List<WebElement> ListClickSignin_1;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement EnterEmailAddress;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement EnterYourPassword;

	@FindBy(xpath = "//*[@id='btn_login']")
	private WebElement ClickLogin;

	@FindBy(xpath = "(//*[contains(text(),'Sign Out')])[1]")
	private WebElement SignOutButton;

	@FindBy(xpath = "//*[contains(text(),'Sign Out')]")
	private List<WebElement> ListSignOutButton_1;

	@FindBy(xpath = "//*[contains(text(),'Webinar!')]")
	private WebElement WebinarDisplay;

	public WebElement getReCaptcha() {
		return reCaptcha;
	}

	public WebElement getElementWaiter() {
		return ElementWaiter;
	}

	public List<WebElement> getListElementWaiter_1() {
		return ListElementWaiter_1;
	}

	public WebElement getClickCreateAccount() {
		return ClickCreateAccount;
	}

	public WebElement getEnterFirstName() {
		return EnterFirstName;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getInvestorOrNot() {
		return InvestorOrNot;
	}

	public List<WebElement> getListInvestorOrNot_2() {
		return ListInvestorOrNot_2;
	}

	public WebElement getClickTerms() {
		return ClickTerms;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getClickSignin() {
		return clickSignin;
	}

	public List<WebElement> getListClickSignin_1() {
		return ListClickSignin_1;
	}

	public WebElement getEnterEmailAddress() {
		return EnterEmailAddress;
	}

	public WebElement getEnterYourPassword() {
		return EnterYourPassword;
	}

	public WebElement getClickLogin() {
		return ClickLogin;
	}

	public WebElement getSignOutButton() {
		return SignOutButton;
	}

	public List<WebElement> getListSignOutButton_1() {
		return ListSignOutButton_1;
	}

	public WebElement getWebinarDisplay() {
		return WebinarDisplay;
	}

}

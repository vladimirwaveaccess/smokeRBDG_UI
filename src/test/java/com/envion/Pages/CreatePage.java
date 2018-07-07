package com.envion.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CreatePage extends BasePage{
	@FindBy(className="create_account_block")
	private WebElement linkCreateNewAccount;

	@FindBy(xpath="//div[@class='dialog modal in']//input[@id='access_key']")
	private WebElement accessKeyField;

	@FindBy(id="pl_next")
	private WebElement btnNext;

	@FindBy(id="pname")
	private WebElement firstNameField;

	@FindBy(id="plname")
	private WebElement lastNameField;

	@FindBy(id="email")
	private WebElement emailField;

	@FindBy(id="r_email")
	private WebElement confirmEmailField;

	@FindBy(id="password")
	private WebElement passwordField;

	@FindBy(id="r_password")
	private WebElement confirmpasswordField;

	@FindBy(id="pl_create_account")
	private WebElement btnCreateAccount;

	@FindBy(xpath="//div[@class='dialog modal in']//option[@value!='0']")
	private WebElement selectLibrary;

	@FindBy(id="pl_next")
	private WebElement webElement;



    protected void createNewUser(String name, String pass) {
        linkCreateNewAccount.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        accessKeyField.clear();
        accessKeyField.sendKeys("happy");
        btnNext.click();
        firstNameField.clear();
        firstNameField.sendKeys(name);
        lastNameField.clear();
        lastNameField.sendKeys(name);
        emailField.clear();
        emailField.sendKeys(name);
        confirmEmailField.clear();
        confirmEmailField.sendKeys(name);
        passwordField.clear();
        passwordField.sendKeys(pass);
        confirmpasswordField.clear();
        confirmpasswordField.sendKeys(pass);
        btnCreateAccount.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectLibrary.click();
        btnNext.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}

package com.envion.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
	@FindBy(xpath="//div[@class='login_block']//a[@href='#']")
	private WebElement linkLogin;

	@FindBy(id="username")
	private WebElement login;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="pl_login")
	private WebElement btnLogIn;


	public void login(String name, String pass){
	    linkLogin.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    login.clear();
        login.sendKeys(name);
        password.clear();
        password.sendKeys(pass);
        btnLogIn.click();
    }


}

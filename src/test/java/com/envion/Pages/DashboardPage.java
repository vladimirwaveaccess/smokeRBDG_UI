package com.envion.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DashboardPage extends BasePage {
	@FindBy(xpath="//div[@class='welcome']")
	private WebElement userEmail;

	@FindBy(id="profile")
	private WebElement userMenu;

	@FindBy(xpath="//div[@class='profile active']//a[@href='#']")
	private WebElement logOutUser;

	@FindBy(xpath="//div[@class='login_block']//a[@href='#']")
	private WebElement checkLogOut;

	@FindBy(xpath="//div[@class='service']//div[@class='service-inner']//a[@class='service_image comics']")
	private WebElement iconComicsPage;

	@FindBy(id="zinio_collection_title")
	private WebElement checkOpenComicsPage;

	@FindBy(xpath="//div[@class='magazine-card']//a[@title='110 Percent']")
	private WebElement checkoutComics;

	@FindBy(xpath="//h3[@class='magazine_name']")
	private WebElement checkCheckoutComic;

	@FindBy(xpath="//a[@class='my_collection_link']")
	private WebElement myCollectionLink;

	@FindBy(xpath="//a[@class='button']")
	private WebElement btnCheckout;

	@FindBy(xpath="//button[@class='close']")
	private WebElement btnCloseSuccess;


	@FindBy(xpath="//a[@title='Read May 19, 2017 issue of 110 Percent']")
	private WebElement findComicOnMyComicsCollectionPage;



	/**
	 * Verification of successful user authorization
	 * Method is returned the values of the "title" parameter that contains the user's login
	 */
	public String getUserEmail() {
	    return userEmail.getAttribute("title");
    }

	/**
	 * Verification of successful user logout
	 * Method is returned the text of the "Login" text link
	 */
    public String checkLogout() {
		return checkLogOut.getText();
	}

	/**
	 * Method for logout of a user account
	 */
	public void logoutUser() {
		userMenu.click();
		logOutUser.click();
	}

	/**
	 * Open Comics page from main page
	 */
	public void openComicsPage() {
		iconComicsPage.click();
	}

	/**
	 * Checking that Comics page open
	 */
	public String checkThatComicsPageOpen() {
		return checkOpenComicsPage.getText();
	}


	/**
	 * Do checkout comics
	 */
	public void getCheckoutComics() {
		checkoutComics.click();
	}

	/**
	 * Check that checkout did
	 */
	public String checkThatComicCheckout() {
		return checkCheckoutComic.getText();
	}


	/**
	 * Click on the "My Collection" text link
	 */
	public void clickMyCollectionLink() {
		myCollectionLink.click();
	}


	/**
	 * Click "Checkout" button on the checkout comic page
	 */
	public void clickButtonCheckout() {
		btnCheckout.click();
	}


	/**
	 * Method is returned title of comics which was checkouted
	 */
	public String checkingCheckoutComics() {
		return findComicOnMyComicsCollectionPage.getAttribute("title");
	}


	/**
	 * Method which closes the window about a successful check
	 */
	public void pushButtonCloseSuccessWindow() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnCloseSuccess.click();
	}
}

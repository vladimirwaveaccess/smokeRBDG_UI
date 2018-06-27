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

	@FindBy(xpath="//a[@class='service_image comics']")
	private WebElement iconComicsPage;

	@FindBy(id="zinio_collection_title")
	private WebElement titleOpenServiccessPage;

	/**
	 * Xpath to title of comic/magazine
	 */
	@FindBy(xpath="//h3[@class='magazine_name']")
	private WebElement titleOfElementAfterCheckout;

	@FindBy(xpath="//a[@class='my_collection_link']")
	private WebElement myCollectionLink;

	/**
	 * Xpath to 'Checkout' button
	 */
	@FindBy(xpath="//a[@class='button']")
	private WebElement btnCheckout;

	@FindBy(xpath="//div[@class='dialog modal in']//*[contains(text(),'Keep Browsing')]")
	private WebElement btnKeepBrowsing;

	/**
	 * Find "Magazine" icon on the main page
	 */
	@FindBy(xpath="//a[@class='service_image magazines']")
	private WebElement iconMagazinePage;

	/**
	 * Back to the main page from service page
	 */
	@FindBy(xpath="//div[@class='page_relation']//*[contains(text(),'RBdigital Gateway')]")
	private WebElement backToMainPageFromServicePage;

	/**
	 * Open checkout page for magazine
	 */
	@FindBy(xpath="//div[@class='magazines']//div[1]//a[1]")
	private WebElement getDataElementForCheckout;


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
	public String checkThatNecessaryServicesPageOpen() {
		return titleOpenServiccessPage.getText();
	}

	/**
	 * Do checkout comics
	 */
	public void getCheckoutSelectedElement() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDataElementForCheckout.click();
	}

	/**
	 * Check that checkout did
	 */
	public String getTitleOfElementAfterCheckout() {
		return titleOfElementAfterCheckout.getText();
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
	 * Method which closes the window about a successful check
	 */
	public void pushButtonKeepBrowsing() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnKeepBrowsing.click();
	}

	public void backToMainPage() {
		backToMainPageFromServicePage.click();
	}

	public void openMagazinesPage() {
		iconMagazinePage.click();
	}

	public String getTitleMainpage() {
		return driver.getTitle();
	}

	/**
	 * Method is returned title selected element before checkout
	 */
	public String getTitleSelectedElement() {
		return getDataElementForCheckout.getAttribute("title");
	}
}

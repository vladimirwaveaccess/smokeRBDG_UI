package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAuthorization extends BaseTest{
    protected static String titleOfElement;
    protected static String titleMainPage = "RBdigital Gateway";

    @Test(priority=1)
    public void testLogin() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getUserEmail().contains(validUser.getLogin()),true);
    }

    @Test(priority=2)
    public void testOpenComicsPage() {
        app.dashboard.openComics();
        Assert.assertEquals(app.dashboard.checkThatNecessaryServicesPageOpen(), "RBdigital Comics");
    }

    @Test(priority=3)
    public void testOpenCheckoutComicPage() {
        titleOfElement = app.dashboard.getTitleSelectedElement();
        app.dashboard.checkoutSelectedElement();
        Assert.assertEquals(app.dashboard.getTitleOfElementAfterCheckout(), titleOfElement);
    }

    @Test(priority=4)
    public void testDoCheckoutComics() {
        app.dashboard.pushCheckout();
    }

    @Test(priority=5)
    public void testStayInBrowserComics() {
        app.dashboard.closeSuccessWindowKeepBrowsing();
    }

    @Test(priority=6)
    public void testCheckMyComicsCollectionPage() {
        app.dashboard.openMyCollectionPage();
        Assert.assertEquals(app.dashboard.getTitleSelectedElement().contains(titleOfElement),true);
    }

    @Test(priority=7)
    public void testBackToMainPageFromComicServicePage() {
        app.dashboard.openMainServicePage();
        Assert.assertEquals(app.dashboard.getTitleMainpage(), titleMainPage);
    }

    @Test(priority=8)
    public void testOpenMagazinesPage() {
        app.dashboard.openMagazinesCheckoutPage();
        Assert.assertEquals(app.dashboard.checkThatNecessaryServicesPageOpen(), "RBdigital Magazines");
    }

    @Test(priority=9)
    public void testOpenCheckoutMagazinePage() {
        titleOfElement = app.dashboard.getTitleSelectedElement();
        app.dashboard.checkoutSelectedElement();
        Assert.assertEquals(app.dashboard.getTitleOfElementAfterCheckout(), titleOfElement);
    }

    @Test(priority=10)
    public void testDoCheckoutMagazine() {
        app.dashboard.pushCheckout();
    }

    @Test(priority = 11)
    public void testStayInBrowserMagazines() {
        app.dashboard.closeSuccessWindowKeepBrowsing();
    }

    @Test(priority = 12)
    public void testCheckMyMagazineCollectionPage() {
        app.dashboard.openMyCollectionPage();
        Assert.assertEquals(app.dashboard.getTitleSelectedElement().contains(titleOfElement),true);
    }

    @Test(priority = 13)
    public void testBackToMainPageFromMagazinesServicePage() {
        app.dashboard.openMainServicePage();
        Assert.assertEquals(app.dashboard.getTitleMainpage(), titleMainPage);
    }

    @Test(priority=14)
    public void testLogOut() {
        app.dashboard.logout();
        Assert.assertEquals(app.dashboard.checkLogout(), "Login");
    }
}

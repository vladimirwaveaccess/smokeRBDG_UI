package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAuthorization extends BaseTest{
    protected static String titleOfElement;
    protected static String titleMainPage = "RBdigital Gateway";

    @Test(priority = 1)
    public void testCreateNewUser() {
        app.create.createUser(randomUser);
        Assert.assertEquals(app.dashboard.getUserEmail().contains(randomUser.getLogin()),true);
    }

    @Test(priority = 2)
    public void testLogoutAfterCreate() {
        app.dashboard.logout();
        Assert.assertEquals(app.dashboard.checkLogout(), "Login");
    }


    @Test(priority = 3)
    public void testLogin() {
        app.login.login(randomUser);
        Assert.assertEquals(app.dashboard.getUserEmail().contains(randomUser.getLogin()),true);
    }

    @Test(priority = 4)
    public void testOpenComicsPage() {
        app.dashboard.openComics();
        Assert.assertEquals(app.dashboard.checkThatNecessaryServicesPageOpen(), "RBdigital Comics");
    }

    @Test(priority = 5)
    public void testOpenCheckoutComicPage() {
        titleOfElement = app.dashboard.getTitleSelectedElement();
        app.dashboard.checkoutSelectedElement();
        Assert.assertEquals(app.dashboard.getTitleOfElementAfterCheckout(), titleOfElement);
    }

    @Test(priority = 6)
    public void testDoCheckoutComics() {
        app.dashboard.pushCheckout();
    }

    @Test(priority = 7)
    public void testStayInBrowserComics() {
        app.dashboard.closeSuccessWindowKeepBrowsing();
    }

    @Test(priority = 8)
    public void testCheckMyComicsCollectionPage() {
        app.dashboard.openMyCollectionPage();
        Assert.assertEquals(app.dashboard.getTitleSelectedElement().contains(titleOfElement),true);
    }

    @Test(priority = 9)
    public void testDeleteComicsFromMyCollection() {
        app.dashboard.deleteCheckoutComics();
        Assert.assertEquals(app.dashboard.getTitleEmptyCollection(),"no data");
    }


    @Test(priority = 10)
    public void testBackToMainPageFromComicServicePage() {
        app.dashboard.openMainServicePage();
        Assert.assertEquals(app.dashboard.getTitleMainpage(), titleMainPage);
    }

    @Test(priority = 11)
    public void testOpenMagazinesPage() {
        app.dashboard.openMagazinesCheckoutPage();
        Assert.assertEquals(app.dashboard.checkThatNecessaryServicesPageOpen(), "RBdigital Magazines");
    }

    @Test(priority = 12)
    public void testOpenCheckoutMagazinePage() {
        titleOfElement = app.dashboard.getTitleSelectedElement();
        app.dashboard.checkoutSelectedElement();
        Assert.assertEquals(app.dashboard.getTitleOfElementAfterCheckout(), titleOfElement);
    }

    @Test(priority = 13)
    public void testDoCheckoutMagazine() {
        app.dashboard.pushCheckout();
    }

    @Test(priority = 14)
    public void testStayInBrowserMagazines() {
        app.dashboard.closeSuccessWindowKeepBrowsing();
    }

    @Test(priority = 15)
    public void testCheckMyMagazineCollectionPage() {
        app.dashboard.openMyCollectionPage();
        Assert.assertEquals(app.dashboard.getTitleSelectedElement().contains(titleOfElement),true);
    }

    @Test(priority = 16)
    public void testDeleteMagazineFromMyCollection() {
        app.dashboard.deleteCheckoutMagazines();
        Assert.assertEquals(app.dashboard.getTitleEmptyCollection(), "no data");
    }


    @Test(priority = 17)
    public void testBackToMainPageFromMagazinesServicePage() {
        app.dashboard.openMainServicePage();
        Assert.assertEquals(app.dashboard.getTitleMainpage(), titleMainPage);
    }

    @Test(priority = 18)
    public void testOpenMyPreferencesPage() {
        app.dashboard.openMyPreferencesPage();
        Assert.assertEquals(app.dashboard.getNamePageMyPreferences().contains("My Preferences"), true);
    }

    @Test(priority = 19)
    public void testOpenMyAccountPage() {
        app.dashboard.openMyAccountPage();
        Assert.assertEquals(app.dashboard.getNamePageMyPreferences().contains("My Account"), true);
    }


    @Test(priority = 20)
    public void testLogOut() {
        app.dashboard.logout();
        Assert.assertEquals(app.dashboard.checkLogout(), "Login");
    }
}

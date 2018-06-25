package com.envion.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAuthorization extends BaseTest{
    @Test(priority=1)
    public void testLogin() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getUserEmail().contains(validUser.getLogin()),true);
    }

    @Test(priority=2)
    public void testOpenComicsPage() {
        app.dashboard.openComics();
        Assert.assertEquals(app.dashboard.checkThatComicsPageOpen(), "RBdigital Comics");
    }

    @Test(priority=3)
    public void testOpenCheckoutComicPage() {
        app.dashboard.checkoutComics();
        Assert.assertEquals(app.dashboard.checkThatComicCheckout(), "110 Percent");
    }

    @Test(priority=4)
    public void testDoCheckoutComics() {
        app.dashboard.pushCheckout();
    }

    @Test(priority=5)
    public void testStayInBrowser() {
        app.dashboard.closeSuccessWindow();
    }
    
    @Test(priority=6)
    public void testCheckMyComicsCollectionPage() {
        app.dashboard.openMyCollectionPage();
        Assert.assertEquals(app.dashboard.checkingCheckoutComics(), "Read May 19, 2017 issue of 110 Percent");
    }

    @Test(priority=7)
    public void testLogOut() {
        app.dashboard.logout();
        Assert.assertEquals(app.dashboard.checkLogout(), "Login");
    }
}

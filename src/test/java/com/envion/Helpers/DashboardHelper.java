package com.envion.Helpers;

import com.envion.Pages.DashboardPage;

public class DashboardHelper extends DashboardPage {
    public void logout() {
        logoutUser();
    }

    public void openComics() {
        openComicsPage();
    }

    public void checkoutSelectedElement() {
        getCheckoutSelectedElement();
    }

    public void pushCheckout() {
        clickButtonCheckout();
    }

    public void closeSuccessWindowKeepBrowsing() {
        pushButtonKeepBrowsing();
    }

    public void openMyCollectionPage() {
        clickMyCollectionLink();
    }

    public void openMainServicePage() {
        backToMainPage();
    }

    public void openMagazinesCheckoutPage() {
        openMagazinesPage();
    }

    public void deleteCheckoutComics() {
        deleteIssue();
        driver.switchTo().alert().accept();
    }

    public void deleteCheckoutMagazines() {
        deleteIssue();
        driver.switchTo().alert().accept();
    }
}

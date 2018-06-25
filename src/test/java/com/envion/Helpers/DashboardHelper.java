package com.envion.Helpers;

import com.envion.Pages.DashboardPage;

public class DashboardHelper extends DashboardPage {
    public void logout() {
        logoutUser();
    }

    public void openComics() {
        openComicsPage();
    }

    public void checkoutComics() {
        getCheckoutComics();
    }

    public void pushCheckout() {
        clickButtonCheckout();
    }

    public void closeSuccessWindow() {
        pushButtonCloseSuccessWindow();
    }

    public void openMyCollectionPage() {
        clickMyCollectionLink();
    }
}

package com.envion.Helpers;

import com.envion.Pages.BasePage;

public class CommonHelper extends BasePage {
    public void closeApp() {
        driver.quit();
    }
}

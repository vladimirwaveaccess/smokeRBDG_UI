package com.envion.Tests;

import com.envion.App;
import com.envion.Utils.Factory;
import com.envion.Utils.Users.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = Factory.Users.getValidUser();
    static User randomUser = Factory.Users.getRandomUser();


    @AfterSuite
    public void tearDown() {
        app.common.closeApp();
    }
}

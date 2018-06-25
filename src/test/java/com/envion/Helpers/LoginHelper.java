package com.envion.Helpers;

import com.envion.Pages.LoginPage;
import com.envion.Utils.Users.User;


public class LoginHelper extends LoginPage {

    public void login(User user) {
        login(user.getLogin(),user.getPassword());
    }
}

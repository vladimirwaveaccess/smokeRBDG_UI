package com.envion.Utils;

import com.envion.Utils.Users.User;

import java.util.ResourceBundle;

public class Factory {
    public static class Users{
        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser() {
            return new User(resourceUser.getString("validUser.login"), resourceUser.getString("validUser.password"));
        }

        public static User getRandomUser() {
            return new User("qarbtest0306patron@gmail.com", "qwerty123456");
        }
    }
}

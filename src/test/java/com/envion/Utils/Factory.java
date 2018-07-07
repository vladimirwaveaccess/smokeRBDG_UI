package com.envion.Utils;

import com.envion.Utils.Users.User;

import java.util.Calendar;
import java.util.ResourceBundle;

public class Factory {
    public static class Users{
        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser() {
            return new User(resourceUser.getString("validUser.login"), resourceUser.getString("validUser.password"));
        }

        protected static String createLogin() {
            Calendar cal = Calendar.getInstance();
            String month = "", day = "", hour = "", min = "";
            String login;

            if (cal.get(cal.MONTH)<8)
                month = "0" + (cal.get(cal.MONTH)+1);
            else if (cal.get(cal.MONTH)>8)
                month = "" + cal.get(cal.MONTH)+1;

            if (cal.get(cal.DAY_OF_MONTH)<9)
                day = "0" + cal.get(cal.DAY_OF_MONTH);
            else if (cal.get(cal.DAY_OF_MONTH)>9)
                day = "" + cal.get(cal.DAY_OF_MONTH);

            if (cal.get(cal.HOUR_OF_DAY)<9)
                hour = "0" + cal.get(cal.HOUR_OF_DAY);
            else if (cal.get(cal.HOUR_OF_DAY)>9)
                hour = "" + cal.get(cal.HOUR_OF_DAY);

            if (cal.get(cal.MINUTE)<9)
                min = "0" + cal.get(cal.MINUTE);
            else if (cal.get(cal.MINUTE)>9)
                min = "" + cal.get(cal.MINUTE);

            return login = day + month + hour + min;
        }

        public static User getRandomUser() {
            return new User("qarbtest" + createLogin() + "patron@gmail.com", "password" + createLogin());
        }

    }
}

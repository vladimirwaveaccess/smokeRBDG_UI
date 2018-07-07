package com.envion.Helpers;

import com.envion.Pages.CreatePage;
import com.envion.Utils.Users.User;

public class CreateHelper extends CreatePage {
    public void createUser(User user) {
        createNewUser(user.getLogin(), user.getPassword());
    }
}

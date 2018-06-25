package com.envion;

import com.envion.Helpers.CommonHelper;
import com.envion.Helpers.DashboardHelper;
import com.envion.Helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public CommonHelper common;
    public DashboardHelper dashboard;

    public App() {
        this.login = new LoginHelper();
        this.common = new CommonHelper();
        this.dashboard = new DashboardHelper();
    }
}

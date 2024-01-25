import business.UserManager;
import core.Db;
import core.Helper;
import view.AdminView;
import view.LoginView;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class App  {
    public static void main(String[] args) {
        Helper.setTheme();
        LoginView loginview = new LoginView();

    }
}
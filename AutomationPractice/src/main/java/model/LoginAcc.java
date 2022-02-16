package model;

import Utils.ReadPropertyFile;

import java.util.HashMap;
import java.util.Map;

public enum LoginAcc {
    Email,
    Password;

    public static Map getCredentials() {
        Map<LoginAcc, String> login = new HashMap<>();
        login.put(Email, ReadPropertyFile.getValue("email"));
        login.put(Password, ReadPropertyFile.getValue("password"));
        return login;
    }
}

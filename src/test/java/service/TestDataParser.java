package service;

import java.util.ResourceBundle;

public class TestDataParser {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));
    public static String getTestData (String key){
        return resourceBundle.getString(key);
    }
}

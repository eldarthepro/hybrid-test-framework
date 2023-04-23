package service;
import model.User;

public class UserCreator {
    public static final String TESTDATA_USER_NAME = "testdata.user.name";
    public static final String TESTDATA_USER_PASSWORD = "testdata.user.password";
    public static User withCredentialsFromProperty(){
        return new User(TestDataParser.getTestData(TESTDATA_USER_NAME), TestDataParser.getTestData(TESTDATA_USER_PASSWORD));
    }
}

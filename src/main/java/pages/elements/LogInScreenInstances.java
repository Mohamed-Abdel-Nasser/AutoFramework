package pages.elements;

import engine.actions.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.openApplication;

public class LogInScreenInstances extends openApplication {

    private static LogInScreenInstances logInScreen;
//    private WebDriver driver;

    private By userName_field = By.name("username");
    private By password_field = By.name("password");
    private By login_btn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public LogInScreenInstances(WebDriver driver) {
        super(driver);
    }

    public static LogInScreenInstances getInstance(WebDriver driver) {
        if (logInScreen == null) {
            logInScreen = new LogInScreenInstances(driver);
        }
        return logInScreen;
    }

    public LogInScreenInstances UserName(String text) {
        ElementActions.getInstance(driver).fieldType(userName_field, text);
        return this;
    }

    public LogInScreenInstances Password(String text) {
        ElementActions.getInstance(driver).fieldType(password_field, text);
        return this;
    }

    public LogInScreenInstances clickLoginButton() {
        ElementActions.getInstance(driver).clickElement(login_btn);
        return this;
    }
}

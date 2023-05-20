package co.com.accenture.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").located(AppiumBy.accessibilityId("test-Usuario"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").located(AppiumBy.accessibilityId("test-Contrase\u00F1a"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(AppiumBy.accessibilityId("test-LOGIN"));

}

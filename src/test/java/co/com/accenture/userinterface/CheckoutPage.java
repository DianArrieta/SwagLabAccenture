package co.com.accenture.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(AppiumBy.accessibilityId("test-CHECKOUT"));
    public static final Target TXT_NAME = Target.the("Name Input").located(AppiumBy.accessibilityId("test-Nombre"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(AppiumBy.accessibilityId("test-Apellido"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(AppiumBy.accessibilityId("test-C\u00F3digo postal"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(AppiumBy.accessibilityId("test-CONTINUAR"));
    public static final Target BTN_FINISH = Target.the("Button Add Product to Cart").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TERMINAR\").instance(0))"));

}

package co.com.accenture.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target LBL_PRODUCT_CATALOG= Target.the("Product catalog title").located(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-Zona de ca\u00EDda del carrito de compras']/android.view.ViewGroup"));
    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"A\u00D1ADIR A CARRITO\").instance(0))"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(AppiumBy.accessibilityId("test-Carrito"));
}

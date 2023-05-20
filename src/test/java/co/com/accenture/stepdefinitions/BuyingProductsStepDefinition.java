package co.com.accenture.stepdefinitions;

import co.com.accenture.tasks.AddProduct;
import co.com.accenture.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.accenture.tasks.Checkout.checkout;
import static co.com.accenture.userinterface.CheckoutCompletadoPage.LBL_CHECKOUT_COMPLETE;
import static co.com.accenture.userinterface.ProductPage.LBL_PRODUCT_CATALOG;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("{word} enters his username and password")
    public void dianaEntersHisUsernameAndPassword(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs());
    }
    @Then("She should see the product catalog")
    public void sheShouldSeeTheProductCatalog() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_PRODUCT_CATALOG).isDisplayed());
    }

    @When("She puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }

    @And("She does the checkout of his purchase")
    public void checkoutPurchase() {
        theActorInTheSpotlight().attemptsTo(checkout());
    }

    @Then("She should see the message {string}")
    public void actorShouldSeeCheckout(String confirmationMessage) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CHECKOUT_COMPLETE).text().contains(confirmationMessage));
    }

}
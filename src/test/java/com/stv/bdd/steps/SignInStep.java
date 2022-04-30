package com.stv.bdd.steps;

import com.stv.factory.factorypages.ErrorMessage;
import com.stv.factory.factorypages.SignInPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class SignInStep extends BasicFactoryTest {
    ;

    SignInPage mySignInPage = new SignInPage();
    ErrorMessage errorMessage = new ErrorMessage();

    @Given("^Sign in form$")
    public void setup() throws Throwable{
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^The User enters invalid email address$")
    public void emailInput()  {
        mySignInPage.signInEmailInput();
    }

    @And("^The User goes to the password field$")
    public void goToPassword()  {
        mySignInPage.goToPasswordField();
    }

    @Then("^Warning message appears$")
    public void errorMessage() {
      getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        errorMessage.isErrorMessageDisplayed();
}
}


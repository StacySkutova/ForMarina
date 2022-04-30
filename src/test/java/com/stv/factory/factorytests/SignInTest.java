package com.stv.factory.factorytests;

import com.stv.factory.factorypages.ErrorMessage;
import com.stv.factory.factorypages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BasicFactoryTest {
    SignInPage mySignInPage = new SignInPage();

    @Test(description = "Input invalid email")
    public void emailValidation() {
        mySignInPage.signInEmailInput();
        mySignInPage.goToPasswordField();
        Assert.assertEquals(new ErrorMessage().isErrorMessageDisplayed(), true);

    }
}

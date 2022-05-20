package com.stv.bdd.steps;

import com.stv.factory.factorypages.HomePage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;

import static com.stv.framework.core.lib.WigglePageURLs.HOMEPAGE_URL;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class FinalTaskSteps extends BasicFactoryTest {

    HomePage myHomePage = new HomePage();

    @Given("^Homepage is loaded$")
    public void setup() throws Throwable {
        getDriver().get(HOMEPAGE_URL);
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        try {
            myHomePage.clickOnAcceptCookies();
        } catch (NoSuchElementException e) {
            return;
        }
    }

    @And("^Search bar is visible$")
    public void searchBarIsPresent() {
        myHomePage.isSearchBarDisplayed();
    }

    @When("^The User enters \"([^\"]*)\" in the search bar$")
    public void enterSearchRequest(String string) {
        myHomePage.searchRequestInput(string);
    }

    @Then("^Dropdown menu appears$")
    public void dropdownAppears() {
        myHomePage.isDropdownDisplayed();
    }

    @And("Dropdown menu contains {string}")
    public void dropdownMenuContains(String word) {
        myHomePage.checkIfDropdownContains(word);
    }

    @When("^The User clears search bar$")
    public void clearSearchBar() {
        myHomePage.deleteRequest();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^Dropdown menu is hidden$")
    public void dropdownDisappears() {
        myHomePage.isDropdownNotDisplayed();
    }

    @And("^Search bar is empty$")
    public void searchBarIsEmpty() {
        Assert.assertEquals(myHomePage.isInputEmpty(), true);
    }
}

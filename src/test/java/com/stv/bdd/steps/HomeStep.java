package com.stv.bdd.steps;

import com.stv.factory.factorypages.HomePage;
import com.stv.factory.factorytests.BasicFactoryTest;
import static com.stv.framework.core.lib.WigglePageURLs.HOMEPAGE_URL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomeStep extends BasicFactoryTest {

    HomePage myHomePage = new HomePage();

    @Given("^Homepage is loaded$")
    public void setup() throws Throwable{
        getDriver().get(HOMEPAGE_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^The Search bar is visible$")
    public void searchBarIsVisible() {
        myHomePage.isSearchBarDisplayed();
    }

    @And("^The User enters {request} bar$")
    public void enterSearchRequest(String request){
       getDriver().findElement(By.id("search")).sendKeys(request);
    }
    @Then("^Dropdown menu is appeared$")
    public void dropdownAppears() {
       myHomePage.isDropdownDisplayed();

    }
}


package com.stv.bdd.steps;

import com.stv.factory.factorypages.HomePage;
import com.stv.factory.factorytests.BasicFactoryTest;
import static com.stv.framework.core.lib.WigglePageURLs.HOMEPAGE_URL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class HomeStep extends BasicFactoryTest {

    HomePage myHomePage = new HomePage();

    @Given("^Homepage is loaded$")
    public void setup() throws Throwable{
        getDriver().get(HOMEPAGE_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
//        myHomePage.clickOnAcceptCookies();
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^Search bar is visible$")
    public void searchBarIsPresent() {
        myHomePage.isSearchBarDisplayed();
    }

    @When("^The User enters \"([^\"]*)\" in the search bar$")
    public void enterSearchRequest(String string)  {
        myHomePage.searchRequestInput(string);
    }

    @Then("^Dropdown menu appears$")
    public void dropdownAppears()  {
        myHomePage.isDropdownDisplayed();
    }

//    @And("^Dropdown menu contains Run$")
//    public void dropdownContains() {
//        myHomePage.checkIfDropdownContains();
//    }


    @When("^The User clears search bar$")
    public void clearSearchBar()  {
        myHomePage.deleteRequest();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^Dropdown menu is hidden$")
    public void dropdownDisappears()  {
        Assert.assertEquals(myHomePage.isDropdownHidden(), false);
    }

    @And("^Search bar is empty$")
        public void searchBarIsEmpty() {
            Assert.assertEquals(myHomePage.isInputEmpty(), true);
        }
   }

//======================================================================================

//package com.stv.bdd.steps;
//
//import com.stv.factory.factorypages.HomePage;
//import com.stv.factory.factorytests.BasicFactoryTest;
//import static com.stv.framework.core.lib.WigglePageURLs.HOMEPAGE_URL;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.testng.Assert;
//
//
//import java.util.concurrent.TimeUnit;
//
//public class HomeStep extends BasicFactoryTest {
//
//    HomePage myHomePage = new HomePage();
//
//    @Given("^Homepage is loaded$")
//    public void setup() throws Throwable {
//        getDriver().get(HOMEPAGE_URL);
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        getDriver().manage().window().maximize();
//        myHomePage.clickOnAcceptCookies();
//        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//
//    @And("^The Search bar is visible$")
//    public void searchBarIsPresent() {
//        myHomePage.isSearchBarDisplayed();
//    }
//
//    @When("^The User enters search request in the search bar$")
//    public void enterSearchRequest() {
//        myHomePage.searchFirstRequestInput();
//    }
//
//    @Then("^Dropdown menu appears$")
//    public void dropdownAppears() {
//        myHomePage.isDropdownDisplayed();
//    }
//
//    @When("^The User clears search bar$")
//    public void clearSearchBar() {
//        myHomePage.deleteRequest();
//        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Then("^Dropdown menu is hidden$")
//    public void dropdownDisappears() {
//        Assert.assertEquals(myHomePage.isDropdownHidden(), false);
//    }
//
//    //=========================02====================================
//
//
//    @When("^The User enters another search request$")
//    public void enterAnotherSearchRequest() {
//        myHomePage.searchSecondRequestInput();
//    }
//
//    @Then("^Search bar is empty$")
//        public void searchBarIsEmpty() {
//            Assert.assertEquals(myHomePage.isInputEmpty(), true);
//        }
//}
package com.stv.factory.factorypages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends FactoryPage {

    @FindBy(id = "search")
    private WebElement searchBar;
    public boolean isSearchBarDisplayed(){
        return searchBar.isDisplayed();
    }

    @FindBy(id = "search-type-ahead")
    private WebElement dropdown;
    public boolean isDropdownDisplayed(){
        return dropdown.isDisplayed();
    }

    @Override
    public void sendKeys(String request) {

    }


//    public void signInEmailInput() {
//        signInEmailField.sendKeys(INVALID_EMAIL);
//    }
//
//    public void goToPasswordField() {
//        passwordField.click();
//    }
}

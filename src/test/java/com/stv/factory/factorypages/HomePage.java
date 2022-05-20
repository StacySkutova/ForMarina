package com.stv.factory.factorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends FactoryPage {

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(id = "search")
    private WebElement searchBar;

    @FindBy(id = "rs")
    private WebElement input;

    @FindBy(id = "search-type-ahead")
    private WebElement dropdown;

    public void clickOnAcceptCookies() {
        trustButton.click();
    }

    public boolean isSearchBarDisplayed() {
        return searchBar.isDisplayed();
    }

    public void searchRequestInput(String string) {
        input.sendKeys(string);
    }

    public boolean isDropdownDisplayed() {
        return dropdown.isDisplayed();
    }

    public void checkIfDropdownContains(String word) {
        String stringToFind = dropdown.getText();
        stringToFind.contains(word);
    }

    public void deleteRequest() {
        input.clear();
    }

    public void isDropdownNotDisplayed() {
        input.sendKeys(Keys.BACK_SPACE);
    }

    public boolean isInputEmpty() {
        if (input.getAttribute("value").isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

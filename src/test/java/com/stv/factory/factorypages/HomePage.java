package com.stv.factory.factorypages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends FactoryPage {

    @FindBy(id = "search")
    private WebElement searchBar;

    @FindBy(id = "search-type-ahead")
    private WebElement dropdown;

    @FindBy(id = "rs")
    private WebElement input;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    public void clickOnAcceptCookies(){ trustButton.click(); }

    public boolean isSearchBarDisplayed(){ return searchBar.isDisplayed(); }

    public boolean isDropdownDisplayed(){ return dropdown.isDisplayed(); }

    public void searchRequestInput(String string) { input.sendKeys(string); }


    //    public void checkIfDropdownContains(){
//        List<WebElement> content = getDriver().findElements(By.id("search-type-ahead"));
//
//    }

    public void deleteRequest(){ input.clear(); }

    public boolean isDropdownHidden() {
        if (dropdown.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInputEmpty(){
        if (input.getAttribute("value").isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void sendKeys(String string) {
    }

}

//=========================================================================

//package com.stv.factory.factorypages;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import static com.stv.framework.core.lib.SearchRequest.REQUEST_1;
//import static com.stv.framework.core.lib.SearchRequest.REQUEST_2;
//
//public class HomePage extends FactoryPage {
//
//    @FindBy(id = "search")
//    private WebElement searchBar;
//
//    @FindBy(id = "search-type-ahead")
//    private WebElement dropdown;
//
//    @FindBy(id = "rs")
//    private WebElement input;
//
//    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
//    private WebElement trustButton;
//
//    public void clickOnAcceptCookies(){ trustButton.click(); }
//
//    public boolean isSearchBarDisplayed(){ return searchBar.isDisplayed(); }
//
//    public boolean isDropdownDisplayed(){ return dropdown.isDisplayed(); }
//
//    public void searchFirstRequestInput() { input.sendKeys(REQUEST_1); }
//
//    public void searchSecondRequestInput() { input.sendKeys(REQUEST_2); }
//
//    @Override
//    public void sendKeys(String string) { }
//
//    public void deleteRequest(){ input.clear(); }
//
//    public boolean isDropdownHidden() {
//        if (dropdown.isDisplayed()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isInputEmpty(){
//        if (input.getAttribute("value").isEmpty()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

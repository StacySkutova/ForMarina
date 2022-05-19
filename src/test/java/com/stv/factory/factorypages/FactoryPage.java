package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class FactoryPage {
    static WebDriver getDriver() {
        return Driver.getDriver();
    }
    protected FactoryPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public abstract void sendKeys(String invalidEmail);

}

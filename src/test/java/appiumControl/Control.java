package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionManager.Session;

import java.net.MalformedURLException;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator=locator;
    }

    public void findLocator() throws MalformedURLException {
        this.control= Session.getInstance().getDriver().findElement(this.locator);

    }
    public void click() throws MalformedURLException {
        this.findLocator();
        this.control.click();
    }
    public void sendKeys() throws MalformedURLException {
        this.findLocator();
        this.control.sendKeys();
    }
    public String getText() throws MalformedURLException {
        this.findLocator();
        return this.control.getText();
    }
    public boolean isDisplayed(){
        try {
            this.findLocator();
            return this.control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

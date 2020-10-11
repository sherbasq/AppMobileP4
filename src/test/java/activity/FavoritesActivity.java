package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class FavoritesActivity {
    public Button Temperature;

    public FavoritesActivity(){
        Temperature=new Button(By.id("Temperature"));
    }
    public boolean isDisplayTemperature(){
        String locator="//android.widget.TextView[@text=\"Temperature\"]";
        Label Temperature=new Label(By.xpath(locator));
        return Temperature.isDisplayed();
    }
}

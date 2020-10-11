package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class LicenseActivity {
    public Button acceptLicence;

    public LicenseActivity(){
        acceptLicence=new Button(By.id("android:id/button1"));
    }

    public boolean isDisplayUnitConverter(){
        String locator="//android.widget.TextView[@text=\"Unit Converter\"]";
        Label UnitConverter=new Label(By.xpath(locator));
        return UnitConverter.isDisplayed();
    }
}

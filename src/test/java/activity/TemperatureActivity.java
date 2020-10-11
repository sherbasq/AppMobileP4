package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class TemperatureActivity {
    public Button Button1;
    public Button Button5;
    public Label FahrenheitTemperatureLabel;

    public TemperatureActivity(){
        Button1 = new Button(By.id("1"));
        Button5 = new Button(By.id("5"));
        FahrenheitTemperatureLabel=new Label(By.id("com.aevumsoft.unitconverter:id/txtOutput"));
    }
}

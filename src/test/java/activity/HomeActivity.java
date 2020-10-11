package activity;

import appiumControl.Button;
import org.openqa.selenium.By;


public class HomeActivity {
    public Button Favorites;
    public Button Temperature;

    public HomeActivity(){
        Favorites = new Button(By.id("com.aevumsoft.unitconverter:id/tab2"));
    }
}

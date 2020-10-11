package testClean;

import activity.FavoritesActivity;
import activity.HomeActivity;
import activity.LicenseActivity;
import activity.TemperatureActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ConverterTest {
    LicenseActivity licenseActivity = new LicenseActivity();
    HomeActivity homeActivity = new HomeActivity();
    FavoritesActivity favoritesActivity = new FavoritesActivity();
    TemperatureActivity temperatureActivity = new TemperatureActivity();

    @Test
    public void verifyFahrenheitTemperature () throws MalformedURLException {
        licenseActivity.acceptLicence.click();
        homeActivity.Favorites.click();
        favoritesActivity.Temperature.click();
        temperatureActivity.Button1.click();
        temperatureActivity.Button5.click();

        String fahrenheitTemperature = temperatureActivity.FahrenheitTemperatureLabel.getText();
        System.out.println(fahrenheitTemperature);
        String expectedFahrehnheitTemperature = "59";
        Assert.assertEquals("ERROR la temperatura no es correcta",expectedFahrehnheitTemperature,fahrenheitTemperature);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}

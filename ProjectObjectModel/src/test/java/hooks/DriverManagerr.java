package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerr {

	public static WebDriver driver ;
	
	public static WebDriver GetDriver() {
		
	WebDriverManager.edgedriver().setup();
	
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	return driver;
	}
}

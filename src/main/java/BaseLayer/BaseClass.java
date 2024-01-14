package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass() 
	{
		File f= new File("user.dir"+"\\src\\main\\java\\ConfigurationLayer\\url.properties");
		prop= new Properties();
		try 
		{
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	public static void initialization()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		String ConfigUrl=prop.getProperty("url");
		driver.get(ConfigUrl);
	}
	

}

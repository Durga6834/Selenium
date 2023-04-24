package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sql.rowset.WebRowSet;

public class OHRMLoginvallid {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("./Properties\\Testcase.data");
		Properties Propobj = new Properties();
		Propobj.load(fi);
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Propobj.getProperty("BASEURL"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(Propobj.getProperty("USERID"));
		driver.findElement(By.name("password")).sendKeys(Propobj.getProperty("PWD"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("Login sucessful");
		

	}

}

package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase001 {
  @Test
  public void verifyTitleGoogle() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:/Users/Aparna Deshpande/Documents/Aparna/Cogniwize/SBrequirements/Logfile.txt");
		WebDriver driver = new FirefoxDriver(); //Launching the FF browser
		
		driver.get("https://www.google.com/"); //open url
		Thread.sleep(2000); 
		
		//verify title
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		System.out.println("expTitle "+expTitle);
		System.out.println("actTitle "+actTitle);
		if(expTitle.equals(actTitle))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase fail");
		}
		driver.close();//close browser	  
  }
}

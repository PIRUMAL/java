package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	WebDriver driver;
	public void invokeBrowser()
	{
		
		
		try {
			System.setProperty ("webdriver.chrome.driver"," C:\\LOCAL DISCKS (E)\\ChromeDriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window();
			driver.manage().timeouts();
			driver.manage().timeouts();
			
			
			
			
			
			
			driver.get("https://www.edureka.co/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		
		
		
		
	}
	
	


	public static void main(String[] args) {
	Day1 myObj=new Day1()	;
	myObj.invokeBrowser();

	}

}
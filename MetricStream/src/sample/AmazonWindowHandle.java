package sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonWindowHandle {
	
	@Test
	void windowhandle(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.linkText("Flights")).click();
		String title1 = d.getTitle();
		System.out.println("The title of the 1st window is  >"+title1);
		String CurrenWindow = d.getWindowHandle();
		Set<String> windowHandles = d.getWindowHandles();
		for(String str:windowHandles){
			
			if(!str.equalsIgnoreCase(CurrenWindow)){
				d.switchTo().window(str);
				String title2 = d.getTitle();
				System.out.println("The title of the 2nd window is  >"+title2);
				String currentUrl = d.getCurrentUrl();
				System.out.println("Url for the 2nd window is  >"+currentUrl);
			}
		}
		
		d.quit();
	}

}

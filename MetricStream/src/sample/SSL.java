package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class SSL {

	public static void main(String[] args) {

		//InternetExplorerOptions option = new InternetExplorerOptions();
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.com");
		WebElement element = d.findElement(By.id(""));
//		JavascriptExecutor js= (JavascriptExecutor)d;
//		js.executeScript("argumnets[0].scrollInView(true);", element);
//		js.executeScript("window.scrollby(0, 1000)", "");
//		js.executeScript("document.getElementById('email').value='kousik';", "");
		
	}

}

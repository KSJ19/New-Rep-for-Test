package WindowHandlesTest;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleproject {

	public static void main(String[] args) {
		
		
		// Window handles project handling multiple windows and single window
		
		ChromeDriver driver = new ChromeDriver();
		
		                                                         //driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		
		//if new window or new tab is opening then we need to use "Windowhandle"
		//set the parent window in the beginning itself
		
	String Parentwindow =driver.getWindowHandle();             // string value needs to give to the window handle
		
		driver.get("http://webdriveruniversity.com/index.html");
		
		WebElement contact= driver.findElement(By.xpath("//*[@id=\"contact-us\"]"));
		
		contact.click();
		 
		WebElement Firstname= driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]"));
		Firstname.click();
		Firstname.sendKeys("Testing");
		
		
		
	
		
		
		
	}

}

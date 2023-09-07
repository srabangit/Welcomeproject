package seleniumpratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicelement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("testng");
	        List<WebElement>total=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='lnnVSe']"));
	        int count=total.size();
	        for (int i=0;i<=count;i++) {
	        	String value=total.get(i).getText();
	        	if(value.contains("testng framework")) {
	        		//value.click();
	        		System.out.println("testng framework");
	        		break;
	        		//.value.click();
	        		
	        	
	        }
	
	        }
	}
	

}

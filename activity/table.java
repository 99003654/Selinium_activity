import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ltts/Documents/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		WebElement man =(WebElement) driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/h2")); 
        
        String rows=man.getText();
        System.out.println(rows);
}
}

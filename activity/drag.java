import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ltts/Documents/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net");
		WebElement ele=driver.findElement(By.id("loanamountslider"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(ele,500,0).build().perform();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("loaninterestslider"));
		Actions act1= new Actions(driver);
		act1.dragAndDropBy(ele1,200,0).build().perform();
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.id("loantermslider"));
		Actions act2= new Actions(driver);
		act2.dragAndDropBy(ele2,30000,0).build().perform();

	}

}

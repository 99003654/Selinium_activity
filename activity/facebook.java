import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo {




		public static void main(String[] args) throws InterruptedException {
      
     System.setProperty("webdriver.chrome.driver","/home/ltts/Documents/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231346502315%7Ce%7Cfacebook%7C&placement=&creative=231346502315&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI0eK-pqbQ7wIVSQwrCh1dTgVOEAAYASAAEgLzcPD_BwE");
      driver.manage().window().maximize();
      driver.findElement(By.name("firstname")).sendKeys("manzar");
			driver.findElement(By.name("lastname")).sendKeys("hussain");
			driver.findElement(By.name("reg_email__")).sendKeys("manzar.hussain@gmail.com");
		
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("manzar.hussain@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("manzar123");
			
			Select d1 = new Select(driver.findElement(By.id("day"))); 
			d1.selectByValue("10");
			Thread.sleep(2000);
			Select d2 = new Select(driver.findElement(By.id("month"))); 
			d2.selectByValue("7");
			Select d3 = new Select(driver.findElement(By.id("year"))); 
			d3.selectByValue("1998");
			Thread.sleep(2000);
			WebElement radio = driver.findElement(By.cssSelector("input[value='2']"));
			radio.click();
			Thread.sleep(2000);
			driver.findElement(By.name("websubmit")).click();
			
			
			
			
		}	

}

package mgr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.name("firstname")).sendKeys("saran");
Thread.sleep(2000);
driver.findElement(By.name("lastname")).sendKeys("stephen");
Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("7625880400");
driver.findElement(By.name("reg_passwd__")).sendKeys("saro0310");	
driver.findElement(By.name("birthday_day")).sendKeys("12");
driver.findElement(By.name("birthday_month")).sendKeys("jul");
driver.findElement(By.name("birthday_year")).sendKeys("1965");
driver.findElement(By.name("sex")).click();
driver.findElement(By.name("websubmit")).click();

	}

}

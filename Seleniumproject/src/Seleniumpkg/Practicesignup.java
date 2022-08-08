package Seleniumpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Practicesignup {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void Openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Seleniumproject/chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}	
	@Test
	public void startmainactivity() throws InterruptedException {
		WebElement Signupbtn=driver.findElement(By.linkText("Create New Account"));
		Signupbtn.click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Sachin");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("7009895341");
		driver.findElement(By.id("password_step_input")).sendKeys("Test");
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("29");
		
		 WebElement month=driver.findElement(By.name("birthday_month")); 
		 Select s1=new Select(month); 
		 s1.selectByValue("1"); 
		 WebElement year=driver.findElement(By.id("year")); 
		 Select s3=new Select(year);
		 s3.selectByValue("1998");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
	@After
	public void closebrowser() {
		driver.close();
	}
	
}

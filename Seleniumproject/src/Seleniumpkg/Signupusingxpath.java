package Seleniumpkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupusingxpath {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "../Seleniumproject/chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void starttest() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__' and @data-type='text']")).sendKeys("7009895341");
		driver.findElement(By.xpath("//input[@data-type='password' or autocomplete='new-password']")).sendKeys("Testpwd");
		//Select Process
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(date);
		s.selectByValue("29");
		
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month' and @name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByValue("1998");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Sign')])[1]")).click();
	}
	@After
	public void closebrowser() {
		driver.close();
	}
}

package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuppage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Seleniumproject/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement signupbtn=driver.findElement(By.linkText("Create New Account"));
		signupbtn.click();
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sachin");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("Kumar");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(3000);
		WebElement cnfemail=driver.findElement(By.name("reg_email_confirmation__"));
		cnfemail.sendKeys("test@gmail.com");
		WebElement newpass=driver.findElement(By.name("reg_passwd__"));
		newpass.sendKeys("Test123@");
		Select selectday=new Select(driver.findElement(By.id("day")));
		selectday.selectByIndex(30);
		Select selectmonth=new Select(driver.findElement(By.id("month")));
		selectmonth.selectByIndex(0);
		Select selectyear=new Select(driver.findElement(By.id("year")));
		selectyear.selectByValue("1998");
		WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));
		gender.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	}
}

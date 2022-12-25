package service;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get("https://www.ftr.irctc.co.in/ftr/"); 
		
		driver.findElementByLinkText("New User? Signup").click();
		
		
		
		Thread.sleep(2000);
		
		driver.findElementById("userId").sendKeys("Nishmita28");
		
		driver.findElementById("password").sendKeys("Nishmita@28");
		
		driver.findElementById("cnfPassword").sendKeys("Nishmita@28");
		
		driver.findElementById("dateOfBirth").click();
		Thread.sleep(2000);
		
		
		driver.findElementByLinkText("16").click();
		
		driver.findElementByXPath("//*[@id=\"gender1\"]").click();
		
		driver.findElementByXPath("//*[@id=\"maritalStatus1\"]").click();
		
		driver.findElementById("email").sendKeys("nishmi2125@gmail.com");
		
		driver.findElementById("fname").sendKeys("Nishmita");
		
		driver.findElementById("mname").sendKeys("Padmanabha");
		
		driver.findElementById("lname").sendKeys("Shetty");
		
		driver.findElementById("flatNo").sendKeys("121");
		
		driver.findElementById("street").sendKeys("HanumanNagar");
		
		driver.findElementById("area").sendKeys("vijaynagar");
		
		
		
		driver.findElementByXPath("//*[@id=\"mobile\"]").sendKeys("8722102530");
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		
		
		driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
		
		Thread.sleep(2000);
		
		
		driver.findElementById("flatNoOffice").sendKeys("121");
		
		driver.findElementById("streetOffice").sendKeys("maruthi street");
		
		driver.findElementById("areaOffice").sendKeys("Tenkanidiyoor");
		
		driver.findElementById("mobileOffice").sendKeys("9975246103");
		
		
		
		
		
		
		
		
		
		
		

	}

}

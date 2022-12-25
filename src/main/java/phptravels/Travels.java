package phptravels;

import org.openqa.selenium.chrome.ChromeDriver;

public class Travels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get("https://www.phptravels.org/register.php"); 
		
		Thread.sleep(2000);
		
		driver.findElementById("inputFirstName").sendKeys("Nishmita");
		
		driver.findElementById("inputLastName").sendKeys("shetty");
		
		driver.findElementById("inputEmail").sendKeys("nishmi2125@gmail.com");
		
		//driver.findElementByClassName("selected-dial-code").sendKeys("+91");
		
		driver.findElementById("inputPhone").sendKeys("8720253645");
		
		driver.findElementById("inputCompanyName").sendKeys("MyTravel");
		
		driver.findElementById("inputAddress1").sendKeys("HanumanNagar");
		
		driver.findElementById("inputAddress2").sendKeys("MarketRoad");
		
		driver.findElementById("inputCity").sendKeys("Udupi");
		
		driver.findElementById("stateinput").sendKeys("Karnataka");
		
		driver.findElementById("inputPostcode").sendKeys("591153");
		
		driver.findElementById("inputCountry").sendKeys("India");
		
		driver.findElementById("customfield2").sendKeys("8722154210");
		
		driver.findElementById("inputNewPassword1").sendKeys("@Nishmizy28*");
		
		driver.findElementById("inputNewPassword2").sendKeys("@Nishmizy28*");
		
		//driver.findElementByXPath("//*[@id=\"frmCheckout\"]/div[3]/div/div/div/span[1]").click();
		
		

	}

}

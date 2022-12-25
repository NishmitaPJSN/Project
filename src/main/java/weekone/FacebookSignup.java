package weekone;


import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		
		ChromeDriver driver= new ChromeDriver(); //creating driver object here
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get("https://www.facebook.com"); 
		
		driver.findElementByLinkText("Create New Account").click();
		
		Thread.sleep(5000);
		
		
		driver.findElementByName("firstname").sendKeys("Nishmita"); //locater name
			
		
			
		
		
		driver.findElementByName("lastname").sendKeys("Shetty"); //locater name
		
		driver.findElementByName("reg_email__").sendKeys("nishmi2125@gmail.com"); //locater name
		
		driver.findElementByName("reg_email_confirmation__").sendKeys("nishmi2125@gmail.com");//locater name
		
		driver.findElementById("password_step_input").sendKeys("nish@28");// locater Id
		
		WebElement day=driver.findElementById("day");
		
		Select se=new Select(day);
		
		se.selectByVisibleText("28");
		
		
		WebElement month=driver.findElementById("month");
		
		Select s=new Select(month);
		
		s.selectByVisibleText("Jun");
		
		
		
		
		
		WebElement year=driver.findElementById("year");
		
		Select a=new Select(year);
		
		a.selectByVisibleText("1996");
		
		
		
		
		driver.findElementByXPath("(//input[@name='sex'])[1]").click();  //locater XPath
		
		
		
	}

}

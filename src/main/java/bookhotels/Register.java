package bookhotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();
		
		
		
		
		Thread.sleep(2000);
		
		
		driver.findElementById("userName").sendKeys("Nishmita");
		
		driver.findElementById("usrPwd").sendKeys("@Nishmita28");
		
		driver.findElementById("cnfUsrPwd").sendKeys("@Nishmita28");
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span").click();
		
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span").click();
		
		
		
		
		
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span").click();
		
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span").click();
		
	
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("Fc Barcelona");
		
		
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		
	
		
		//Thread.sleep(2000);
		
		driver.findElementById("firstName").sendKeys("Nishmita");
		
		driver.findElementById("middleName").sendKeys("Padmanabha");
		
		driver.findElementById("lastname").sendKeys("Shetty");
		 //Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span").click();
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
		
		Thread.sleep(3000);
		
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("28-06-1996");
	    
	   Thread.sleep(2000);
	    
	    driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click();
	    
	    
	    WebElement country= driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[7]/select");
	   
		Select sel=new Select(country);
		
		sel.selectByVisibleText("India");
		
		//Thread.sleep(5000);
	    
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span").click();	
	   
	    
		
		driver.findElementById("email").sendKeys("nishmi2125@gmail.com");
		
		driver.findElementById("mobile").sendKeys("8756426580");//*[@id="ui-tabpanel-1"]/div/div[9]/p-selectbutton/div/div[2]/span
		
		Thread.sleep(3000);
		
		WebElement nationality= driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
		
		Select sell=new Select(nationality);
		
		sell.selectByValue("94");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();

		Thread.sleep(2000);
		
		driver.findElementById("resAddress1").sendKeys("121");
		
		driver.findElementById("resAddress2").sendKeys("Shanti Street");
		
		driver.findElementById("resAddress3").sendKeys("JP Nagar");
		
		driver.findElementByName("resPinCode").sendKeys("591143");
		
		driver.findElementById("resState").sendKeys("Karnataka");
		
		driver.findElementById("resCity").sendKeys("Belgaum");
		
		driver.findElementById("resPostOff").sendKeys("M.H.K Post");
		
		driver.findElementById("resPhone").sendKeys("9947225861");
		
		
		driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
		
		driver.findElementById("offAddress1").sendKeys("25H");
		
		driver.findElementById("offAddress2").sendKeys("market street");
		
		driver.findElementById("offAddress3").sendKeys("Neharu nagar");
		
		
		driver.findElementById("offPinCode").sendKeys("591153");
		
		driver.findElementById("offState").sendKeys("karnataka");
		
		WebElement city= driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[7]/select");
		
		Select sel1=new Select(city);
		
		sel1.selectByValue("Belgaum");
		
		WebElement post= driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[8]/select");
		Select sel2=new Select(post);
		
		
		sel2.selectByValue("M.K.Hubli S.F. S.O");
		
		driver.findElementById("offPhone").sendKeys("9785642560");
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click();
		
		driver.quit();
		

	}

}

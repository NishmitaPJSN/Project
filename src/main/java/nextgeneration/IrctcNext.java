package nextgeneration;


import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcNext

{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		Thread.sleep(5000);
		
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();
		
		
		Thread.sleep(2000);
		
		//driver.findElementByXPath("//*[@id=\"ui-tabpanel-0-label\"]").click();
		
		driver.findElementById("userName").sendKeys("Nishmita");
		
		driver.findElementById("usrPwd").sendKeys("@Nishmita28");
		
		driver.findElementById("cnfUsrPwd").sendKeys("@Nishmita28");
		
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("firstName").sendKeys("Nishmita");
		
		driver.findElementById("middleName").sendKeys("Padmanabha");
		
		driver.findElementById("lastname").sendKeys("Shetty");
		 //Thread.sleep(2000);
		
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("28-06-1996");
	    Thread.sleep(2000);
		
	    driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click();
	    
	   
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]").click();
	    
		
		driver.findElementById("email").sendKeys("nishmi2125@gmail.com");
		
		driver.findElementById("mobile").sendKeys("8756426580");
		
		//driver.findElementByLinkText("Continue ").click();
		//driver.findElementByXPath("//*[@id=\"ui-tabpanel-2-label\"]").click();
		
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();

		Thread.sleep(2000);
		
		driver.findElementById("resAddress1").sendKeys("121");
		
		driver.findElementById("resAddress2").sendKeys("Shanti Street");
		
		driver.findElementById("resAddress3").sendKeys("JP Nagar");
		
		driver.findElementByName("resPinCode").sendKeys("591143");
		
		driver.findElementById("resState").sendKeys("Karnataka");
		
		driver.findElementById("resPhone").sendKeys("9947225861");
		
		driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
		
		driver.findElementById("offAddress1").sendKeys("25H");
		
		driver.findElementById("offAddress2").sendKeys("market street");
		
		driver.findElementById("offAddress3").sendKeys("Neharu nagar");
		
		driver.findElementById("offPinCode").sendKeys("591153");
		
		driver.findElementById("offState").sendKeys("karnataka");
		
		driver.findElementById("offPhone").sendKeys("9785642560");
		
		//driver.findElementById("sbi").click();
		
		//driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click();
		
		
		
		
		
		

	}

}

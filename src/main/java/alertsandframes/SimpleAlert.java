package alertsandframes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert"); //load url
		
		Thread.sleep(2000);
		
		
		WebElement frameOne=driver.findElementByXPath("//*[@id=\"iframeResult\"]");  //third frame method
		
		driver.switchTo().frame(frameOne);
		
		driver.findElementByXPath("/html/body/button").click(); //click on try it
		
	
		//Thread.sleep(2000);
		String alertText=driver.switchTo().alert().getText(); //get alert text
		
		System.out.print(alertText);
		
		
		
		driver.switchTo().alert().accept(); // accepting alert
		
		
		driver.switchTo().defaultContent(); // Main web page(from out of the frame)
		
		driver.findElementById("tryhome").click(); //home 

	}

}

package alertsandframes;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); //Load url
		
		Thread.sleep(5000);
		
		//driver.switchTo().frame("iframeResult"); //second frame method 
		
		WebElement oneFrame=driver.findElementByXPath("//*[@id=\"iframeResult\"]"); 
		
		driver.switchTo().frame(oneFrame);
		
		driver.findElementByXPath("/html/body/button").click(); // Try button
		
		
		driver.switchTo().alert().sendKeys("Nishmita");  //sending name
		
		String alertText=driver.switchTo().alert().getText(); //alert text
		
		System.out.println(alertText);  //printing in console
		
		driver.switchTo().alert().accept();  //alert accept
		
		
		String appText=driver.findElementById("demo").getText();	
		
		if(appText.contains("Nishmita"))
		{
		System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		} 
		
		
		
		
		driver.navigate().refresh();  //refresh page
		
	
		
		
		
		WebElement oneFrameOne=driver.findElementByXPath("//*[@id=\"iframeResult\"]"); 
		
		driver.switchTo().frame(oneFrameOne);
	
		driver.findElementByXPath("/html/body/button").click();
		

		driver.switchTo().alert().sendKeys("Nishmita");
		
		String textA=driver.switchTo().alert().getText();
		
		System.out.println(textA);
		
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		String text= driver.findElementById("demo").getText();   // name should not appear
		
		if(!text.contains("Nishmita"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		driver.switchTo().defaultContent(); // Main web page
		
		driver.findElementById("tryhome").click(); //home 
		

		
		

	}

}

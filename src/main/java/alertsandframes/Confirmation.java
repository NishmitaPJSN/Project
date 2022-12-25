package alertsandframes;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {

	public static void main(String[] args) throws InterruptedException 
	
	{// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm\r\n" +""); //Load url
		
		Thread.sleep(5000);
		
		WebElement oneFrame=driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		
		driver.switchTo().frame(oneFrame);
		
		driver.findElementByXPath("/html/body/button").click(); //click on try it
		
		String textAlert=driver.switchTo().alert().getText(); 
		
		System.out.println(textAlert); // printing the text
		
		driver.switchTo().alert().accept(); //alert accept
		
		String textAlert1= driver.findElementById("demo").getText();
		
		if(textAlert1.equals("You pressed OK!"))  //verification text for ok
		{
		System.out.println("Pass");
		}
		else {
			System.out.println("Fail!");
		} 
		
		driver.navigate().refresh();	//page refresh
		
		Thread.sleep(5000);
		
		//repeat steps
		
		WebElement oneFramee=driver.findElementByXPath("//*[@id=\"iframeResult\"]"); 
		
		driver.switchTo().frame(oneFramee);
		
		driver.findElementByXPath("/html/body/button").click(); //click on try it
		
		String textAlert2=driver.switchTo().alert().getText();
		
		System.out.println(textAlert2);
		
		driver.switchTo().alert().accept();
		
		
		driver.findElementByXPath("/html/body/button").click(); //click on try it
		
		driver.switchTo().alert().dismiss();	//alert dismiss
		
		
		String appText=driver.findElementById("demo").getText();	//verification for Cancel
		
		if(appText.equals("You pressed Cancel!"))
		{
		System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		} 
		
		
		driver.switchTo().defaultContent(); // Main web page(from out of the frame)
		
		driver.findElementById("tryhome").click(); //home 
		
		
		

	}


	}



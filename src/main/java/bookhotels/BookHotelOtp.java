package bookhotels;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookHotelOtp {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get(" https://www.irctc.co.in/nget/train-search");
		
		
		Thread.sleep(10000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		
		//Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
		
		
		String winIdBeforeClick=driver.getWindowHandle();
		System.out.println(winIdBeforeClick);
		
		Set <String> allWinIdBeforeClick= driver.getWindowHandles();
		System.out.println(allWinIdBeforeClick);
		
		
	
		
		String winIdAfterClick=driver.getWindowHandle();
		System.out.println(winIdAfterClick);
		
		Set <String> allWinIdsAfterClick= driver.getWindowHandles();
		System.out.println(allWinIdsAfterClick);
		
		for(String eachId: allWinIdsAfterClick) 
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
			}


		
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a/div").click();
		
		 Thread.sleep(2000);
		 
		String winIdAfterClickk=driver.getWindowHandle();
		System.out.println(winIdAfterClickk);
		
		Set <String> allWinIdsAfterClickk= driver.getWindowHandles();
		System.out.println(allWinIdsAfterClickk);
		
		for(String eachId: allWinIdsAfterClickk) 
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
			}
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a").click();
		
		//driver.findElementByXPath("/html/body/app-root/app-fulllayout/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a").click();
		driver.findElementByXPath("//*[@id=\"profile-tab\"]").click();
		
		driver.findElementByName("email").sendKeys("messileo@gmail.com");
		
		
		driver.findElementByName("mobileNo").sendKeys("8722102456");
		
		
		driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
		
		
		
		Thread.sleep(5000);
		
		
		
		
		
		driver.findElementById("filterText").sendKeys("Pune"); 
		
		driver.findElementById("filterText").click();
		
		//driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[4]/a/div[1]/span").click();
		
		
		//driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[2]/strong").click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.findElementByName("dt12").click();
		
		
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[1]/td[4]/span").click();
		
		
		Thread.sleep(7000);
		
		driver.findElementByName("dt13").click();
		
		
		
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[4]/span").click();
		
		Thread.sleep(5000);
		
		
		
		driver.findElementByXPath("//*[@id=\"user-data-wrapper-id\"]").click();
		
		WebElement room=driver.findElementByName("hotelRoom");
		
		Select selThree=new Select(room);
		
		selThree.selectByValue("1");
		
		
		WebElement adults=driver.findElementByName("hotelAdult");
		
		Select sel=new Select(adults);
		
		sel.selectByValue("3");
		
		driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click();
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button").click();
		
		

		Set<String> allWinIDsAfterSecondClick = driver.getWindowHandles();
		
		System.out.println(allWinIDsAfterSecondClick);
		
		for(String eachId:allWinIDsAfterSecondClick)
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
		}
		
		Thread.sleep(2000);
		
		
		
		
		Set<String> allWinIDsAfterThrdClick = driver.getWindowHandles();
		
		System.out.println(allWinIDsAfterThrdClick);
		
		for(String eachId:allWinIDsAfterThrdClick)
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
		}
		
		Thread.sleep(3000);
		//System.out.println("22");
		
		
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[1]/div/img").click();
		
		String hotel = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div/h5").getText();
		System.out.println(hotel);
		
		String price = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[3]/div/strong").getText();
		
		System.out.println(price);
		
		
		
		//driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[1]/div/img").cl
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button").click();
		
		Thread.sleep(5000);
		
		Set<String> allWinIDsAfterThirdClick = driver.getWindowHandles();
		
		System.out.println(allWinIDsAfterThirdClick);
		
		for(String eachId:allWinIDsAfterThirdClick)
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
		}
		
		
		
		Thread.sleep(3000);
		
		

		WebElement titl=driver.findElementByName("title");
		
		Select se=new Select(titl);
		
		se.selectByValue("3");
		
		
		driver.findElementByName("firstName").sendKeys("messi");
		
		driver.findElementByName("lastName").sendKeys("leo");
		
		driver.findElementByName("mobileNo").sendKeys("9972297134");
		

		
		WebElement stat=driver.findElementByName("state");
		
		Select s=new Select(stat);
		
		s.selectByValue("KA");
		
		
		driver.findElementByName("email").sendKeys("messileo@gmail.com");
		
		
		WebElement gstt=driver.findElementByName("gst");
		
		Select a=new Select(gstt);
		
		a.selectByValue("No");
		
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]").click();
		
		
		Thread.sleep(3000);
		
		
		
		
		String name = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[1]/div/div/h5").getText();
		
		System.out.println(name);
		
		if(name.contains("Oga SRH Hotel "))
		{
			System.out.println("Same" );
		}
		else
		{
			System.out.println("Different");
		}
		
        String money = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong").getText();
		
		System.out.println(money);
		
		if(price.equals(money))
		{
			System.out.println("Same" );
		}
		else
		{
			System.out.println("Different");
		}
	
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]").click();
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span").click();
		
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]").click();
		
		Thread.sleep(2000);
		
		
		
		
		
		driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button").click();
		
		String err = driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span").getText();
		
		if(err.equals("OTP is required."))
		{
			System.out.println("OTP required filed displayed");
		}
		else
		{
			System.out.println("OTP required filed is NOT displayed");
		}
		
		driver.quit();

		
		
		}
		
		
		
	
	
	
	
	
	

}

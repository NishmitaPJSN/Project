package weektwo.dayfour;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookHotelsOTPValidation {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		
		
		// TODO Auto-generated method stub

					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.irctc.co.in");
					
					driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
				
					
					Thread.sleep(2000);
					
					driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i").click();
					
					driver.findElementByXPath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[7]/label").click();
					
					Thread.sleep(2000);
					
					//driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
					
					Thread.sleep(2000);
						
					driver.findElementByXPath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[7]/ul/li[3]/label").click();
				
					Thread.sleep(2000);
					driver.findElementByPartialLinkText("Lounge").click();
					
					Set<String> allWinIDsAfterClick = driver.getWindowHandles();
					
					System.out.println(allWinIDsAfterClick);
					
					for(String eachId:allWinIDsAfterClick)
					{
						System.out.println(eachId);
						driver.switchTo().window(eachId);
					}
					
					Thread.sleep(2000);
					
					driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a/div").click();
					
					Set<String> allWinIDsAfterFirstClick = driver.getWindowHandles();
					
					System.out.println(allWinIDsAfterFirstClick);
					
					for(String eachId:allWinIDsAfterFirstClick)
					{
						System.out.println(eachId);
						driver.switchTo().window(eachId);
					}
					
					Thread.sleep(2000);
					
					driver.findElementByPartialLinkText("Login").click();
					
					
					
					driver.findElementById("profile-tab").click();
					
					Thread.sleep(1000);
					
					driver.findElementByName("email").sendKeys("deepikadcs@gmail.com");
					
					driver.findElementByName("mobileNo").sendKeys("9176000571");
					
					driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
					
					Thread.sleep(2000);
					
					driver.findElementById("filterText").click();
					
					driver.findElementById("filterText").sendKeys("Yer");
					
					Thread.sleep(2000);
					
					driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[2]/strong").click();
					
					driver.findElementByName("dt12").click();
					
					Thread.sleep(1000);
					
					driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[5]/span").click();
					
					Thread.sleep(1000);
						
					//driver.findElementByName("dt13").click();
					
					//driver.findElementByCssSelector("#owl-dt-picker-1 > div.owl-dt-container-inner.ng-trigger.ng-trigger-fadeInPicker > owl-date-time-calendar > div.owl-dt-calendar-main > owl-date-time-month-view > table > tbody > tr:nth-child(5) > td.owl-dt-calendar-cell.owl-dt-day-3.owl-dt-calendar-cell-active.owl-dt-calendar-cell-in-range.owl-dt-calendar-cell-range-to.ng-star-inserted > span").click();
				
					driver.findElementById("user-data-wrapper-id").click();
					
					WebElement room = driver.findElementByName("hotelRoom");
					
					Select selRoom = new Select(room);
					
					selRoom.selectByValue("1");
					
					WebElement adult = driver.findElementByName("hotelAdult");
					
					Select selAdult = new Select(adult);
					
					selAdult.selectByIndex(2);
					
					driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click();
					
					driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button").click();
					
					Set<String> allWinIDsAfterSecondClick = driver.getWindowHandles();
					
					System.out.println(allWinIDsAfterSecondClick);
					
					for(String eachId:allWinIDsAfterSecondClick)
					{
						System.out.println(eachId);
						driver.switchTo().window(eachId);
					}
					
					Thread.sleep(2000);
					System.out.println("23");
					//driver.findElementByCssSelector("body > app-root > app-fulllayout > app-hotellist > div.main-content.ng-star-inserted > div > div > div.col-md-9.col-lg-9.ng-star-inserted > div.filtersearch-packages.ng-star-inserted > a > div > div.col-12.col-md-4 > div").click();
					driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[1]/div/img").click();
					
					Set<String> allWinIDsAfterThrdClick = driver.getWindowHandles();
					
					System.out.println(allWinIDsAfterThrdClick);
					
					for(String eachId:allWinIDsAfterThrdClick)
					{
						System.out.println(eachId);
						driver.switchTo().window(eachId);
					}
					
					Thread.sleep(3000);
					System.out.println("22");
					String hotel = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5").getText();
					System.out.println(hotel);
					
					String price = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong").getText();
					
					System.out.println(price);
					
					driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button").click();
					
					Set<String> allWinIDsAfterThirdClick = driver.getWindowHandles();
					
					System.out.println(allWinIDsAfterThirdClick);
					
					for(String eachId:allWinIDsAfterThirdClick)
					{
						System.out.println(eachId);
						driver.switchTo().window(eachId);
					}
					
					Thread.sleep(2000);
					WebElement title = driver.findElementByName("title");
					
					Select selTitle = new Select(title);
					
					selTitle.selectByIndex(2);
					
					driver.findElementByName("firstName").sendKeys("Deepika");
					
					driver.findElementByName("lastName").sendKeys("S");
					
					WebElement state = driver.findElementByName("state");
					
					Select selState = new Select(state);
					
					selState.selectByValue("TN");
					
					driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]").click();
					
					Thread.sleep(3000);
					
					String hotelName = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[1]/div/div/h5").getText();
					
					System.out.println(hotelName);
					
					if(hotelName.contains("Yercaud"))
					{
						System.out.println("Hotel Name Same :" );
					}
					else
					{
						System.out.println("Hotel name not same");
					}
					
			        String hotelPrice = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong").getText();
					
					System.out.println(hotelPrice);
					
					if(hotelPrice.equals(price))
					{
						System.out.println("Amount is Same:" );
					}
					else
					{
						System.out.println("Amount is not same");
					}
				
					driver.findElementByClassName("checkmark").click();
					
					driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]").click();
					
					Thread.sleep(2000);
					
					driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button").click();
					
					String errMsg = driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span").getText();
				
					if(errMsg.equals("otp is required."))
					{
						System.out.println("OTP required filed is displayed in SCreen");
					}
					else
					{
						System.out.println("OTP required filed is NOT displayed in SCreen");
					}
					
					driver.quit();
	}

	

}

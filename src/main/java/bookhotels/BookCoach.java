package bookhotels;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookCoach {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize browser window automatically
		
		driver.get(" https://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
		
		//write window code
		
		
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
		
		driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"sidebar\"]/ul/li[14]/a").click();
		
		
		
		
		String winIdAfterClickk=driver.getWindowHandle();
		System.out.println(winIdAfterClickk);
		
		Set <String> allWinIdsAfterClickk= driver.getWindowHandles();
		System.out.println(allWinIdsAfterClickk);
		
		for(String eachId: allWinIdsAfterClickk) 
		{
			System.out.println(eachId);
			driver.switchTo().window(eachId);
			}
		
		
		
		
		driver.findElementByLinkText("New User? Signup").click();
		
		 
		Thread.sleep(2000);
		
		driver.findElementById("userId").sendKeys("Nishmita28");
		
		driver.findElementById("password").sendKeys("Nishmita@28");
		
		driver.findElementById("cnfPassword").sendKeys("Nishmita@28");
		
		
		WebElement seqQues= driver.findElementById("secQstn");
		
		Select sel=new Select(seqQues);
		sel.selectByVisibleText("What is your all time favorite sports team?");
		
		driver.findElementById("secAnswer").sendKeys("Fc Barcelona ");
		//security ques
		//ans
		
		driver.findElementById("dateOfBirth").click();
		
		Thread.sleep(2000);
		
		
		
		driver.findElementByLinkText("16").click();
		
		driver.findElementByXPath("//*[@id=\"gender1\"]").click();
		
		driver.findElementByXPath("//*[@id=\"maritalStatus1\"]").click();
		
		driver.findElementById("email").sendKeys("nishmi2125@gmail.com");
		
		//occuptn
		
		
		WebElement occu= driver.findElementById("occupation");
		
		Select sell=new Select(occu);
		
		sell.selectByVisibleText("Student");
		
		driver.findElementById("fname").sendKeys("Nishmita");
		
		driver.findElementById("mname").sendKeys("Padmanabha");
		
		driver.findElementById("lname").sendKeys("Shetty");
		
		//nationl
		
		WebElement national=driver.findElementById("natinality");
		
		Select selOne=new Select(national);
		selOne.selectByValue("94");
		
		
		
		driver.findElementById("flatNo").sendKeys("121");
		
		driver.findElementById("street").sendKeys("HanumanNagar");
		
		driver.findElementById("area").sendKeys("vijaynagar");
		
		//country
		
		WebElement count=driver.findElementById("country");
		
		Select selThree=new Select(count);
		
		selThree.selectByValue("94");
		
		
		driver.findElementByXPath("//*[@id=\"mobile\"]").sendKeys("8722102530");
		
		//pincode
		
		driver.findElementById("pincode").sendKeys("591153");
		
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"postOffice\"]").click();
		
		
		
		WebElement post=driver.findElementById("postOffice");
		
		Select objj=new Select(post);
		
		objj.selectByValue("Kadrolli B.O");
	
		//Thread.sleep(2000);
		
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		
		
		driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
		
		//Thread.sleep(2000);
		
		
		driver.findElementById("flatNoOffice").sendKeys("121");
		
		driver.findElementById("streetOffice").sendKeys("maruthi street");
		
		driver.findElementById("areaOffice").sendKeys("Tenkanidiyoor");
		
		//country

		WebElement cotry=driver.findElementById("countryOffice");
		
		Select tr=new Select(cotry);
		
		tr.selectByValue("94");
		
		
		
		
		
		driver.findElementById("mobileOffice").sendKeys("9975246103");
		

		
		driver.findElementById("pincodeOffice").sendKeys("591153");
		
		
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"postOfficeOffice\"]").click();
		
		WebElement of=driver.findElementById("postOfficeOffice");
		
		Select sa=new Select(of);
		
		sa.selectByValue("M.K.Hubli S.F. S.O");
		
		
		//clear all browser
		
		
		driver.quit();

	}

}

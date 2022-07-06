package Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Room_Booking {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("santroanna");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("66EW18");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement multiple = driver.findElement(By.xpath("//select[@id='location']"));
		Select s= new Select(multiple);
		s.selectByVisibleText("Paris");
		
		WebElement multiple1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(multiple1);
		s1.selectByVisibleText("Hotel Creek");
		
		WebElement multiple2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(multiple2);
		s2.selectByVisibleText("Deluxe");
		
		WebElement multiple3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(multiple3);
		s3.selectByValue("2");
		
		 WebElement indate = driver.findElement(By.xpath("//input[@value='08/06/2022']"));
		 indate.clear();
		 indate.sendKeys("15/06/2022");
		 
		 WebElement outdate = driver.findElement(By.xpath("//input[@value='09/06/2022']"));
		 outdate.clear();
		 outdate.sendKeys("18/06/2022");
		
		WebElement multiple4 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(multiple4);
		s4.selectByValue("3");
		
		WebElement multiple5 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(multiple5);
		s5.selectByValue("2");
		
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		search.click();
		
		WebElement button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		button.click();
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("santhosh");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("santro");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("xxxxx");
		
		WebElement credit = driver.findElement(By.xpath("//input[@id='cc_num']"));
		credit.sendKeys("1234567893434456");
		
		WebElement multiple6 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6 = new Select(multiple6);
		s6.selectByVisibleText("Master Card");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7 = new Select(month);
		s7.selectByValue("6");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(year);
		s8.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("123");
		
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		
		
		
		
	}

}

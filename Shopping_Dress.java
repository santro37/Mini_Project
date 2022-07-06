package Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopping_Dress {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("santro37@gmail.com");
		
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("santro@1995");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirt.click();
		
		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		size.click();
		
		driver.findElement(By.xpath("(//input[@class='color-option  '])[2]")).click();
		
		WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		js.executeScript("arguments[0].click();", cart);
		
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		 js.executeScript("arguments[0].click();", proceed);
		
		 WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		 summary.click();
		
		 
		 WebElement address = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
         address.click();
		 
		 WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 checkbox.click();
		 
		 WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		 shipping.click();
		 
		 WebElement payement = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		 payement.click();
		 
		 WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		 confirm.click();
	}

}

package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4_DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March_2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		
		Actions act = new Actions(driver);
		
	   //act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}

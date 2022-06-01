package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\workspace\\Automation_March_2022\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//synchronization/wait
		
		driver.get(UtilityClass.getPropertyFileData("url"));
	}
}

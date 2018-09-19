import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("k230210@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Praise@1");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		
	
		
	}
}

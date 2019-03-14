import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\OnchariWycliffe\\eclipse-workspace\\SeleniumFramework\\Drivers\\geckodrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");

	}

}

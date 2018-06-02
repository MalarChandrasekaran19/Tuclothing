import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreLocatorWithShortData {

	public static By STORE_LOCATOR_LINK = By.linkText("Tu Store Locator");
	public static By STORE_POSTCODE_CITY_TXTBOX=By.name("q");
	public static By STORE_LOCATOR_BUTTON = By.cssSelector("form");

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(STORE_LOCATOR_LINK ).click();
		driver.findElement(STORE_POSTCODE_CITY_TXTBOX).sendKeys("an");
		driver.findElement(STORE_LOCATOR_BUTTON).click();
		driver.close();

	}

}

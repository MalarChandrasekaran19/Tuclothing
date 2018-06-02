import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreLocatorWithValidCity {

	public static By STORE_LOCATOR_LINK = By.linkText("Tu Store Locator");
	public static By STORE_POSTCODE_CITY_TXTBOX=By.cssSelector(".text.required");
	public static By STORE_LOCATOR_BUTTON = By.cssSelector(".form.search");
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(STORE_LOCATOR_LINK ).click();
		driver.findElement(STORE_POSTCODE_CITY_TXTBOX).sendKeys("London");
		driver.findElement(STORE_LOCATOR_BUTTON).click();
		driver.close();

	}

}

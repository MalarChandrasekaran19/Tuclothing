import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreLocatorWithTwoCheckBox {

	public static String BASEURL = "https://tuclothing.sainsburys.co.uk/";
	public static By STORE_LOCATOR_LINK = By.linkText("Tu Store Locator");
	public static By STORE_POSTCODE_CITY_TXTBOX=By.cssSelector(".text.required");
	public static By STORE_LOCATOR_BUTTON = By.cssSelector(".form.search");
	public static By CHECKBOX_FIRST=By.cssSelector("#women");
	public static By CHECKBOX_SECOND=By.cssSelector("#click");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASEURL);
		driver.findElement(STORE_LOCATOR_LINK ).click();
		driver.findElement(STORE_POSTCODE_CITY_TXTBOX).sendKeys("NN8 4DH");
		driver.findElement( CHECKBOX_FIRST).click();
		driver.findElement( CHECKBOX_SECOND).click();
		driver.findElement(STORE_LOCATOR_BUTTON).click();
		driver.close();
	}

}

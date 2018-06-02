import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterWithValidData {
	
	public static By LOGIN_REGISTER_LINK = By.linkText("Tu Log In / Register");
	public static By REGISTER_BUTTON = By.cssSelector(".regToggle");
	public static By REGISTER_EMAIL = By.cssSelector("#register_email");
	public static By REGISTER_TITLE = By.cssSelector("#register_title");
	public static By REGISTER_FIRSTNAME= By.cssSelector("#register_firstName");
	public static By REGISTER_LASTNAME= By.cssSelector("#register_lastName");
	public static By REGISTER_PASSWORD =By.cssSelector("#password");
	public static By REGISTER_CONFIRM_PASSWORD =By.cssSelector("#register_checkPwd");
	public static By REGISTER_TERMS_CONDITIONS = By.name("termsAndConditions");
	public static By REGISTER_SUBMIT_BUTTON=By.cssSelector(".registerButton");

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(LOGIN_REGISTER_LINK).click();
		driver.findElement(REGISTER_BUTTON).click();
		driver.findElement(REGISTER_EMAIL).clear();
		driver.findElement(REGISTER_EMAIL).sendKeys("testuser@gmail.com");
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mrs");
		driver.findElement(REGISTER_FIRSTNAME).clear();
		driver.findElement(REGISTER_FIRSTNAME).sendKeys("sunflower");
		driver.findElement(REGISTER_LASTNAME).clear();
		driver.findElement(REGISTER_LASTNAME).sendKeys("lotus");
		driver.findElement(REGISTER_PASSWORD).clear();
		driver.findElement(REGISTER_PASSWORD).sendKeys("qwsdvb");
		driver.findElement(REGISTER_CONFIRM_PASSWORD).clear();
		driver.findElement( REGISTER_CONFIRM_PASSWORD).sendKeys("qwsdvb");
		driver.findElement(REGISTER_TERMS_CONDITIONS).click();
		driver.findElement(REGISTER_SUBMIT_BUTTON).click();
		driver.close();


	}

}

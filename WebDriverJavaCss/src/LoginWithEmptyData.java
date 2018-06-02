import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithEmptyData {

	public static By LOGIN_EMAIL_TEXTBOX=By.cssSelector("#j_username");
	public static By LOGIN_PASSWORD_TEXTBOX=By.cssSelector(".password");
	public static By LOGIN_BUTTON=By.cssSelector(".tuButton.loginButtonMain");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(LOGIN_EMAIL_TEXTBOX).clear();
		driver.findElements(LOGIN_PASSWORD_TEXTBOX).get(0).clear();
		driver.findElement(LOGIN_BUTTON).click();
		driver.close();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottonPasswordWithValidData {

		public static By FORGOTTON_PASSWORD_LINK=By.cssSelector(".password-forgotten");
		public static By FORGOTTON_PASSWORD_EMAIL=By.cssSelector(".text.required");
		public static By FORGOTTON_PASSWORD_BUTTON=By.cssSelector(".tuButton.button.orange");

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tuclothing.sainsburys.co.uk/");
			driver.findElement(By.linkText("Tu Log In / Register")).click();
			driver.findElement(FORGOTTON_PASSWORD_LINK).click();
			driver.findElements(FORGOTTON_PASSWORD_EMAIL).get(0).clear();
			Thread.sleep(2000);
			driver.findElements(FORGOTTON_PASSWORD_EMAIL).get(0).sendKeys("mharini44@gmail.com");
			driver.findElement(FORGOTTON_PASSWORD_BUTTON).click();
			driver.close();
	}

}

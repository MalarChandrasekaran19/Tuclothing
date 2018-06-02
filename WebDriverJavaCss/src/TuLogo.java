import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuLogo {
	public static By TULOGO = By.cssSelector(".simple_disp-img");
	public static String BASEURL = "https://tuclothing.sainsburys.co.uk/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASEURL);
		driver.findElement(TULOGO ).click();
		driver.close();
	}

}

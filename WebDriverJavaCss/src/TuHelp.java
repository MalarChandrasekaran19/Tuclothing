import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuHelp {

	public static String BASEURL = "https://tuclothing.sainsburys.co.uk/";
	public static By HELP_LINK = By.linkText("Tu Help");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASEURL);
		driver.findElement(HELP_LINK);
		
	}

}

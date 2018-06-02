import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithValidData {
	public static By SEARCH_TEXTBOX=By.cssSelector("#search");
	public static By SEARCH_BUTTON=By.cssSelector(".button.searchButton");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys("tops");
		driver.findElement( SEARCH_BUTTON).click();
		driver.close();
	}

}

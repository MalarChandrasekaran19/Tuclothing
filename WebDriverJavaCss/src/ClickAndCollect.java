import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickAndCollect {
	public static By SEARCH_TEXTBOX=By.cssSelector("#search");
	public static By SEARCH_BUTTON=By.cssSelector(".button.searchButton");
	public static By PRODUCT_SIZE=By.cssSelector("#productVariantSize");
	public static By PRODUCT_QUANTITY=By.cssSelector("#productVariantQty");
	public static By FACET_CHECKBOX=By.cssSelector(".facet_type_type .even .facetCheckBox");
	public static By ADD_TO_CART=By.cssSelector("#AddToCart");
	public static By CART_ICON=By.cssSelector(".icon");
	public static By BASKET_BUTTON_BOTTOM=By.cssSelector("#basketButtonBottom");
	public static By USER_EMAIL_TEXTBOX=By.cssSelector(".required");
	public static By USER_PASSWORD_TEXTBOX=By.cssSelector(".password");
	public static By USER_LOGIN_CHECKOUT=By.cssSelector(".button.orange");
	public static By CLICK_AND_COLLECT = By.cssSelector("#CLICK_AND_COLLECT");
	public static By CHECKOUT_CONTINUE = By.cssSelector(".center.button.orange");
	public static By MATERIAL_SELECT =By.cssSelector(".details");
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Automation/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys("tops");
		driver.findElement(SEARCH_BUTTON).click();
		driver.findElements(MATERIAL_SELECT).get(3).click();
		
		Select dropdown = new Select(driver.findElement(PRODUCT_SIZE));
		Thread.sleep(3000);
		dropdown.selectByValue("133500121");
	
		Select dropdown1 = new Select(driver.findElement(PRODUCT_QUANTITY));
		Thread.sleep(3000);
		dropdown1.selectByValue("2");
		driver.findElement(ADD_TO_CART).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(CART_ICON).click();
		driver.findElement(By.linkText("View Basket & checkout")).click();
		Thread.sleep(2000);
		driver.findElement(BASKET_BUTTON_BOTTOM).click();
		driver.findElement(USER_EMAIL_TEXTBOX).clear();
		driver.findElement(USER_EMAIL_TEXTBOX).sendKeys("mharini44@gmail.com");
		driver.findElement(USER_PASSWORD_TEXTBOX).clear();
		driver.findElement(USER_PASSWORD_TEXTBOX).sendKeys("qwsdvb");
		Thread.sleep(3000);
		driver.findElements(USER_LOGIN_CHECKOUT).get(0).click();
		driver.findElement(BASKET_BUTTON_BOTTOM).click();
		WebElement radiobtn = driver.findElement(CLICK_AND_COLLECT);
		if(!radiobtn.isSelected()) {
		radiobtn.click();
		}
		driver.findElement(CHECKOUT_CONTINUE).click();
		//driver.close();

	}

}

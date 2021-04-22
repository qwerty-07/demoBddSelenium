package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddUser_StepDefinition {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.qatouch.com/signin");
	}

	@Given("^user is already logged in$")
	public void user_is_already_logged_in() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("pandeymohit650@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Space@X123");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

		Thread.sleep(3000);
	}

	@Given("^user is in user Management module$")
	public void user_is_in_user_Management_module() {
		Actions act = new Actions(driver);
		WebElement adminTab = driver
				.findElement(By.xpath("//body/div[@id='vue-app']/nav[@id='sidebar']/div[1]/ul[1]/li[3]/a[1]"));
//			act.click(adminTab).build().perform();
		adminTab.click();
		WebElement userTab = driver
				.findElement(By.xpath("//body/div[@id='vue-app']/nav[@id='sidebar']/ul[2]/li[3]/a[1]"));
//			act.click(userTab).build().perform();
		userTab.click();
	}

	@When("^click on Add user$")
	public void click_on_Add_user() {
		Actions act = new Actions(driver);
		WebElement addYUser = driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[9]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		act.click(addYUser).build().perform();
	}

	@Then("^Add user form should open$")
	public void add_user_form_should_open() {
		// Write code here that turns the phrase above into concrete actions
	}

//              \"([^\"]*)\"
	@Then("^enter the values ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)$")
	public void enter_the_values_Virat_Kohli_VK_demo_comm_Tester(String firstname, String lastname, String email,
			String accessType) throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(By.cssSelector("#firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("#lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
		WebElement accessBtn = driver.findElement(By.name("access_type"));
		Select accessDropdown = new Select(accessBtn);
		accessDropdown.selectByVisibleText(accessType);
		Thread.sleep(2000);

	}

	@Then("^click on save$")
	public void click_on_save() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement saveBtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
//			act.click(saveBtn).build().perform();
		saveBtn.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	@After
	public void tearDown() {
		driver.close();
	}

}
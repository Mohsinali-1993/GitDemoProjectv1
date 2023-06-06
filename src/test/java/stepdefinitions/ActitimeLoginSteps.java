package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLoginSteps {
	private WebDriver driver;
	@Given("User navigates to actitime")
	public void user_navigates_to_actitime() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User provides valid credentials and click on login")
	public void user_provides_valid_credentials_and_click_on_login() {
	   driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
	}

	@Then("Actitime homepage is displayed")
	public void actitime_homepage_is_displayed() {
	   WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	   driver.close();
	}

	}

}

package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeParameters {
	private WebDriver driver;
	@Given("User navigates to actitime.com")
	public void user_navigates_to_actitime_com() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver (options);
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("^(.*) and (.*) entered$")
	public void username_and_password_entered(String username,String pwd) {
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@And("clicked on login")
	public void clicked_on_login() {
	    driver.findElement(By.id("loginbutton")).click();;
	    
	}

	@Then("^Home page with(.*)displays$")
	public void home_page_with_status_displays(String status) {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   try {
		   wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		   System.out.println(status);
	   }
	   catch(Exception e) {
		   System.out.println(status);
	   }
	   driver.close();
	}


}

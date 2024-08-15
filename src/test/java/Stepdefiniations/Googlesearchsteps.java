package Stepdefiniations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearchsteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is opnened");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
		driver.manage().window().maximize();
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
		String URL = "https://www.google.com/";
		driver.get(URL);
		System.out.println("user is in google page");   
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("https://www.amazon.com/");
		System.out.println("user enter a text in search box");
	   
	}

	@And("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	    
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user navigated to the search results");
		driver.findElement(By.xpath("//*[contains(@class, 'LC20lb MBeuO DKV0Md')]")).click();
		Thread.sleep(10);
		//driver.findElement(By.xpath("//button[@type='submit' and @class='a-button-text' and text()='Continue shopping']"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy s24 ultra");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}

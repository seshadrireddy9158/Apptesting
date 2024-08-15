package Stepdefiniations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderPhone {
    private WebDriver driver;

    public OrderPhone() {
        // Set up WebDriver
    	String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
		driver.manage().window().maximize();
    }

    public void orderPhone(String phoneType) {
        switch (phoneType) {
            case "iphone":
                orderIPhone();
                break;
            case "samsung":
                orderSamsung();
                break;
            case "moto g":
                orderMotoG();
                break;
            default:
                throw new IllegalArgumentException("Unknown phone type: " + phoneType);
        }
    }

    private void orderIPhone() {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone')]")).click();
        // Additional steps to complete the purchase
    }

    private void orderSamsung() {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Phone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy')]")).click();
        // Additional steps to complete the purchase
    }

    private void orderMotoG() {
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Moto G");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Moto G')]")).click();
        // Additional steps to complete the purchase
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}

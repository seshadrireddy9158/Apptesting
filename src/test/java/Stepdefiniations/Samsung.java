package Stepdefiniations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samsung implements Phone {
    private WebDriver driver;

    public Samsung(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void order() {
        // Navigate to Samsung page on Amazon and order
        driver.get("https://www.amazon.com");
        
        driver.findElement(By.xpath("//*[contains(@class, 'LC20lb MBeuO DKV0Md')]")).click();
		
		//driver.findElement(By.xpath("//button[@type='submit' and @class='a-button-text' and text()='Continue shopping']"));
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung galaxy s24 ultra");
		driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Phone");
       // driver.findElement(By.id("nav-search-submit-button")).click();
       // driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy')]")).click();
        // Additional steps to complete the purchase
    }
}


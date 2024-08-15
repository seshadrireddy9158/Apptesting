package Stepdefiniations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iPhone implements Phone {
    private WebDriver driver;

    public iPhone(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void order() {
        // Navigate to iPhone page on Amazon and order
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone')]")).click();
        // Additional steps to complete the purchase
    }
}

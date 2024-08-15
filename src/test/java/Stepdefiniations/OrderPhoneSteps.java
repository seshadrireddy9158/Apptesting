package Stepdefiniations;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class OrderPhoneSteps {
    private WebDriver driver;

    @Given("I want to order a phone")
    public void i_want_to_order_a_phone() {
        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which phone would you like to order? (iPhone/Samsung/Moto G): ");
        String phoneType = scanner.nextLine().trim().toLowerCase();

        // Validate input and proceed only if valid
        if (!phoneType.equals("iphone") && !phoneType.equals("samsung") && !phoneType.equals("moto g")) {
            System.out.println("Invalid phone type entered. Please enter 'iPhone', 'Samsung', or 'Moto G'.");
            return;  // Exit the method without executing further steps
        }

        // Initialize OrderPhone class after receiving input
        OrderPhone orderPhone = new OrderPhone();
        
        // Execute the order based on user input
        orderPhone.orderPhone(phoneType);

        // Close the browser
        orderPhone.closeBrowser();
    }
}

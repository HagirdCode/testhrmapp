package testhrmweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTrail {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/");

        //Thread.sleep(3000);
       
        WebElement EmailHomePage = driver.findElement(By.id("Form_submitForm_EmailHomePage"));
       EmailHomePage.sendKeys("testuser@example.com");
       Thread.sleep(1000);
       
       WebElement actionrequest = driver.findElement(By.id("Form_submitForm_action_request")); // Replace with the correct ID if necessary
       actionrequest.click();
       Thread.sleep(1000);
       
       WebElement subdomain = driver.findElement(By.id("Form_getForm_subdomain")); // Replace with the correct ID if necessary
       subdomain.sendKeys("quantamHR");
       Thread.sleep(1000);
       
       WebElement Fullname = driver.findElement(By.id("Form_getForm_Name")); // Replace with the correct ID if necessary
       Fullname.sendKeys("HR Ashwini Reddy");
       Thread.sleep(1000);
       
       WebElement Contact = driver.findElement(By.id("Form_getForm_Contact")); // Replace with the correct ID if necessary
       Contact.sendKeys("9182548528");
       Thread.sleep(1000);
        
       WebElement countryDropdown = driver.findElement(By.id("Form_getForm_Country")); // Replace with the actual ID
        
            // Create an instance of the Select class
            Select selectCountry = new Select(countryDropdown);
            // Select a country by visible text
            selectCountry.selectByVisibleText("India");
            Thread.sleep(6000); // 60 seconds (adjust as needed)

            // Locate and click the "Get Your Free Trial" button
       WebElement freeTrialButton = driver.findElement(By.id("Form_getForm_action_submitForm")); // Replace with actual ID
            freeTrialButton.click();

       driver.manage().window().maximize();   
    
    }
}
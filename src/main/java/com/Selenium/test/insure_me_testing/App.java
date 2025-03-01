package com.Selenium.test.insure_me_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import java.time.Duration;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
    	
    	
//adding headless browser options to sync to Ubuntu
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--headless");
    	
    	WebDriver driver = new ChromeDriver(options);
    	
    	driver.get("http://52.15.99.215:8082/contact.html");
    	
    	Thread.sleep(2000);
        System.out.println(driver.getTitle());

       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("First Name");
        Thread.sleep(2000);
        WebElement number = driver.findElement(By.id("inputNumber"));
        number.sendKeys("9999999880");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("inputMail"));
        email.sendKeys("abc@xyz.com");
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.id("inputMessage"));
        message.sendKeys("Hello and Welcome");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.id("my-button"));
         submitButton.click();
         Thread.sleep(2000);
        WebElement displaymessage = driver.findElement(By.id("response"));
        displaymessage.getText();
        Thread.sleep(2000);
        Thread.sleep(2000);
        if(displaymessage.getText().equalsIgnoreCase("Message Sent"))
        {
        	System.out.println("Passed");
        }
        else
        {
        	System.out.println("Failure");
        }

        driver.quit();
    }
}

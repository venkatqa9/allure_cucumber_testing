package com.frameworkutils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
//        //simpleAlert
//        driver.findElement(By.id("alertBox")).click();
//        Alert simpleAlert=driver.switchTo().alert();
//        System.out.println(simpleAlert.getText());
//        Thread.sleep(2000);
//        simpleAlert.accept();
//        driver.quit();

        //confirmationAlert
//        driver.findElement(By.id("confirmBox")).click();
//        Alert confirmationAlert=driver.switchTo().alert();
//        System.out.println(confirmationAlert.getText());
//        Thread.sleep(2000);
//        confirmationAlert.accept();
//        System.out.println(driver.findElement(By.id("output")).getText());
//        driver.quit();

        //PromptAlert
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert=driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        Thread.sleep(2000);
        promptAlert.sendKeys("Venkat");
        promptAlert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();

    }
}

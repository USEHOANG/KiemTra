package com.example.PH48214_02032025.Phan3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium {

    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://www.zoho.com/signup.html");
    }

    @Test
    public void testDangKy() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.zoho.com/signup.html");


        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("luongvanhoang27072001@gmail.com");

        WebElement inputMK = driver.findElement(By.xpath("//input[@id='password']"));
        inputMK.sendKeys("Hoang@Hh");

        WebElement danhnhap123 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='signup-termservice']")));
        danhnhap123.click();


        WebElement dangky = driver.findElement(By.xpath("//input[@id='signupbtn']"));
        dangky.click();
    }

//    @Test
//    public void testDangNhap() {
//        driver.get("https://accounts.zoho.com/signin?servicename=ZohoHome&signupurl=https://www.zoho.com/signup.html");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//
//
//        // Chờ modal mở ra (chờ ô nhập tài khoản xuất hiện)
//        WebElement inputSDT = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login_id']")));
//        inputSDT.sendKeys("luongvanhoang27072001@gmail.com");
//
//        WebElement danhnhap123 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Đăng nhập')]")));
//        danhnhap123.click();
//
//        WebElement inputMK = driver.findElement(By.xpath("//input[@id='password']"));
//        inputMK.sendKeys("Hoang@Hh");
//
//        WebElement dangnhap = driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Đăng nhập')]"));
//        dangnhap.click();
//    }

}

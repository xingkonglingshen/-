package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SWJtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cn.bing.com/");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement element = driver.findElement(By.id("sb_form_q"));
        element.sendKeys("全职高手");
        element.submit();
        driver.quit();
    }
}

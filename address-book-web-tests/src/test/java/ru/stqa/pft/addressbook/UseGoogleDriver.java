package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.lang.*;

public class UseGoogleDriver {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Java test\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    /*driver.get ("https://www.google.com");
    System.out.println(driver.getTitle());*/
    driver.get("http://localhost:8080/addressbook/");

    /*Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();*/
  }
}

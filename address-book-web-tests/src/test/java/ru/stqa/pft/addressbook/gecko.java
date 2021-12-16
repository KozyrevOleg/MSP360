package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;
import java.lang.*;

public class gecko {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdrider.chrome.driver", "C:\\Java test\\Selenium\\chromedriver");
    WebDriver driver = new ChromeDriver();
    /*driver.get ("https://www.google.com");
    System.out.println(driver.getTitle());*/
    driver.get("http://www.google.com/");

    Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
}

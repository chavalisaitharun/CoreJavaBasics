package org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {
	public static void main(String[] args) {
		String s="C:\\Users\\C THARUN\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",s);
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html ");
        WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        Actions a=new Actions(driver);
        a.dragAndDrop(src, dest);
        
        
        
        
        
    }

	}
package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class Amazon {
    private static HTMLInputElement searchBtn;

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        if (buttons.size() == 1) {
            //we see cookies!
            WebElement element = buttons.get(1);
            element.click();
        }
        WebElement searchInput = driver.findElement(By.name("field-keywords"));
        searchInput.sendKeys("iphone 15");
        searchInput.click();
        Thread.sleep(1500);
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
        searchBtn.click();
        driver.quit();
    }
}

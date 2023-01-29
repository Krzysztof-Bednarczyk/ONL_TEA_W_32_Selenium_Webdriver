package Konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.get("https://www.google.com/");

        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("Wielka Orkiestra");
        searchBar.submit();
        driver.quit();
    }
}

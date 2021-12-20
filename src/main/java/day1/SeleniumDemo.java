package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Main Folder\\SATT\\Selenium\\Projects\\SeleniumLevel1\\src\\main\\java\\Executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

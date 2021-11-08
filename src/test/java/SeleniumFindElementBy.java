import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumFindElementBy {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//li/div/p[text()='Login or Create Account']")).click();

        driver.findElement(By.cssSelector("input[id='newusername']")).sendKeys("jobs.savita87@gmail.com");

        driver.close();
    }
}
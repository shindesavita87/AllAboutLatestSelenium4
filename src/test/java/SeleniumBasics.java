import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //This will open new firefox browser
        FirefoxDriver driver = new FirefoxDriver();

        //This will maximize the browser
        driver.manage().window().maximize();

        //This will type URL in firefox browser also we can able to user another method to open URL
        driver.get("http://demo.guru99.com/test/newtours/");

        //click is used to click
        driver.findElement(By.linkText("Home")).click();

        driver.close();
    }
}

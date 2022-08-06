import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SeleniumMyFirstProgramme {
 
    public static void main(String[] args) {
        //This will open new firefox browser
        FirefoxDriver driver = new FirefoxDriver();
 
        //This will maximize the browser
        driver.manage().window().maximize();       
 
        //This will type URL in firefox browser also we can able to user another method to open URL
        //driver.navigate().to("http://newtours.demoaut.com/");
        driver.get("http://demo.guru99.com/test/newtours/");
 
        //sendKeys method is used to type
        driver.findElement(By.name("userName")).sendKeys("savita20");
        driver.findElement(By.name("password")).sendKeys("*****");
 
        //click is used to click
        driver.findElement(By.name("submit")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualText=driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(actualText,"Login Successfully", "Unable to verify 'Login Successfully' message..");

        driver.close();
 }
}

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumWebDriverAllMethods {
 
    public static void main(String[] args) throws NoSuchElementException {
 
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
        // This will return current page URL.
        System.out.println("\n Page URL : " + driver.getCurrentUrl());
 
        // This will return Page Title
        System.out.println("\n Page Tittle : " + driver.getTitle());
 
        // This will return class name
        System.out.println("\n Class Name : " + driver.getClass());
 
        driver.findElementByLinkText("REGISTER").click();
        // driver will click on browser back
        driver.navigate().back();
 
        // /This will click on browser forward
        driver.navigate().forward();
 
        driver.findElementByLinkText("SIGN-ON").click();
 
        List element = driver.findElements(By.tagName("a"));
        System.out.println("\n How to get Size example: " + element.size());
 
        driver.findElementByName("userName").sendKeys("savita20");
        WebElement ele5 = driver.findElementByName("password");
        ele5.sendKeys("@Savita20");
        String css_val = ele5.getCssValue("background-color");
        System.out.println("\n Get CSS value example: " + css_val);
        String value = ele5.getAttribute("value");
        System.out.println("\n Get value example: " + value);
 
        WebElement ele1 = driver.findElementByName("submit");
        System.out.println("\n Get Text Example: " + ele1.getText());
        System.out.println("\n Get X Y axis location example: " + ele1.getLocation());
        System.out.println("\n How to get tag name example: " + ele1.getTagName());
 
        WebElement ele2 = driver.findElementByName("submit");
        System.out.println("\n getAttribute example Get Attribute named as type: "+ ele2.getAttribute("type"));
        // This will click on submit button
        ele2.click();

        //This will verify if user is logged in successfully
        String actualText=driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(actualText,"Login Successfully", "Unable to verify 'Login Successfully' message..");

        //This is used for check-box or radio button to check whether selected or not.
        driver.findElement(By.linkText("Flights")).click();
        Boolean val = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]")).isSelected();
        System.out.println("\n isSelected example: " + val);
 
        //This will be useful when page have dynamic fields & we have to wait until element is displayed
        Boolean val1 = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]")).isDisplayed();
        System.out.println("\n isDisplayed example: " + val1);
 
        //This will be useful when we have to wait until element is enable
        Boolean val2 = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]")).isEnabled();
        System.out.println("\n isDisplayed example: " + val2);
 
        // This will click on browser refresh
        driver.navigate().refresh();
 
        // This will return page source
    System.out.println("\n Page Source : " + driver.getPageSource());
 
        driver.close();
    }
}
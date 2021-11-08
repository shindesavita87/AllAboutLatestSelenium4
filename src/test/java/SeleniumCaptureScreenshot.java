import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SeleniumCaptureScreenshot {

    public static void main(String[] args) throws IOException {

        // This will open new firefox browser
        FirefoxDriver driver = new FirefoxDriver();

        // This will maximize the browser
        driver.manage().window().maximize();

        // This will wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // This will type URL in firefox browser
        driver.navigate().to("http://demo.guru99.com/test/newtours/");

        try {
            String img = (new SimpleDateFormat("yyMMddHHmmssZ")).format(new Date());

            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(System.getProperty("user.dir") + "/screenshots/" + img + ".png");
            FileHandler.copy(source, dest);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Screenshot captured successfully...");
        driver.close();
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchUrl_FF {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C://Users//manorsah//JARS//geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://demoqa.com");
        driver.quit();
        System.out.println("Execution complete");
//
    }
}
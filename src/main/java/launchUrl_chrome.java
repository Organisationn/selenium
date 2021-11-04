import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchUrl_chrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//manorsah//JARS//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demoqa.com");
        driver.quit();
        System.out.println("Execution complete");
//
    }
}
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.HasAuthentication;
//import org.openqa.selenium.HasCapabilities;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class launchUrl_chrome {
//    protected static final String USER_AGENT= "Automation";
//
//    public static void main(String[] args) throws InterruptedException {
////        System.setProperty("webdriver.chrome.driver","C://Users//manorsah//JARS//chromedriver.exe");
////        WebDriver driver=new ChromeDriver();
////        driver.get("http://demoqa.com");
////        driver.quit();
////        System.out.println("Execution complete");
//        WebDriverManager.chromedriver().setup();
//        DesiredCapabilities capa = new DesiredCapabilities().chrome();
//        capa.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        ChromeOptions co= new ChromeOptions();
//        co.addArguments("--user-agent=" + USER_AGENT);
//        capa.setCapability(ChromeOptions.CAPABILITY, co);
//
//
//        // System.setProperty("webdriver.chrome.driver","C://Users//manorsah//JARS//chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://demoqa.com");
//        driver.quit();
//        System.out.println("Execution complete");
////
//    }
//}
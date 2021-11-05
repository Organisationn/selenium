import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class launchUrl_FF {
    WebDriver driver;
    By txtUserName=By.xpath("//input[@id='userInput']");
    By txtPwd=By.xpath("//input[@id='passwordInput']");
    By btnLogin=By.xpath("//input[@id='login-button']");
    By btnRegisterCustomer=By.xpath("//button[contains(text(),'Register Customer')]");
    By imgCisco=By.xpath("//img[contains(@src,'logo.svg')]");
    By txtCustomerRegistry=By.xpath("//h1[contains(text(),'Customer Registry')]");

    @BeforeTest
    public void initialSetUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//manorsah//JARS//chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C://Users//manorsah//JARS//geckodriver.exe");
        driver=new FirefoxDriver();
//        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cr-cust-registration-ys3.cisco.com/#/cr-form");
        Thread.sleep(3000);
    }
    WebDriverWait wait=new WebDriverWait(driver,30);
// Validate the UI is loaded properly once we launch the URL
    @Test(priority = 1)
    public  void login() throws InterruptedException {

        driver.findElement(txtUserName).sendKeys("manorsah@cisco.com");
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtPwd));
//        String strPassword="Jhuni@2019";
//        String strDecriptedPwd = (StringUtils.newStringUtf8(Base64.decodeBase64(strPassword)));
        driver.findElement(txtPwd).sendKeys("Jhuni@2019");
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnRegisterCustomer)));
        System.out.println("Execution completed TC01");
    }

    @Test(priority = 2)
    public  void verifyLogoAndPageTitle() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(imgCisco));
        if(driver.findElement(imgCisco).isDisplayed()){
            System.out.println("Cisco logo displayed");
        }
        else{
            System.out.println("Cisco logo is not displayed");
        }

        System.out.println("Execution completed TC02");
    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
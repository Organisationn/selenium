package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.xpathUtil;
import java.io.File;
import java.util.UUID;

public class TC16_Download_Customer_Name_Address_Validation_Upload_Template {
    WebDriver driver;
    File folder;
    String projectPath = System.getProperty("user.dir");

    By btnDownloadTemplate = By.xpath(xpathUtil.BTN_DOWNLOAD_TEMPLATE);
    By txtUserName = By.xpath(xpathUtil.TXT_USER_NAME);
    By txtPwd = By.xpath(xpathUtil.TXT_PWD);
    By btnLogin = By.xpath(xpathUtil.BTN_LOGIN);
    By lnkCustomerAddressValidation = By.xpath(xpathUtil.LNK_CUSTOMERADDRESSVALIDATION);

    @BeforeTest
    public void VerifyLoginAndsetUp() {
        //below code will create a random number like "88889-99988-909090-98988--09909"
        folder=new File(UUID.randomUUID().toString());
        folder.mkdir();//this will return a boolean value which will confirm if file got created or not
        System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/java/drivers/geckodriver.exe");
        FirefoxProfile profile =new FirefoxProfile();
        profile.setPreference("browser.download.dir", folder.getAbsolutePath());
        profile.setPreference("browser.download.folderList",0);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","image/jpeg,application/pdf,application/octet-stream");
        profile.setPreference("pdfjs.disabled", true);
        profile.setPreference("browser.download.panel.shown", false);
//        driver = new FirefoxDriver(profile);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);

        driver = new FirefoxDriver(capabilities);
    }

    @Test
    public void validateDownloadSearchResult() throws InterruptedException {
        driver.get("https://cr-cust-registration-ys3.cisco.com/#/cr-form");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String strUn = System.getenv("EMAIL");
        wait.until(ExpectedConditions.elementToBeClickable(txtUserName));
        driver.findElement(txtUserName).sendKeys(strUn);
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtPwd));
        String strPwd = System.getenv("PASSWORD");
        driver.findElement(txtPwd).sendKeys(strPwd);
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(lnkCustomerAddressValidation));
        driver.findElement(lnkCustomerAddressValidation).click();
        wait.until(ExpectedConditions.elementToBeClickable(btnDownloadTemplate));
        driver.findElement(btnDownloadTemplate).click();
        Thread.sleep(2000);
        System.out.println("Execution completed TC16");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        for (File file:folder.listFiles()){
            file.delete();
        }
        folder.delete();
    }

}

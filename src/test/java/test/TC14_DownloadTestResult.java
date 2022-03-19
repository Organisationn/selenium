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

public class TC14_DownloadTestResult {
    WebDriver driver;
    File folder;
    String projectPath = System.getProperty("user.dir");

    By btnDownloadResult = By.xpath(xpathUtil.BTN_DOWNLOAD_SEARCH_RESULT);
    By txtUserName = By.xpath(xpathUtil.TXT_USER_NAME);
    By txtPwd = By.xpath(xpathUtil.TXT_PWD);
    By btnLogin = By.xpath(xpathUtil.BTN_LOGIN);
    By lnkCustomerAddressValidation = By.xpath(xpathUtil.LNK_CUSTOMERADDRESSVALIDATION);

    @BeforeTest
    public void VerifyLoginAndsetUp() {
        //below code will create a random number like "88889-99988-909090-98988--09909"
        folder=new File(UUID.randomUUID().toString());
        folder.mkdir();//this will return a boolean value which will confirm if file got created or not

         //chrome
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/java/drivers/chromedriver.exe");
////      Before launching chrome we have to do below set ups 1st
//        ChromeOptions options=new ChromeOptions();
//        Map<String, Object> prefs=new HashMap<>();
//        prefs.put("profile.default_content_settings.popups", 0);
//        prefs.put("download.default_directory", folder.getAbsolutePath());
//        options.setExperimentalOption("prefs", prefs);
//        DesiredCapabilities cap=DesiredCapabilities.chrome();
//        cap.setCapability(ChromeOptions.CAPABILITY,options);
//
//        driver = new ChromeDriver(cap);
//        driver.manage().window().maximize();
        //firefox
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
    public void validateDownloadSearchResult() throws InterruptedException{
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
        wait.until(ExpectedConditions.elementToBeClickable(btnDownloadResult));
        driver.findElement(btnDownloadResult).click();
        Thread.sleep(2000);

//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        File listOfFiles[]= folder.listFiles();
//        //make sure directory is not empty
////        Assert.assertEquals(listOfFiles.length,is(not(0)));
//        Assert.assertTrue(listOfFiles.length>0);
//
//        for (File file:listOfFiles){
//            //make sure downloaded file is not empty
////            Assert.assertEquals(file.length(),is(not((long)0)));
//            Assert.assertTrue(file.length()>0);
//        }
        System.out.println("Execution completed TC14");
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

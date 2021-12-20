package page;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Properties;
import util.xpathUtil;

public class launchUrl_FF {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
//    private static Logger logger = LogManager.getLogger(Log4jDemo.class);
    private static Logger logger = LogManager.getRootLogger();

    By txtUserName=By.xpath(xpathUtil.TXT_USER_NAME);
    By txtPwd=By.xpath(xpathUtil.TXT_PWD);
    By btnLogin=By.xpath(xpathUtil.BTN_LOGIN);
    By btnRegisterCustomer=By.xpath(xpathUtil.BTN_REGISTER_CUSTOMER);
    By imgCisco=By.xpath(xpathUtil.TXT_IMG_CISCO);
    By txtCustomerRegistry=By.xpath(xpathUtil.TXT_CUSTOMER_REGISTRY);
    By btnNewCustomerRegistration=By.xpath(xpathUtil.BTN_NEW_CUSTOMER_REGISTRATION);
    By btnCustomerAddrValidation=By.xpath(xpathUtil.BTN_CUSTOMER_ADDR_VALIDATION);
    By lblCountry=By.xpath(xpathUtil.LBL_COUNTRY);
    By lblCustomerCompanyName=By.xpath(xpathUtil.LBL_CUSTOMER_COMPANY_NAME);
    By lblState=By.xpath(xpathUtil.LBL_STATE);
    By lblAddress1=By.xpath(xpathUtil.LBL_ADDRESS1);
    By lblAddress2=By.xpath(xpathUtil.LBL_ADDRESS2);
    By lblAddress3=By.xpath(xpathUtil.LBL_ADDRESS3);
    By lblAddress4=By.xpath(xpathUtil.LBL_ADDRESS4);
    By lblCity=By.xpath(xpathUtil.LBL_CITY);
    By lblZipCode=By.xpath(xpathUtil.LBL_ZIP_CODE);
    By lblWebDomain=By.xpath(xpathUtil.LBL_WEB_DOMAIN);
    By lblIdentificationType=By.xpath(xpathUtil.LBL_IDENTIFICATION_TYPE);
    By lblIdentificationNumber=By.xpath(xpathUtil.LBL_IDENTIFICATION_NUMBER);
    By lblPrimaryIndustry=By.xpath(xpathUtil.LBL_PRIMARY_INDUSTRY);
    By lblSegmentation=By.xpath(xpathUtil.LBL_SEGMENTATION);
    By lblReferenceURL=By.xpath(xpathUtil.LBL_REFERENCE_URL);
    By lblReferenceGUID=By.xpath(xpathUtil.LBL_IREFERENCE_GUID);
    By btnReset=By.xpath(xpathUtil.BTN_RESET);
    By imgTWebDomain=By.xpath(xpathUtil.IMG_WEB_DOMAIN);
    By imgTIdentificationType=By.xpath(xpathUtil.LBL_IDENTIFICATION_TYPE);
    By imgTIdentificationNumber=By.xpath(xpathUtil.LBL_IDENTIFICATION_NUMBER);
    By imgTPrimaryIndustry=By.xpath(xpathUtil.IMG_PRIMARY_INDUSTRY);
    By imgTReferenceUrl=By.xpath(xpathUtil.IMG_REFERENCE_URL);
    By imgSegmentation=By.xpath(xpathUtil.IMG_SEGMENTATION);
    By imgRefGUID=By.xpath(xpathUtil.IMG_REF_GUID);
    By txtErrorHighlights=By.xpath(xpathUtil.TXT_ERROR_HIGHLIGHTS);
    By ddCountry=By.xpath(xpathUtil.DD_COUNTRY);
    By ddCountryOption=By.xpath(xpathUtil.DD_COUNTRY_OPTION);
    By txtDefaultCountryOption=By.xpath(xpathUtil.TXT_DEFAULT_COUNTRY_OPTION);

    @BeforeTest
    public void initialSetUp() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        driver = basePage.init_driver(prop);
    }

    // Validate the UI is loaded properly once we launch the URL
    @Test(priority = 1)
    public void login(){
        WebDriverWait wait=new WebDriverWait(driver,30);
        String strUn=System.getenv("EMAIL");
        wait.until(ExpectedConditions.elementToBeClickable(txtUserName));
        driver.findElement(txtUserName).sendKeys(strUn);
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtPwd));
        String strPwd=System.getenv("PASSWORD");
        driver.findElement(txtPwd).sendKeys(strPwd);
        driver.findElement(btnLogin).click();
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isEnabled());
        System.out.println("Home Page is Displayed");
        System.out.println("Execution completed TC01");
        logger.info("Home Page is Displayed");

    }
    //    Validate the Cisco Logo and Customer Registry Page title is displayed properly
    @Test(priority = 2)
    public void verifyLogoAndPageTitle() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(imgCisco));
        Assert.assertTrue(driver.findElement(imgCisco).isDisplayed());
        System.out.println("Cisco logo displayed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtCustomerRegistry));
        Assert.assertEquals(driver.findElement(txtCustomerRegistry).getText(),"Customer Registry");
        System.out.println("Customer Registry Page title is displayed");

        System.out.println("Execution completed TC02");
    }
    //    Validate the Cisco Logo and Customer Registry Page title is displayed properly
    @Test(priority = 3)
    public void verifyCRAndCustomerValidationTabs() throws InterruptedException {
        Assert.assertTrue(driver.findElement(btnNewCustomerRegistration).isDisplayed());
        System.out.println("New Customer Registration tab is displayed");
        Assert.assertTrue(driver.findElement(btnCustomerAddrValidation).isEnabled());
        Assert.assertTrue(driver.findElement(btnCustomerAddrValidation).isDisplayed());
        System.out.println("Customer & Address Validation tab is enabled and displayed");
        System.out.println("Execution completed TC03");
    }
    @Test(priority = 4)
    public void verifyCRTabIsSelected() {
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isDisplayed());
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isEnabled());
        System.out.println("New Customer Registration tab is selected");
        System.out.println("Execution completed TC04");
    }
    //Validate that the New Customer Registration tab contains all the fields along with the Reset and Register Customer button
    @Test(priority = 5)
    public void verifyPresenceOfAllFields(){
        Assert.assertTrue(driver.findElement(lblCountry).isDisplayed() && driver.findElement(lblCustomerCompanyName).isDisplayed() && driver.findElement(lblState).isDisplayed() && driver.findElement(lblAddress1).isDisplayed() && driver.findElement(lblAddress2).isDisplayed() && driver.findElement(lblAddress3).isDisplayed() && driver.findElement(lblAddress4).isDisplayed() && driver.findElement(lblCity).isDisplayed() && driver.findElement(lblZipCode).isDisplayed() && driver.findElement(lblWebDomain).isDisplayed() && driver.findElement(lblIdentificationType).isDisplayed() && driver.findElement(lblIdentificationNumber).isDisplayed() && driver.findElement(lblPrimaryIndustry).isDisplayed() && driver.findElement(lblSegmentation).isDisplayed() && driver.findElement(lblReferenceURL).isDisplayed() && driver.findElement(lblReferenceGUID).isDisplayed() && driver.findElement(btnReset).isDisplayed() && driver.findElement(btnRegisterCustomer).isDisplayed());
        System.out.println("All Mandatory fields are displayed");
        System.out.println("Execution completed TC05");
    }
    //Verify the tooltip text is displayed when user hover over for Web Domain
    @Test(priority = 6,enabled = false)
    public void verifyWebDomainTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTWebDomain)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgTWebDomain).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Official website of the Company");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC06");
    }
    //    Verify the tooltip text is displayed when user hover over for Identification Type
    @Test(priority = 7,enabled = false)
    public void verifyIdentificationTypeTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTIdentificationType)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgTIdentificationType).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Company Registration Number or Tax Identification Number");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC07");
    }
    //    Verify the tooltip text is displayed when user hover over for Identification Type
    @Test(priority = 8,enabled = false)
    public void verifyIdentificationNumberTooltipText(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTIdentificationNumber)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgTIdentificationNumber).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Value of Idenitfication Type");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC08");
    }
    // Verify the tooltip text is displayed when user hover over for Primary Industry
    @Test(priority = 9,enabled = false)
    public void verifyPrimaryIndustryTooltipText() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTPrimaryIndustry)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgTPrimaryIndustry).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Type of Business");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC09");
    }
    // Verify the tooltip text is displayed when user hover over for Reference URL
    @Test(priority = 10,enabled = false)
    public void verifyReferenceURLTooltipText(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTReferenceUrl)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgTReferenceUrl).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Type of Business");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC10");
    }

    // Verify the tooltip text is displayed when user hover over for Segmentation
    @Test(priority = 11,enabled = false)
    public void verifySegmentationTooltipText(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgSegmentation)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgSegmentation).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Company market segmentation");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC11");
    }
    // Verify the tooltip text is displayed when user hover over for Reference GU ID
    @Test(priority = 12,enabled = false)
    public void verifyReferenceGIDTooltipText(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgRefGUID)).build().perform();
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
        String toolTipText= driver.findElement(imgRefGUID).getAttribute("value");
        System.out.println(toolTipText);
        Assert.assertEquals(toolTipText,"Company Global Ultimate ID(Parent Company)");
        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC12");
    }
    // Validate that User is not allowed to Register Customer if any mandatory fields are not filled and the field is highlighted in red once after clicking on Register Customer
    @Test(priority = 13)
    public void verifyFieldsMandatoryToFillForRegistration(){
        driver.findElement(btnRegisterCustomer).click();
        List<WebElement> links = driver.findElements(txtErrorHighlights);
        System.out.println("Numbers of highlighted errors: "+links.size());
        String txtErrorCustomerCompanyName=driver.findElement(lblCustomerCompanyName).getAttribute("class");
        String txtErrorState=driver.findElement(lblState).getAttribute("class");
        String txtErrorAddress1=driver.findElement(lblAddress1).getAttribute("class");
        String txtErrorCity=driver.findElement(lblCity).getAttribute("class");
        String txtErrorZipCode=driver.findElement(lblZipCode).getAttribute("class");
        String txtErrorWebDomain=driver.findElement(lblWebDomain).getAttribute("class");
        String txtErrorPrimaryIndustry=driver.findElement(lblPrimaryIndustry).getAttribute("class");
        String txtErrorSegmentation=driver.findElement(lblSegmentation).getAttribute("class");

        Assert.assertEquals(txtErrorCustomerCompanyName,"required error");
        Assert.assertEquals(txtErrorState,"required error");
        Assert.assertEquals(txtErrorAddress1,"required error");
        Assert.assertEquals(txtErrorCity,"required error");
        Assert.assertEquals(txtErrorZipCode,"required error");
        Assert.assertEquals(txtErrorWebDomain,"required error");
        Assert.assertEquals(txtErrorPrimaryIndustry,"required error");
        Assert.assertEquals(txtErrorSegmentation,"required error");

        System.out.println("All mandatory fields are highlighted successfully");

    }
    // Validate that Country is a mandatory field and a drop down
    @Test(priority = 15)
    public void verifyCountryIsMandatoryAndElementType(){
        String strClassValue=driver.findElement(lblCountry).getAttribute("class");
        Assert.assertEquals(strClassValue,"required");
        System.out.println("Country is a mandatory field");
        driver.findElement(ddCountry).click();
        driver.findElement(ddCountryOption).click();

        String strOptionCoutry=driver.findElement(ddCountryOption).getText();
        Assert.assertEquals(strOptionCoutry,"Uganda - UG");
        System.out.println("Country is a dropdown type web element");
    }
    // Validate that Country united states - US is selected by default
    @Test(priority = 14)
    public void verifyUSAsDefaultCountry(){
        String strCountryValue=driver.findElement(txtDefaultCountryOption).getText();
        Assert.assertEquals(strCountryValue,"United States - US");
        logger.info("united states - US is auto selected");
    }
//    @AfterTest
//    public void quitBrowser(){
//        driver.quit();
//    }
}
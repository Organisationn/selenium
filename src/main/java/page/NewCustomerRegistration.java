package page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import util.xpathUtil;

public class NewCustomerRegistration {
    WebDriver driver;

    //    private static Logger logger = LogManager.getLogger(Log4jDemo.class);
    private static Logger logger = LogManager.getRootLogger();

    By txtUserName = By.xpath(xpathUtil.TXT_USER_NAME);
    By txtPwd = By.xpath(xpathUtil.TXT_PWD);
    By btnLogin = By.xpath(xpathUtil.BTN_LOGIN);
    By btnRegisterCustomer = By.xpath(xpathUtil.BTN_REGISTER_CUSTOMER);
    By imgCisco = By.xpath(xpathUtil.TXT_IMG_CISCO);
    By txtCustomerRegistry = By.xpath(xpathUtil.TXT_CUSTOMER_REGISTRY);
    By btnNewCustomerRegistration = By.xpath(xpathUtil.BTN_NEW_CUSTOMER_REGISTRATION);
    By btnCustomerAddrValidation = By.xpath(xpathUtil.BTN_CUSTOMER_ADDR_VALIDATION);
    By lblCountry = By.xpath(xpathUtil.LBL_COUNTRY);
    By lblCustomerCompanyName = By.xpath(xpathUtil.LBL_CUSTOMER_COMPANY_NAME);
    By lblState = By.xpath(xpathUtil.LBL_STATE);
    By lblAddress1 = By.xpath(xpathUtil.LBL_ADDRESS1);
    By lblAddress2 = By.xpath(xpathUtil.LBL_ADDRESS2);
    By lblAddress3 = By.xpath(xpathUtil.LBL_ADDRESS3);
    By lblAddress4 = By.xpath(xpathUtil.LBL_ADDRESS4);
    By lblCity = By.xpath(xpathUtil.LBL_CITY);
    By lblZipCode = By.xpath(xpathUtil.LBL_ZIP_CODE);
    By lblWebDomain = By.xpath(xpathUtil.LBL_WEB_DOMAIN);
    By lblIdentificationType = By.xpath(xpathUtil.LBL_IDENTIFICATION_TYPE);
    By lblIdentificationNumber = By.xpath(xpathUtil.LBL_IDENTIFICATION_NUMBER);
    By lblPrimaryIndustry = By.xpath(xpathUtil.LBL_PRIMARY_INDUSTRY);
    By lblSegmentation = By.xpath(xpathUtil.LBL_SEGMENTATION);
    By lblReferenceURL = By.xpath(xpathUtil.LBL_REFERENCE_URL);
    By lblReferenceGUID = By.xpath(xpathUtil.LBL_IREFERENCE_GUID);
    By btnReset = By.xpath(xpathUtil.BTN_RESET);
    By imgTWebDomain = By.xpath(xpathUtil.IMG_WEB_DOMAIN);
    By imgTIdentificationType = By.xpath(xpathUtil.LBL_IDENTIFICATION_TYPE);
    By imgTIdentificationNumber = By.xpath(xpathUtil.LBL_IDENTIFICATION_NUMBER);
    By imgTPrimaryIndustry = By.xpath(xpathUtil.IMG_PRIMARY_INDUSTRY);
    By imgTReferenceUrl = By.xpath(xpathUtil.IMG_REFERENCE_URL);
    By imgSegmentation = By.xpath(xpathUtil.IMG_SEGMENTATION);
    By imgRefGUID = By.xpath(xpathUtil.IMG_REF_GUID);
    By txtErrorHighlights = By.xpath(xpathUtil.TXT_ERROR_HIGHLIGHTS);
    By ddCountry = By.xpath(xpathUtil.DD_COUNTRY);
    By ddCountryOption = By.xpath(xpathUtil.DD_COUNTRY_OPTION);
    By ddCountryOption2 = By.xpath(xpathUtil.DD_COUNTRY_OPTION_Afghanistan);
    By txtDefaultCountryOption = By.xpath(xpathUtil.TXT_DEFAULT_COUNTRY_OPTION);
    By txtState = By.xpath(xpathUtil.TXT_STATE);
    By txtCity = By.xpath(xpathUtil.TXT_CITY);
    By txtZipCode = By.xpath(xpathUtil.TXT_ZIPCODE);
    By txtWebDomain = By.xpath(xpathUtil.TXT_WEBDOMAIN);
    By ddPrimaryIndustry = By.xpath(xpathUtil.DD_PRIMARY_INDUSTRY);
    By ddPrimaryIndustryOption = By.xpath(xpathUtil.DD_PRIMARY_INDUSTRY_OPTION);
    By txtCustomerCompanyName = By.xpath(xpathUtil.TXT_CUSTOMER_COMPANY_NAME);
    By txtAddress1 = By.xpath(xpathUtil.TXT_ADDRESS1);
    By ddSegmentation = By.xpath(xpathUtil.DD_SEGMENTATION);
    By ddSegmentationOption = By.xpath(xpathUtil.DD_SEGMENTATION_OPTION);
    By ddCountryOption1 = By.xpath(xpathUtil.DD_COUNTRY_RUSSIA);
    By ddIdentificationType = By.xpath(xpathUtil.DD_IDENTIFICATION_TYPE);
    By ddIdentificationOption = By.xpath(xpathUtil.DD_IDENTIFICATION_TYPE_OPTION);
    By optIndetificationtype = By.xpath(xpathUtil.OPT_IDENTIFICATION_TYPE);
    By txtIdentificationNumber = By.xpath(xpathUtil.TXT_IDENTIFICATION_NUMBER);
    By txtCityError = By.xpath(xpathUtil.TXT_CITY_ERROR);
    By ddState = By.xpath(xpathUtil.DD_STATE);
    By optState = By.xpath(xpathUtil.OPT_STATE);
    By optStateRussia = By.xpath(xpathUtil.OPT_STATE_RUSSIA);
    By txtErrorInvalidPostalCode = By.xpath(xpathUtil.TXT_ERROR_INVALID_POSTAL_CODE);
    By txtErrorIncorrectPostalCode = By.xpath(xpathUtil.TXT_ERROR_INCORRECT_POSTAL_CODE);
    By txtErrorInvalidCustomerCompanyName = By.xpath(xpathUtil.TXT_ERROR_INVALID_CUSTOMER_COMPANY_NAME);
    By txtPartyCreationForUS = By.xpath(xpathUtil.TXT_SUCCESSFUL_PARTY_CREATION_MESSAGE_US);
    By txtToolTipIdentificationType = By.xpath(xpathUtil.IMG_IDENTIFICATION_TYPE);
    By txtToolTipIdentificationNumber = By.xpath(xpathUtil.IMG_IDENTIFICATION_NUMBER);


    // initialize driver and utilities
    public NewCustomerRegistration(WebDriver driver) {
        this.driver = driver;
    }

    // Validate the UI is loaded properly once we launch the URL
//    @Test(priority = 1)
    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String strUn = System.getenv("EMAIL");
        wait.until(ExpectedConditions.elementToBeClickable(txtUserName));
        driver.findElement(txtUserName).sendKeys(strUn);
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtPwd));
        String strPwd = System.getenv("PASSWORD");
        driver.findElement(txtPwd).sendKeys(strPwd);
        driver.findElement(btnLogin).click();
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isEnabled());
        System.out.println("Home Page is Displayed");
        logger.info("Home Page is Displayed");
        System.out.println("Execution completed TC01");
    }

    //    Validate the Cisco Logo and Customer Registry Page title is displayed properly
//    @Test(priority = 2)
    public void verifyLogoAndPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(imgCisco));
        Assert.assertTrue(driver.findElement(imgCisco).isDisplayed());
        System.out.println("Cisco logo displayed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtCustomerRegistry));
        Assert.assertEquals(driver.findElement(txtCustomerRegistry).getText(), "Customer Registry");
        System.out.println("Customer Registry Page title is displayed");
        System.out.println("Execution completed TC02");
    }

    //    Validate that CR contains New Customer Registration and Customer & Address Validation tabs
//    @Test(priority = 3)
    public void verifyCRAndCustomerValidationTabs() {
        Assert.assertTrue(driver.findElement(btnNewCustomerRegistration).isDisplayed());
        System.out.println("New Customer Registration tab is displayed");
        Assert.assertTrue(driver.findElement(btnCustomerAddrValidation).isEnabled());
        Assert.assertTrue(driver.findElement(btnCustomerAddrValidation).isDisplayed());
        System.out.println("Customer & Address Validation tab is enabled and displayed");
        System.out.println("Execution completed TC03");
    }

    //    Validate that by default the New Customer Registration tab is selected
//    @Test(priority = 4)
    public void verifyCRTabIsSelected() {
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isDisplayed());
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isEnabled());
        System.out.println("New Customer Registration tab is selected");
        System.out.println("Execution completed TC04");
    }

    //Validate that the New Customer Registration tab contains all the fields along with the Reset and Register Customer button
//    @Test(priority = 5)
    public void verifyPresenceOfAllFields() {
        Assert.assertTrue(driver.findElement(lblCountry).isDisplayed() && driver.findElement(lblCustomerCompanyName).isDisplayed() && driver.findElement(lblState).isDisplayed() && driver.findElement(lblAddress1).isDisplayed() && driver.findElement(lblAddress2).isDisplayed() && driver.findElement(lblAddress3).isDisplayed() && driver.findElement(lblAddress4).isDisplayed() && driver.findElement(lblCity).isDisplayed() && driver.findElement(lblZipCode).isDisplayed() && driver.findElement(lblWebDomain).isDisplayed() && driver.findElement(lblIdentificationType).isDisplayed() && driver.findElement(lblIdentificationNumber).isDisplayed() && driver.findElement(lblPrimaryIndustry).isDisplayed() && driver.findElement(lblSegmentation).isDisplayed() && driver.findElement(lblReferenceURL).isDisplayed() && driver.findElement(lblReferenceGUID).isDisplayed() && driver.findElement(btnReset).isDisplayed() && driver.findElement(btnRegisterCustomer).isDisplayed());
        System.out.println("All Mandatory fields are displayed");
        System.out.println("Execution completed TC05");
    }

    //    Validate that user is able to fill all mandatory details and register a Customer successfully when Country is selected as "united states - US"
//    @Test(priority = 6)
    public void customerRegistrationForUS() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ddState));
        driver.findElement(ddState).click();
        driver.findElement(optState).click();

        driver.findElement(txtCity).sendKeys("phoenix");
        driver.findElement(txtZipCode).sendKeys("85097");
        driver.findElement(txtWebDomain).sendKeys("abc.com");
        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        driver.findElement(txtCustomerCompanyName).sendKeys("Innovative Solution Health Care");
        driver.findElement(txtAddress1).sendKeys("lane1");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();
        Thread.sleep(3000);
        String txtSuccessMsg = driver.findElement(txtPartyCreationForUS).getText();
        System.out.println("Message displayed post successful Party creation is: " + txtSuccessMsg);
        System.out.println("Execution completed TC06");
    }

    //    Validate that user is able to fill all mandatory details and register a Customer successfully when Country is selected as "afghanistan - AF"
//    @Test(priority = 7)
    public void customerRegistrationForAF() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(btnReset).click();
        wait.until(ExpectedConditions.elementToBeClickable(ddCountry));
        driver.findElement(ddCountry).click();
        driver.findElement(ddCountryOption2).click();

        driver.findElement(txtCity).sendKeys("ab bazak");
        driver.findElement(txtZipCode).sendKeys("3255");
        driver.findElement(txtWebDomain).sendKeys("InnovativeHealthCare.com");
        try {
            driver.findElement(ddPrimaryIndustry).click();
            driver.findElement(ddPrimaryIndustryOption).click();
        } catch(Exception e) {
            System.out.println("Inside catch block and trying again");
            driver.findElement(ddPrimaryIndustry).click();
            driver.findElement(ddPrimaryIndustryOption).click();
        }

        driver.findElement(txtCustomerCompanyName).sendKeys("Innovative Solution Health Care");
        driver.findElement(txtAddress1).sendKeys("lane3");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();
        Thread.sleep(5000);
        String txtSuccessMsg = driver.findElement(txtPartyCreationForUS).getText();
        System.out.println("Message displayed post successful Party creation is: " + txtSuccessMsg);
        System.out.println("Execution completed TC07");
    }

    //    Validate that user is able to fill all mandatory details and register a Customer successfully when Country is selected as "afghanistan - AF"
//    @Test(priority = 8)
    public void customerRegistrationForRU() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(btnReset).click();
        wait.until(ExpectedConditions.elementToBeClickable(ddCountry));
        driver.findElement(ddCountry).click();
        driver.findElement(ddCountryOption1).click();

        wait.until(ExpectedConditions.elementToBeClickable(ddState));
        driver.findElement(ddState).click();
        wait.until(ExpectedConditions.elementToBeClickable(optStateRussia));
        driver.findElement(optStateRussia).click();

        driver.findElement(txtCity).sendKeys("albazinka");
        driver.findElement(txtZipCode).sendKeys("676450");
        driver.findElement(txtWebDomain).sendKeys("InnovativeHealthCare.com");
        driver.findElement(ddIdentificationType).click();
        driver.findElement(ddIdentificationOption).click();

        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        driver.findElement(txtIdentificationNumber).sendKeys("1234321");
        driver.findElement(txtCustomerCompanyName).sendKeys("Innovative Solution Health Care");
        driver.findElement(txtAddress1).sendKeys("lane3");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();
        Thread.sleep(5000);
        String txtSuccessMsg = driver.findElement(txtPartyCreationForUS).getText();
        System.out.println("Message displayed post successful Party creation is: " + txtSuccessMsg);
        System.out.println("Execution completed TC08");
    }

    //Verify the tooltip text is displayed when user hover over for Web Domain
//    @Test(priority = 6, enabled = false)
    public void verifyWebDomainTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTWebDomain)).build().perform();
        Thread.sleep(1000);
//        String toolTipText = driver.findElement(imgTWebDomain).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Official website of the Company");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC10");
    }

    //    //    Verify the tooltip text is displayed when user hover over for Identification Type
//    @Test(priority = 7, enabled = false)
    public void verifyIdentificationTypeTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(txtToolTipIdentificationType)).build().perform();
        Thread.sleep(1000);
//        String toolTipText = driver.findElement(imgTIdentificationType).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Company Registration Number or Tax Identification Number");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC11");
    }

    //    //    Verify the tooltip text is displayed when user hover over for Identification Number
//    @Test(priority = 8, enabled = false)
    public void verifyIdentificationNumberTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(txtToolTipIdentificationNumber)).build().perform();
        Thread.sleep(1000);
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
//        String toolTipText = driver.findElement(imgTIdentificationNumber).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Value of Idenitfication Type");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC12");
    }

    //    // Verify the tooltip text is displayed when user hover over for Primary Industry
//    @Test(priority = 9, enabled = false)
    public void verifyPrimaryIndustryTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTPrimaryIndustry)).build().perform();
        Thread.sleep(1000);
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
//        String toolTipText = driver.findElement(imgTPrimaryIndustry).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Type of Business");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC13");
    }

    //    // Verify the tooltip text is displayed when user hover over for Reference URL
//    @Test(priority = 10, enabled = false)
    public void verifyReferenceURLTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgTReferenceUrl)).build().perform();
        Thread.sleep(1000);
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
//        String toolTipText = driver.findElement(imgTReferenceUrl).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Type of Business");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC14");
    }

    //
//    // Verify the tooltip text is displayed when user hover over for Segmentation
//    @Test(priority = 11, enabled = false)
    public void verifySegmentationTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgSegmentation)).build().perform();
        Thread.sleep(1000);
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
//        String toolTipText = driver.findElement(imgSegmentation).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Company market segmentation");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC15");
    }

    //    // Verify the tooltip text is displayed when user hover over for Reference GU ID
//    @Test(priority = 12, enabled = false)
    public void verifyReferenceGIDTooltipText() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(imgRefGUID)).build().perform();
        Thread.sleep(1000);
//        String toolTipText= driver.findElement(imgTWebDomain).getText();
//        String toolTipText = driver.findElement(imgRefGUID).getAttribute("value");
//        System.out.println(toolTipText);
//        Assert.assertEquals(toolTipText, "Company Global Ultimate ID(Parent Company)");
//        System.out.println("ToolTip Text displayed");
        System.out.println("Execution completed TC16");
    }

    //    // Validate that Zip/Postal Code is mandatory and is a text field
//    @Test(priority = 12)
    public void verifyZipCodeIsMandatoryAndElementType() {
        driver.findElement(btnReset).click();
        String strClassValue = driver.findElement(lblZipCode).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Zip/Postal Code is a mandatory field");
        String strZipCodeType = driver.findElement(txtZipCode).getAttribute("type");

        Assert.assertEquals(strZipCodeType, "text");
        System.out.println("Zip/Postal Code is a textfield type web element");
        System.out.println("Execution completed TC22");
    }

    //    // Validate that User is not allowed to Register Customer if any mandatory fields are not filled and the field is highlighted in red once after clicking on Register Customer
//    @Test(priority = 13)
    public void verifyFieldsMandatoryToFillForRegistration() {
        driver.findElement(btnReset).click();
        driver.findElement(btnRegisterCustomer).click();
        List<WebElement> links = driver.findElements(txtErrorHighlights);
        System.out.println("Numbers of highlighted errors: " + links.size());
        String txtErrorCustomerCompanyName = driver.findElement(lblCustomerCompanyName).getAttribute("class");
//        String txtErrorState=driver.findElement(lblState).getAttribute("class");
        String txtErrorAddress1 = driver.findElement(lblAddress1).getAttribute("class");
        String txtErrorCity = driver.findElement(lblCity).getAttribute("class");
        String txtErrorZipCode = driver.findElement(lblZipCode).getAttribute("class");
        String txtErrorWebDomain = driver.findElement(lblWebDomain).getAttribute("class");
        String txtErrorPrimaryIndustry = driver.findElement(lblPrimaryIndustry).getAttribute("class");
        String txtErrorSegmentation = driver.findElement(lblSegmentation).getAttribute("class");

        Assert.assertEquals(txtErrorCustomerCompanyName, "required error");
        Assert.assertEquals(txtErrorAddress1, "required error");
        Assert.assertEquals(txtErrorCity, "required error");
        Assert.assertEquals(txtErrorZipCode, "required error");
        Assert.assertEquals(txtErrorWebDomain, "required error");
        Assert.assertEquals(txtErrorPrimaryIndustry, "required error");
        Assert.assertEquals(txtErrorSegmentation, "required error");

        System.out.println("All mandatory fields are highlighted successfully");
        System.out.println("Execution completed TC17");
    }

    // Validate that Country united states - US is selected by default
//    @Test(priority = 14)
    public void verifyUSAsDefaultCountry() {
        String strCountryValue = driver.findElement(txtDefaultCountryOption).getText();
        Assert.assertEquals(strCountryValue, "United States - US");
        logger.info("united states - US is auto selected");
        System.out.println("Execution completed TC19");
    }

    //
//    // Validate that Country is a mandatory field and a dropdown
//    @Test(priority = 15)
    public void verifyCountryIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblCountry).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Country is a mandatory field");

        driver.findElement(ddCountry).click();
        driver.findElement(ddCountryOption).click();
        String strOptionCoutry = driver.findElement(ddCountryOption).getText();
        Assert.assertEquals(strOptionCoutry, "Uganda - UG");
        System.out.println("Country is a dropdown type web element");
        System.out.println("Execution completed TC18");
    }

    // Validate that State/Province is a mandatory field and is a type drop down
//    @Test(priority = 16)
    public void verifyStateIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblState).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("State is a mandatory field");
        String strStateType = driver.findElement(txtState).getAttribute("type");

        Assert.assertEquals(strStateType, "text");
        System.out.println("State is a textfield type web element");
        System.out.println("Execution completed TC20");
    }

    // Validate that City is a mandatory field and is a type drop down
//    @Test(priority = 17)
    public void verifyCityIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblCity).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("City is a mandatory field");
        String strCityType = driver.findElement(txtCity).getAttribute("type");

        Assert.assertEquals(strCityType, "text");
        System.out.println("City is a textfield type web element");
        System.out.println("Execution completed TC21");
    }

    // Validate that Web Domain is mandatory and is a text field
//    @Test(priority = 19)
    public void verifyWebDomainIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblWebDomain).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("WebDomain is a mandatory field");

        String strWebDomainType = driver.findElement(txtWebDomain).getAttribute("type");
        Assert.assertEquals(strWebDomainType, "text");
        System.out.println("WebDomain is a textfield type web element");
        System.out.println("Execution completed TC23");
    }

    // Validate that Primary Industry is mandatory and is a drop down
//    @Test(priority = 20)
    public void verifyPrimaryIndustryIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblPrimaryIndustry).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Primary Industry is a mandatory field");

        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        String strOptionprimaryIndustry = driver.findElement(ddPrimaryIndustryOption).getText();
        Assert.assertEquals(strOptionprimaryIndustry, "Hospitality");
        System.out.println("Primary Industry is a dropdown type web element");
        System.out.println("Execution completed TC24");
    }

    // Validate that Customer Company Name is mandatory and is a text field
//    @Test(priority = 21)
    public void verifyCustomerCompanyNameIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblCustomerCompanyName).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Customer Company Name is a mandatory field");

        String strCustomerCompanyNameType = driver.findElement(txtCustomerCompanyName).getAttribute("type");
        Assert.assertEquals(strCustomerCompanyNameType, "text");
        System.out.println("Customer Company Name is a textfield type web element");
        System.out.println("Execution completed TC25");
    }

    //   Validate that Address 1 is mandatory and is a text field
//    @Test(priority = 22)
    public void verifyAddress1IsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblAddress1).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Address 1 is a mandatory field");

        String strAddress1Type = driver.findElement(txtAddress1).getAttribute("type");
        Assert.assertEquals(strAddress1Type, "text");
        System.out.println("Address 1 is a textfield type web element");
        System.out.println("Execution completed TC26");
    }

    //   Validate that Segmentation is mandatory and is a drop down
//    @Test(priority = 23)
    public void verifySegmentationIsMandatoryAndElementType() {
        String strClassValue = driver.findElement(lblSegmentation).getAttribute("class");
        Assert.assertEquals(strClassValue, "required");
        System.out.println("Segmentation is a mandatory field");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();
        String strOptionSegmentation = driver.findElement(ddSegmentationOption).getText();
        Assert.assertEquals(strOptionSegmentation, "Public Sector");
        System.out.println("Segmentation is a dropdown type web element");
        System.out.println("Execution completed TC27");
    }

    //    Validate that Identification Type is mandatory for Country Russia and is a drop down
//    @Test(priority = 24)
    public void verifyIdentificationTypeIsMandatoryAndElementType() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(ddCountry).click();
        driver.findElement(ddCountryOption1).click();
        wait.until(ExpectedConditions.attributeContains(imgTIdentificationType, "class", "required"));
        wait.until(ExpectedConditions.elementToBeClickable(ddIdentificationType));
        String strIdentificationType = driver.findElement(imgTIdentificationType).getAttribute("class");
        Assert.assertEquals(strIdentificationType, "required");
        System.out.println("Identification Type is a mandatory field");

        driver.findElement(ddIdentificationType).click();
        driver.findElement(ddIdentificationOption).click();
        String strOptionIdentificationType = driver.findElement(optIndetificationtype).getText();
        Assert.assertEquals(strOptionIdentificationType, "Tax Identification Number");
        System.out.println("IdentificationType is a dropdown type web element");
        System.out.println("Execution completed TC28");
    }

    //   Validate that Identification Number is mandatory and is a text field
//    @Test(priority = 25)
    public void verifyIdentificationNumberIsMandatoryAndElementType() {
        String strIdentificationType = driver.findElement(lblIdentificationNumber).getAttribute("class");
        Assert.assertEquals(strIdentificationType, "required");
        System.out.println("Identification Number is a mandatory field for Country Russia");

        String strIdentificationNumber = driver.findElement(txtIdentificationNumber).getAttribute("type");
        Assert.assertEquals(strIdentificationNumber, "text");
        System.out.println("Identification Number is a textfield type web element");
        System.out.println("Execution completed TC29");
    }

    //   Validate "no cities found" is displayed when invalid value is entered for City
//    @Test(priority = 26)
    public void verifyErrorForInvalidCity() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(txtCity).sendKeys("aaaa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElements(By.xpath(".//div[@class='spinner-bg']")).size() > 0) {
            for (int i = 0; i < driver.findElements(By.xpath(".//div[@class='spinner-bg']")).size(); i++) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@class='spinner-bg']")));
            }
        }
        String strErrorReturned = driver.findElement(txtCityError).getText();
        System.out.println("Error returned when invalid City entered: " + strErrorReturned);
        System.out.println("Execution completed TC30");
    }

    //   Validate "POSTAL CODE MISSING" is displayed when special character is entered for Zip/Postal Code
//    @Test(priority = 27)
    public void verifyErrorForInvalidPostalCode() {
        driver.findElement(btnReset).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ddState));
        driver.findElement(ddState).click();
        driver.findElement(optState).click();

        driver.findElement(txtCity).sendKeys("arizona city");
        driver.findElement(txtZipCode).sendKeys("@@@@@");
        driver.findElement(txtWebDomain).sendKeys("abc.com");
        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        driver.findElement(txtCustomerCompanyName).sendKeys("Innovative health care solutions");
        driver.findElement(txtAddress1).sendKeys("lane1");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();

        String txtErrorMsg = driver.findElement(txtErrorInvalidPostalCode).getText();

        Assert.assertEquals(txtErrorMsg, "POSTAL CODE MISSING");
        System.out.println("Error message " + txtErrorMsg + " displayed for invalid postal code input");
        System.out.println("Execution completed TC31");
    }

    //   Validate "INVALID POSTAL CODE INPUT" is displayed when invalid value is entered for Zip/Postal Code
//    @Test(priority = 28)
    public void verifyErrorForIncorrectPostalCode() {
        driver.findElement(btnReset).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ddState));
        driver.findElement(ddState).click();
        driver.findElement(optState).click();

        driver.findElement(txtCity).sendKeys("arizona city");
        driver.findElement(txtZipCode).sendKeys("aaaaa");
        driver.findElement(txtWebDomain).sendKeys("abc.com");
        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        driver.findElement(txtCustomerCompanyName).sendKeys("Innovative health care solutions");
        driver.findElement(txtAddress1).sendKeys("lane1");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();

        String txtErrorMsg = driver.findElement(txtErrorIncorrectPostalCode).getText();

        Assert.assertEquals(txtErrorMsg, "INVALID POSTAL CODE INPUT");
        System.out.println("Error message " + txtErrorMsg + " displayed for incorrect postal code input");
        System.out.println("Execution completed TC32");
    }

    //   Validate "party name should be provided and not be null in locale: en-US" is displayed when special character is entered for Customer Company Name
//    @Test(priority = 29)
    public void verifyErrorForInvalidCustomerCompanyName() {
        driver.findElement(btnReset).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ddState));
        driver.findElement(ddState).click();
        driver.findElement(optState).click();

        driver.findElement(txtCity).sendKeys("phoenix");
        driver.findElement(txtZipCode).sendKeys("85097");
        driver.findElement(txtWebDomain).sendKeys("abc.com");
        driver.findElement(ddPrimaryIndustry).click();
        driver.findElement(ddPrimaryIndustryOption).click();
        driver.findElement(txtCustomerCompanyName).sendKeys("@@!!@@");
        driver.findElement(txtAddress1).sendKeys("lane1");

        driver.findElement(ddSegmentation).click();
        driver.findElement(ddSegmentationOption).click();

        driver.findElement(btnRegisterCustomer).click();

        String txtErrorMsg = driver.findElement(txtErrorInvalidCustomerCompanyName).getText();

        Assert.assertEquals(txtErrorMsg, "party name should be provided and not be null in locale: en-US");
        System.out.println("Error message " + txtErrorMsg + " displayed for invalid Customer Company Name input");
        System.out.println("Execution completed TC33");
    }

    //   Validate that all fields should reset properly once user clicks on Reset button
//    @Test(priority = 30)
    public void verifyResetFunctionality() throws InterruptedException {
        driver.findElement(txtCustomerCompanyName).sendKeys("IMH");
        driver.findElement(btnRegisterCustomer).click();
        Thread.sleep(3000);
        String txtSuccessMsg = driver.findElement(txtPartyCreationForUS).getText();
        System.out.println("Message displayed post successful Party creation is: " + txtSuccessMsg);

        driver.findElement(btnReset).click();
        driver.findElement(btnRegisterCustomer).click();
        List<WebElement> links = driver.findElements(txtErrorHighlights);
        System.out.println("Numbers of highlighted errors: " + links.size());
        String txtErrorCustomerCompanyName = driver.findElement(lblCustomerCompanyName).getAttribute("class");
        String txtErrorAddress1 = driver.findElement(lblAddress1).getAttribute("class");
        String txtErrorCity = driver.findElement(lblCity).getAttribute("class");
        String txtErrorZipCode = driver.findElement(lblZipCode).getAttribute("class");
        String txtErrorWebDomain = driver.findElement(lblWebDomain).getAttribute("class");
        String txtErrorPrimaryIndustry = driver.findElement(lblPrimaryIndustry).getAttribute("class");
        String txtErrorSegmentation = driver.findElement(lblSegmentation).getAttribute("class");
        Assert.assertEquals(txtErrorCustomerCompanyName, "required error");
        Assert.assertEquals(txtErrorAddress1, "required error");
        Assert.assertEquals(txtErrorCity, "required error");
        Assert.assertEquals(txtErrorZipCode, "required error");
        Assert.assertEquals(txtErrorWebDomain, "required error");
        Assert.assertEquals(txtErrorPrimaryIndustry, "required error");
        Assert.assertEquals(txtErrorSegmentation, "required error");

        System.out.println("No mandatory fields are filled as we clicked on reset button");
        System.out.println("Execution completed TC09");
    }


}
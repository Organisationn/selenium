package page;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.xpathUtil;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class CustomerAndAddressValidation {
    WebDriver driver;
    File folder;
    private static Logger logger = LogManager.getRootLogger();

    By txtUserName = By.xpath(xpathUtil.TXT_USER_NAME);
    By txtPwd = By.xpath(xpathUtil.TXT_PWD);
    By btnLogin = By.xpath(xpathUtil.BTN_LOGIN);
    By btnRegisterCustomer = By.xpath(xpathUtil.BTN_REGISTER_CUSTOMER);
    By txtDefaultCountryOption = By.xpath(xpathUtil.TXT_DEFAULT_COUNTRY_OPTION);
    By btnValidate = By.xpath(xpathUtil.BTN_VALIDATE);
    By lnkCustomerAddressValidation = By.xpath(xpathUtil.LNK_CUSTOMERADDRESSVALIDATION);
    By txtErrorMessage = By.xpath(xpathUtil.TXT_ERROR_MESSAGE);
    By txtCustomerCompanyName1 = By.xpath(xpathUtil.TXT_CUSTOMER_COMPANY_NAME1);
    By lstCustomerCompanyNames = By.xpath(xpathUtil.LST_CUSTOMER_COMPANY_NAMES);
    By optCustomerCompanyNames = By.xpath(xpathUtil.OPT_CUSTOMER_COMPANY_NAMES);
    By txtState = By.xpath(xpathUtil.TXT_STATE1);
    By optState = By.xpath(xpathUtil.OPT_STATE1);
    By lnkCloseIcon = By.xpath(xpathUtil.LNK_CLOSE_ICON);
    By txtCity = By.xpath(xpathUtil.TXT_CITY1);
    By optCity = By.xpath(xpathUtil.OPT_CITY);
    By btnHelpfulTips = By.xpath(xpathUtil.BTN_HELPFUL_TIPS);
    By txtPostalCode = By.xpath(xpathUtil.TXT_POSTAL_CODE);
    By txtAddress = By.xpath(xpathUtil.TXT_ADDRESS1);
    By btnReset = By.xpath(xpathUtil.BTN_RESET);
    By btnDemo = By.xpath(xpathUtil.BTN_DEMO);
    By btnNext = By.xpath(xpathUtil.BTN_NEXT);
    By btnDone = By.xpath(xpathUtil.BTN_DONE);
    By btnBulkValidation = By.xpath(xpathUtil.BTN_BULK_VALIDATION);
    By txtBulkValidation = By.xpath(xpathUtil.TXT_BULK_VALIDATION);
    By imgClose = By.xpath(xpathUtil.IMG_CLOSE);
    By ddContactSupport = By.xpath(xpathUtil.DD_CONTACT_SUPPORT);
    By txtCustomerCompanyToolTip = By.xpath(xpathUtil.TXT_CUSTOMER_COMPANY_NAMES);
    By txtNameValidationStatusToolTip = By.xpath(xpathUtil.TXT_NAME_VALIDATION_STATUS_TOOL_TIP);
    By txtNameValidationStatus = By.xpath(xpathUtil.TXT_NAME_VALIDATION_STATUS);
    By txtResultCustomerCompanyName = By.xpath(xpathUtil.TXT_RESULT_CUSTOMER_COMPANY_NAME);
    By txtResultState = By.xpath(xpathUtil.TXT_RESULT_STATE);
    By txtResultCity = By.xpath(xpathUtil.TXT_RESULT_CITY);
    By btnDownloadResult = By.xpath(xpathUtil.BTN_DOWNLOAD_SEARCH_RESULT);
    By btnRefresh = By.xpath(xpathUtil.BTN_REFRESH);
    By btnUploadBulkFile = By.xpath(xpathUtil.BTN_UPLOAD_BULK_FILE);
    By btnUploadConfirmation = By.xpath(xpathUtil.BTN_UPLOAD_CONFIRMATION);
    By txtErrorMessage1 = By.xpath(xpathUtil.TXT_ERROR_MESSAGE1);
    By txtAddress1 = By.xpath(xpathUtil.TXT_ADDRESS);



    // initialize driver and utilities
    public CustomerAndAddressValidation(WebDriver driver) {
        this.driver = driver;
    }

    //    Validate the UI is loaded properly once we launch the URL
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

    public void verifyUSAsDefaultCountry() {
        String strCountryValue = driver.findElement(txtDefaultCountryOption).getText();
        Assert.assertEquals(strCountryValue, "United States - US");
        logger.info("united states - US is auto selected");
        System.out.println("Execution completed TC02");
    }

    public void verifyErrorCustomerName_State_City_Postal_Code_Mandatory() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(lnkCustomerAddressValidation));
        driver.findElement(lnkCustomerAddressValidation).click();
        wait.until(ExpectedConditions.elementToBeClickable(btnValidate));
        driver.findElement(btnValidate).click();
        String strErrorMessage = driver.findElement(txtErrorMessage).getText();

        Assert.assertEquals(strErrorMessage, "Customer Name or State/City/Postal Code are mandatory");
        logger.info("Correct error message displayed");
        System.out.println("Execution completed TC03");
    }

    public void SuggestionsListsForCustomerCompanyName() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(lnkCloseIcon));
        driver.findElement(lnkCloseIcon).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtCustomerCompanyName1));
        driver.findElement(txtCustomerCompanyName1).sendKeys("abc");

        Thread.sleep(2000);
        if (driver.findElement(lstCustomerCompanyNames).isDisplayed() && driver.findElement(optCustomerCompanyNames).isDisplayed())
            System.out.println("Suggestion lists of Customer company name displayed");

        System.out.println("One of the displayed suggestion of Customer Company name is : " + driver.findElement(optCustomerCompanyNames).getText());
        System.out.println("Execution completed TC05");
    }

    public void suggestionsListsForState() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(txtCustomerCompanyName1).clear();
        wait.until(ExpectedConditions.elementToBeClickable(txtState));
        driver.findElement(txtState).click();
        driver.findElement(txtState).sendKeys("a");

        Thread.sleep(2000);
        if (driver.findElement(optState).isDisplayed())
            System.out.println("Suggestion lists of State displayed");

        System.out.println("One of the displayed suggestion of State is : " + driver.findElement(optState).getText());
        System.out.println("Execution completed TC07");
    }

    public void suggestionsListsForCity() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        driver.findElement(txtState).clear();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        driver.findElement(txtCity).click();
        driver.findElement(txtCity).sendKeys("a");

        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(optCity)));
        if (driver.findElement(optCity).isDisplayed())
            System.out.println("Suggestion lists of State displayed");

        System.out.println("One of the displayed suggestion of State is : " + driver.findElement(optCity).getText());
        System.out.println("Execution completed TC09");
    }

    public void validateResetFunctionality() throws IOException {
        driver.findElement(txtCustomerCompanyName1).sendKeys("INNOVATIVE HEALTH CARE");
        driver.findElement(txtAddress).sendKeys("LANE1");
        driver.findElement(txtState).sendKeys("Arizona");
        driver.findElement(txtCity).clear();
        driver.findElement(txtCity).sendKeys("arizona city");
        driver.findElement(txtPostalCode).click();
        driver.findElement(txtPostalCode).sendKeys("85074");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC12_ValidateResetFunctionality_BeforeReset.png"));

        driver.findElement(btnReset).click();
        System.out.println("Execution completed TC12");
    }

    public void verifyHelpfulTips() throws InterruptedException {
        driver.findElement(txtPostalCode).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(btnHelpfulTips).isEnabled());
        driver.findElement(btnHelpfulTips).click();
        Thread.sleep(1000);
        System.out.println("Execution completed TC13");
    }

    public void verifyDemoFunctionality() throws IOException {
        driver.findElement(btnDemo).click();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoCountry.png"));
        driver.findElement(btnNext).click();
        File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoCustomerCompanyName.png"));
        driver.findElement(btnNext).click();
        File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src2, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoAddress.png"));
        driver.findElement(btnNext).click();
        File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src3, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoAddress2.png"));
        driver.findElement(btnNext).click();
        File src4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src4, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoState.png"));
        driver.findElement(btnNext).click();
        File src5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src5, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_ValidateDemoCity.png"));
        driver.findElement(btnNext).click();
        File src6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src6, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_DemoValidate.png"));
        driver.findElement(btnNext).click();
        File src7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src7, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC19_DemoValidationResults.png"));
        driver.findElement(btnDone).click();
        System.out.println("Execution completed TC19");
    }

    public void bulkValidationMessageToDownloadTemplate() {
        driver.findElement(btnBulkValidation).click();
        String strTxt = driver.findElement(txtBulkValidation).getText();
        System.out.println(strTxt);
        Assert.assertEquals(strTxt, "Click here to download the bulk upload template.");
        System.out.println("Execution completed TC20");
    }

    public void verifySupportFunctionality() {
        driver.findElement(imgClose).click();
        driver.findElement(ddContactSupport).click();
        System.out.println("Execution completed TC24");
    }

    public void verifyToolTipTextCustomerCompanyName() throws InterruptedException {
        driver.findElement(txtCustomerCompanyToolTip).click();
        Thread.sleep(1000);
        System.out.println("Execution completed TC21");
    }

    public void verifyToolTipTextNameValidationStatus() throws InterruptedException {
        Actions act=new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(2500,0)", "");
        System.out.println("Execution completed TC22");
    }

    public void validateCustomerSearchUsingCustomerCompanyName() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(txtCustomerCompanyName1));
        driver.findElement(txtCustomerCompanyName1).sendKeys("ABC LIQUORS INC");
        driver.findElement(btnValidate).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtResultCustomerCompanyName)));
        System.out.println("Result displayed with Customer company name as: "+driver.findElement(txtResultCustomerCompanyName).getText());
        System.out.println("Execution completed TC04");
    }

    public void validateCustomerSearchUsingState() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(txtState));
//        driver.findElement(txtCustomerCompanyName1).click();
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(txtCustomerCompanyName1)).click().perform();
        driver.findElement(txtCustomerCompanyName1).clear();
        driver.findElement(txtState).sendKeys("Arizona");
        driver.findElement(btnValidate).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(txtResultState)));
        System.out.println("Result displayed with State as: "+driver.findElement(txtResultState).getText());
        Thread.sleep(1000);
        System.out.println("Execution completed TC06");
    }

    public void validateCustomerSearchUsingCity() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        driver.findElement(txtState).click();
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(txtState)).click().perform();
        driver.findElement(txtState).clear();
        wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        driver.findElement(txtCity).sendKeys("Alabaster");
        driver.findElement(btnValidate).click();
        Thread.sleep(2000);
        System.out.println("Execution completed TC08");
    }

    public void validateCustomerSearchUsingZipCode() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        driver.findElement(txtCity).click();
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(txtCity)).click().perform();
        driver.findElement(txtCity).clear();
        wait.until(ExpectedConditions.elementToBeClickable(txtPostalCode));
        driver.findElement(txtPostalCode).sendKeys("85074");
        driver.findElement(btnValidate).click();
        Thread.sleep(2000);
        System.out.println("Execution completed TC10");
    }

    public void validateCustomerSearchWithAllInput() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        driver.findElement(txtCity).sendKeys("Alabaster");
        driver.findElement(txtState).sendKeys("Arizona");
        wait.until(ExpectedConditions.elementToBeClickable(txtCustomerCompanyName1));
        driver.findElement(txtCustomerCompanyName1).sendKeys("ABC LIQUORS INC");
        driver.findElement(txtAddress).sendKeys("1441 BUCKEYE RD");
        driver.findElement(btnValidate).click();
        Thread.sleep(2000);
        System.out.println("Execution completed TC11");
    }
    public void refreshResultTable() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(btnRefresh));
        Thread.sleep(2000);
        driver.findElement(btnRefresh).click();
        System.out.println("Execution completed TC15");
    }

    public void verfiyUploadErrorMessage() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(btnUploadBulkFile));
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(btnUploadBulkFile)).click().build().perform();
        Thread.sleep(3000);
        uploadFile("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Customer_Name_Address_Validation_Upload.xlsx");
        Thread.sleep(3000);
        driver.findElement(btnUploadConfirmation).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(txtErrorMessage1).getText());
        Assert.assertEquals(driver.findElement(txtErrorMessage1).getText(),"Uploaded file is empty !!");
        System.out.println("Execution completed TC17");
    }

    public void verfiyBulkUploadData() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(btnUploadBulkFile));
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(btnUploadBulkFile)).click().build().perform();
        Thread.sleep(2000);
//        uploadFile("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Customer_Name_Address_Validation_Upload-WithAllValidInputs.xlsx");
        uploadFile("C:\\Users\\manorsah\\OneDrive - Cisco\\Desktop\\Customer_Name_Address_Validation_Upload.xlsx");

        Thread.sleep(3000);
        driver.findElement(btnUploadConfirmation).click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(txtAddress1).getText(),"1441 E BUCKEYE RD");
        System.out.println("Execution completed TC17");
    }

    public void setClipBoard(String file){
        StringSelection obj=new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
    }

    public void uploadFile(String filePath) throws AWTException {
        setClipBoard(filePath);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }






}

package test;

import base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.CustomerAndAddressValidation;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CustomerAndAddressValidationTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    CustomerAndAddressValidation customerAndAddressValidationobj;

    @BeforeTest
    public void VerifyLoginAndsetUp() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        driver = basePage.init_driver(prop);
        customerAndAddressValidationobj = new CustomerAndAddressValidation(driver);
    }

    @Test(priority = 1)
    public void TC01_login() throws IOException {
        customerAndAddressValidationobj.login();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC01_login.png"));
    }

    @Test(priority = 2)
    public void TC02_verifyUSAsDefaultCountry() throws IOException {
        customerAndAddressValidationobj.verifyUSAsDefaultCountry();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC02_verifyUSAsDefaultCountry.png"));
    }

    @Test(priority = 3)
    public void TC03_verifyErrorCustomerName_State_City_Postal_Code_Mandatory() throws IOException {
        customerAndAddressValidationobj.verifyErrorCustomerName_State_City_Postal_Code_Mandatory();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC03_verifyErrorCustomerName_State_City_Postal_Code_Mandatory.png"));
    }

    @Test(priority = 4)
    public void TC05_SuggestionsListsForCustomerCompanyName() throws IOException, InterruptedException {
        customerAndAddressValidationobj.SuggestionsListsForCustomerCompanyName();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC05_SuggestionsListsForCustomerCompanyName.png"));
    }

    @Test(priority = 5)
    public void TC07_SuggestionsListsForState() throws IOException, InterruptedException {
        customerAndAddressValidationobj.suggestionsListsForState();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC07_SuggestionsListsForState.png"));
    }

    @Test(priority = 6)
    public void TC09_SuggestionsListsForCity() throws IOException, InterruptedException {
        customerAndAddressValidationobj.suggestionsListsForCity();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC09_SuggestionsListsForCity.png"));
    }

    @Test(priority = 7)
    public void TC12_ValidateResetFunctionality() throws IOException {
        customerAndAddressValidationobj.validateResetFunctionality();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC12_ValidateResetFunctionality_AfterReset.png"));
    }

    @Test(priority = 8)
    public void TC13_VerifyHelpfulTips() throws IOException, InterruptedException {
        customerAndAddressValidationobj.verifyHelpfulTips();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC13_VerifyHelpfulTips.png"));
    }

    @Test(priority = 9)
    public void TC19_VerifyDemoFunctionality() throws IOException {
        customerAndAddressValidationobj.verifyDemoFunctionality();
    }

    @Test(priority = 10)
    public void TC20_BulkValidationMessageToDownloadTemplate() throws IOException {
        customerAndAddressValidationobj.bulkValidationMessageToDownloadTemplate();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC20_BulkValidationMessageToDownloadTemplate.png"));
    }

    @Test(priority = 11)
    public void TC24_VerifySupportFunctionality() throws IOException {
        customerAndAddressValidationobj.verifySupportFunctionality();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC24_VerifySupportFunctionality.png"));
    }

    @Test(priority = 12)
    public void TC21_VerifyToolTipTextCustomerCompanyName() throws IOException, InterruptedException {
        customerAndAddressValidationobj.verifyToolTipTextCustomerCompanyName();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC21_VerifyToolTipTextCustomerCompanyName.png"));
    }

    //    @Test(priority = 13)
//    public void TC22_VerifyToolTipTextNameValidationStatus() throws IOException, InterruptedException {
//        customerAndAddressValidationobj.verifyToolTipTextNameValidationStatus();
//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC22_VerifyToolTipTextNameValidationStatus.png"));
//    }
    @Test(priority = 13)
    public void TC04_ValidateCustomerSearchUsingCustomerCompanyName() throws IOException, InterruptedException {
        customerAndAddressValidationobj.validateCustomerSearchUsingCustomerCompanyName();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC04_ValidateCustomerSearchUsingCustomerCompanyName.png"));
    }

    @Test(priority = 14)
    public void TC06_ValidateCustomerSearchUsingState() throws IOException, InterruptedException {
        customerAndAddressValidationobj.validateCustomerSearchUsingState();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC06_ValidateCustomerSearchUsingState.png"));
    }

    @Test(priority = 15)
    public void TC08_ValidateCustomerSearchUsingCity() throws IOException, InterruptedException {
        customerAndAddressValidationobj.validateCustomerSearchUsingCity();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC08_ValidateCustomerSearchUsingCity.png"));
    }

    @Test(priority = 16)
    public void TC10_ValidateCustomerSearchUsingZipCode() throws IOException, InterruptedException {
        customerAndAddressValidationobj.validateCustomerSearchUsingZipCode();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC10_ValidateCustomerSearchUsingZipCode.png"));
    }

    @Test(priority = 16)
    public void TC11_ValidateCustomerSearchWithAllInput() throws IOException, InterruptedException {
        customerAndAddressValidationobj.validateCustomerSearchWithAllInput();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC11_ValidateCustomerSearchWithAllInput.png"));
    }

    @Test(priority = 17)
    public void TC15_RefreshResultTable() throws IOException, InterruptedException {
        customerAndAddressValidationobj.refreshResultTable();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC15_RefreshResultTable.png"));
    }

    @Test(priority = 18)
    public void TC17_VerfiyUploadErrorMessage() throws IOException, InterruptedException, AWTException {
        customerAndAddressValidationobj.verfiyUploadErrorMessage();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC17_VerfiyUploadErrorMessage.png"));
    }

    @Test(priority = 19)
    public void TC18_VerfiyBulkUploadData() throws IOException, InterruptedException, AWTException {
        customerAndAddressValidationobj.verfiyBulkUploadData();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_CustomerAndAddressValidation\\TC18_VerfiyBulkUploadData.png"));
    }


}

//    @AfterTest
//    public void quitBrowser() {
//        driver.quit();
//    }

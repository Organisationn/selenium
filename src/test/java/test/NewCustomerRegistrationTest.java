package test;

import base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.NewCustomerRegistration;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class NewCustomerRegistrationTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    NewCustomerRegistration NewCustomerRegistrationObj;

    @BeforeTest
    public void VerifyLoginAndsetUp() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        driver = basePage.init_driver(prop);
        NewCustomerRegistrationObj = new NewCustomerRegistration(driver);
    }

    @Test(priority = 1)
    public void TC01_login() throws IOException {
        NewCustomerRegistrationObj.login();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC01_login.png"));
    }

    @Test(priority = 2)
    public void TC02_verifyLogoAndPageTitle() throws IOException {
        NewCustomerRegistrationObj.verifyLogoAndPageTitle();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC02_verifyLogoAndPageTitle.png"));
    }

    @Test(priority = 3)
    public void TC03_verifyCRAndCustomerValidationTabs() throws IOException {
        NewCustomerRegistrationObj.verifyCRAndCustomerValidationTabs();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC03_verifyCRAndCustomerValidationTabs.png"));
    }

    @Test(priority = 4)
    public void TC04_verifyCRTabIsSelected() throws IOException {
        NewCustomerRegistrationObj.verifyCRTabIsSelected();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC04_verifyCRTabIsSelected.png"));
    }

    @Test(priority = 5)
    public void TC05_verifyPresenceOfAllFields() throws IOException {
        NewCustomerRegistrationObj.verifyPresenceOfAllFields();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC05_verifyPresenceOfAllFields.png"));
    }

    @Test(priority = 6)
    public void TC06_CustomerRegistrationForUS() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.customerRegistrationForUS();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC06_CustomerRegistrationForUS.png"));
    }

    @Test(priority = 7)
    public void TC07_CustomerRegistrationForAF() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.customerRegistrationForAF();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC07_CustomerRegistrationForAF.png"));
    }

    @Test(priority = 8)
    public void TC08_CustomerRegistrationForRU() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.customerRegistrationForRU();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC08_CustomerRegistrationForRU.png"));
    }

    @Test(priority = 12)
    public void TC22_verifyZipCodeIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyZipCodeIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC22_verifyZipCodeIsMandatoryAndElementType.png"));
    }

    @Test(priority = 13)
    public void TC17_verifyFieldsMandatoryToFillForRegistration() throws IOException {
        NewCustomerRegistrationObj.verifyFieldsMandatoryToFillForRegistration();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC17_verifyFieldsMandatoryToFillForRegistration.png"));
    }

    @Test(priority = 14)
    public void TC19_verifyUSAsDefaultCountry() throws IOException {
        NewCustomerRegistrationObj.verifyUSAsDefaultCountry();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC19_verifyUSAsDefaultCountry.png"));
    }

    @Test(priority = 15)
    public void TC18_verifyCountryIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyCountryIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC18_verifyCountryIsMandatoryAndElementType.png"));
    }

    @Test(priority = 16)
    public void TC20_verifyStateIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyStateIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC20_verifyStateIsMandatoryAndElementType.png"));
    }

    @Test(priority = 17)
    public void TC21_verifyCityIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyCityIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC21_verifyCityIsMandatoryAndElementType.png"));
    }

    @Test(priority = 19)
    public void TC23_verifyWebDomainIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyWebDomainIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC23_verifyWebDomainIsMandatoryAndElementType.png"));
    }

    @Test(priority = 20)
    public void TC24_verifyPrimaryIndustryIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyPrimaryIndustryIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC24_verifyPrimaryIndustryIsMandatoryAndElementType.png"));
    }

    @Test(priority = 21)
    public void TC25_verifyCustomerCompanyNameIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyCustomerCompanyNameIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC25_verifyCustomerCompanyNameIsMandatoryAndElementType.png"));
    }

    @Test(priority = 22)
    public void TC26_verifyAddress1IsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyAddress1IsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC26_verifyAddress1IsMandatoryAndElementType.png"));
    }

    @Test(priority = 23)
    public void TC27_verifySegmentationIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifySegmentationIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC27_verifySegmentationIsMandatoryAndElementType.png"));
    }

    @Test(priority = 24)
    public void TC28_verifyIdentificationTypeIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyIdentificationTypeIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC28_verifyIdentificationTypeIsMandatoryAndElementType.png"));
    }

    @Test(priority = 25)
    public void TC29_verifyIdentificationNumberIsMandatoryAndElementType() throws IOException {
        NewCustomerRegistrationObj.verifyIdentificationNumberIsMandatoryAndElementType();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC29_verifyIdentificationNumberIsMandatoryAndElementType.png"));
    }

    @Test(priority = 26)
    public void TC30_verifyErrorForInvalidCity() throws IOException {
        NewCustomerRegistrationObj.verifyErrorForInvalidCity();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC30_verifyErrorForInvalidCity.png"));
    }

    @Test(priority = 27)
    public void TC31_verifyErrorForInvalidPostalCode() throws IOException {
        NewCustomerRegistrationObj.verifyErrorForInvalidPostalCode();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC31_verifyErrorForInvalidPostalCode.png"));
    }

    @Test(priority = 28)
    public void TC32_verifyErrorForIncorrectPostalCode() throws IOException {
        NewCustomerRegistrationObj.verifyErrorForIncorrectPostalCode();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC32_verifyErrorForIncorrectPostalCode.png"));
    }

    @Test(priority = 29)
    public void TC33_verifyErrorForInvalidCustomerCompanyName() throws IOException {
        NewCustomerRegistrationObj.verifyErrorForInvalidCustomerCompanyName();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC33_verifyErrorForInvalidCustomerCompanyName.png"));
    }

    @Test(priority = 30)
    public void TC09_verifyResetFunctionality() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyResetFunctionality();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC09_verifyResetFunctionality.png"));
    }

    @Test(priority = 31)
    public void TC10_verifyWebDomainTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyWebDomainTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC10_verifyWebDomainTooltipText.png"));
    }

    @Test(priority = 32)
    public void TC11_verifyIdentificationTypeTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyIdentificationTypeTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC11_verifyIdentificationTypeTooltipText.png"));
    }

    @Test(priority = 33)
    public void TC12_verifyIdentificationNumberTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyIdentificationNumberTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC12_verifyIdentificationNumberTooltipText.png"));
    }

    @Test(priority = 34)
    public void TC13_verifyPrimaryIndustryTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyPrimaryIndustryTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC13_verifyPrimaryIndustryTooltipText.png"));
    }

    @Test(priority = 34)
    public void TC14_verifyReferenceURLTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyReferenceURLTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC14_verifyReferenceURLTooltipText.png"));
    }

    @Test(priority = 34)
    public void TC15_verifySegmentationTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifySegmentationTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC15_verifySegmentationTooltipText.png"));
    }

    @Test(priority = 34)
    public void TC16_verifyReferenceGIDTooltipText() throws IOException, InterruptedException {
        NewCustomerRegistrationObj.verifyReferenceGIDTooltipText();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\manorsah\\IdeaProjects\\selenium\\src\\Result_SS_NewCustomerRegistration\\TC16_verifyReferenceGIDTooltipText.png"));
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}

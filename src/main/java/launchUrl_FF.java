import base.BasePage;
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

public class launchUrl_FF {
    WebDriver driver;
    BasePage basePage;
    Properties prop;

    By txtUserName=By.xpath("//input[@id='userInput']");
    By txtPwd=By.xpath("//input[@id='passwordInput']");
    By btnLogin=By.xpath("//input[@id='login-button']");
    By btnRegisterCustomer=By.xpath("//button[contains(text(),'Register Customer')]");
    By imgCisco=By.xpath("//img[contains(@src,'logo.svg')]");
    By txtCustomerRegistry=By.xpath("//h1[contains(text(),'Customer Registry')]");
    By btnNewCustomerRegistration=By.xpath("//a[contains(text(),'New Customer Registration')]");
    By btnCustomerAddrValidation=By.xpath("//a[contains(text(),'Customer & Address Validation')]");
    By lblCountry=By.xpath("//label[contains(text(),'Country')]");
    By lblCustomerCompanyName=By.xpath("//label[contains(text(),'Customer Company Name')]");
    By lblState=By.xpath("//label[contains(text(),'State/Province')]");
    By lblAddress1=By.xpath("//label[contains(text(),'Address 1')]");
    By lblAddress2=By.xpath("//label[contains(text(),'Address 2')]");
    By lblAddress3=By.xpath("//label[contains(text(),'Address 3')]");
    By lblAddress4=By.xpath("//label[contains(text(),'Address 4')]");
    By lblCity=By.xpath("//label[contains(text(),'City')]");
    By lblZipCode=By.xpath("//label[contains(text(),'Zip/Postal Code')]");
    By lblWebDomain=By.xpath("//label[contains(text(),'Web Domain')]");
    By lblIdentificationType=By.xpath("//label[contains(text(),'Identification Type')]");
    By lblIdentificationNumber=By.xpath("//label[contains(text(),'Identification Number')]");
    By lblPrimaryIndustry=By.xpath("//label[contains(text(),'Primary Industry')]");
    By lblSegmentation=By.xpath("//label[contains(text(),'Segmentation')]");
    By lblReferenceURL=By.xpath("//label[contains(text(),'Reference URL')]");
    By lblReferenceGUID=By.xpath("//label[contains(text(),'Reference GU ID')]");
    By btnReset=By.xpath("//button[contains(text(),'Reset')]");
    By imgTWebDomain=By.xpath("//label[contains(text(),'Web Domain')]//child::i");
    By imgTIdentificationType=By.xpath("//label[contains(text(),'Identification Type')]//child::i");
    By imgTIdentificationNumber=By.xpath("//label[contains(text(),'Identification Number')]//child::i");
    By imgTPrimaryIndustry=By.xpath("//label[contains(text(),'Primary Industry')]//child::i");
    By imgTReferenceUrl=By.xpath("//label[contains(text(),'Reference URL')]//child::i");
    By imgSegmentation=By.xpath("//label[contains(text(),'Segmentation')]//child::i");
    By imgRefGUID=By.xpath("//label[contains(text(),'Reference GU ID')]//child::i");
    By txtErrorHighlights=By.xpath("//label[@class='required error']");
    By ddCountry=By.xpath("//label[contains(text(),'Country')]//following-sibling::ng-select");
    By ddCountryOption=By.xpath("//span[contains(text(),'uganda - UG')]");

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
        driver.findElement(txtUserName).sendKeys(strUn);
        driver.findElement(btnLogin).click();
        wait.until(ExpectedConditions.elementToBeClickable(txtPwd));
        String strPwd=System.getenv("PASSWORD");
        driver.findElement(txtPwd).sendKeys(strPwd);
        driver.findElement(btnLogin).click();
        Assert.assertTrue(driver.findElement(btnRegisterCustomer).isEnabled());
        System.out.println("Home Page is Displayed");
        System.out.println("Execution completed TC01");
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
    @Test(priority = 6)
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
    @Test(priority = 7)
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
    @Test(priority = 8)
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
    @Test(priority = 9)
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
    @Test(priority = 10)
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
    @Test(priority = 11)
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
    @Test(priority = 12)
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
    @Test(priority = 14)
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
    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
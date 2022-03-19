package util;

public interface xpathUtil {
    String TXT_USER_NAME = "//input[@id='userInput']";
    String TXT_PWD = "//input[@id='passwordInput']";
    String BTN_LOGIN = "//input[@id='login-button']";
    String BTN_REGISTER_CUSTOMER = "//button[contains(text(),'Register Customer')]";
    String TXT_IMG_CISCO = "//img[contains(@src,'logo.svg')]";
    String TXT_CUSTOMER_REGISTRY = "//h1[contains(text(),'Customer Registry')]";
    String BTN_NEW_CUSTOMER_REGISTRATION = "//a[contains(text(),'New Customer Registration')]";
    String BTN_CUSTOMER_ADDR_VALIDATION = "//a[contains(text(),'Customer & Address Validation')]";
    String LBL_COUNTRY = "//label[contains(text(),'Country')]";
    String LBL_CUSTOMER_COMPANY_NAME = "//label[contains(text(),'Customer Company Name')]";
    String LBL_STATE = "//label[contains(text(),'State/Province')]";
    String LBL_ADDRESS1 = "//label[contains(text(),'Address 1')]";
    String LBL_ADDRESS2 = "//label[contains(text(),'Address 2')]";
    String LBL_ADDRESS3 = "//label[contains(text(),'Address 3')]";
    String LBL_ADDRESS4 = "//label[contains(text(),'Address 4')]";
    String LBL_CITY = "//label[contains(text(),'City')]";
    String LBL_ZIP_CODE = "//label[contains(text(),'Zip/Postal Code')]";
    String LBL_WEB_DOMAIN = "//label[contains(text(),'Web Domain')]";
    String LBL_IDENTIFICATION_TYPE = "//label[contains(text(),'Identification Type')]";
    String LBL_IDENTIFICATION_NUMBER = "//label[contains(text(),'Identification Number')]";
    String LBL_PRIMARY_INDUSTRY = "//label[contains(text(),'Primary Industry')]";
    String LBL_SEGMENTATION = "//label[contains(text(),'Segmentation')]";
    String LBL_REFERENCE_URL = "//label[contains(text(),'Reference URL')]";
    String LBL_IREFERENCE_GUID = "//label[contains(text(),'Reference GU ID')]";
    String BTN_RESET = "//button[contains(text(),'Reset')]";
    String IMG_WEB_DOMAIN = "//label[contains(text(),'Web Domain')]//child::i";
    String IMG_IDENTIFICATION_TYPE = "//label[contains(text(),'Identification Type')]//child::i";
    String IMG_IDENTIFICATION_NUMBER = "//label[contains(text(),'Identification Number')]//child::i";
    String IMG_PRIMARY_INDUSTRY = "//label[contains(text(),'Primary Industry')]//child::i";
    String IMG_REFERENCE_URL = "//label[contains(text(),'Reference URL')]//child::i";
    String IMG_SEGMENTATION = "//label[contains(text(),'Segmentation')]//child::i";
    String IMG_REF_GUID = "//label[contains(text(),'Reference GU ID')]//child::i";
    String TXT_ERROR_HIGHLIGHTS = "//label[@class='required error']";
    String DD_COUNTRY = "//label[contains(text(),'Country')]//following-sibling::ng-select";
    String DD_COUNTRY_OPTION = "//span[contains(text(),'uganda - UG')]";
    String DD_COUNTRY_OPTION_Afghanistan = "//span[contains(text(),'afghanistan - AF')]";
    String TXT_DEFAULT_COUNTRY_OPTION = "//*[contains(text(),'united states - US')]";
    String TXT_STATE = "//label[contains(text(),'State')]//following-sibling::input";
    String TXT_CITY = "//input[@placeholder='Start typing for suggestions']";
    String TXT_ZIPCODE = "//label[contains(text(),'Zip/Postal Code')]/following-sibling::input";
    String TXT_WEBDOMAIN = "(//input[@type='text'])[8]";
    String DD_PRIMARY_INDUSTRY="//label[contains(text(),'Primary Industry')]/following-sibling::ng-select";
    String DD_PRIMARY_INDUSTRY_OPTION = "//span[contains(text(),'Hospitality')]";
    String TXT_CUSTOMER_COMPANY_NAME="//*[@name='companyName']";
    String TXT_ADDRESS1="//*[@name='address1']";
    String DD_SEGMENTATION="//label[contains(text(),'Segmentation')]/following-sibling::ng-select";
    String DD_SEGMENTATION_OPTION = "//span[contains(text(),'Public Sector')]";
    String DD_COUNTRY_RUSSIA = "//span[contains(text(),'russian federation - RU')]";
    String DD_IDENTIFICATION_TYPE="//label[contains(text(),'Identification Type')]/following-sibling::ng-select";
    String DD_IDENTIFICATION_TYPE_OPTION = "//div[contains(text(),'Tax Identification Number')]";
    String OPT_IDENTIFICATION_TYPE = "//span[contains(text(),'Tax Identification Number')]";
    String TXT_IDENTIFICATION_NUMBER = "//label[contains(text(),'Identification Number')]//following-sibling::input";
    String TXT_CITY_ERROR="//li[contains(text(),'no cities found')]";
    String DD_STATE ="//label[contains(text(),'State')]//following-sibling::ng-select";
    String OPT_STATE="//span[text()='arizona']";
    String OPT_STATE_RUSSIA="//span[text()='amurskaya']";
    String TXT_ERROR_INVALID_POSTAL_CODE="//div[contains(text(),'POSTAL CODE MISSING')]";
    String TXT_ERROR_INCORRECT_POSTAL_CODE="//div[contains(text(),'INVALID POSTAL CODE INPUT')]";
    String TXT_ERROR_INVALID_CUSTOMER_COMPANY_NAME="//div[contains(text(),'party name should be provided and not be null in locale: en-US')]";
    String TXT_SUCCESSFUL_PARTY_CREATION_MESSAGE_US="//div[contains(text(),'Party created successfully')]";

    //CUSTOMER AND ADDRESS VALIDATION WEB ELEMENTS XPATH
    String BTN_VALIDATE="//button[contains(text(),'Validate')]";
    String LNK_CUSTOMERADDRESSVALIDATION="//a[contains(text(),'Customer & Address Validation')]";
    String TXT_ERROR_MESSAGE="//div[contains(text(),'State/City/Postal Code  are mandatory')]";
    String TXT_CUSTOMER_COMPANY_NAME1="//*[@placeholder='Customer Company Name' and @type='text']";
    String LST_CUSTOMER_COMPANY_NAMES="//*[@role='listbox']";
    String OPT_CUSTOMER_COMPANY_NAMES="//span[contains(text(),'abc liquors inc')]";
    String TXT_STATE1="//*[@placeholder='State/Province' and @type='text']";
    String OPT_STATE1="//span[contains(text(),'alaska')]";
    String LNK_CLOSE_ICON="//a[@class='alert__close icon-exit-outline']";
    String TXT_CITY1="//*[@placeholder='City' and @type='text']";
    String OPT_CITY="//span[contains(text(),'aaronsburg')]";
    String BTN_HELPFUL_TIPS="//*[contains(text(),'Helpful Tips!')]//parent::div[contains(@class,'SkipThisFixedPosition')]";
    String TXT_POSTAL_CODE="//input[@name='postalCode']";
    String BTN_DEMO="//div[contains(text(),'Need a demo?')]";
    String BTN_NEXT="//span[contains(text(),'Next')]";
    String BTN_DONE="//span[contains(text(),'Done')]";
    String BTN_BULK_VALIDATION="//div[contains(text(),'Bulk Validation?')]";
    String TXT_BULK_VALIDATION="//span[contains(text(),'Click here to download the bulk upload template.')]";
    String IMG_CLOSE="//div[contains(text(),'×')]";
    String DD_CONTACT_SUPPORT="//i[@class='fa fa-envelope']";
    String TXT_CUSTOMER_COMPANY_NAMES="(//div[@class='walkme-icon-image-div'])[2]";
    String TXT_NAME_VALIDATION_STATUS_TOOL_TIP="(//div[@class='walkme-icon-image-div'])[3]";
    String TXT_NAME_VALIDATION_STATUS="//span[contains(text(),'Name Validation Status')]";
    String TXT_RESULT_CUSTOMER_COMPANY_NAME="//i[@class='fa fa-check-circle']//parent::span";
    String TXT_RESULT_STATE="//span[contains(text(),'ARIZONA')]";
    String TXT_RESULT_CITY="//span[contains(text(),'ALABASTER')]";
    String BTN_DOWNLOAD_SEARCH_RESULT="//*[@class='icon-download dl-icon']";
    String BTN_REFRESH="//*[@title='Refresh Table']";
    String BTN_DOWNLOAD_TEMPLATE="//button[@title='Download Template']";
    String BTN_UPLOAD_BULK_FILE="//button[@title='Upload Bulk File']";
    String BTN_UPLOAD_CONFIRMATION="//span[contains(text(),'Yes')]";
    String TXT_ERROR_MESSAGE1="//div[contains(text(),'Uploaded file is empty !!')]";
    String TXT_ADDRESS="//span[contains(text(),'1441 E BUCKEYE RD')]";










































}

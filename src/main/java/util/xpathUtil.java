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
    String TXT_DEFAULT_COUNTRY_OPTION = "//*[contains(text(),'united states - US')]";








}

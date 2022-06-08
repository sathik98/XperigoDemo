package xperigo.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    protected WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space()='Cases'])[1]")
    protected WebElement btnCases;

    @FindBy(how = How.XPATH, using = " (//span[normalize-space()='Xperigo Call Centre'])[1]")
    protected WebElement txtXperigo;

    @FindBy(how = How.XPATH, using = "//div[@title='New']")
    protected WebElement btnNew;

    @FindBy(how = How.XPATH, using = "//button[@name='language']")
    protected WebElement drpDownLanguage;

    protected String txtLanguage = new StringBuilder()
            .append("(//span[normalize-space()='")
            .append("<<LANGUAGE>>").append("'])[2]").toString();

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Call Flow']")
    protected WebElement drpDownCallFlow;

    protected String txtValueBMW = new StringBuilder()
            .append("(//span[normalize-space()='")
            .append("<<LANGUAGE>>").append("'])[2]").toString();

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Case']")
    protected WebElement btnCreateCase;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),' may I provide for you today?')]/following::button[1]")
    protected WebElement drpDownRoadSideService;

    protected String txtRoadSideService = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Why are you requesting a tow?')]/following::input[1]")
    protected WebElement drpDownTowReason;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Does the caller require Language Link Services?')]")
    protected WebElement txtNeedsAssessment;

    protected String txtTowReason = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Does the vehicle go into Neutral?')]/following::input[1]")
    protected WebElement drpDownNeutralQuestion;

    protected String txtNeutralQuestion = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();


    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Eligibility & Validation')]/following::input[1]")
    protected WebElement txtVIN;


    //@FindAll({
    //     @FindBy(how = How.XPATH, using = "(//span[normalize-space()='VIN: 5UXTY5C08L9C53700 - Test Manager - 1234567890']"),
    @FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(),'VIN:')])[4]")
    //   @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Eligibility & Validation')]/following::span[contains(normalize-space(),'Policy:')][4]")

    //  })
    protected WebElement searchResultVIN;

    @FindBy(how = How.XPATH, using = "(//input[@name='Current_Odometer__c'])")
    protected WebElement txtOdometer;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Type of Caller')]/following::input[1]")
    protected WebElement drpDownCaller;

    protected String txtCaller = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//p[normalize-space()='Search Customer Address Here...']/following::input[1]")
    protected WebElement txtAddress;

    @FindBy(how = How.XPATH, using = "(//span[normalize-space()='78 King Street North, Waterloo, ON, Canada'])[2]")
    protected WebElement txtAddressResult;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Where is your vehicle')]/following::input[1]")
    protected WebElement drpDownVehicleLocation;

    protected String txtVehicleLocation = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//input[@name='ETA__c']")
    protected WebElement txtBoxETA;

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Dispatch Call'])")
    protected WebElement btnDispatchCall;

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Dispatch Call'])")
    protected WebElement btnScrollUp;

    @FindBy(how = How.XPATH, using = "(//h4[normalize-space()='Dispatch Results'])[1]")
    protected WebElement txtDispatchResult;

    @FindBy(how = How.XPATH, using = "//iframe[@title='accessibility title']")
    protected WebElement iFrameDispatchResult;

    @FindBy(how = How.XPATH, using = "(//input[@value='Back'])[1]")
    protected WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='ETA']")
    protected WebElement txtETA;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Close Case']")
    protected WebElement btnCloseCase;

    @FindBy(how = How.XPATH, using = "//label[contains(normalize-space(),'Cancel Reason')]/following::button[1]")
    protected WebElement drpDownReason;

    protected String txtReason = new StringBuilder()
            .append("//span[@title='")
            .append("<<LANGUAGE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Cancel Case'])")
    protected WebElement btnCancelCase;

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Success']")
    protected WebElement txtSuccessMessage;

    @FindBy(how = How.XPATH, using = "//label[contains(normalize-space(),'Please confirm with the caller')]/following::input[1]")
    protected WebElement drpDownBoostSymptoms;

    protected String txtBoostSymptoms = new StringBuilder()
            .append("(//span[@title='")
            .append("<<LANGUAGE>>").append("'])[1]").toString();

    @FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(),' may I provide for you today?')]/following::span[normalize-space()='Flatbed Tow'])[1]")
    protected WebElement txtFlippingToFlatbedTow;

    @FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(),'Cases')]/following::button[contains(normalize-space(),'Close')])[1]")
    protected WebElement btnClose;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'first name')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptyTxtFirstNameInCallerDetails;

    @FindBy(how = How.XPATH, using = "//p[contains(normalize-space(),'Caller Details')]")
    protected WebElement txtFirstNameInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'first name')]/following::input[1]")
    protected WebElement txtBoxFirstNameInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'last name')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptyTxtLastNameInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'last name')]/following::input[1]")
    protected WebElement txtLastNameInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'call back number')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptyTxtCallBackNumberInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'call back number')]/following::input[1]")
    protected WebElement txtCallBackNumberInCallerDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'year')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptydropDownVehicleYearInVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'year')]/following::input[1]")
    protected WebElement dropDownVehicleYearInVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'make')]/following::span[1][contains(normalize-space(),'--None--')]")
    protected WebElement emptydropDownVehicleMakeInVehicleDetails;

    protected String dropDownVehicleMakeVehicleDetails = new StringBuilder()
            .append("//span[@title='")
            .append("<<MAKE>>").append("']").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'model')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptyDropDownVehicleModelInVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'model')]/following::input[1]")
    protected WebElement dropDownVehicleModelVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'colour')]/following::input[1][contains(@aria-describedby,'help-message')]")
    protected WebElement emptyDropDownVehicleColorInVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'colour')]/following::input[1]")
    protected WebElement dropDownVehicleColorVehicleDetails;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Is this an electric vehicle?')]/following::span[1][contains(normalize-space(),'--None--')]")
    protected WebElement emptyDropDownElectricVehicleInVehicleDetails;

    protected String dropDownElectricVehicleVehicleDetails = new StringBuilder()
            .append("(//span[contains(normalize-space(),'Is this an electric vehicle?')]/following::span[normalize-space()='")
            .append("<<LANGUAGE>>").append("'])[1]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Does the Customer agree?')]/following::input[1]")
    protected WebElement drpDownCustomerAgreeDrpDown;

    protected String txtCustomerAgreeDrpDown = new StringBuilder()
            .append("(//span[contains(normalize-space(),'Does the Customer agree?')]/following::span[@title='")
            .append("<<LANGUAGE>>").append("'])").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Based on the conversation with the caller')]/following::input[1]")
    protected WebElement drpDownBasedOnTheConversationWithTheCaller;

    protected String txtBasedOnTheConversationWithTheCaller = new StringBuilder()
            .append("(//span[@title='")
            .append("<<LANGUAGE>>").append("'])[1]").toString();
    @FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(),' may I provide for you today?')]/following::span[normalize-space()='Tow'])[1]")
    protected WebElement txtFlippingToTow;

    @FindBy(how = How.XPATH, using = "//span[contains(normalize-space(),'Current Program')]/following::span[contains(normalize-space(),'LGM - Kia MBP OMM')][1]")
    protected WebElement txtFlippingToLGMKia;

    @FindBy(how = How.XPATH, using = "//input[@inputmode='email']")
    protected WebElement txtBoxCustomerEmailAddress;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'spinner_small')]/child::span[contains(normalize-space(),'Loading')])[1]")
    protected WebElement loaderIcon;


    public void launchXperigoURL() {
        try {
            visit(TestDataUtil.getValue("&URL&"));
            System.out.println("This is the data from the Util file" + TestDataUtil.getValue("&URL&"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterUserDetails(String strUserName, String strPassword) {
        System.out.println("strUserName>>>>>>>>>> "+strPassword);
        System.out.println("strPassword>>>>>>>>>>> "+strPassword);
        waitForElement(txtUserName);
        enterValue(txtUserName, strUserName);
        enterValue(txtPassword, strPassword);


    }

    public void clickLoginBtn() {
        mouseOver(btnLogin);
        click(btnLogin);
    }

    public boolean verifyHomePage() {
        waitForElement(txtXperigo);
        return verifyElement(txtXperigo);
    }

    public void clickNewButton() {
        click(btnCases);
        waitForSeconds(2);
        waitForElement(btnNew);
        click(btnNew);
    }

    public void clickCloseIcon() {
        waitForElement(txtXperigo);
        while (verifyElementWithoutWait(btnClose)) {
            waitForSeconds(2);
            click(btnClose);
            waitForSeconds(2);
        }
    }

    public void selectLanguageAndCallFlowDropDown(String strLanguage, String strCallFlow) {
        waitForElement(drpDownLanguage);
        click(drpDownLanguage);
        WebElement elmntTab = waitForElement(By.xpath(txtLanguage.replace("<<LANGUAGE>>",
                strLanguage)));
        waitForSeconds(1);
        click(elmntTab);
        waitForElement(drpDownCallFlow);
        click(drpDownCallFlow);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtValueBMW.replace("<<LANGUAGE>>",
                strCallFlow)));
        waitForSeconds(2);
        jsScrollIntoView(elmntTab1);
        waitForSeconds(2);
        click(elmntTab1);
    }

    public void clickCreateCase() {
        click(btnCreateCase);
        waitForSeconds(10);
    }


    public void selectRoadSideService(String strRoadSideService) {
//        System.out.println("<<<<<<<<<<<<" +loaderIcon.isDisplayed());
//        waitForInvisibilityOfElement(loaderIcon);
//        System.out.println("After>>>>>>>>>>>>>>>");
        waitForElement(txtNeedsAssessment);
        waitForSeconds(3);
        jsScrollIntoView(drpDownRoadSideService);
        waitForSeconds(3);
        click(drpDownRoadSideService);
        WebElement elmntTab1 = waitForElement(By.xpath(txtRoadSideService.replace("<<LANGUAGE>>",
                strRoadSideService)));
        waitForElement(elmntTab1);
        click(elmntTab1);
    }

    public void selectTowReason(String strTowReason) {
//        waitForInvisibilityOfElement(loaderIcon);
        waitForElement(drpDownTowReason);
        waitForSeconds(3);
        click(drpDownTowReason);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtTowReason.replace("<<LANGUAGE>>",
                strTowReason)));
        waitForElement(elmntTab1);
        click(elmntTab1);
    }

    public void selectNeutralQuestion(String strNeutralQuestion) {
//        waitForInvisibilityOfElement(loaderIcon);
        jsScrollDown();
        waitForElement(drpDownNeutralQuestion);
        waitForSeconds(3);
        click(drpDownNeutralQuestion);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtNeutralQuestion.replace("<<LANGUAGE>>",
                strNeutralQuestion)));
        waitForElement(elmntTab1);
        click(elmntTab1);
    }

    public void enterVIN(String strVIN) {
        jsScrollIntoView(txtVIN);
        waitForElement(txtVIN);
        enterValue(txtVIN, strVIN);
        waitForElement(searchResultVIN);
        click(searchResultVIN);
    }

    public void enterOdometer(String strOdometer) {
        waitForElement(txtOdometer);
        enterValue(txtOdometer, strOdometer);
        waitForSeconds(8);
    }



    public void enterAddress(String strAddress) {
        waitForSeconds(2);
        jsScrollDown();
        jsScrollDown();
        waitForSeconds(5);
        enterValue(txtAddress, strAddress);
        waitForSeconds(4);
        click(txtAddressResult);
    }

    public void enterVehicleLocation(String strVehicleLocation) {
        waitForSeconds(3);
        waitForElement(drpDownVehicleLocation);
        jsScrollDown();
        jsScrollDown();
        jsScrollDown();
        jsScrollDown();
        waitForElement(drpDownVehicleLocation);
        waitForSeconds(2);
        click(drpDownVehicleLocation);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtVehicleLocation.replace("<<LANGUAGE>>",
                strVehicleLocation)));
        click(elmntTab1);
    }

    public void enterETA(String strETA) {
        waitForSeconds(2);
        jsScrollDown();
        jsScrollDown();
        jsScrollDown();
        jsScrollDown();
        waitForSeconds(2);
        enterValue(txtBoxETA, strETA);
        waitForSeconds(2);
        click(txtETA);
    }

    public void clickDispatchCall() {
        waitForSeconds(2);
        waitForElement(btnScrollUp);
        mouseOver(btnScrollUp);
        click(btnScrollUp);
        waitForElement(btnDispatchCall);
        mouseOver(btnDispatchCall);
        click(btnDispatchCall);
        waitForSeconds(15);
    }

    public boolean verifyTextDispatchResult() {
            waitForSeconds(15);
            System.out.println("<<<<<<<<<<<<<<BeforeSwitching>>>>>>>>>>>");
            waitForframeToBeAvailableAndSwitchToIt(driver, iFrameDispatchResult);
            System.out.println("<<<<<<<<<<<<<<AfterSwitching>>>>>>>>>>>");
//            System.out.println("<<<<<<<<<<<<<IsDisplayed"+iFrameDispatchResult.isDisplayed());
            System.out.println("<<<<<<<<<<<<<IsDisplayed"+txtDispatchResult.isDisplayed());
             return verifyElement(txtDispatchResult);
    }

    public boolean verifyTextDispatch() {
        return verifyElement(txtDispatchResult);
    }

    public void clickBackButton() {
        waitForSeconds(2);
        System.out.println("<<<<<<<<<<<<<IsDisplayed"+btnBack.isEnabled());
        mouseOver(btnBack);
        click(btnBack);
//        System.out.println("<<<<<<<<<<<<<IsDisplayed"+btnBack.isEnabled());
        waitForSeconds(5);
        System.out.println("BeforeBackToDefault");
        driver.switchTo().activeElement();
//        focusBackToDefaultFrame();
        System.out.println("AfterBackToDefault");
    }

    public void clickCloseCaseButton() {
        waitForElement(btnCloseCase);
        waitForSeconds(2);
        mouseOver(btnCloseCase);
        click(btnCloseCase);
    }

    public void selectReason(String strReason) {
        waitForSeconds(6);
        waitForElement(drpDownReason);
        click(drpDownReason);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtReason.replace("<<LANGUAGE>>",
                strReason)));
        click(elmntTab1);
    }

    public void clickCancelCaseButton() {
        waitForSeconds(5);
        mouseOver(btnCancelCase);
        click(btnCancelCase);
    }

    public void selectRoadSideServiceTwo(String strRoadSideService) {
        waitForSeconds(2);
        jsScroll();
        waitForSeconds(6);
        click(drpDownRoadSideService);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtRoadSideService.replace("<<LANGUAGE>>",
                strRoadSideService)));
        click(elmntTab1);
    }

    public boolean verifySuccessMessagePopUpBox() {
        waitForElement(txtSuccessMessage);
        return verifyElement(txtSuccessMessage);
    }

    public void clickCloseButton() {
        waitForSeconds(5);
        mouseOver(btnClose);
        click(btnClose);
    }

    public void selectBoostSymptoms(String strBoostSymptoms) {
        waitForSeconds(6);
        jsScrollDown();
        jsScrollDown();
        waitForSeconds(2);
        click(drpDownBoostSymptoms);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtBoostSymptoms.replace("<<LANGUAGE>>",
                strBoostSymptoms)));
        click(elmntTab1);

    }

    public boolean verifyFlippingToFlatbedTow() {
        jsScrollUp();
        waitForSeconds(4);
        waitForElement(txtFlippingToFlatbedTow);
        return verifyElement(txtFlippingToFlatbedTow);
    }

    public void verifyFirstNameDrpDown(String strFirstName) {
        waitForElement(txtFirstNameInCallerDetails);
        waitForSeconds(4);
        jsScrollDown();
        if (verifyElement(emptyTxtFirstNameInCallerDetails)) {
            waitForElement(txtBoxFirstNameInCallerDetails);
            enterValue(txtBoxFirstNameInCallerDetails, strFirstName);
            waitForSeconds(4);
        }
    }

    public void verifyLastNameDrpDown(String strLastName) {
        if (verifyElement(emptyTxtLastNameInCallerDetails)) {
            waitForElement(txtLastNameInCallerDetails);
            enterValue(txtLastNameInCallerDetails, strLastName);
            waitForSeconds(4);
        }
    }

    public void verifyCallBackNumberDrpDown(String strCallBackNumber) {
        jsScrollDown();
        if (verifyElement(emptyTxtCallBackNumberInCallerDetails)) {
            waitForElement(txtCallBackNumberInCallerDetails);
            enterValue(txtCallBackNumberInCallerDetails, strCallBackNumber);
            waitForSeconds(4);
        }
    }

    public void verifyVehicleYearDrpDown(String strVehicleYear) {
        jsScrollDown();
        if (verifyElement(emptydropDownVehicleYearInVehicleDetails)) {
            enterValue(dropDownVehicleYearInVehicleDetails, strVehicleYear);
            waitForSeconds(4);
        }
    }

    public void verifyVehicleMakeDrpDown(String strVehicleMake) {
        if (verifyElement(emptydropDownVehicleMakeInVehicleDetails)) {
            waitForElement(emptydropDownVehicleMakeInVehicleDetails);
            click(emptydropDownVehicleMakeInVehicleDetails);
            waitForSeconds(2);
            WebElement elmntTab1 = waitForElement(By.xpath(dropDownVehicleMakeVehicleDetails.replace("<<MAKE>>",
                    strVehicleMake)));
            waitForSeconds(2);
            jsScrollIntoView(elmntTab1);
            waitForSeconds(2);
            click(elmntTab1);
            waitForSeconds(4);

        }
    }

    public void verifyVehicleModelDrpDown(String strVehicleModel) {
        jsScrollDown();
        if (verifyElement(emptyDropDownVehicleModelInVehicleDetails)) {
            enterValue(dropDownVehicleModelVehicleDetails, strVehicleModel);
            waitForSeconds(4);

        }
    }

    public void verifyVehicleColorDrpDown(String strVehicleColor) {
        if (verifyElement(emptyDropDownVehicleColorInVehicleDetails)) {
            enterValue(dropDownVehicleColorVehicleDetails, strVehicleColor);
            waitForSeconds(4);
        }
    }

    public void verifyElectricVehicleDrpDown(String strElectricVehicle) {
        if (verifyElement(emptyDropDownElectricVehicleInVehicleDetails)) {
            waitForElement(emptyDropDownElectricVehicleInVehicleDetails);
            click(emptyDropDownElectricVehicleInVehicleDetails);
            waitForSeconds(2);
            WebElement elmntTab1 = waitForElement(By.xpath(dropDownElectricVehicleVehicleDetails.replace("<<LANGUAGE>>",
                    strElectricVehicle)));
            waitForSeconds(2);
            click(elmntTab1);
            waitForSeconds(4);
        }
    }

    public void verifyCustomerAgreeDrpDown(String strCustomerAgree, String strEmail) {
        waitForSeconds(2);
        jsScrollDown();
        jsScrollDown();
        waitForSeconds(6);
        click(drpDownCustomerAgreeDrpDown);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtCustomerAgreeDrpDown.replace("<<LANGUAGE>>",
                strCustomerAgree)));
        click(elmntTab1);
        waitForElement(txtBoxCustomerEmailAddress);
        enterValue(txtBoxCustomerEmailAddress, strEmail);
        waitForSeconds(4);
    }


    public void selectBoostSymptomsKia(String strBoostSymptoms) {
        waitForSeconds(6);
        jsScrollDown();
        jsScrollDown();
        waitForSeconds(2);
        click(drpDownBasedOnTheConversationWithTheCaller);
        waitForSeconds(2);
        WebElement elmntTab1 = waitForElement(By.xpath(txtBasedOnTheConversationWithTheCaller.replace("<<LANGUAGE>>",
                strBoostSymptoms)));
        click(elmntTab1);

    }

    public boolean verifyFlippingToTow() {
        jsScrollUp();
        waitForSeconds(4);
        waitForElement(txtFlippingToTow);
        return verifyElement(txtFlippingToTow);
    }

    public boolean verifyFlippingToLGMKia() {
        jsScrollUp();
        jsScrollUp();
        waitForSeconds(4);
        waitForElement(txtFlippingToLGMKia);
        return verifyElement(txtFlippingToLGMKia);
    }

}




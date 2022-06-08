package xperigo.stepDefinitions;

import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import xperigo.PageContainer;

/*
 * Created by Codoidian-pc on 05/03/2022.
 */
public class HomeSteps {

    private PageContainer demoPageContainer;

    public HomeSteps(PageContainer demoPageContainer) {
        this.demoPageContainer = demoPageContainer;
    }

    @Given("I am on salesforce application")
    public void iAmOnSalesforceApplication() {
        demoPageContainer.homePage.launchXperigoURL();
    }

    @And("^I enter (.*) and (.*)")
    public void iEnterUsernameAndPassword(String strUserName, String strPassword) {
        String strUsername = System.getProperty("username", "");
        String strPassword1 = System.getProperty("password", "");
        demoPageContainer.homePage.enterUserDetails(strUsername,  strPassword1);
    }

    @When("I click Log In button")
    public void iClickLogInButton() {
        demoPageContainer.homePage.clickLoginBtn();
    }

    @Then("I see the Xperigo Home Page")
    public void iSeeTheXperigoHomePage() {
        Assert.assertTrue(demoPageContainer.homePage.verifyHomePage());;
    }

    @Given("I am on Xperigo Home Page")
    public void iAmOnXperigoHomePage() {
        Assert.assertTrue(demoPageContainer.homePage.verifyHomePage());;
    }

    @And("I click New Button under case SubTab")
    public void iClickNewButtonUnderCaseSubTab() {
        demoPageContainer.homePage.clickCloseIcon();
        demoPageContainer.homePage.clickNewButton();
    }

    @And("^I select value from (.*) (.*) dropdown")
    public void iSelectValueFromLanguageCallFlowDropdown(String strLanguage, String strCallFlow) {
        demoPageContainer.homePage.selectLanguageAndCallFlowDropDown(TestDataUtil.getValue(strLanguage), TestDataUtil.getValue(strCallFlow));
        demoPageContainer.homePage.clickCreateCase();
    }





    @And("I fill up {string} Caller dropdown Customer {string} and {string} in user Details")
    public void iFillUpCallerDropdownCustomerAndInUserDetails(String strCaller, String strAddress, String strVehicleLocation) {
        demoPageContainer.bmwCaseFlowPage.selectCaller(TestDataUtil.getValue(strCaller));
        demoPageContainer.homePage.enterAddress(TestDataUtil.getValue(strAddress));
        demoPageContainer.homePage.enterVehicleLocation(TestDataUtil.getValue(strVehicleLocation));
    }

    @And("I enter Value {string} in dispatch call form")
    public void iEnterValueInDispatchCallForm(String strETA) {
        demoPageContainer.homePage.enterETA(TestDataUtil.getValue(strETA));
    }

    @When("I Click on Dispatch Call button")
    public void iClickOnDispatchCallButton() {
        demoPageContainer.homePage.clickDispatchCall();
    }

    @Then("I should see Dispatch result details")
    public void iShouldSeeDispatchResultDetails() {
        Assert.assertTrue(demoPageContainer.homePage.verifyTextDispatchResult());
    }

    @And("I Click on Back button")
    public void iClickOnBackButton() {
        demoPageContainer.homePage.clickBackButton();
    }

    @And("I Click on Close Case button")
    public void iClickOnCloseCaseButton() {
        demoPageContainer.homePage.clickCloseCaseButton();
    }

    @Given("I am on Dispatch result details screen")
    public void iAmOnDispatchResultDetailsScreen() {
        Assert.assertTrue(demoPageContainer.homePage.verifyTextDispatch());
    }

    @When("^I choose option in (.*) dropdown")
    public void iChooseOptionInReasonDropdown(String strReason) {
        demoPageContainer.homePage.selectReason(TestDataUtil.getValue(strReason));
    }

    @When("I Click on Close Case button in close case frame")
    public void iClickOnCloseCaseButtonInCloseCaseFrame() {
        demoPageContainer.homePage.clickCancelCaseButton();

    }

    @Then("I should see Success Message is pop up in screen")
    public void iShouldSeeSuccessMessageIsPopUpInScreen() {
        Assert.assertTrue(demoPageContainer.homePage.verifySuccessMessagePopUpBox());
        demoPageContainer.homePage.clickCloseButton();
    }


    @And("I Select {string} and {string} Value on dispatch call form")
    public void iSelectAndValueOnDispatchCallForm(String strVIN, String strOdometer) {
        demoPageContainer.homePage.enterVIN(TestDataUtil.getValue(strVIN));
        demoPageContainer.homePage.enterOdometer(TestDataUtil.getValue(strOdometer));

    }

    @And("^I Select value from (.*) (.*) (.*) dropdown in dispatch call form")
    public void iSelectValueFromRoadSideServiceTowReasonNeutralQuestionDropdownInDispatchCallForm(String strRoadSideService, String strTowReason, String strNeutralQuestions) {
        demoPageContainer.homePage.selectRoadSideService(TestDataUtil.getValue(strRoadSideService));
        demoPageContainer.homePage.selectTowReason(TestDataUtil.getValue(strTowReason));
        demoPageContainer.homePage.selectNeutralQuestion(TestDataUtil.getValue(strNeutralQuestions));

    }

    @And("I Select value from {string} dropdown")
    public void iSelectValueFromDropdown(String strRoadSideService) {
        demoPageContainer.homePage.selectRoadSideServiceTwo(TestDataUtil.getValue(strRoadSideService));
    }

    @When("I select No Recommend Tow value in {string} dropdown")
    public void iSelectNoRecommendTowValueInDropdown(String strBoostSymptoms) {
        demoPageContainer.homePage.selectBoostSymptoms(TestDataUtil.getValue(strBoostSymptoms));
    }

    @Then("I Verify that RSA flips to Tow with a reason")
    public void iVerifyThatRSAFlipsToTowWithAReason() {
        Assert.assertTrue(demoPageContainer.homePage.verifyFlippingToFlatbedTow());
        demoPageContainer.homePage.clickCloseButton();
    }

    @And("I validate caller details fields {string} {string} and {string} dropdown in dispatch call form")
    public void iValidateCallerDetailsFieldsAndDropdownInDispatchCallForm(String strFirstName, String strLastName, String strCallBackNumber) {
        demoPageContainer.homePage.verifyFirstNameDrpDown(TestDataUtil.getValue(strFirstName));
        demoPageContainer.homePage.verifyLastNameDrpDown(TestDataUtil.getValue(strLastName));
        demoPageContainer.homePage.verifyCallBackNumberDrpDown(TestDataUtil.getValue(strCallBackNumber));
    }

    @And("I validate Vehicle details fields {string} {string} {string} {string} and {string} dropdown in dispatch call form")
    public void iValidateVehicleDetailsFieldsAndDropdownInDispatchCallForm(String strVehicleYear, String strVehicleMake, String strVehicleModel, String strVehicleColor, String strElectricVehicle) {
        demoPageContainer.homePage.verifyVehicleYearDrpDown(TestDataUtil.getValue(strVehicleYear));
        demoPageContainer.homePage.verifyVehicleMakeDrpDown(TestDataUtil.getValue(strVehicleMake));
        demoPageContainer.homePage.verifyVehicleModelDrpDown(TestDataUtil.getValue(strVehicleModel));
        demoPageContainer.homePage.verifyVehicleColorDrpDown(TestDataUtil.getValue(strVehicleColor));
        demoPageContainer.homePage.verifyElectricVehicleDrpDown(TestDataUtil.getValue(strElectricVehicle));

    }

    @And("I search customer address and fill Customer {string} and {string} in user Details page")
    public void iSearchCustomerAddressAndFillCustomerAndInUserDetailsPage(String strAddress, String strVehicleLocation) {
        demoPageContainer.homePage.enterAddress(TestDataUtil.getValue(strAddress));
        demoPageContainer.homePage.enterVehicleLocation(TestDataUtil.getValue(strVehicleLocation));
    }

    @When("I select Two is Recommended value in {string} dropdown")
    public void iSelectTwoIsRecommendedValueInDropdown(String strBoostSymptoms) {
        demoPageContainer.homePage.selectBoostSymptomsKia(TestDataUtil.getValue(strBoostSymptoms));
    }

    @Then("I Verify that RSA flips to Tow with a reason for KIA")
    public void iVerifyThatRSAFlipsToTowWithAReasonForKIA() {
        Assert.assertTrue(demoPageContainer.homePage.verifyFlippingToTow());
        demoPageContainer.homePage.clickCloseButton();
    }

    @And("I enter LGM Kia policy {string} Value on dispatch call form")
    public void iEnterLGMKiaPolicyValueOnDispatchCallForm(String strVIN) {
        demoPageContainer.homePage.enterVIN(TestDataUtil.getValue(strVIN));
    }

    @Then("I verify that current program has been flips to LGM Kia")
    public void iVerifyThatCurrentProgramHasBeenFlipsToLGMKia() {
        Assert.assertTrue(demoPageContainer.homePage.verifyFlippingToLGMKia());
        demoPageContainer.homePage.clickCloseButton();
    }

    @And("I enter customer survey {string} {string} in dispatch call form")
    public void iEnterCustomerSurveyInDispatchCallForm(String strCustomerAgree, String strEmail) {
        demoPageContainer.homePage.verifyCustomerAgreeDrpDown(TestDataUtil.getValue(strCustomerAgree), TestDataUtil.getValue(strEmail));
    }




}
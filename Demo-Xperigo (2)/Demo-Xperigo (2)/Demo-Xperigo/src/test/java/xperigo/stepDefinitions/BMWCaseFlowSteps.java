package xperigo.stepDefinitions;

import xperigo.PageContainer;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;


public class BMWCaseFlowSteps {

    private PageContainer demoPageContainer;

    public BMWCaseFlowSteps(PageContainer demoPageContainer) {
        this.demoPageContainer = demoPageContainer;
    }



    @And("I Select value from {string} {string} {string} dropdown for BMW in dispatch call form")
    public void iSelectValueFromDropdownForBMWInDispatchCallForm(String strRoadSideService, String strTowReason, String strNeutralQuestions) {
        demoPageContainer.bmwCaseFlowPage.selectRoadSideService(TestDataUtil.getValue(strRoadSideService));
        demoPageContainer.bmwCaseFlowPage.selectTowReason(TestDataUtil.getValue(strTowReason));
        demoPageContainer.bmwCaseFlowPage.selectNeutralQuestion(TestDataUtil.getValue(strNeutralQuestions));
    }

    @And("I Select {string} and {string} Value for BMW on dispatch call form")
    public void iSelectAndValueForBMWOnDispatchCallForm(String strVIN, String strOdometer) {
        demoPageContainer.bmwCaseFlowPage.enterVIN(TestDataUtil.getValue(strVIN));
        demoPageContainer.bmwCaseFlowPage.enterOdometer(TestDataUtil.getValue(strOdometer));
    }

    @And("I validate caller details fields {string} {string} and {string} dropdown for BMW in dispatch call form")
    public void iValidateCallerDetailsFieldsAndDropdownForBMWInDispatchCallForm(String strFirstName, String strLastName, String strCallBackNumber) {
        demoPageContainer.bmwCaseFlowPage.verifyFirstNameDrpDown(TestDataUtil.getValue(strFirstName));
        demoPageContainer.bmwCaseFlowPage.verifyLastNameDrpDown(TestDataUtil.getValue(strLastName));
        demoPageContainer.bmwCaseFlowPage.verifyCallBackNumberDrpDown(TestDataUtil.getValue(strCallBackNumber));
    }

    @And("I validate Vehicle details fields {string} {string} {string} {string} and {string} dropdown for BMW in dispatch call form")
    public void iValidateVehicleDetailsFieldsAndDropdownForBMWInDispatchCallForm(String strVehicleYear, String strVehicleMake, String strVehicleModel, String strVehicleColor, String strElectricVehicle) {
        demoPageContainer.bmwCaseFlowPage.verifyVehicleYearDrpDown(TestDataUtil.getValue(strVehicleYear));
        demoPageContainer.bmwCaseFlowPage.verifyVehicleMakeDrpDown(TestDataUtil.getValue(strVehicleMake));
        demoPageContainer.bmwCaseFlowPage.verifyVehicleModelDrpDown(TestDataUtil.getValue(strVehicleModel));
        demoPageContainer.bmwCaseFlowPage.verifyVehicleColorDrpDown(TestDataUtil.getValue(strVehicleColor));
        demoPageContainer.bmwCaseFlowPage.verifyElectricVehicleDrpDown(TestDataUtil.getValue(strElectricVehicle));
    }

    @And("I search customer address and fill Customer {string} and {string} in user Details page for BMW call flow")
    public void iSearchCustomerAddressAndFillCustomerAndInUserDetailsPageForBMWCallFlow(String strAddress, String strVehicleLocation) {
        demoPageContainer.bmwCaseFlowPage.enterAddress(TestDataUtil.getValue(strAddress));
        demoPageContainer.bmwCaseFlowPage.enterVehicleLocation(TestDataUtil.getValue(strVehicleLocation));
    }

    @And("I enter Value {string} for BMW in dispatch call form")
    public void iEnterValueForBMWInDispatchCallForm(String strETA) {
        demoPageContainer.bmwCaseFlowPage.enterETA(TestDataUtil.getValue(strETA));
    }

    @And("I fill up {string} Caller dropdown in user Details")
    public void iFillUpCallerDropdownInUserDetails(String strCaller) {
        demoPageContainer.bmwCaseFlowPage.selectCaller(TestDataUtil.getValue(strCaller));
    }
}

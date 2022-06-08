Feature: Validating Xperigo application Functionality

  @BMW
  Scenario Outline: User Login salesforce site

    Given I am on salesforce application
    And  I enter <Username> and <Password>
    When I click Log In button
    Then I see the Xperigo Home Page
    Examples:
      | Username   | Password   |
      | &USERNAME& | &PASSWORD& |

  @BMW
  Scenario Outline: User perform Dispatch Call Functionality for BMW

    Given I am on Xperigo Home Page
    And I click New Button under case SubTab
    And I select value from <language> <CallFlow> dropdown
    And I Select value from "<RoadSideService>" "<TowReason>" "<NeutralQuestion>" dropdown for BMW in dispatch call form
    And I Select "<VIN>" and "<odometer>" Value for BMW on dispatch call form
    And I validate caller details fields "<FirstName>" "<LastName>" and "<CallBackNumber>" dropdown for BMW in dispatch call form
    And I fill up "<Phone>" Caller dropdown in user Details
    And I validate Vehicle details fields "<VehicleYear>" "<VehicleMake>" "<VehicleModel>" "<VehicleColor>" and "<ElectricVehicle>" dropdown for BMW in dispatch call form
    And I search customer address and fill Customer "<Address>" and "<location>" in user Details page for BMW call flow
    And I enter Value "<ETA>" for BMW in dispatch call form
    When I Click on Dispatch Call button
    Then I should see Dispatch result details
    Examples:
      | language   | CallFlow      | RoadSideService      | TowReason      | NeutralQuestion    | VIN      | odometer   | Phone    | Address   | location          | ETA   | FirstName   | LastName   | CallBackNumber   | VehicleYear   | VehicleMake   | VehicleModel   | VehicleColor   | ElectricVehicle   |
      | &LANGUAGE& | &CALLFLOWBMW& | &ROADSIDESERVICEBMW& | &TOWREASONBMW& | &NEUTRALQUESTIONS& | &VINBMW& | &ODOMETER& | &CALLER& | &ADDRESS& | &VEHICLELOCATION& | &ETA& | &FIRSTNAME& | &LASTNAME& | &CALLBACKNUMBER& | &VEHICLEYEAR& | &VEHICLEMAKE& | &VEHICLEMODEL& | &VEHICLECOLOR& | &ELECTRICVEHICLE& |


  @BMW
  Scenario Outline: User close the dispatched case

    Given I am on Dispatch result details screen
    And I Click on Back button
    And I Click on Close Case button
    Then I choose option in <reason> dropdown
    When I Click on Close Case button in close case frame
    Then I should see Success Message is pop up in screen
    Examples:
      | reason         |
      | &CANCELREASON& |

  @BMW
  Scenario Outline: User preform Flipping scenario

    Given I am on Xperigo Home Page
    And I click New Button under case SubTab
    And I select value from <language> <CallFlow> dropdown
    And I Select value from "<RoadSideService>" dropdown
    When I select No Recommend Tow value in "<BoostSymptoms>" dropdown
    Then I Verify that RSA flips to Tow with a reason
    Examples:
      | language   | CallFlow   | RoadSideService         | BoostSymptoms       |
      | &LANGUAGE& | &CALLFLOW& | &ROADSIDESERVICETWOBMW& | &NORECOMMENDTOWBMW& |
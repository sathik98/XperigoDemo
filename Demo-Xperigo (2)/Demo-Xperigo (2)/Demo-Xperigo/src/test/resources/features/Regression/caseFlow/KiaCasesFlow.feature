Feature: Validating Kia Cases flow Functionality

  @Kia
  Scenario Outline: User Login salesforce site

    Given I am on salesforce application
    And  I enter <Username> and <Password>
    When I click Log In button
    Then I see the Xperigo Home Page
    Examples:
      | Username   | Password   |
      | &USERNAME& | &PASSWORD& |


  @Kia
  Scenario Outline: User perform Dispatch Call Functionality for Kia

    Given I am on Xperigo Home Page
    And I click New Button under case SubTab
    And I select value from <language> <CallFlow> dropdown
    And I Select value from <RoadSideService> <TowReason> <NeutralQuestion> dropdown in dispatch call form
    And I Select "<VIN>" and "<odometer>" Value on dispatch call form
    And I validate caller details fields "<FirstName>" "<LastName>" and "<CallBackNumber>" dropdown in dispatch call form
    And I validate Vehicle details fields "<VehicleYear>" "<VehicleMake>" "<VehicleModel>" "<VehicleColor>" and "<ElectricVehicle>" dropdown in dispatch call form
    And I search customer address and fill Customer "<Address>" and "<location>" in user Details page
    And I enter Value "<ETA>" in dispatch call form
    And I enter customer survey "<Agree>" "<Email>" in dispatch call form
    When I Click on Dispatch Call button
    Then I should see Dispatch result details
    Examples:
      | language   | CallFlow   | RoadSideService      | TowReason      | NeutralQuestion    | VIN      | odometer   | Address   | location          | ETA   | FirstName   | LastName   | CallBackNumber   | VehicleYear   | VehicleMake   | VehicleModel   | VehicleColor   | ElectricVehicle   | Agree   | Email   |
      | &LANGUAGE& | &CALLFLOW& | &ROADSIDESERVICEKIA& | &TOWREASONKIA& | &NEUTRALQUESTIONS& | &VINKIA& | &ODOMETER& | &ADDRESS& | &VEHICLELOCATION& | &ETA& | &FIRSTNAME& | &LASTNAME& | &CALLBACKNUMBER& | &VEHICLEYEAR& | &VEHICLEMAKE& | &VEHICLEMODEL& | &VEHICLECOLOR& | &ELECTRICVEHICLE& | &AGREE& | &EMAIL& |

  @Kia
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

  @Kia
  Scenario Outline: User preform Flipping scenario

    Given I am on Xperigo Home Page
    And I click New Button under case SubTab
    And I select value from <language> <CallFlow> dropdown
    And I Select value from "<RoadSideService>" dropdown
    When I select Two is Recommended value in "<HowYouLikeToProceedRoadSideRequest>" dropdown
    Then I Verify that RSA flips to Tow with a reason for KIA
    Examples:
      | language   | CallFlow      | RoadSideService      | HowYouLikeToProceedRoadSideRequest |
      | &LANGUAGE& | &CALLFLOWKIA& | &ROADSIDESERVICEKIA& | &TWORECOMMENDED&                   |

  @Kia
  Scenario Outline: User preform program Flipping scenario

    Given I am on Xperigo Home Page
    And I click New Button under case SubTab
    And I select value from <language> <CallFlow> dropdown
    And I Select value from <RoadSideService> <TowReason> <NeutralQuestion> dropdown in dispatch call form
    When I enter LGM Kia policy "<LGMVIN>" Value on dispatch call form
    Then I verify that current program has been flips to LGM Kia
    Examples:
      | language   | CallFlow      | RoadSideService      | TowReason   | NeutralQuestion    | LGMVIN   |
      | &LANGUAGE& | &CALLFLOWKIA& | &ROADSIDESERVICEKIA& | &TOWREASON& | &NEUTRALQUESTIONS& | &LGMVIN& |
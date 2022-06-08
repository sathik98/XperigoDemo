package xperigo;

import cap.utilities.SharedDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import xperigo.pages.BMWCaseFlowPage;
import xperigo.pages.HomePage;
import xperigo.pages.KiaCaseFlowPage;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Created by Codoidian-pc on 05/03/2022.
 */
public class PageContainer {
    private WebDriver driver;
    public static Scenario myScenario;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();

    public HomePage homePage;
    public BMWCaseFlowPage bmwCaseFlowPage;
    public KiaCaseFlowPage kiaCaseFlowPage;

    public PageContainer() {
        driver = SharedDriver.getDriver();
        initPages();
    }

    private void initPages() {
        homePage = new HomePage(driver);
        bmwCaseFlowPage = new BMWCaseFlowPage(driver);
        kiaCaseFlowPage = new KiaCaseFlowPage(driver);
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.log(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }
       // if (scenario.isFailed()) {
            byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageBytes, "image/png", "");
       // }
        System.out.println("\n Scenario Outline: " + scenario.getName());
        System.out.println("\n Scenario Status: " + scenario.getStatus());
    }

    //  @Before("not @API and not @Mobile and not @Desktop")
    @Before
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
    }
}

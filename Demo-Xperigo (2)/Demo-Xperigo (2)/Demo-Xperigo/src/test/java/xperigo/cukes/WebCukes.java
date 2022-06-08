package xperigo.cukes;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/Regression/caseFlow"},
        monochrome = true,
//        tags = "@Kia",
        glue = {"xperigo"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"


        })


public class WebCukes extends AbstractTestNGCucumberTests {


}

package core.utils.AppiumHook;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class CucumberHook {

    // for Allure Report screenshot
    @After
    public void captureScreenShotOnTestFailure(Scenario scenarioUnderTest) throws IOException
    {
        if (AppiumRunner.getIOSDriver() != null)
        {
            if (scenarioUnderTest.isFailed())
            {
                System.out.println("In @After Appium iOS screenshot ... ");

                System.out.println("< --- ---- PAGE SOURCE START --- ---->\n" +
                AppiumRunner.getIOSDriver().getPageSource());
                System.out.println("< --- ---- PAGE SOURCE END ----- ---->\n");

                File failureScreenShot = ((TakesScreenshot) AppiumRunner.getIOSDriver()).getScreenshotAs(OutputType.FILE);
                Allure.addAttachment("Failure Screen", FileUtils.openInputStream(failureScreenShot));
            }
        }
    }
}

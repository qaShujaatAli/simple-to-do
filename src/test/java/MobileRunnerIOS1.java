import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.mdb.android.Android;
import com.testvagrant.mdb.ios.IOS;
import core.utils.AppiumHook.AppiumRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources"
        },
        tags = ("@SimpleToDo"),
        stepNotifications = true,
        publish = true,
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class MobileRunnerIOS1 {

        @BeforeClass
        public static void allocateDeviceRunner1()
        {
                AppiumRunner.platformName = "iOS";
                AppiumRunner.UDID = "BC261838-5661-4B39-A7C7-170E0112F55D";
                AppiumRunner.platformVersion = "18.1";
                AppiumRunner.deviceName = "iPhone 16";
        }
}

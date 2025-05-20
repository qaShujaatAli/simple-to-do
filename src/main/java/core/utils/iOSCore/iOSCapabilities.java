package core.utils.iOSCore;

import core.utils.ConfigUtil;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.time.Duration;
import java.util.Properties;

public class iOSCapabilities {

    public static Properties environmentConfig = ConfigUtil.getConfig("environment");

    public static XCUITestOptions getIOSDeviceCapabilities
                        (String platformName, String UDID, String platformVersion, String deviceName, String appName)
    {
        XCUITestOptions iosDesiredCap = new XCUITestOptions();

        iosDesiredCap.setPlatformName(platformName);  // e.g., "iOS"
        iosDesiredCap.setUdid(UDID);                 // Device UDID
        iosDesiredCap.setPlatformVersion(platformVersion);  // e.g., "17.0"
        iosDesiredCap.setDeviceName(deviceName);     // e.g., "iPhone 14"
        iosDesiredCap.setNewCommandTimeout(Duration.ofSeconds(0));
        iosDesiredCap.setAutomationName("XCUITest");
        iosDesiredCap.setNoReset(false);

// iOS-specific capabilities
        iosDesiredCap.setCapability("appium:autoAcceptAlerts", true);
        iosDesiredCap.setCapability("appium:useNewWDA", true);
        iosDesiredCap.setCapability("appium:connectHardwareKeyboard", false);
        iosDesiredCap.setCapability("appium:printPageSourceOnFindFailure", true);

// Set the .app or .ipa file path\
        String appPath = environmentConfig.getProperty("SIMPLE_TO_DO_APP");
        System.out.println("App Path: " + appPath);

        iosDesiredCap.setApp(environmentConfig.getProperty("SIMPLE_TO_DO_APP"));

        return iosDesiredCap;
    }

}

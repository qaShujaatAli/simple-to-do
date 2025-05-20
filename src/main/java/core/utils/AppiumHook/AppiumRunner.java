package core.utils.AppiumHook;

import core.utils.iOSCore.iOSCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AppiumRunner {

    public static String platformName;
    public static String UDID;
    public static String platformVersion;
    public static String deviceName;
    private static AndroidDriver androidDriver;
    private static IOSDriver iOSDriver;

    public static void startAppiumServeriOS() throws MalformedURLException
    {
        if (iOSDriver == null)
        {
            System.out.println("Starting Appium server ...");
            iOSDriver = new IOSDriver
                    (new URL("http://127.0.0.1:4723/wd/hub"),
                            iOSCapabilities.getIOSDeviceCapabilities
                                    (platformName, UDID, platformVersion, deviceName, ""));

            iOSDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }else
        {
            iOSDriver.executeScript("mobile: reset");
            System.out.println("iOS Driver not null!");
        }
    }

    public static IOSDriver getIOSDriver()
    {
        if (iOSDriver!=null)
            return iOSDriver;
        else
            System.out.println("iOS Driver not initialized!");
        return null;
    }

}

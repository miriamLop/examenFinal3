package deviceFactory;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

/**
 * @autor: Miriam
 * @date: 08/10/2020
 */

public interface IDevice {
    AppiumDriver create()throws MalformedURLException;
}

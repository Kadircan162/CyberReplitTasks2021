package day43_polymorphism;

public class PolymorphismInWebDriverClass {
    /*
    WebDriver driver;
    driver.get("http://practice.cybertekschool.com/");
    WebElement dropDownLink = driver.findElement(By.linkText("Dropdown"));

    //WebDriver driver = new ChromeDriver();//e.g. driver object address: WD@driver14623
    //jse address signature before casting: JSE@jse79120 (e.g.)
    //jse address signature after casting: JSE@jse14623 (same driver object address with different reference tool (jse))
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].click();", dropDownLink);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropDownLink);

    RemoteWebDriver remoteWebDriver = (RemoteWebDriver) driver;
    remoteWebDriver.executeScript("arguments[0].click();", dropDownLink);
    ChromiumDriver chromiumDriver = (ChromiumDriver) driver;
    chromiumDriver.executeScript("arguments[0].click();", dropDownLink);

        /*
        WebDriver driver1 = new ChromeDriver();
        driver1.executeScript("arguments[0].click();", dropDownLink);//Error: (I)SearchContext cannot call the methods of its child which are
        //implemented from another interface with which it has no parent/child/implementing relations (cannot call even by casting)
        SearchContext searchContext = driver;//no need to cast here. (I)SearchContext is over (I)WebDriver
        //e.g. searchContext address signature before casting: SC@searchContext25156
        //e.g. searchContext address signature after casting: SC@searchContext14623 (No need to down-casting, auto up-casting)
        searchContext.executeScript("arguments[0].click();", dropDownLink);//Error: (I)SearchContext cannot call the methods of its child which are
        //implemented from another interface with which it has no parent/child/implementing relations (cannot call even by casting)
        */

}

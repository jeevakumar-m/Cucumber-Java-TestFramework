package steps;

import Manager.BrowserManager;
import Manager.PageObjectManager;
import data.ConfigProvider;

public class AbstractSteps {

    public static PageObjectManager getPages;

    public void initDriver()
    {
        if(getPages==null){
        String browserName= ConfigProvider.getValueOf("BROWSER");
        getPages=new PageObjectManager(BrowserManager.getDriver(browserName));
    }}




}

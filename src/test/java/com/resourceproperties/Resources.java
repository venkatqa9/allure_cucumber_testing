package com.resourceproperties;

public enum Resources {
    CHROMEDRIVERPATH("src/test/resources/drivers/chromedriver.exe"),
    FIREFOXDRIVER("src/test/resources/drivers/geckodriver"),
    JSONDATA("src/main/resources/testdata/Testdata.json");
    String value;
    Resources(String value) {

        this.value=value;
    }
    public String getValue()
    {
        return value;
    }
}

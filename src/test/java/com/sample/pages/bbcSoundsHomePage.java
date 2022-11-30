package com.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bbcSoundsHomePage extends CommonPageElements {
    public static Map<String, String> URLS = new HashMap<>() {{
        put("Sounds Homepage", "https://www.bbc.co.uk/sounds");
        put("Stations", "https://www.bbc.co.uk/sounds/stations");
        put("Hip Hop, RnB & Dancehall", "https://www.bbc.co.uk/sounds/category/music-hiphoprnbanddancehall?sort=popular");
    }};

    public static Map<String, String> TITLES = new HashMap<>() {{
        put("Sounds Homepage", "BBC Sounds - Music. Radio. Podcasts");
        put("Stations", "BBC Sounds - Stations & Schedules");
        put("Hip Hop, RnB & Dancehall", "BBC Sounds - Categories - Hip Hop, RnB & Dancehall");
    }};

    @FindBy(xpath = "//div//div//a//div//div//div")
    public List<WebElement> networksLogos;

    public WebElement viewStations(String page) {
        return browser().findElement(By.xpath("(//*[text()='" + page + "']//..//..//..//img)[2]"));
    }

    public WebElement goToLink(String stationName) {
        return browser().findElement(By.xpath("//*[text()='" + stationName + "']"));
    }

    public WebElement categories(String musicCategories) {
        return browser().findElement(By.xpath("//*[text()='" + musicCategories + "']"));
    }


}


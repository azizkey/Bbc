package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class CommonPageElements extends Driver {
    public CommonPageElements() {
        PageFactory.initElements(browser(), this);
    }


    public void goToPage(String page) {
        browser().findElement(By.xpath("//nav[@role=\"navigation\"]//span[.='" + page + "']")).click();
    }


}


package com.sample.pages;

import com.sample.utilities.Driver;

public class PageInitializer extends Driver {

    public static bbcSoundsHomePage bbcPage;


    public static void initialize() {

        bbcPage = new bbcSoundsHomePage();

    }
}

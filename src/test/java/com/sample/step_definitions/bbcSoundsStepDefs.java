package com.sample.step_definitions;

import com.sample.pages.bbcSoundsHomePage;
import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class bbcSoundsStepDefs extends CommonSteps {

    @Given("I am on the BBC Sounds Homepage")
    public void i_am_on_the_bbc_sounds_homepage() {
    }

    @When("I select the {string} logo")
    public void iSelectTheLogo(String goToPage) {
        bbcPage.goToPage(goToPage);
    }

    @And("I can see the {string} logo")
    public void iCanSeeTheLogo(String radioName) {
        WebElement radioNameElement = bbcPage.viewStations(radioName);
        verifyElementDisplayed(radioNameElement);
    }

    @When("I click the {string} link")
    public void iClickTheLink(String allStationLink) {
        WebElement allStationElement = bbcPage.goToLink(allStationLink);
        click(allStationElement);
    }

    @And("I see {int} network station logos")
    public void iSeeNetworkStationLogos(int stationLogo) {
        Assert.assertEquals(stationLogo, bbcPage.networksLogos.size());
    }

    @When("I select {string} Category")
    public void iSelectCategory(String musicCategories) {
        bbcPage.goToPage("Home");
        click(bbcPage.categories(musicCategories));
    }

    @And("I see Category page is sorted by popular")
    public void iSeeCategoryPageIsSortedByPopular() {
        Assert.assertTrue(browser().getCurrentUrl().contains("popular"));
    }

    @Then("I am on the {string} page")
    public void iAmOnThePage(String expectedPage) {
        browser().get(bbcSoundsHomePage.URLS.get(expectedPage));
        Assert.assertEquals(browser().getTitle(), bbcSoundsHomePage.TITLES.get(expectedPage));
    }


    @And("all {int} categories should be clickable")
    public void allCategoriesShouldBeClickable(int arg0) {
    }
}
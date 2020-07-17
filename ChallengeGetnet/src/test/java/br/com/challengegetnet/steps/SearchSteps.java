package br.com.challengegetnet.steps;

import br.com.challengegetnet.pages.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    @Given("that I access the getnet site")
    public void thatIAccessTheGetnetSite() {
        searchPage.accessSite();
        searchPage.checkTitle();
    }

    @And("fill in the search with {string}")
    public void fillInTheSearchWith(String wordSearch) {
        searchPage.fillSearchField(wordSearch);
    }


    @When("I see the search result and click")
    public void iSeeTheSearchResultAndClick() {
        searchPage.findOption();
    }

    @After
    public void closeBrowser() {
        searchPage.closeBrowser();
    }


    @Then("I must see the message with the informative content with the text")
    public void iMustSeeTheMessageWithTheInformativeContentWithTheText() {
        searchPage.checkMessage();
    }
}

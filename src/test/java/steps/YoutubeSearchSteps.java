package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YoutubeSearchSteps extends AbstractSteps {



    @When("user searches for {string} in the search bar")
    public void userSearchingSearchBar(String searchText)
    {
        getPages.getYoutubeHomePage().searchForVideo(searchText);
    }

    @When("filters by {string} as {string}")
    public void filterBy(String filterType,String filterValue)
    {
        //implement code to verify
    }

    @Then("verify videos displayed were uploaded in last 1 hour")
    public void verifyLast1HourVideos()
    {
        //implement code to verify
    }


    @Then("verify search result belongs to {string}")
    public void verifySearchResultType(String contentType)
    {
        //implement code to verify
    }
}

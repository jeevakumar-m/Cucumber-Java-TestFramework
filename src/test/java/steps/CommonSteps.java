package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends AbstractSteps {
    @Given("user is on home page")
    public void userIsOnHomePage()
    {
        initDriver();
        getPages.getYoutubeHomePage().Load();
    }



    @When("user navigates to {string} tab and clicks {string} pane")
    public void user_navigates_to_tab_and_clicks_pane(String tab,String pane) {
        // Write code here that turns the phrase above into concrete actions
        getPages.getYoutubeHomePage().gotoTab(tab);
        getPages.getYoutubeHomePage().gotoPane(pane);
    }
}

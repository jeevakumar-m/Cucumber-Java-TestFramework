package Manager;

import org.openqa.selenium.WebDriver;
import pages.ExplorePage;
import pages.HomePage;

public class PageObjectManager {

  private static HomePage _youtubeHomePage;
  private static ExplorePage _youtubeExplorePage;
  private static WebDriver driver;

  public PageObjectManager(WebDriver driver)
  {
    this.driver=driver;
  }

  public HomePage getYoutubeHomePage()
  {
      return _youtubeHomePage==null? _youtubeHomePage= new HomePage(driver):_youtubeHomePage;
  }

  public ExplorePage getYoutubeExplorePage()
  {
      return _youtubeExplorePage==null? _youtubeExplorePage=new ExplorePage(driver):_youtubeExplorePage;
  }

}

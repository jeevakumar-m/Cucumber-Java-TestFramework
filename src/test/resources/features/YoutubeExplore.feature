Feature: Youtube explore

  Scenario:  verify youtube explore for trending videos
    Given user is on home page
    When user navigates to "Explore" tab and clicks "Trending" pane
    Then verify trending videos are displayed

  Scenario Outline: verify youtube explore for <Topic>
    Given user is on home page
    When user navigates to "Explore" tab and clicks "<Topic>" pane
    Then verify explore search result belongs to "<Topic>"
    Examples:
      | Topic |
      | Music |
      | Films |
      | News  |
      | Sport |
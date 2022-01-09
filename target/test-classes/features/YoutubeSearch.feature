Feature: Youtube search
  Scenario: verify youtube search for videos uploaded in last 1 hour
    Given user is on home page
    When user searches for "Giraffe" in the search bar
    And filters by "upload date" as "Last hour"
    Then verify videos displayed were uploaded in last 1 hour

  Scenario Outline: verify youtube search for <contentType>
    Given user is on home page
    When user searches for "Giraffe" in the search bar
    And filters by "Type" as "<contentType>"
    Then verify search result belongs to "<contentType>"
    Examples:
      | contentType |
      | Video       |
      | Channel     |
      | Playlist    |
      | Film        |
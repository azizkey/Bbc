Feature: Sound's web music page


  Background:
    Given I am on the BBC Sound's Music page

  @music
  Scenario: As a user I should be able to see 12 radio in the Back To Back Sounds
    When I click the "Music" module link
    Then I should able to see 'Back to Back Sounds' on the main screen
    And I can see 12 radio station

  @music
  Scenario: All items should be clickable
    Then user verifies that all 'Back to Back Sounds' items should be clickable
      | Radio 1 Anthems |
      | Radio 1 Happy   |
      | Charged Up      |
      | Artist Icons    |
      | Radio 2 90s     |
      | Soothing Sleep  |
      | The Reset       |
      | Pop Right Now   |
      | Amplified       |
      | Rap Unlocked    |
      | Total Rewind    |
      | Pre-Party       |


  @music
  Scenario: As a user I should able to see and click 15 music categories
    When I am on the music page
    Then I can see 15 music categories
    And all 15 categories should be clickable
      | Blues                                  |
      | Classical                              |
      | Classic Pop & Rock                     |
      | Country                                |
      | Dance & Electronica                    |
      | Desi                                   |
      | Easy Listening, Soundtracks & Musicals |
      | Folk                                   |
      | Hip Hop, RnB & Dancehall               |
      | Jazz                                   |
      | Mixes                                  |
      | Pop & Chart                            |
      | Rock & Indie                           |
      | Soul & Reggae                          |
      | World                                  |
@test0
Feature: Azal task
  #Scenario: Aza tsk||
  Scenario Outline: Book a flight ticket using "<Origin>" and "<Destination>"
    Given Open Azal website

      #Main page
    And Check "<Destination>"
    When Click on Origin section
    And Set "<Origin>" in Origin section
    Then Click on Origin
    When Click on Destination section
    And Set "<Destination>" in Destination section
    Then Click on Destination
    Then Click on Flight Date section
    And Choose Outbound date
    #Now Return Date section will be selected
    Then Click on Search button
    #There's bug that prevents searching when Return Date section is selected
    And Click on Outbound section
    Then Click on Search button

      #Search result page
    Then Click on Economy Tariff section for "<Origin>" and "<Destination>"
    And Choose Tariff with lowest cost
    Then Close Browser

    Examples:
    |Origin       |Destination|
    |Bakı         |Antalya    |
    |Moskva       |Bakı       |
    |Bakı         |London     |
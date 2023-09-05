Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Checking authorization on the site
    Given user opens '<homePage>' page
    And user enters '<keyWord>' to search field
    And user clicks on the submit button
    Then user checks the search result

    Examples:
      | homePage             | keyWord                                            |
      | https://www.ebay.com | DEWALT DWP849X Variable Speed Polisher 1250W 240V  |

  Scenario Outline: Check all categories are displayed
   Given user opens '<homePage>' page
    And user clicks on the 'Shop by category' button
    And users clicks on the 'See all categories' button
    Then user checks that all categories are displayed

    Examples:
      | homePage             |
      | https://www.ebay.com |

  Scenario Outline: Check that url contains required section
    Given user opens '<homePage>' page
    And user clicks on the 'Motors' button
    And user clicks on the 'Cars and Trucks Parts' button
    And user clicks on the 'Interior Parts and Accessories' button
    Then user checks that url contains required section

    Examples:
      | homePage             |
      | https://www.ebay.com |

  Scenario Outline: Check register fields
    Given user opens '<homePage>' page
    And user clicks on the 'Register' button
    Then user checks input fields

    Examples:
      | homePage             |
      | https://www.ebay.com |

  Scenario Outline: Check buy item
    Given user opens '<homePage>' page
    And user enters '<name>' item
    And user clicks on the submit button
    And user clicks on item
    And user chooses 'color' telephone
    And user clicks on the 'Add to cart' button
    Then user checks cart

    Examples:
      | homePage             | name          |
      | https://www.ebay.com | redmi 9 128gb |

  Scenario Outline: check deletion from the cart
    Given user opens '<homePage>' page
    And user enters '<name>' item
    And user clicks on the submit button
    And user clicks on item
    And user chooses 'color' telephone
    And user clicks on the 'Add to cart' button
    And user clicks on the logo
    And user clicks on the cart button
    And user removes item from cart
    Then user checks that cart is empty

    Examples:
      | homePage             | name          |
      | https://www.ebay.com | redmi 9 128gb |

  Scenario Outline: Check that functional the home page is displayed
    Given user opens '<homePage>' page
    And user clicks on 'logo'
    Then user checks that functional home page is displayed

    Examples:
      | homePage             |
      | https://www.ebay.com |

  Scenario Outline: checking the quantity of available goods
    Given user opens '<homePage>' page
    And user enters '<name>' item
    And user clicks on the submit button
    And user clicks on item
    And user chooses 'color' telephone
    And user chooses '<amount>' pieces
    Then user checks available quantity

    Examples:
      | homePage             | name          | amount|
      | https://www.ebay.com | redmi 9 128gb | 1000  |

  Scenario Outline: Check registration with out first name
    Given user opens '<homePage>' page
    And user clicks on the 'Register' button
    And user enters to first name input
    And user enters '<lastName>'  to last name input
    Then user checks that an 'enter first name' error message is displayed

    Examples:
      | homePage              | lastName |
      | https://www.ebay.com  | Trizna   |

  Scenario Outline: Check registration with out last name
    Given user opens '<homePage>' page
    And user clicks on the 'Register' button
    And user enters 'last name' to last name input
    And user enters '<firstName>' to first name input
    Then user checks that an 'enter last name' error message is displayed

    Examples:
      | homePage              | firstName |
      | https://www.ebay.com  | Vitaliy   |
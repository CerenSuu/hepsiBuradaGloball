@LoginTest
Feature: Login Test

  Scenario Outline: Go to hepsi burada website and login

    Given Go to hepsi burada website
    When Click to Giris Yap veya üye ol button
    And Click to Giris Yap button
    And Click "<e-posta>" adresi field
    And Click to login button
    And Type "<password>"
    And Click to loginn button
    Then Verify success message

    Examples:
      | e-posta                 | password |
      | cerensuylmz91@gmail.com | DumMy53  |
      | su.yilmazz3@gmail.com   | DumMy53  |








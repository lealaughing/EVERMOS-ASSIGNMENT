Feature: test evermos
  Scenario: Login with valid username and password
    Given open browser
    And open login page evermos
    When input valid username and password
    Then logged in succesfully

    Scenario: purchase satu produk
      Given click daftar produk
      And open page evermos and login
      When lakukan purchasing
      Then sampai ke checkout

      Scenario: copy paste toko saya
        Given : open evermos
        And login with invalid username
        When lakukan copy paste di tab chrome baru
        Then paste link toko di tab baru
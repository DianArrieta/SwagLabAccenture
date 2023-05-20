Feature: Use Shopping Cart

  #Scenario: Signed-in SwagLabs
  #  When Diana enters his username and password
  #  Then She should see the product catalog

  Scenario: Buying products at SwagLabs
   # Given that Juan signed-in SwagLabs app
    Given Diana enters his username and password
   # And She should see the product catalog
    When She puts in the cart the "Camisa Sauce Labs Bolt"
    And She does the checkout of his purchase
    Then She should see the message "CHECKOUT: COMPLETADO!"


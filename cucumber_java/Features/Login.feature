Feature: login

Scenario: Successful Login with valid credentails
		  Given user launch chromme browser
		  When  user opens URL "http://admin-demo.nopcommerce.com/login"
		  And   User enters Email as "admin@yourstore.com" and password as "admin"
		  And   Click on login
		  Then  Page Title should be "Dashboard / nopCommerce administration"
		  When  user click on log out link
		  Then  Page Title should be "Your store. Login"
		  And   close browser
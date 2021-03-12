Feature: Check if end point returns correct data
  
  Background: 
    * url 'https://jsonplaceholder.typicode.com/'
    * header Accept = 'application/json'
    
  Scenario: Verify Information returned by API
    Given path 'posts'
    When method get
    Then status 200

    And def userResponse = response

    Then match response[1].userId == '#number'
    Then match response[1].id == '#number'
    Then match response[1].body == '#string'
    Then match response[1].title == '#string'


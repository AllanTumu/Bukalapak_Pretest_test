Feature: Check if end point returns correct data

  Background:
    * url 'https://jsonplaceholder.typicode.com/'
    * header Accept = 'application/json'

  Scenario: Verify Information returned by API
    Given path 'posts'
    And request {"UserId":"12","Title":"recommendation","id":101,"body":"motorcycle"}
    When method POST
    Then status 201

    And def userResponse = response

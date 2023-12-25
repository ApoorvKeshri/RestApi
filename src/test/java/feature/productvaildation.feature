Feature: Vailding Place Api's
Scenario: verify if place is being Succesfully added using AddPlaceApi

Given Add Place Payload
When user calls "AddPlaceApI" With Post http request
Then the ApI call got success with status code 200
And "status" in response body is "OK"
And "Scope" in response body is "APP"
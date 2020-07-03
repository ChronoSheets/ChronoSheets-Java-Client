

# DoLoginResponse

A Response object containing important information that can be used after the user has logged in
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**csAuthToken** | **String** | The ChronoSheets Auth Token.  Use this token for all subsequent requests to the API.  The Auth Token does these things: holds your session and gives you appropraite authorisation to access API endpoints based on your UserRoles |  [optional]
**loggedInUser** | [**ClientSideUser**](ClientSideUser.md) |  |  [optional]




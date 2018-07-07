# OrganisationGroupUsersApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationGroupUsersGetOrganisationGroupUsers**](OrganisationGroupUsersApi.md#organisationGroupUsersGetOrganisationGroupUsers) | **GET** /api/OrganisationGroupUsers/GetOrganisationGroupUsers | Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupUsersUpdateOrganisationGroupUsers**](OrganisationGroupUsersApi.md#organisationGroupUsersUpdateOrganisationGroupUsers) | **POST** /api/OrganisationGroupUsers/UpdateOrganisationGroupUsers | Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.


<a name="organisationGroupUsersGetOrganisationGroupUsers"></a>
# **organisationGroupUsersGetOrganisationGroupUsers**
> CSApiResponseListUserForManagement organisationGroupUsersGetOrganisationGroupUsers(orgGroupId, xChronosheetsAuth)

Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupUsersApi;


OrganisationGroupUsersApi apiInstance = new OrganisationGroupUsersApi();
Integer orgGroupId = 56; // Integer | An OrganisatioGroup Id
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListUserForManagement result = apiInstance.organisationGroupUsersGetOrganisationGroupUsers(orgGroupId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupUsersApi#organisationGroupUsersGetOrganisationGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgGroupId** | **Integer**| An OrganisatioGroup Id |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListUserForManagement**](CSApiResponseListUserForManagement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupUsersUpdateOrganisationGroupUsers"></a>
# **organisationGroupUsersUpdateOrganisationGroupUsers**
> CSApiResponseBoolean organisationGroupUsersUpdateOrganisationGroupUsers(request, xChronosheetsAuth)

Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupUsersApi;


OrganisationGroupUsersApi apiInstance = new OrganisationGroupUsersApi();
CSSetOrganisationGroupUsersRequest request = new CSSetOrganisationGroupUsersRequest(); // CSSetOrganisationGroupUsersRequest | A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.organisationGroupUsersUpdateOrganisationGroupUsers(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupUsersApi#organisationGroupUsersUpdateOrganisationGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSSetOrganisationGroupUsersRequest**](CSSetOrganisationGroupUsersRequest.md)| A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


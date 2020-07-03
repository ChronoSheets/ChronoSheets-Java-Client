# OrganisationGroupUsersApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationGroupUsersGetOrganisationGroupUsers**](OrganisationGroupUsersApi.md#organisationGroupUsersGetOrganisationGroupUsers) | **GET** /OrganisationGroupUsers/GetOrganisationGroupUsers | Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupUsersUpdateOrganisationGroupUsers**](OrganisationGroupUsersApi.md#organisationGroupUsersUpdateOrganisationGroupUsers) | **PUT** /OrganisationGroupUsers/UpdateOrganisationGroupUsers | Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.


<a name="organisationGroupUsersGetOrganisationGroupUsers"></a>
# **organisationGroupUsersGetOrganisationGroupUsers**
> ApiResponseListUserForManagement organisationGroupUsersGetOrganisationGroupUsers(orgGroupId, xChronosheetsAuth)

Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.OrganisationGroupUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    OrganisationGroupUsersApi apiInstance = new OrganisationGroupUsersApi(defaultClient);
    Integer orgGroupId = 56; // Integer | An OrganisationGroup Id
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseListUserForManagement result = apiInstance.organisationGroupUsersGetOrganisationGroupUsers(orgGroupId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationGroupUsersApi#organisationGroupUsersGetOrganisationGroupUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgGroupId** | **Integer**| An OrganisationGroup Id |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseListUserForManagement**](ApiResponseListUserForManagement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="organisationGroupUsersUpdateOrganisationGroupUsers"></a>
# **organisationGroupUsersUpdateOrganisationGroupUsers**
> ApiResponseBoolean organisationGroupUsersUpdateOrganisationGroupUsers(xChronosheetsAuth, request)

Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.OrganisationGroupUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    OrganisationGroupUsersApi apiInstance = new OrganisationGroupUsersApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    SetOrganisationGroupUsersRequest request = new SetOrganisationGroupUsersRequest(); // SetOrganisationGroupUsersRequest | A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4
    try {
      ApiResponseBoolean result = apiInstance.organisationGroupUsersUpdateOrganisationGroupUsers(xChronosheetsAuth, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationGroupUsersApi#organisationGroupUsersUpdateOrganisationGroupUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **request** | [**SetOrganisationGroupUsersRequest**](SetOrganisationGroupUsersRequest.md)| A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4 |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


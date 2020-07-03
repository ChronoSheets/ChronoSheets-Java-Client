# UsualHoursApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usualHoursGetUsualHours**](UsualHoursApi.md#usualHoursGetUsualHours) | **GET** /UsualHours/GetUsualHours | Get usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.
[**usualHoursSetUsualHours**](UsualHoursApi.md#usualHoursSetUsualHours) | **PUT** /UsualHours/SetUsualHours | Set usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.


<a name="usualHoursGetUsualHours"></a>
# **usualHoursGetUsualHours**
> ApiResponseListUsualHoursDay usualHoursGetUsualHours(userId, xChronosheetsAuth)

Get usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.UsualHoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    UsualHoursApi apiInstance = new UsualHoursApi(defaultClient);
    Integer userId = 56; // Integer | The ID of the User for which you want to get UsualHours for
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseListUsualHoursDay result = apiInstance.usualHoursGetUsualHours(userId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsualHoursApi#usualHoursGetUsualHours");
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
 **userId** | **Integer**| The ID of the User for which you want to get UsualHours for |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseListUsualHoursDay**](ApiResponseListUsualHoursDay.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="usualHoursSetUsualHours"></a>
# **usualHoursSetUsualHours**
> ApiResponseBoolean usualHoursSetUsualHours(xChronosheetsAuth, request)

Set usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.UsualHoursApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    UsualHoursApi apiInstance = new UsualHoursApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    SetUsualHoursRequest request = new SetUsualHoursRequest(); // SetUsualHoursRequest | A Set UsualHours Request object containing updated data.  Make sure to specify the Day types in the request object so that ChronoSheets knows which Days to update
    try {
      ApiResponseBoolean result = apiInstance.usualHoursSetUsualHours(xChronosheetsAuth, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsualHoursApi#usualHoursSetUsualHours");
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
 **request** | [**SetUsualHoursRequest**](SetUsualHoursRequest.md)| A Set UsualHours Request object containing updated data.  Make sure to specify the Day types in the request object so that ChronoSheets knows which Days to update |

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


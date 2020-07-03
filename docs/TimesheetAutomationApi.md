# TimesheetAutomationApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timesheetAutomationCreateAutomationStep**](TimesheetAutomationApi.md#timesheetAutomationCreateAutomationStep) | **POST** /TimesheetAutomation/CreateAutomationStep | Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
[**timesheetAutomationGetTimesheetAutomationAuditTrail**](TimesheetAutomationApi.md#timesheetAutomationGetTimesheetAutomationAuditTrail) | **GET** /TimesheetAutomation/GetTimesheetAutomationAuditTrail | Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.


<a name="timesheetAutomationCreateAutomationStep"></a>
# **timesheetAutomationCreateAutomationStep**
> ApiResponseInt32 timesheetAutomationCreateAutomationStep(xChronosheetsAuth, request)

Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.TimesheetAutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    TimesheetAutomationApi apiInstance = new TimesheetAutomationApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    CreateAutomationStepRequest request = new CreateAutomationStepRequest(); // CreateAutomationStepRequest | 
    try {
      ApiResponseInt32 result = apiInstance.timesheetAutomationCreateAutomationStep(xChronosheetsAuth, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationCreateAutomationStep");
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
 **request** | [**CreateAutomationStepRequest**](CreateAutomationStepRequest.md)|  |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="timesheetAutomationGetTimesheetAutomationAuditTrail"></a>
# **timesheetAutomationGetTimesheetAutomationAuditTrail**
> ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take)

Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.TimesheetAutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    TimesheetAutomationApi apiInstance = new TimesheetAutomationApi(defaultClient);
    Integer geofenceId = 56; // Integer | The ID of the Geofence
    Integer userId = 56; // Integer | 
    String sort = "sort_example"; // String | 
    String order = "order_example"; // String | 
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many records
    Integer take = 56; // Integer | Take this many records
    try {
      ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence result = apiInstance.timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationGetTimesheetAutomationAuditTrail");
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
 **geofenceId** | **Integer**| The ID of the Geofence |
 **userId** | **Integer**|  |
 **sort** | **String**|  | [enum: UserName, AutomationActionType, ClientDateTime, IsProcessed]
 **order** | **String**|  | [enum: Ascending, Descending]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many records | [optional]
 **take** | **Integer**| Take this many records | [optional]

### Return type

[**ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence**](ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


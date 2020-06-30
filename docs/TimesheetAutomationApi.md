# TimesheetAutomationApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timesheetAutomationCreateAutomationStep**](TimesheetAutomationApi.md#timesheetAutomationCreateAutomationStep) | **POST** /TimesheetAutomation/CreateAutomationStep | Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
[**timesheetAutomationGetTimesheetAutomationAuditTrail**](TimesheetAutomationApi.md#timesheetAutomationGetTimesheetAutomationAuditTrail) | **GET** /TimesheetAutomation/GetTimesheetAutomationAuditTrail | Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.


<a name="timesheetAutomationCreateAutomationStep"></a>
# **timesheetAutomationCreateAutomationStep**
> CSApiResponseInt32 timesheetAutomationCreateAutomationStep(request, xChronosheetsAuth)

Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetAutomationApi;


TimesheetAutomationApi apiInstance = new TimesheetAutomationApi();
CSCreateAutomationStepRequest request = new CSCreateAutomationStepRequest(); // CSCreateAutomationStepRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.timesheetAutomationCreateAutomationStep(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationCreateAutomationStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSCreateAutomationStepRequest**](CSCreateAutomationStepRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetAutomationGetTimesheetAutomationAuditTrail"></a>
# **timesheetAutomationGetTimesheetAutomationAuditTrail**
> CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take)

Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetAutomationApi;


TimesheetAutomationApi apiInstance = new TimesheetAutomationApi();
Integer geofenceId = 56; // Integer | The ID of the Geofence
Integer userId = 56; // Integer | 
String sort = "sort_example"; // String | 
String order = "order_example"; // String | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
Integer skip = 56; // Integer | Skip this many records
Integer take = 56; // Integer | Take this many records
try {
    CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence result = apiInstance.timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationGetTimesheetAutomationAuditTrail");
    e.printStackTrace();
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

[**CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence**](CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


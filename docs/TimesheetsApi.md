# TimesheetsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timesheetsDeleteTimesheet**](TimesheetsApi.md#timesheetsDeleteTimesheet) | **DELETE** /api/Timesheets/DeleteTimesheet | Delete a timesheet
[**timesheetsGetTimesheets**](TimesheetsApi.md#timesheetsGetTimesheets) | **GET** /api/Timesheets/GetTimesheets | Get timesheets between start and end dates
[**timesheetsInsertSingleTimesheet**](TimesheetsApi.md#timesheetsInsertSingleTimesheet) | **PUT** /api/Timesheets/InsertSingleTimesheet | Inserts a single timesheet record
[**timesheetsUpdateTimesheets**](TimesheetsApi.md#timesheetsUpdateTimesheets) | **POST** /api/Timesheets/UpdateTimesheets | Batch update timesheets


<a name="timesheetsDeleteTimesheet"></a>
# **timesheetsDeleteTimesheet**
> CsApiApiResponseBoolean timesheetsDeleteTimesheet(timesheetId, xChronosheetsAuth)

Delete a timesheet

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
Integer timesheetId = 56; // Integer | The ID of the timesheet to delete
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseBoolean result = apiInstance.timesheetsDeleteTimesheet(timesheetId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsDeleteTimesheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timesheetId** | **Integer**| The ID of the timesheet to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseBoolean**](CsApiApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsGetTimesheets"></a>
# **timesheetsGetTimesheets**
> CsApiApiResponseListTimesheet timesheetsGetTimesheets(startDate, endDate, xChronosheetsAuth)

Get timesheets between start and end dates

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the date range
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the date range
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseListTimesheet result = apiInstance.timesheetsGetTimesheets(startDate, endDate, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsGetTimesheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**| The start date of the date range |
 **endDate** | **OffsetDateTime**| The end date of the date range |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseListTimesheet**](CsApiApiResponseListTimesheet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsInsertSingleTimesheet"></a>
# **timesheetsInsertSingleTimesheet**
> CsApiApiResponseInt32 timesheetsInsertSingleTimesheet(request, xChronosheetsAuth)

Inserts a single timesheet record

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
CsApiTimesheet request = new CsApiTimesheet(); // CsApiTimesheet | The timesheet request object
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseInt32 result = apiInstance.timesheetsInsertSingleTimesheet(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsInsertSingleTimesheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiTimesheet**](CsApiTimesheet.md)| The timesheet request object |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseInt32**](CsApiApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsUpdateTimesheets"></a>
# **timesheetsUpdateTimesheets**
> CsApiApiResponseListInt32 timesheetsUpdateTimesheets(request, xChronosheetsAuth)

Batch update timesheets

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
CsApiBatchUpdateTimesheetRequest request = new CsApiBatchUpdateTimesheetRequest(); // CsApiBatchUpdateTimesheetRequest | The batch update timesheets request
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseListInt32 result = apiInstance.timesheetsUpdateTimesheets(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsUpdateTimesheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiBatchUpdateTimesheetRequest**](CsApiBatchUpdateTimesheetRequest.md)| The batch update timesheets request |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseListInt32**](CsApiApiResponseListInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


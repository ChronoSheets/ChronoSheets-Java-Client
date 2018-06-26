# TimesheetsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timesheetsCreateSingleTimesheet**](TimesheetsApi.md#timesheetsCreateSingleTimesheet) | **PUT** /api/Timesheets/CreateSingleTimesheet | Inserts a single timesheet record
[**timesheetsDeleteTimesheet**](TimesheetsApi.md#timesheetsDeleteTimesheet) | **DELETE** /api/Timesheets/DeleteTimesheet | Delete a timesheet
[**timesheetsGetTimesheets**](TimesheetsApi.md#timesheetsGetTimesheets) | **GET** /api/Timesheets/GetTimesheets | Get timesheets between start and end dates
[**timesheetsUpdateTimesheets**](TimesheetsApi.md#timesheetsUpdateTimesheets) | **POST** /api/Timesheets/UpdateTimesheets | Batch update timesheets


<a name="timesheetsCreateSingleTimesheet"></a>
# **timesheetsCreateSingleTimesheet**
> CSApiResponseInt32 timesheetsCreateSingleTimesheet(request, xChronosheetsAuth)

Inserts a single timesheet record

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
CSTimesheet request = new CSTimesheet(); // CSTimesheet | The timesheet request object
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.timesheetsCreateSingleTimesheet(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsCreateSingleTimesheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSTimesheet**](CSTimesheet.md)| The timesheet request object |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsDeleteTimesheet"></a>
# **timesheetsDeleteTimesheet**
> CSApiResponseBoolean timesheetsDeleteTimesheet(timesheetId, xChronosheetsAuth)

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
    CSApiResponseBoolean result = apiInstance.timesheetsDeleteTimesheet(timesheetId, xChronosheetsAuth);
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

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsGetTimesheets"></a>
# **timesheetsGetTimesheets**
> CSApiResponseListTimesheet timesheetsGetTimesheets(startDate, endDate, xChronosheetsAuth)

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
    CSApiResponseListTimesheet result = apiInstance.timesheetsGetTimesheets(startDate, endDate, xChronosheetsAuth);
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

[**CSApiResponseListTimesheet**](CSApiResponseListTimesheet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="timesheetsUpdateTimesheets"></a>
# **timesheetsUpdateTimesheets**
> CSApiResponseListInt32 timesheetsUpdateTimesheets(request, xChronosheetsAuth)

Batch update timesheets

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TimesheetsApi;


TimesheetsApi apiInstance = new TimesheetsApi();
CSBatchUpdateTimesheetRequest request = new CSBatchUpdateTimesheetRequest(); // CSBatchUpdateTimesheetRequest | The batch update timesheets request
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListInt32 result = apiInstance.timesheetsUpdateTimesheets(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetsApi#timesheetsUpdateTimesheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSBatchUpdateTimesheetRequest**](CSBatchUpdateTimesheetRequest.md)| The batch update timesheets request |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListInt32**](CSApiResponseListInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


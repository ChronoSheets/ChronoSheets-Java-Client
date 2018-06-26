# ReportsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsGetAllChartsDataAdmin**](ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /api/Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects)
[**reportsGetAllChartsDataUser**](ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /api/Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs and Tasks)
[**reportsGetOrgTripById**](ReportsApi.md#reportsGetOrgTripById) | **GET** /api/Reports/GetOrgTripById | Get trip by Id, for reporting purposes
[**reportsGetOrganisationTimesheetFileAttachments**](ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /api/Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments
[**reportsGetOrganisationTrips**](ReportsApi.md#reportsGetOrganisationTrips) | **GET** /api/Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation)
[**reportsGetRawDataAdmin**](ReportsApi.md#reportsGetRawDataAdmin) | **GET** /api/Reports/GetRawDataAdmin | Get Timesheets Raw Data
[**reportsProjectCostingsAdmin**](ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /api/Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users
[**reportsUserJobsOverTime**](ReportsApi.md#reportsUserJobsOverTime) | **GET** /api/Reports/UserJobsOverTime | Timeseries jobs data for the logged in user


<a name="reportsGetAllChartsDataAdmin"></a>
# **reportsGetAllChartsDataAdmin**
> CSApiResponseCombinedReportsData reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth)

Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects)

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
String userIds = "userIds_example"; // String | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **userIds** | **String**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseCombinedReportsData**](CSApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetAllChartsDataUser"></a>
# **reportsGetAllChartsDataUser**
> CSApiResponseCombinedReportsData reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth)

Get Consolidated User Reports Data (Jobs and Tasks)

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseCombinedReportsData**](CSApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrgTripById"></a>
# **reportsGetOrgTripById**
> CSApiResponseTrip reportsGetOrgTripById(tripId, xChronosheetsAuth)

Get trip by Id, for reporting purposes

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Integer tripId = 56; // Integer | The ID of the trip
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseTrip result = apiInstance.reportsGetOrgTripById(tripId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrgTripById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tripId** | **Integer**| The ID of the trip |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseTrip**](CSApiResponseTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTimesheetFileAttachments"></a>
# **reportsGetOrganisationTimesheetFileAttachments**
> CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, skip, take, userIds, xChronosheetsAuth)

Reports on Organisation timesheet file attachments

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
Integer skip = 56; // Integer | 
Integer take = 56; // Integer | 
String userIds = "userIds_example"; // String | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment result = apiInstance.reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, skip, take, userIds, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTimesheetFileAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **skip** | **Integer**|  |
 **take** | **Integer**|  |
 **userIds** | **String**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment**](CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTrips"></a>
# **reportsGetOrganisationTrips**
> CSApiResponseForPaginatedListOrgReportTrip reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth)

Reports on Organisation trips (GPS tracking from whole organisation)

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
Integer skip = 56; // Integer | 
Integer take = 56; // Integer | 
String userIds = "userIds_example"; // String | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListOrgReportTrip result = apiInstance.reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **skip** | **Integer**|  |
 **take** | **Integer**|  |
 **userIds** | **String**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListOrgReportTrip**](CSApiResponseForPaginatedListOrgReportTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetRawDataAdmin"></a>
# **reportsGetRawDataAdmin**
> CSApiResponseForPaginatedListRawReportItem reportsGetRawDataAdmin(startDate, endDate, userIds, sort, order, skip, take, xChronosheetsAuth)

Get Timesheets Raw Data

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
String userIds = "userIds_example"; // String | 
String sort = "sort_example"; // String | 
String order = "order_example"; // String | 
Integer skip = 56; // Integer | 
Integer take = 56; // Integer | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListRawReportItem result = apiInstance.reportsGetRawDataAdmin(startDate, endDate, userIds, sort, order, skip, take, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetRawDataAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **userIds** | **String**|  |
 **sort** | **String**|  | [enum: EmailAddress, JobCode, TaskName, ClientName, ProjectName, StartDate, EndDate, SpanSeconds, Description, PayAmount, PayOvertimeAmount, TripCost, TripDistanceMeters, Username]
 **order** | **String**|  | [enum: Ascending, Descending]
 **skip** | **Integer**|  |
 **take** | **Integer**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListRawReportItem**](CSApiResponseForPaginatedListRawReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsProjectCostingsAdmin"></a>
# **reportsProjectCostingsAdmin**
> CSApiResponseListProjectCostingReportItem reportsProjectCostingsAdmin(startDate, endDate, userIds, xChronosheetsAuth)

Gets project cost estimations VS actual cost for date range and users

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
String userIds = "userIds_example"; // String | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListProjectCostingReportItem result = apiInstance.reportsProjectCostingsAdmin(startDate, endDate, userIds, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsProjectCostingsAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **userIds** | **String**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListProjectCostingReportItem**](CSApiResponseListProjectCostingReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsUserJobsOverTime"></a>
# **reportsUserJobsOverTime**
> CSApiResponseListJobSeriesReportItem reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth)

Timeseries jobs data for the logged in user

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListJobSeriesReportItem result = apiInstance.reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsUserJobsOverTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  |
 **endDate** | **OffsetDateTime**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListJobSeriesReportItem**](CSApiResponseListJobSeriesReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


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
> CsApiApiResponseCombinedReportsData reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth)

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
    CsApiApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth);
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

[**CsApiApiResponseCombinedReportsData**](CsApiApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetAllChartsDataUser"></a>
# **reportsGetAllChartsDataUser**
> CsApiApiResponseCombinedReportsData reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth)

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
    CsApiApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth);
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

[**CsApiApiResponseCombinedReportsData**](CsApiApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrgTripById"></a>
# **reportsGetOrgTripById**
> CsApiApiResponseTrip reportsGetOrgTripById(tripId, xChronosheetsAuth)

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
    CsApiApiResponseTrip result = apiInstance.reportsGetOrgTripById(tripId, xChronosheetsAuth);
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

[**CsApiApiResponseTrip**](CsApiApiResponseTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTimesheetFileAttachments"></a>
# **reportsGetOrganisationTimesheetFileAttachments**
> CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, skip, take, userIds, xChronosheetsAuth)

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
    CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment result = apiInstance.reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, skip, take, userIds, xChronosheetsAuth);
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

[**CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment**](CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTrips"></a>
# **reportsGetOrganisationTrips**
> CsApiApiResponseForPaginatedListOrgReportTrip reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth)

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
    CsApiApiResponseForPaginatedListOrgReportTrip result = apiInstance.reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth);
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

[**CsApiApiResponseForPaginatedListOrgReportTrip**](CsApiApiResponseForPaginatedListOrgReportTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetRawDataAdmin"></a>
# **reportsGetRawDataAdmin**
> CsApiApiResponseForPaginatedListRawReportItem reportsGetRawDataAdmin(startDate, endDate, userIds, sort, order, skip, take, xChronosheetsAuth)

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
Integer sort = 56; // Integer | 0 = Username, 1 = EmailAddress, 2 = JobCode, 3 = TaskName, 4 = ClientName, 5 = ProjectName, 6 = StartDate, 7 = EndDate, 8 = SpanSeconds, 9 = Description, 10 = PayAmount, 11 = PayOvertimeAmount, 12 = TripCost, 13 = TripDistanceMeters
Integer order = 56; // Integer | 0 = Ascending, 1 = Descending
Integer skip = 56; // Integer | 
Integer take = 56; // Integer | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseForPaginatedListRawReportItem result = apiInstance.reportsGetRawDataAdmin(startDate, endDate, userIds, sort, order, skip, take, xChronosheetsAuth);
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
 **sort** | **Integer**| 0 &#x3D; Username, 1 &#x3D; EmailAddress, 2 &#x3D; JobCode, 3 &#x3D; TaskName, 4 &#x3D; ClientName, 5 &#x3D; ProjectName, 6 &#x3D; StartDate, 7 &#x3D; EndDate, 8 &#x3D; SpanSeconds, 9 &#x3D; Description, 10 &#x3D; PayAmount, 11 &#x3D; PayOvertimeAmount, 12 &#x3D; TripCost, 13 &#x3D; TripDistanceMeters | [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
 **order** | **Integer**| 0 &#x3D; Ascending, 1 &#x3D; Descending | [enum: 0, 1]
 **skip** | **Integer**|  |
 **take** | **Integer**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseForPaginatedListRawReportItem**](CsApiApiResponseForPaginatedListRawReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsProjectCostingsAdmin"></a>
# **reportsProjectCostingsAdmin**
> CsApiApiResponseListProjectCostingReportItem reportsProjectCostingsAdmin(startDate, endDate, userIds, xChronosheetsAuth)

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
    CsApiApiResponseListProjectCostingReportItem result = apiInstance.reportsProjectCostingsAdmin(startDate, endDate, userIds, xChronosheetsAuth);
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

[**CsApiApiResponseListProjectCostingReportItem**](CsApiApiResponseListProjectCostingReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsUserJobsOverTime"></a>
# **reportsUserJobsOverTime**
> CsApiApiResponseListJobSeriesReportItem reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth)

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
    CsApiApiResponseListJobSeriesReportItem result = apiInstance.reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth);
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

[**CsApiApiResponseListJobSeriesReportItem**](CsApiApiResponseListJobSeriesReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


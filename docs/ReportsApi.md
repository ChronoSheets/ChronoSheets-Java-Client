# ReportsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsGetAllChartsDataAdmin**](ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /api/Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetAllChartsDataUser**](ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /api/Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
[**reportsGetFleetSummaryAdmin**](ReportsApi.md#reportsGetFleetSummaryAdmin) | **GET** /api/Reports/GetFleetSummaryAdmin | Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrgTripById**](ReportsApi.md#reportsGetOrgTripById) | **GET** /api/Reports/GetOrgTripById | Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTimesheetFileAttachments**](ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /api/Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTranscripts**](ReportsApi.md#reportsGetOrganisationTranscripts) | **GET** /api/Reports/GetOrganisationTranscripts | Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTrips**](ReportsApi.md#reportsGetOrganisationTrips) | **GET** /api/Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetRawDataAdmin**](ReportsApi.md#reportsGetRawDataAdmin) | **GET** /api/Reports/GetRawDataAdmin | Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsProjectCostingsAdmin**](ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /api/Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsUserJobsOverTime**](ReportsApi.md#reportsUserJobsOverTime) | **GET** /api/Reports/UserJobsOverTime | Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.


<a name="reportsGetAllChartsDataAdmin"></a>
# **reportsGetAllChartsDataAdmin**
> CSApiResponseCombinedReportsData reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth)

Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
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

Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseCombinedReportsData**](CSApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetFleetSummaryAdmin"></a>
# **reportsGetFleetSummaryAdmin**
> CSApiResponseListFleetSummaryReportItem reportsGetFleetSummaryAdmin(startDate, endDate, userIds, xChronosheetsAuth)

Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListFleetSummaryReportItem result = apiInstance.reportsGetFleetSummaryAdmin(startDate, endDate, userIds, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetFleetSummaryAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListFleetSummaryReportItem**](CSApiResponseListFleetSummaryReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrgTripById"></a>
# **reportsGetOrgTripById**
> CSApiResponseTrip reportsGetOrgTripById(tripId, xChronosheetsAuth)

Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Integer tripId = 56; // Integer | The ID of the Trip you want to get
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
 **tripId** | **Integer**| The ID of the Trip you want to get |
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

Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
Integer skip = 56; // Integer | Skip this many items
Integer take = 56; // Integer | Take this many items
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **skip** | **Integer**| Skip this many items |
 **take** | **Integer**| Take this many items |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment**](CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTranscripts"></a>
# **reportsGetOrganisationTranscripts**
> CSApiResponseForPaginatedListOrgReportTranscript reportsGetOrganisationTranscripts(startDate, endDate, skip, take, userIds, keywords, xChronosheetsAuth)

Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
Integer skip = 56; // Integer | Skip this many items
Integer take = 56; // Integer | Take this many items
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String keywords = "keywords_example"; // String | Search the transcripts by keyword(s)
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListOrgReportTranscript result = apiInstance.reportsGetOrganisationTranscripts(startDate, endDate, skip, take, userIds, keywords, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTranscripts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **skip** | **Integer**| Skip this many items |
 **take** | **Integer**| Take this many items |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
 **keywords** | **String**| Search the transcripts by keyword(s) |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListOrgReportTranscript**](CSApiResponseForPaginatedListOrgReportTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="reportsGetOrganisationTrips"></a>
# **reportsGetOrganisationTrips**
> CSApiResponseForPaginatedListOrgReportTrip reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth)

Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
Integer skip = 56; // Integer | Skip this many items
Integer take = 56; // Integer | Take this many items
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **skip** | **Integer**| Skip this many items |
 **take** | **Integer**| Take this many items |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
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

Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String sort = "sort_example"; // String | Decide which column to sort on
String order = "order_example"; // String | Decide which direction to sort the column
Integer skip = 56; // Integer | Skip this many rows
Integer take = 56; // Integer | Take this many rows
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
 **sort** | **String**| Decide which column to sort on | [enum: EmailAddress, JobCode, TaskName, ClientName, ProjectName, StartDate, EndDate, SpanSeconds, Description, PayAmount, PayOvertimeAmount, TripCost, TripDistanceMeters, Username]
 **order** | **String**| Decide which direction to sort the column | [enum: Ascending, Descending]
 **skip** | **Integer**| Skip this many rows |
 **take** | **Integer**| Take this many rows |
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

Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. |
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

Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListJobSeriesReportItem**](CSApiResponseListJobSeriesReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


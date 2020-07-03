# ReportsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsGetAllChartsDataAdmin**](ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetAllChartsDataUser**](ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
[**reportsGetFleetSummaryAdmin**](ReportsApi.md#reportsGetFleetSummaryAdmin) | **GET** /Reports/GetFleetSummaryAdmin | Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrgTripById**](ReportsApi.md#reportsGetOrgTripById) | **GET** /Reports/GetOrgTripById | Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTimesheetFileAttachments**](ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTranscripts**](ReportsApi.md#reportsGetOrganisationTranscripts) | **GET** /Reports/GetOrganisationTranscripts | Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTrips**](ReportsApi.md#reportsGetOrganisationTrips) | **GET** /Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetRawDataAdmin**](ReportsApi.md#reportsGetRawDataAdmin) | **GET** /Reports/GetRawDataAdmin | Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsProjectCostingsAdmin**](ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsUserJobsOverTime**](ReportsApi.md#reportsUserJobsOverTime) | **GET** /Reports/UserJobsOverTime | Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.


<a name="reportsGetAllChartsDataAdmin"></a>
# **reportsGetAllChartsDataAdmin**
> ApiResponseCombinedReportsData reportsGetAllChartsDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, forceOnlyThisChart)

Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    String forceOnlyThisChart = "forceOnlyThisChart_example"; // String | A flag to indicate which report data you require.  Choose a particular set of data, or if you want all data use the 'NotForced' option.
    try {
      ApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, forceOnlyThisChart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataAdmin");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]
 **forceOnlyThisChart** | **String**| A flag to indicate which report data you require.  Choose a particular set of data, or if you want all data use the &#39;NotForced&#39; option. | [optional] [enum: NotForced, SeriesJobCodes, SeriesClients, SeriesProjects, SeriesTasks, TotalsClients, TotalsJobCodes, TotalsProjects, TotalsTasks]

### Return type

[**ApiResponseCombinedReportsData**](ApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetAllChartsDataUser"></a>
# **reportsGetAllChartsDataUser**
> ApiResponseCombinedReportsData reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth)

Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataUser");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseCombinedReportsData**](ApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetFleetSummaryAdmin"></a>
# **reportsGetFleetSummaryAdmin**
> ApiResponseListFleetSummaryReportItem reportsGetFleetSummaryAdmin(startDate, endDate, xChronosheetsAuth, userIds)

Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    try {
      ApiResponseListFleetSummaryReportItem result = apiInstance.reportsGetFleetSummaryAdmin(startDate, endDate, xChronosheetsAuth, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetFleetSummaryAdmin");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]

### Return type

[**ApiResponseListFleetSummaryReportItem**](ApiResponseListFleetSummaryReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetOrgTripById"></a>
# **reportsGetOrgTripById**
> ApiResponseTrip reportsGetOrgTripById(tripId, xChronosheetsAuth)

Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer tripId = 56; // Integer | The ID of the Trip you want to get
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseTrip result = apiInstance.reportsGetOrgTripById(tripId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetOrgTripById");
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
 **tripId** | **Integer**| The ID of the Trip you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseTrip**](ApiResponseTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetOrganisationTimesheetFileAttachments"></a>
# **reportsGetOrganisationTimesheetFileAttachments**
> ApiResponseForPaginatedListOrgReportTimesheetFileAttachment reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take, userIds)

Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many items
    Integer take = 56; // Integer | Take this many items
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    try {
      ApiResponseForPaginatedListOrgReportTimesheetFileAttachment result = apiInstance.reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTimesheetFileAttachments");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many items | [optional]
 **take** | **Integer**| Take this many items | [optional]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]

### Return type

[**ApiResponseForPaginatedListOrgReportTimesheetFileAttachment**](ApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetOrganisationTranscripts"></a>
# **reportsGetOrganisationTranscripts**
> ApiResponseForPaginatedListOrgReportTranscript reportsGetOrganisationTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, userIds, keywords)

Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many items
    Integer take = 56; // Integer | Take this many items
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    String keywords = "keywords_example"; // String | Search the transcripts by keyword(s)
    try {
      ApiResponseForPaginatedListOrgReportTranscript result = apiInstance.reportsGetOrganisationTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, userIds, keywords);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTranscripts");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many items | [optional]
 **take** | **Integer**| Take this many items | [optional]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]
 **keywords** | **String**| Search the transcripts by keyword(s) | [optional]

### Return type

[**ApiResponseForPaginatedListOrgReportTranscript**](ApiResponseForPaginatedListOrgReportTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetOrganisationTrips"></a>
# **reportsGetOrganisationTrips**
> ApiResponseForPaginatedListOrgReportTrip reportsGetOrganisationTrips(startDate, endDate, xChronosheetsAuth, skip, take, userIds)

Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many items
    Integer take = 56; // Integer | Take this many items
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    try {
      ApiResponseForPaginatedListOrgReportTrip result = apiInstance.reportsGetOrganisationTrips(startDate, endDate, xChronosheetsAuth, skip, take, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTrips");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many items | [optional]
 **take** | **Integer**| Take this many items | [optional]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]

### Return type

[**ApiResponseForPaginatedListOrgReportTrip**](ApiResponseForPaginatedListOrgReportTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsGetRawDataAdmin"></a>
# **reportsGetRawDataAdmin**
> ApiResponseForPaginatedListRawReportItem reportsGetRawDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, sort, order, skip, take)

Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    String sort = "sort_example"; // String | Decide which column to sort on
    String order = "order_example"; // String | Decide which direction to sort the column
    Integer skip = 56; // Integer | Skip this many rows
    Integer take = 56; // Integer | Take this many rows
    try {
      ApiResponseForPaginatedListRawReportItem result = apiInstance.reportsGetRawDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, sort, order, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetRawDataAdmin");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]
 **sort** | **String**| Decide which column to sort on | [optional] [enum: EmailAddress, JobCode, TaskName, ClientName, ProjectName, StartDate, EndDate, SpanSeconds, Description, PayAmount, PayOvertimeAmount, TripCost, TripDistanceMeters, Username]
 **order** | **String**| Decide which direction to sort the column | [optional] [enum: Ascending, Descending]
 **skip** | **Integer**| Skip this many rows | [optional]
 **take** | **Integer**| Take this many rows | [optional]

### Return type

[**ApiResponseForPaginatedListRawReportItem**](ApiResponseForPaginatedListRawReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsProjectCostingsAdmin"></a>
# **reportsProjectCostingsAdmin**
> ApiResponseListProjectCostingReportItem reportsProjectCostingsAdmin(startDate, endDate, xChronosheetsAuth, userIds)

Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    String userIds = "userIds_example"; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
    try {
      ApiResponseListProjectCostingReportItem result = apiInstance.reportsProjectCostingsAdmin(startDate, endDate, xChronosheetsAuth, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsProjectCostingsAdmin");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional]

### Return type

[**ApiResponseListProjectCostingReportItem**](ApiResponseListProjectCostingReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reportsUserJobsOverTime"></a>
# **reportsUserJobsOverTime**
> ApiResponseListJobSeriesReportItem reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth)

Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date for the date range.  Report data in the response is after this date
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date for the date range.  Report data in the response is before this date
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseListJobSeriesReportItem result = apiInstance.reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUserJobsOverTime");
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
 **startDate** | **OffsetDateTime**| The start date for the date range.  Report data in the response is after this date |
 **endDate** | **OffsetDateTime**| The end date for the date range.  Report data in the response is before this date |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseListJobSeriesReportItem**](ApiResponseListJobSeriesReportItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


# AggregateJobTasksApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateJobTasksGetAggregateJobTasks**](AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.


<a name="aggregateJobTasksGetAggregateJobTasks"></a>
# **aggregateJobTasksGetAggregateJobTasks**
> ApiResponseListAggregateJobCode aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth)

Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.AggregateJobTasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    AggregateJobTasksApi apiInstance = new AggregateJobTasksApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseListAggregateJobCode result = apiInstance.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AggregateJobTasksApi#aggregateJobTasksGetAggregateJobTasks");
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

### Return type

[**ApiResponseListAggregateJobCode**](ApiResponseListAggregateJobCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


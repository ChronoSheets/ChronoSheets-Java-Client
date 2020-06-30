# AggregateClientProjectsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateClientProjectsGetAggregateClientProjects**](AggregateClientProjectsApi.md#aggregateClientProjectsGetAggregateClientProjects) | **GET** /AggregateClientProjects/GetAggregateClientProjects | Get client and project information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageClientsAndProjects&#39; permissions.


<a name="aggregateClientProjectsGetAggregateClientProjects"></a>
# **aggregateClientProjectsGetAggregateClientProjects**
> CSApiResponseListAggregateClient aggregateClientProjectsGetAggregateClientProjects(xChronosheetsAuth)

Get client and project information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageClientsAndProjects&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.AggregateClientProjectsApi;


AggregateClientProjectsApi apiInstance = new AggregateClientProjectsApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListAggregateClient result = apiInstance.aggregateClientProjectsGetAggregateClientProjects(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregateClientProjectsApi#aggregateClientProjectsGetAggregateClientProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListAggregateClient**](CSApiResponseListAggregateClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


# FileAttachmentsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileAttachmentsGetMyFileAttachments**](FileAttachmentsApi.md#fileAttachmentsGetMyFileAttachments) | **GET** /api/FileAttachments/GetMyFileAttachments | Get my file attachments.  Get files you&#39;ve attached to timesheets.


<a name="fileAttachmentsGetMyFileAttachments"></a>
# **fileAttachmentsGetMyFileAttachments**
> CSApiResponseForPaginatedListTimesheetFileAttachment fileAttachmentsGetMyFileAttachments(startDate, endDate, skip, take, xChronosheetsAuth)

Get my file attachments.  Get files you&#39;ve attached to timesheets.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FileAttachmentsApi;


FileAttachmentsApi apiInstance = new FileAttachmentsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The Start date of the date range.  File attachments after this date will be obtained.
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The End date of the date range.  File attachments before this date will be obtained.
Integer skip = 56; // Integer | Skip this many File attachments
Integer take = 56; // Integer | Take this many File attachments
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListTimesheetFileAttachment result = apiInstance.fileAttachmentsGetMyFileAttachments(startDate, endDate, skip, take, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsGetMyFileAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**| The Start date of the date range.  File attachments after this date will be obtained. |
 **endDate** | **OffsetDateTime**| The End date of the date range.  File attachments before this date will be obtained. |
 **skip** | **Integer**| Skip this many File attachments |
 **take** | **Integer**| Take this many File attachments |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListTimesheetFileAttachment**](CSApiResponseForPaginatedListTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

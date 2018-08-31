# FileAttachmentsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileAttachmentsDeleteTimesheetFileAttachment**](FileAttachmentsApi.md#fileAttachmentsDeleteTimesheetFileAttachment) | **DELETE** /api/FileAttachments/DeleteTimesheetFileAttachment | Delete a particular timesheet file attachment
[**fileAttachmentsGetMyFileAttachments**](FileAttachmentsApi.md#fileAttachmentsGetMyFileAttachments) | **GET** /api/FileAttachments/GetMyFileAttachments | Get my file attachments.  Get files you&#39;ve attached to timesheets.


<a name="fileAttachmentsDeleteTimesheetFileAttachment"></a>
# **fileAttachmentsDeleteTimesheetFileAttachment**
> CSApiResponseBoolean fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth)

Delete a particular timesheet file attachment

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FileAttachmentsApi;


FileAttachmentsApi apiInstance = new FileAttachmentsApi();
Integer fileAttachmentId = 56; // Integer | The Id of the file attachment to delete
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsDeleteTimesheetFileAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileAttachmentId** | **Integer**| The Id of the file attachment to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fileAttachmentsGetMyFileAttachments"></a>
# **fileAttachmentsGetMyFileAttachments**
> CSApiResponseForPaginatedListTimesheetFileAttachment fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take)

Get my file attachments.  Get files you&#39;ve attached to timesheets.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FileAttachmentsApi;


FileAttachmentsApi apiInstance = new FileAttachmentsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The Start date of the date range.  File attachments after this date will be obtained.
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The End date of the date range.  File attachments before this date will be obtained.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
Integer skip = 56; // Integer | Skip this many File attachments
Integer take = 56; // Integer | Take this many File attachments
try {
    CSApiResponseForPaginatedListTimesheetFileAttachment result = apiInstance.fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take);
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
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many File attachments | [optional]
 **take** | **Integer**| Take this many File attachments | [optional]

### Return type

[**CSApiResponseForPaginatedListTimesheetFileAttachment**](CSApiResponseForPaginatedListTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


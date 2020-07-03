# FileAttachmentsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileAttachmentsDeleteTimesheetFileAttachment**](FileAttachmentsApi.md#fileAttachmentsDeleteTimesheetFileAttachment) | **DELETE** /FileAttachments/DeleteTimesheetFileAttachment | Delete a particular timesheet file attachment  Requires the &#39;SubmitTimesheets&#39; permission.
[**fileAttachmentsGetFileAttachmentById**](FileAttachmentsApi.md#fileAttachmentsGetFileAttachmentById) | **GET** /FileAttachments/GetFileAttachmentById | Get a particular file attachment by ID.  User must own the file attachment for access.
[**fileAttachmentsGetMyFileAttachments**](FileAttachmentsApi.md#fileAttachmentsGetMyFileAttachments) | **GET** /FileAttachments/GetMyFileAttachments | Get my file attachments.  Get files you&#39;ve attached to timesheets.


<a name="fileAttachmentsDeleteTimesheetFileAttachment"></a>
# **fileAttachmentsDeleteTimesheetFileAttachment**
> ApiResponseBoolean fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth)

Delete a particular timesheet file attachment  Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.FileAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    FileAttachmentsApi apiInstance = new FileAttachmentsApi(defaultClient);
    Integer fileAttachmentId = 56; // Integer | The Id of the file attachment to delete
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseBoolean result = apiInstance.fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsDeleteTimesheetFileAttachment");
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
 **fileAttachmentId** | **Integer**| The Id of the file attachment to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="fileAttachmentsGetFileAttachmentById"></a>
# **fileAttachmentsGetFileAttachmentById**
> ApiResponseTimesheetFileAttachment fileAttachmentsGetFileAttachmentById(fileAttachmentId, xChronosheetsAuth)

Get a particular file attachment by ID.  User must own the file attachment for access.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.FileAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    FileAttachmentsApi apiInstance = new FileAttachmentsApi(defaultClient);
    Integer fileAttachmentId = 56; // Integer | The ID of the file attachment
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseTimesheetFileAttachment result = apiInstance.fileAttachmentsGetFileAttachmentById(fileAttachmentId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsGetFileAttachmentById");
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
 **fileAttachmentId** | **Integer**| The ID of the file attachment |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseTimesheetFileAttachment**](ApiResponseTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="fileAttachmentsGetMyFileAttachments"></a>
# **fileAttachmentsGetMyFileAttachments**
> ApiResponseForPaginatedListTimesheetFileAttachment fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take)

Get my file attachments.  Get files you&#39;ve attached to timesheets.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.FileAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    FileAttachmentsApi apiInstance = new FileAttachmentsApi(defaultClient);
    OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The Start date of the date range.  File attachments after this date will be obtained.
    OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The End date of the date range.  File attachments before this date will be obtained.
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many File attachments
    Integer take = 56; // Integer | Take this many File attachments
    try {
      ApiResponseForPaginatedListTimesheetFileAttachment result = apiInstance.fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsGetMyFileAttachments");
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
 **startDate** | **OffsetDateTime**| The Start date of the date range.  File attachments after this date will be obtained. |
 **endDate** | **OffsetDateTime**| The End date of the date range.  File attachments before this date will be obtained. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many File attachments | [optional]
 **take** | **Integer**| Take this many File attachments | [optional]

### Return type

[**ApiResponseForPaginatedListTimesheetFileAttachment**](ApiResponseForPaginatedListTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


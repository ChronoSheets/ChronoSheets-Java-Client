# TranscriptsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptsGetMyTranscript**](TranscriptsApi.md#transcriptsGetMyTranscript) | **GET** /Transcripts/GetMyTranscript | Get an audio to text transcript for a particular audio file attachment
[**transcriptsGetMyTranscripts**](TranscriptsApi.md#transcriptsGetMyTranscripts) | **GET** /Transcripts/GetMyTranscripts | Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.


<a name="transcriptsGetMyTranscript"></a>
# **transcriptsGetMyTranscript**
> ApiResponseTranscription transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth)

Get an audio to text transcript for a particular audio file attachment

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.TranscriptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
    Integer fileAttachmentId = 56; // Integer | The ID of the file attachment that has a transcript.  It should be an audio file attachment.
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseTranscription result = apiInstance.transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscript");
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
 **fileAttachmentId** | **Integer**| The ID of the file attachment that has a transcript.  It should be an audio file attachment. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseTranscription**](ApiResponseTranscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="transcriptsGetMyTranscripts"></a>
# **transcriptsGetMyTranscripts**
> ApiResponseForPaginatedListOrgReportTranscript transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword)

Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.TranscriptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The Start date of the date range.  Transcripts after this date will be obtained.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The End date of the date range.  Transcripts before this date will be obtained.
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    Integer skip = 56; // Integer | Skip this many transcripts
    Integer take = 56; // Integer | Take this many transcripts
    String keyword = "keyword_example"; // String | Search the text content of the transcript keywords
    try {
      ApiResponseForPaginatedListOrgReportTranscript result = apiInstance.transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscripts");
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
 **startDate** | **OffsetDateTime**| The Start date of the date range.  Transcripts after this date will be obtained. |
 **endDate** | **OffsetDateTime**| The End date of the date range.  Transcripts before this date will be obtained. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Skip this many transcripts | [optional]
 **take** | **Integer**| Take this many transcripts | [optional]
 **keyword** | **String**| Search the text content of the transcript keywords | [optional]

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


# TranscriptsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptsGetMyTranscript**](TranscriptsApi.md#transcriptsGetMyTranscript) | **GET** /api/Transcripts/GetMyTranscript | Get an audio to text transcript for a particular audio file attachment
[**transcriptsGetMyTranscripts**](TranscriptsApi.md#transcriptsGetMyTranscripts) | **GET** /api/Transcripts/GetMyTranscripts | Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.


<a name="transcriptsGetMyTranscript"></a>
# **transcriptsGetMyTranscript**
> CSApiResponseTranscription transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth)

Get an audio to text transcript for a particular audio file attachment

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TranscriptsApi;


TranscriptsApi apiInstance = new TranscriptsApi();
Integer fileAttachmentId = 56; // Integer | The ID of the file attachment that has a transcript.  It should be an audio file attachment.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseTranscription result = apiInstance.transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileAttachmentId** | **Integer**| The ID of the file attachment that has a transcript.  It should be an audio file attachment. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseTranscription**](CSApiResponseTranscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="transcriptsGetMyTranscripts"></a>
# **transcriptsGetMyTranscripts**
> CSApiResponseForPaginatedListOrgReportTranscript transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword)

Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TranscriptsApi;


TranscriptsApi apiInstance = new TranscriptsApi();
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The Start date of the date range.  Transcripts after this date will be obtained.
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The End date of the date range.  Transcripts before this date will be obtained.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
Integer skip = 56; // Integer | Skip this many transcripts
Integer take = 56; // Integer | Take this many transcripts
String keyword = "keyword_example"; // String | Search the text content of the transcript keywords
try {
    CSApiResponseForPaginatedListOrgReportTranscript result = apiInstance.transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscripts");
    e.printStackTrace();
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

[**CSApiResponseForPaginatedListOrgReportTranscript**](CSApiResponseForPaginatedListOrgReportTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


# JobCodesApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobCodesCreateJobCode**](JobCodesApi.md#jobCodesCreateJobCode) | **PUT** /api/JobCodes/CreateJobCode | Create a job code
[**jobCodesDeleteJobCode**](JobCodesApi.md#jobCodesDeleteJobCode) | **DELETE** /api/JobCodes/DeleteJobCode | Delete a job code
[**jobCodesGetJobCodeById**](JobCodesApi.md#jobCodesGetJobCodeById) | **GET** /api/JobCodes/GetJobCodeById | Get a particular job code by job code id
[**jobCodesGetJobCodes**](JobCodesApi.md#jobCodesGetJobCodes) | **GET** /api/JobCodes/GetJobCodes | Get job codes for your organisation
[**jobCodesUpdateJobCode**](JobCodesApi.md#jobCodesUpdateJobCode) | **POST** /api/JobCodes/UpdateJobCode | Update a job code


<a name="jobCodesCreateJobCode"></a>
# **jobCodesCreateJobCode**
> CSApiResponseInt32 jobCodesCreateJobCode(request, xChronosheetsAuth)

Create a job code

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.JobCodesApi;


JobCodesApi apiInstance = new JobCodesApi();
CSInsertJobCodeRequest request = new CSInsertJobCodeRequest(); // CSInsertJobCodeRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.jobCodesCreateJobCode(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobCodesApi#jobCodesCreateJobCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertJobCodeRequest**](CSInsertJobCodeRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="jobCodesDeleteJobCode"></a>
# **jobCodesDeleteJobCode**
> CSApiResponseBoolean jobCodesDeleteJobCode(jobCodeId, xChronosheetsAuth)

Delete a job code

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.JobCodesApi;


JobCodesApi apiInstance = new JobCodesApi();
Integer jobCodeId = 56; // Integer | The ID of the job code your want to delete
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.jobCodesDeleteJobCode(jobCodeId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobCodesApi#jobCodesDeleteJobCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobCodeId** | **Integer**| The ID of the job code your want to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="jobCodesGetJobCodeById"></a>
# **jobCodesGetJobCodeById**
> CSApiResponseJobCode jobCodesGetJobCodeById(jobCodeId, xChronosheetsAuth)

Get a particular job code by job code id

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.JobCodesApi;


JobCodesApi apiInstance = new JobCodesApi();
Integer jobCodeId = 56; // Integer | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseJobCode result = apiInstance.jobCodesGetJobCodeById(jobCodeId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobCodesApi#jobCodesGetJobCodeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobCodeId** | **Integer**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseJobCode**](CSApiResponseJobCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="jobCodesGetJobCodes"></a>
# **jobCodesGetJobCodes**
> CSApiResponseListJobCode jobCodesGetJobCodes(xChronosheetsAuth)

Get job codes for your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.JobCodesApi;


JobCodesApi apiInstance = new JobCodesApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListJobCode result = apiInstance.jobCodesGetJobCodes(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobCodesApi#jobCodesGetJobCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListJobCode**](CSApiResponseListJobCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="jobCodesUpdateJobCode"></a>
# **jobCodesUpdateJobCode**
> CSApiResponseBoolean jobCodesUpdateJobCode(request, xChronosheetsAuth)

Update a job code

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.JobCodesApi;


JobCodesApi apiInstance = new JobCodesApi();
CSUpdateJobCodeRequest request = new CSUpdateJobCodeRequest(); // CSUpdateJobCodeRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.jobCodesUpdateJobCode(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobCodesApi#jobCodesUpdateJobCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateJobCodeRequest**](CSUpdateJobCodeRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


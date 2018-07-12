# UserJobFavouritesApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userJobFavouritesCreateJobFavourite**](UserJobFavouritesApi.md#userJobFavouritesCreateJobFavourite) | **POST** /api/UserJobFavourites/CreateJobFavourite | Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
[**userJobFavouritesDeleteJobFavourite**](UserJobFavouritesApi.md#userJobFavouritesDeleteJobFavourite) | **DELETE** /api/UserJobFavourites/DeleteJobFavourite | Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
[**userJobFavouritesGetJobFavourites**](UserJobFavouritesApi.md#userJobFavouritesGetJobFavourites) | **GET** /api/UserJobFavourites/GetJobFavourites | Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.


<a name="userJobFavouritesCreateJobFavourite"></a>
# **userJobFavouritesCreateJobFavourite**
> CSApiResponseInt32 userJobFavouritesCreateJobFavourite(request, xChronosheetsAuth)

Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;


UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
CSInsertUserJobFavouriteRequest request = new CSInsertUserJobFavouriteRequest(); // CSInsertUserJobFavouriteRequest | An Insert UserJobFavourite Request object containing values for the new UserJobFavourite to create
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.userJobFavouritesCreateJobFavourite(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesCreateJobFavourite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertUserJobFavouriteRequest**](CSInsertUserJobFavouriteRequest.md)| An Insert UserJobFavourite Request object containing values for the new UserJobFavourite to create |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userJobFavouritesDeleteJobFavourite"></a>
# **userJobFavouritesDeleteJobFavourite**
> CSApiResponseBoolean userJobFavouritesDeleteJobFavourite(jobId, xChronosheetsAuth)

Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;


UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
Integer jobId = 56; // Integer | The ID of the Job for the Job Favourite you want to delete.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.userJobFavouritesDeleteJobFavourite(jobId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesDeleteJobFavourite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| The ID of the Job for the Job Favourite you want to delete. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userJobFavouritesGetJobFavourites"></a>
# **userJobFavouritesGetJobFavourites**
> CSApiResponseListUserJobFavourite userJobFavouritesGetJobFavourites(xChronosheetsAuth)

Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;


UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListUserJobFavourite result = apiInstance.userJobFavouritesGetJobFavourites(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesGetJobFavourites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListUserJobFavourite**](CSApiResponseListUserJobFavourite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


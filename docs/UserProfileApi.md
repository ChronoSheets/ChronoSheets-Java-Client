# UserProfileApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userProfileDoLogin**](UserProfileApi.md#userProfileDoLogin) | **POST** /api/UserProfile/DoLogin | 
[**userProfileDoLogout**](UserProfileApi.md#userProfileDoLogout) | **DELETE** /api/UserProfile/DoLogout | 
[**userProfileGetMyProfile**](UserProfileApi.md#userProfileGetMyProfile) | **GET** /api/UserProfile/GetMyProfile | 
[**userProfileKeepSessionAlive**](UserProfileApi.md#userProfileKeepSessionAlive) | **GET** /api/UserProfile/KeepSessionAlive | 
[**userProfileUpdateMyProfile**](UserProfileApi.md#userProfileUpdateMyProfile) | **POST** /api/UserProfile/UpdateMyProfile | 


<a name="userProfileDoLogin"></a>
# **userProfileDoLogin**
> CsApiApiResponseDoLoginResponse userProfileDoLogin(request)



### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
CsApiDoLoginRequest request = new CsApiDoLoginRequest(); // CsApiDoLoginRequest | 
try {
    CsApiApiResponseDoLoginResponse result = apiInstance.userProfileDoLogin(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileDoLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiDoLoginRequest**](CsApiDoLoginRequest.md)|  |

### Return type

[**CsApiApiResponseDoLoginResponse**](CsApiApiResponseDoLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileDoLogout"></a>
# **userProfileDoLogout**
> CsApiApiResponseBoolean userProfileDoLogout(xChronosheetsAuth)



### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseBoolean result = apiInstance.userProfileDoLogout(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileDoLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseBoolean**](CsApiApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileGetMyProfile"></a>
# **userProfileGetMyProfile**
> CsApiApiResponseUserProfile userProfileGetMyProfile(xChronosheetsAuth)



### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseUserProfile result = apiInstance.userProfileGetMyProfile(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileGetMyProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseUserProfile**](CsApiApiResponseUserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileKeepSessionAlive"></a>
# **userProfileKeepSessionAlive**
> CsApiApiResponseBoolean userProfileKeepSessionAlive(xChronosheetsAuth)



### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseBoolean result = apiInstance.userProfileKeepSessionAlive(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileKeepSessionAlive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseBoolean**](CsApiApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileUpdateMyProfile"></a>
# **userProfileUpdateMyProfile**
> CsApiApiResponseSignupResponse userProfileUpdateMyProfile(request, xChronosheetsAuth)



### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
CsApiUpdateMyProfileRequest request = new CsApiUpdateMyProfileRequest(); // CsApiUpdateMyProfileRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseSignupResponse result = apiInstance.userProfileUpdateMyProfile(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileUpdateMyProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiUpdateMyProfileRequest**](CsApiUpdateMyProfileRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseSignupResponse**](CsApiApiResponseSignupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


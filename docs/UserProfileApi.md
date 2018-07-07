# UserProfileApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userProfileDoLogin**](UserProfileApi.md#userProfileDoLogin) | **POST** /api/UserProfile/DoLogin | Login to your ChronoSheets account and obtain an Auth Token which you can use for other ChronoSheets API methods.    Does not require any special permissions.
[**userProfileDoLogout**](UserProfileApi.md#userProfileDoLogout) | **DELETE** /api/UserProfile/DoLogout | Logout of your ChronoSheets account.  This method ends and deletes your active session.    Does not require any special permissions.
[**userProfileGetMyProfile**](UserProfileApi.md#userProfileGetMyProfile) | **GET** /api/UserProfile/GetMyProfile | Get your own profile.  Use this method to obtain detailed information about your ChronoSheets user profile.    Does not require any special permissions.
[**userProfileKeepSessionAlive**](UserProfileApi.md#userProfileKeepSessionAlive) | **GET** /api/UserProfile/KeepSessionAlive | Keep a session alive.  Use this method to keep a session active.  You could use this to &#39;ping&#39; ChronoSheets every &#39;x&#39; minutes to make sure your Auth Token will keep working.    Does not require any special permissions.
[**userProfileUpdateMyProfile**](UserProfileApi.md#userProfileUpdateMyProfile) | **POST** /api/UserProfile/UpdateMyProfile | Update your own profile.  Use this method to update your profile information or update/change your password.    Does not require any special permissions.


<a name="userProfileDoLogin"></a>
# **userProfileDoLogin**
> CSApiResponseDoLoginResponse userProfileDoLogin(request)

Login to your ChronoSheets account and obtain an Auth Token which you can use for other ChronoSheets API methods.    Does not require any special permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
CSDoLoginRequest request = new CSDoLoginRequest(); // CSDoLoginRequest | A request object containing your username/email and password.
try {
    CSApiResponseDoLoginResponse result = apiInstance.userProfileDoLogin(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileDoLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSDoLoginRequest**](CSDoLoginRequest.md)| A request object containing your username/email and password. |

### Return type

[**CSApiResponseDoLoginResponse**](CSApiResponseDoLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileDoLogout"></a>
# **userProfileDoLogout**
> CSApiResponseBoolean userProfileDoLogout(xChronosheetsAuth)

Logout of your ChronoSheets account.  This method ends and deletes your active session.    Does not require any special permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.userProfileDoLogout(xChronosheetsAuth);
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

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileGetMyProfile"></a>
# **userProfileGetMyProfile**
> CSApiResponseUserProfile userProfileGetMyProfile(xChronosheetsAuth)

Get your own profile.  Use this method to obtain detailed information about your ChronoSheets user profile.    Does not require any special permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseUserProfile result = apiInstance.userProfileGetMyProfile(xChronosheetsAuth);
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

[**CSApiResponseUserProfile**](CSApiResponseUserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileKeepSessionAlive"></a>
# **userProfileKeepSessionAlive**
> CSApiResponseBoolean userProfileKeepSessionAlive(xChronosheetsAuth)

Keep a session alive.  Use this method to keep a session active.  You could use this to &#39;ping&#39; ChronoSheets every &#39;x&#39; minutes to make sure your Auth Token will keep working.    Does not require any special permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.userProfileKeepSessionAlive(xChronosheetsAuth);
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

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userProfileUpdateMyProfile"></a>
# **userProfileUpdateMyProfile**
> CSApiResponseUpdateProfileResponse userProfileUpdateMyProfile(request, xChronosheetsAuth)

Update your own profile.  Use this method to update your profile information or update/change your password.    Does not require any special permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserProfileApi;


UserProfileApi apiInstance = new UserProfileApi();
CSUpdateMyProfileRequest request = new CSUpdateMyProfileRequest(); // CSUpdateMyProfileRequest | An Update MyProfile Request object containing updated fields.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseUpdateProfileResponse result = apiInstance.userProfileUpdateMyProfile(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#userProfileUpdateMyProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateMyProfileRequest**](CSUpdateMyProfileRequest.md)| An Update MyProfile Request object containing updated fields. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseUpdateProfileResponse**](CSApiResponseUpdateProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


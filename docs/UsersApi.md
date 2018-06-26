# UsersApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersCreateTimesheetUser**](UsersApi.md#usersCreateTimesheetUser) | **PUT** /api/Users/CreateTimesheetUser | Create a user in your organisation
[**usersGetTimesheetUser**](UsersApi.md#usersGetTimesheetUser) | **GET** /api/Users/GetTimesheetUser | Get a particular user in your organisation
[**usersGetTimesheetUsers**](UsersApi.md#usersGetTimesheetUsers) | **GET** /api/Users/GetTimesheetUsers | Get users for your organisation
[**usersUpdateTimesheetUser**](UsersApi.md#usersUpdateTimesheetUser) | **POST** /api/Users/UpdateTimesheetUser | Update a user


<a name="usersCreateTimesheetUser"></a>
# **usersCreateTimesheetUser**
> CSApiResponseInsertUserResponse usersCreateTimesheetUser(request, xChronosheetsAuth)

Create a user in your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UsersApi;


UsersApi apiInstance = new UsersApi();
CSInsertUserRequest request = new CSInsertUserRequest(); // CSInsertUserRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInsertUserResponse result = apiInstance.usersCreateTimesheetUser(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersCreateTimesheetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertUserRequest**](CSInsertUserRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInsertUserResponse**](CSApiResponseInsertUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="usersGetTimesheetUser"></a>
# **usersGetTimesheetUser**
> CSApiResponseUserForManagement usersGetTimesheetUser(userId, xChronosheetsAuth)

Get a particular user in your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseUserForManagement result = apiInstance.usersGetTimesheetUser(userId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersGetTimesheetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseUserForManagement**](CSApiResponseUserForManagement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="usersGetTimesheetUsers"></a>
# **usersGetTimesheetUsers**
> CSApiResponseListUserForManagement usersGetTimesheetUsers(xChronosheetsAuth)

Get users for your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UsersApi;


UsersApi apiInstance = new UsersApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListUserForManagement result = apiInstance.usersGetTimesheetUsers(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersGetTimesheetUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListUserForManagement**](CSApiResponseListUserForManagement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="usersUpdateTimesheetUser"></a>
# **usersUpdateTimesheetUser**
> CSApiResponseUpdateUserResponse usersUpdateTimesheetUser(request, xChronosheetsAuth)

Update a user

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UsersApi;


UsersApi apiInstance = new UsersApi();
CSUpdateUserRequest request = new CSUpdateUserRequest(); // CSUpdateUserRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseUpdateUserResponse result = apiInstance.usersUpdateTimesheetUser(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUpdateTimesheetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateUserRequest**](CSUpdateUserRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseUpdateUserResponse**](CSApiResponseUpdateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


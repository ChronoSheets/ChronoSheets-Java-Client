# ClientsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsCreateClient**](ClientsApi.md#clientsCreateClient) | **PUT** /api/Clients/CreateClient | Create a client
[**clientsGetClient**](ClientsApi.md#clientsGetClient) | **GET** /api/Clients/GetClient | Get a particular client
[**clientsGetClients**](ClientsApi.md#clientsGetClients) | **GET** /api/Clients/GetClients | Get a collection of clients that are under your organisation
[**clientsUpdateClient**](ClientsApi.md#clientsUpdateClient) | **POST** /api/Clients/UpdateClient | Update a client


<a name="clientsCreateClient"></a>
# **clientsCreateClient**
> CSApiResponseInt32 clientsCreateClient(request, xChronosheetsAuth)

Create a client

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
CSInsertClientRequest request = new CSInsertClientRequest(); // CSInsertClientRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.clientsCreateClient(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#clientsCreateClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertClientRequest**](CSInsertClientRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="clientsGetClient"></a>
# **clientsGetClient**
> CSApiResponseClient clientsGetClient(clientId, xChronosheetsAuth)

Get a particular client

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | The ID of the client you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseClient result = apiInstance.clientsGetClient(clientId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#clientsGetClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| The ID of the client you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseClient**](CSApiResponseClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="clientsGetClients"></a>
# **clientsGetClients**
> CSApiResponseListClient clientsGetClients(xChronosheetsAuth)

Get a collection of clients that are under your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListClient result = apiInstance.clientsGetClients(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#clientsGetClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListClient**](CSApiResponseListClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="clientsUpdateClient"></a>
# **clientsUpdateClient**
> CSApiResponseBoolean clientsUpdateClient(request, xChronosheetsAuth)

Update a client

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
CSSaveClientRequest request = new CSSaveClientRequest(); // CSSaveClientRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.clientsUpdateClient(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#clientsUpdateClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSSaveClientRequest**](CSSaveClientRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


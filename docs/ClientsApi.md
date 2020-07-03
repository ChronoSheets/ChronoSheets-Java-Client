# ClientsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsCreateClient**](ClientsApi.md#clientsCreateClient) | **POST** /Clients/CreateClient | Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
[**clientsGetClient**](ClientsApi.md#clientsGetClient) | **GET** /Clients/GetClient | Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**clientsGetClients**](ClientsApi.md#clientsGetClients) | **GET** /Clients/GetClients | Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**clientsUpdateClient**](ClientsApi.md#clientsUpdateClient) | **PUT** /Clients/UpdateClient | Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.


<a name="clientsCreateClient"></a>
# **clientsCreateClient**
> ApiResponseInt32 clientsCreateClient(xChronosheetsAuth, request)

Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    InsertClientRequest request = new InsertClientRequest(); // InsertClientRequest | An Insert Client Request object containing values for the new Client to create
    try {
      ApiResponseInt32 result = apiInstance.clientsCreateClient(xChronosheetsAuth, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsCreateClient");
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
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **request** | [**InsertClientRequest**](InsertClientRequest.md)| An Insert Client Request object containing values for the new Client to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="clientsGetClient"></a>
# **clientsGetClient**
> ApiResponseClient clientsGetClient(clientId, xChronosheetsAuth)

Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    Integer clientId = 56; // Integer | The ID of the Client you want to get
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseClient result = apiInstance.clientsGetClient(clientId, xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsGetClient");
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
 **clientId** | **Integer**| The ID of the Client you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseClient**](ApiResponseClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="clientsGetClients"></a>
# **clientsGetClients**
> ApiResponseListClient clientsGetClients(xChronosheetsAuth)

Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    try {
      ApiResponseListClient result = apiInstance.clientsGetClients(xChronosheetsAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsGetClients");
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
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**ApiResponseListClient**](ApiResponseListClient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="clientsUpdateClient"></a>
# **clientsUpdateClient**
> ApiResponseBoolean clientsUpdateClient(xChronosheetsAuth, request)

Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.

### Example
```java
// Import classes:
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.models.*;
import ChronoSheetsClientLibApi.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.chronosheets.com");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
    SaveClientRequest request = new SaveClientRequest(); // SaveClientRequest | A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update
    try {
      ApiResponseBoolean result = apiInstance.clientsUpdateClient(xChronosheetsAuth, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsUpdateClient");
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
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **request** | [**SaveClientRequest**](SaveClientRequest.md)| A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |


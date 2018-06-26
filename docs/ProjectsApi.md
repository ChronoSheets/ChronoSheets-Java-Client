# ProjectsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsCreateProject**](ProjectsApi.md#projectsCreateProject) | **PUT** /api/Projects/CreateProject | Create a project
[**projectsGetProjectById**](ProjectsApi.md#projectsGetProjectById) | **GET** /api/Projects/GetProjectById | Get project by Id
[**projectsGetProjectsForClient**](ProjectsApi.md#projectsGetProjectsForClient) | **GET** /api/Projects/GetProjectsForClient | Get projects for a particular client
[**projectsUpdateProject**](ProjectsApi.md#projectsUpdateProject) | **POST** /api/Projects/UpdateProject | Update a project


<a name="projectsCreateProject"></a>
# **projectsCreateProject**
> CSApiResponseInt32 projectsCreateProject(request, xChronosheetsAuth)

Create a project

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
CSInsertProjectRequest request = new CSInsertProjectRequest(); // CSInsertProjectRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.projectsCreateProject(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsCreateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertProjectRequest**](CSInsertProjectRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="projectsGetProjectById"></a>
# **projectsGetProjectById**
> CSApiResponseProject projectsGetProjectById(projectId, xChronosheetsAuth)

Get project by Id

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Integer projectId = 56; // Integer | The ID of the project
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseProject result = apiInstance.projectsGetProjectById(projectId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsGetProjectById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**| The ID of the project |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseProject**](CSApiResponseProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="projectsGetProjectsForClient"></a>
# **projectsGetProjectsForClient**
> CSApiResponseListProject projectsGetProjectsForClient(clientId, xChronosheetsAuth)

Get projects for a particular client

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Integer clientId = 56; // Integer | The ID of the client
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListProject result = apiInstance.projectsGetProjectsForClient(clientId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsGetProjectsForClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| The ID of the client |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListProject**](CSApiResponseListProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="projectsUpdateProject"></a>
# **projectsUpdateProject**
> CSApiResponseBoolean projectsUpdateProject(request, xChronosheetsAuth)

Update a project

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
CSUpdateProjectRequest request = new CSUpdateProjectRequest(); // CSUpdateProjectRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.projectsUpdateProject(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsUpdateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateProjectRequest**](CSUpdateProjectRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


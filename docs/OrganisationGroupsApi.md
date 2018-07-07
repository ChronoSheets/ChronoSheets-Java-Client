# OrganisationGroupsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationGroupsCreateOrganisationGroup**](OrganisationGroupsApi.md#organisationGroupsCreateOrganisationGroup) | **PUT** /api/OrganisationGroups/CreateOrganisationGroup | Create an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
[**organisationGroupsGetOrganisationGroup**](OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroup) | **GET** /api/OrganisationGroups/GetOrganisationGroup | Get a particular organisation group.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupsGetOrganisationGroups**](OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroups) | **GET** /api/OrganisationGroups/GetOrganisationGroups | Get a collection of organisation groups that are under your organisation.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupsGetOrganisationGroupsForJob**](OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForJob) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForJob | Get org groups for a particular job.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupsGetOrganisationGroupsForVehicle**](OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForVehicle) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForVehicle | Get org groups for a particular vehicle.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageFleet&#39; or &#39;ManageOrganisationUsers&#39; permissions.
[**organisationGroupsUpdateOrganisationGroup**](OrganisationGroupsApi.md#organisationGroupsUpdateOrganisationGroup) | **POST** /api/OrganisationGroups/UpdateOrganisationGroup | Update an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.


<a name="organisationGroupsCreateOrganisationGroup"></a>
# **organisationGroupsCreateOrganisationGroup**
> CSApiResponseInt32 organisationGroupsCreateOrganisationGroup(request, xChronosheetsAuth)

Create an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
CSInsertOrganisationGroupRequest request = new CSInsertOrganisationGroupRequest(); // CSInsertOrganisationGroupRequest | An Insert OrganisationGroup Request object containing values for the new OrganisationGroup to create
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.organisationGroupsCreateOrganisationGroup(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsCreateOrganisationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertOrganisationGroupRequest**](CSInsertOrganisationGroupRequest.md)| An Insert OrganisationGroup Request object containing values for the new OrganisationGroup to create |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupsGetOrganisationGroup"></a>
# **organisationGroupsGetOrganisationGroup**
> CSApiResponseOrganisationGroup organisationGroupsGetOrganisationGroup(organisationGroupId, xChronosheetsAuth)

Get a particular organisation group.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
Integer organisationGroupId = 56; // Integer | The ID of the OrganisationGroup you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseOrganisationGroup result = apiInstance.organisationGroupsGetOrganisationGroup(organisationGroupId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsGetOrganisationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationGroupId** | **Integer**| The ID of the OrganisationGroup you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseOrganisationGroup**](CSApiResponseOrganisationGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupsGetOrganisationGroups"></a>
# **organisationGroupsGetOrganisationGroups**
> CSApiResponseListOrganisationGroup organisationGroupsGetOrganisationGroups(xChronosheetsAuth)

Get a collection of organisation groups that are under your organisation.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListOrganisationGroup result = apiInstance.organisationGroupsGetOrganisationGroups(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsGetOrganisationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListOrganisationGroup**](CSApiResponseListOrganisationGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupsGetOrganisationGroupsForJob"></a>
# **organisationGroupsGetOrganisationGroupsForJob**
> CSApiResponseListOrganisationGroup organisationGroupsGetOrganisationGroupsForJob(jobId, xChronosheetsAuth)

Get org groups for a particular job.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
Integer jobId = 56; // Integer | The ID of the job
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListOrganisationGroup result = apiInstance.organisationGroupsGetOrganisationGroupsForJob(jobId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsGetOrganisationGroupsForJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| The ID of the job |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListOrganisationGroup**](CSApiResponseListOrganisationGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupsGetOrganisationGroupsForVehicle"></a>
# **organisationGroupsGetOrganisationGroupsForVehicle**
> CSApiResponseListOrganisationGroup organisationGroupsGetOrganisationGroupsForVehicle(vehicleId, xChronosheetsAuth)

Get org groups for a particular vehicle.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageFleet&#39; or &#39;ManageOrganisationUsers&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
Integer vehicleId = 56; // Integer | The ID of the vehicle
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListOrganisationGroup result = apiInstance.organisationGroupsGetOrganisationGroupsForVehicle(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsGetOrganisationGroupsForVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The ID of the vehicle |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListOrganisationGroup**](CSApiResponseListOrganisationGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationGroupsUpdateOrganisationGroup"></a>
# **organisationGroupsUpdateOrganisationGroup**
> CSApiResponseBoolean organisationGroupsUpdateOrganisationGroup(request, xChronosheetsAuth)

Update an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationGroupsApi;


OrganisationGroupsApi apiInstance = new OrganisationGroupsApi();
CSSaveOrganisationGroupRequest request = new CSSaveOrganisationGroupRequest(); // CSSaveOrganisationGroupRequest | A Save OrganisationGroup Request object containing updated fields.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.organisationGroupsUpdateOrganisationGroup(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationGroupsApi#organisationGroupsUpdateOrganisationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSSaveOrganisationGroupRequest**](CSSaveOrganisationGroupRequest.md)| A Save OrganisationGroup Request object containing updated fields.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


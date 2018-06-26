# OrganisationApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationGetOrganisation**](OrganisationApi.md#organisationGetOrganisation) | **GET** /api/Organisation/GetOrganisation | Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission.
[**organisationUpdateOrganisation**](OrganisationApi.md#organisationUpdateOrganisation) | **POST** /api/Organisation/UpdateOrganisation | Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission.


<a name="organisationGetOrganisation"></a>
# **organisationGetOrganisation**
> CSApiResponseOrganisation organisationGetOrganisation(xChronosheetsAuth)

Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationApi;


OrganisationApi apiInstance = new OrganisationApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseOrganisation result = apiInstance.organisationGetOrganisation(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationGetOrganisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseOrganisation**](CSApiResponseOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="organisationUpdateOrganisation"></a>
# **organisationUpdateOrganisation**
> CSApiResponseUpdateOrganisationResponse organisationUpdateOrganisation(request, xChronosheetsAuth)

Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.OrganisationApi;


OrganisationApi apiInstance = new OrganisationApi();
CSUpdateOrganisationRequest request = new CSUpdateOrganisationRequest(); // CSUpdateOrganisationRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseUpdateOrganisationResponse result = apiInstance.organisationUpdateOrganisation(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationUpdateOrganisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateOrganisationRequest**](CSUpdateOrganisationRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseUpdateOrganisationResponse**](CSApiResponseUpdateOrganisationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


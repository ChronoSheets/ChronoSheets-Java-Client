# GeoFencingApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoFencingCreateGeofence**](GeoFencingApi.md#geoFencingCreateGeofence) | **POST** /GeoFencing/CreateGeofence | Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
[**geoFencingDeleteGeofence**](GeoFencingApi.md#geoFencingDeleteGeofence) | **DELETE** /GeoFencing/DeleteGeofence | Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.
[**geoFencingGetGeofenceById**](GeoFencingApi.md#geoFencingGetGeofenceById) | **GET** /GeoFencing/GetGeofenceById | Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.
[**geoFencingGetGeofences**](GeoFencingApi.md#geoFencingGetGeofences) | **GET** /GeoFencing/GetGeofences | Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.
[**geoFencingUpdateGeofence**](GeoFencingApi.md#geoFencingUpdateGeofence) | **PUT** /GeoFencing/UpdateGeofence | Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.


<a name="geoFencingCreateGeofence"></a>
# **geoFencingCreateGeofence**
> CSApiResponseInt32 geoFencingCreateGeofence(request, xChronosheetsAuth)

Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.GeoFencingApi;


GeoFencingApi apiInstance = new GeoFencingApi();
CSCreateGeoFenceRequest request = new CSCreateGeoFenceRequest(); // CSCreateGeoFenceRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.geoFencingCreateGeofence(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingCreateGeofence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSCreateGeoFenceRequest**](CSCreateGeoFenceRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="geoFencingDeleteGeofence"></a>
# **geoFencingDeleteGeofence**
> CSApiResponseGeofence geoFencingDeleteGeofence(geofenceId, xChronosheetsAuth)

Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.GeoFencingApi;


GeoFencingApi apiInstance = new GeoFencingApi();
Integer geofenceId = 56; // Integer | Specify the geofence you want to delete with the geofence ID.
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseGeofence result = apiInstance.geoFencingDeleteGeofence(geofenceId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingDeleteGeofence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geofenceId** | **Integer**| Specify the geofence you want to delete with the geofence ID. |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseGeofence**](CSApiResponseGeofence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="geoFencingGetGeofenceById"></a>
# **geoFencingGetGeofenceById**
> CSApiResponseGeofence geoFencingGetGeofenceById(geofenceId, xChronosheetsAuth)

Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.GeoFencingApi;


GeoFencingApi apiInstance = new GeoFencingApi();
Integer geofenceId = 56; // Integer | The ID of the geofence you want to obtain
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseGeofence result = apiInstance.geoFencingGetGeofenceById(geofenceId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingGetGeofenceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geofenceId** | **Integer**| The ID of the geofence you want to obtain |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseGeofence**](CSApiResponseGeofence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="geoFencingGetGeofences"></a>
# **geoFencingGetGeofences**
> CSApiResponseForPaginatedListExtendedGeofence geoFencingGetGeofences(xChronosheetsAuth, skip, take)

Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.GeoFencingApi;


GeoFencingApi apiInstance = new GeoFencingApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
Integer skip = 56; // Integer | Number of records to skip
Integer take = 56; // Integer | Number of records to take
try {
    CSApiResponseForPaginatedListExtendedGeofence result = apiInstance.geoFencingGetGeofences(xChronosheetsAuth, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingGetGeofences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **skip** | **Integer**| Number of records to skip | [optional]
 **take** | **Integer**| Number of records to take | [optional]

### Return type

[**CSApiResponseForPaginatedListExtendedGeofence**](CSApiResponseForPaginatedListExtendedGeofence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="geoFencingUpdateGeofence"></a>
# **geoFencingUpdateGeofence**
> CSApiResponseInt32 geoFencingUpdateGeofence(request, xChronosheetsAuth)

Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.GeoFencingApi;


GeoFencingApi apiInstance = new GeoFencingApi();
CSUpdateGeoFenceRequest request = new CSUpdateGeoFenceRequest(); // CSUpdateGeoFenceRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.geoFencingUpdateGeofence(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingUpdateGeofence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateGeoFenceRequest**](CSUpdateGeoFenceRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


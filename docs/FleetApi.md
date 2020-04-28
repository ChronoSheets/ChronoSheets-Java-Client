# FleetApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fleetCreateVehicle**](FleetApi.md#fleetCreateVehicle) | **POST** /api/Fleet/CreateVehicle | Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.
[**fleetDeleteVehicle**](FleetApi.md#fleetDeleteVehicle) | **DELETE** /api/Fleet/DeleteVehicle | Delete a vehicle from the fleet.  Requires the &#39;ManageFleet&#39; permission.
[**fleetGetVehicleById**](FleetApi.md#fleetGetVehicleById) | **GET** /api/Fleet/GetVehicleById | Get a particular vehicle.  Does not require any special permission.
[**fleetGetVehicles**](FleetApi.md#fleetGetVehicles) | **GET** /api/Fleet/GetVehicles | Get a collection of vehicles that are under your organisation.    Does not require any special permission.
[**fleetUpdateVehicle**](FleetApi.md#fleetUpdateVehicle) | **PUT** /api/Fleet/UpdateVehicle | Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.


<a name="fleetCreateVehicle"></a>
# **fleetCreateVehicle**
> CSApiResponseInt32 fleetCreateVehicle(request, xChronosheetsAuth)

Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
CSInsertVehicleRequest request = new CSInsertVehicleRequest(); // CSInsertVehicleRequest | An Insert Vehicle Request object containing values for the new Vehicle to create
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.fleetCreateVehicle(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetCreateVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertVehicleRequest**](CSInsertVehicleRequest.md)| An Insert Vehicle Request object containing values for the new Vehicle to create |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetDeleteVehicle"></a>
# **fleetDeleteVehicle**
> CSApiResponseBoolean fleetDeleteVehicle(vehicleId, xChronosheetsAuth)

Delete a vehicle from the fleet.  Requires the &#39;ManageFleet&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
Integer vehicleId = 56; // Integer | The unique ID of the vehicle you wish to delete
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.fleetDeleteVehicle(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetDeleteVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The unique ID of the vehicle you wish to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetGetVehicleById"></a>
# **fleetGetVehicleById**
> CSApiResponseFleetVehicle fleetGetVehicleById(vehicleId, xChronosheetsAuth)

Get a particular vehicle.  Does not require any special permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
Integer vehicleId = 56; // Integer | The ID of the Vehicle you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseFleetVehicle result = apiInstance.fleetGetVehicleById(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The ID of the Vehicle you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseFleetVehicle**](CSApiResponseFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetGetVehicles"></a>
# **fleetGetVehicles**
> CSApiResponseListFleetVehicle fleetGetVehicles(xChronosheetsAuth, includeDeleted)

Get a collection of vehicles that are under your organisation.    Does not require any special permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
Boolean includeDeleted = true; // Boolean | Whether or not to include deleted vehicles
try {
    CSApiResponseListFleetVehicle result = apiInstance.fleetGetVehicles(xChronosheetsAuth, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |
 **includeDeleted** | **Boolean**| Whether or not to include deleted vehicles | [optional]

### Return type

[**CSApiResponseListFleetVehicle**](CSApiResponseListFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetUpdateVehicle"></a>
# **fleetUpdateVehicle**
> CSApiResponseBoolean fleetUpdateVehicle(request, xChronosheetsAuth)

Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
CSSaveVehicleRequest request = new CSSaveVehicleRequest(); // CSSaveVehicleRequest | A Save Vehicle Request object containing updated fields.  Make sure to specify the Vehicle Id in the request object so that ChronoSheets knows which Vehicle to update
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.fleetUpdateVehicle(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetUpdateVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSSaveVehicleRequest**](CSSaveVehicleRequest.md)| A Save Vehicle Request object containing updated fields.  Make sure to specify the Vehicle Id in the request object so that ChronoSheets knows which Vehicle to update |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


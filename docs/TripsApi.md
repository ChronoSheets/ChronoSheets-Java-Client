# TripsApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tripsCreateTrip**](TripsApi.md#tripsCreateTrip) | **POST** /api/Trips/CreateTrip | Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.
[**tripsGetMyTripById**](TripsApi.md#tripsGetMyTripById) | **GET** /api/Trips/GetMyTripById | Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.
[**tripsGetMyTrips**](TripsApi.md#tripsGetMyTrips) | **GET** /api/Trips/GetMyTrips | Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.


<a name="tripsCreateTrip"></a>
# **tripsCreateTrip**
> CSApiResponseInt32 tripsCreateTrip(request, xChronosheetsAuth)

Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TripsApi;


TripsApi apiInstance = new TripsApi();
CSCreateTripRequest request = new CSCreateTripRequest(); // CSCreateTripRequest | A Create Trip Request object containing values for the new Trip to create
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.tripsCreateTrip(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsCreateTrip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSCreateTripRequest**](CSCreateTripRequest.md)| A Create Trip Request object containing values for the new Trip to create |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tripsGetMyTripById"></a>
# **tripsGetMyTripById**
> CSApiResponseTrip tripsGetMyTripById(tripId, xChronosheetsAuth)

Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TripsApi;


TripsApi apiInstance = new TripsApi();
Integer tripId = 56; // Integer | The ID of the Trip you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseTrip result = apiInstance.tripsGetMyTripById(tripId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsGetMyTripById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tripId** | **Integer**| The ID of the Trip you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseTrip**](CSApiResponseTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tripsGetMyTrips"></a>
# **tripsGetMyTrips**
> CSApiResponseForPaginatedListTrip tripsGetMyTrips(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth)

Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TripsApi;


TripsApi apiInstance = new TripsApi();
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The Start date of the date range.  Trips after this date will be obtained.
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The End date of the date range.  Trips before this date will be obtained.
Integer skip = 56; // Integer | Skip this many Trips
Integer take = 56; // Integer | Take this many Trips
Integer vehicleId = 56; // Integer | Filter by a particular Vehicle (get trips made with a particular vehicle), specified by VehicleId
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseForPaginatedListTrip result = apiInstance.tripsGetMyTrips(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsGetMyTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**| The Start date of the date range.  Trips after this date will be obtained. |
 **endDate** | **OffsetDateTime**| The End date of the date range.  Trips before this date will be obtained. |
 **skip** | **Integer**| Skip this many Trips |
 **take** | **Integer**| Take this many Trips |
 **vehicleId** | **Integer**| Filter by a particular Vehicle (get trips made with a particular vehicle), specified by VehicleId |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseForPaginatedListTrip**](CSApiResponseForPaginatedListTrip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data




# OrgReportTrip

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**tripId** | **Integer** |  |  [optional]
**timesheetId** | **Integer** |  |  [optional]
**vehicleId** | **Integer** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**vehicleName** | **String** |  |  [optional]
**vehicleMake** | **String** |  |  [optional]
**vehicleModel** | **String** |  |  [optional]
**vehicleYear** | **String** |  |  [optional]
**costPerKilometer** | **Double** |  |  [optional]
**tripTotalCost** | **Double** |  |  [optional]
**totalTripDistanceMeters** | **Double** |  |  [optional]
**startAddress** | **String** |  |  [optional]
**endAddress** | **String** |  |  [optional]
**pathCoordinates** | [**List&lt;TripCoordinate&gt;**](TripCoordinate.md) |  |  [optional]
**cacheExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: MobilePlatformEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;iOS&quot;
ANDROID | &quot;Android&quot;




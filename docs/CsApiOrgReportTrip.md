
# CsApiOrgReportTrip

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
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) | 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android |  [optional]
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
**pathCoordinates** | [**List&lt;CsApiTripCoordinate&gt;**](CsApiTripCoordinate.md) |  |  [optional]
**cacheExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="MobilePlatformEnum"></a>
## Enum: MobilePlatformEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2






# CreateTripRequest

Contains fields for creating a Trip
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timesheetId** | **Integer** | The associated Timesheet record Id.  The Trip will be linked to the Timesheet with this TimesheetId |  [optional]
**vehicleId** | **Integer** | The associated Vehicle Id.  The Trip will show that this Vehicle was used |  [optional]
**pathCoordsStringCsv** | **String** | A CSV of GPS path co-ordinates.  Format example: -37.8433562,144.7226188;[Lat1],[Long1];........[LatN],[LongN] |  [optional]
**distanceMeters** | **Double** | The total distance of the Trip |  [optional]
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) | The Mobile platform that the Trip was recorded on |  [optional]



## Enum: MobilePlatformEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;iOS&quot;
ANDROID | &quot;Android&quot;




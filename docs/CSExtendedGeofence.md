
# CSExtendedGeofence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobCode** | **String** |  |  [optional]
**taskName** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**updatedBy** | **String** |  |  [optional]
**alertOrganisation** | **String** |  |  [optional]
**geoFencingId** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**createdByUserId** | **Integer** |  |  [optional]
**lastUpdatedByUserId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**locationName** | **String** |  |  [optional]
**coordinates** | [**List&lt;CSBasicCoordinate&gt;**](CSBasicCoordinate.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**triggerJobCodeId** | **Integer** |  |  [optional]
**triggerTaskId** | **Integer** |  |  [optional]
**triggerSettings** | [**TriggerSettingsEnum**](#TriggerSettingsEnum) |  |  [optional]
**alertToOrgGroupId** | **Integer** |  |  [optional]
**alertSettings** | [**AlertSettingsEnum**](#AlertSettingsEnum) |  |  [optional]
**startTimeHour** | **Integer** |  |  [optional]
**startTimeMinute** | **Integer** |  |  [optional]
**endTimeHour** | **Integer** |  |  [optional]
**endTimeMinute** | **Integer** |  |  [optional]


<a name="TriggerSettingsEnum"></a>
## Enum: TriggerSettingsEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
STARTTIMESHEETWHENENTERING | &quot;StartTimesheetWhenEntering&quot;
STOPTIMESHEETWHENENTERING | &quot;StopTimesheetWhenEntering&quot;
STARTONENTERSTOPONLEAVE | &quot;StartOnEnterStopOnLeave&quot;


<a name="AlertSettingsEnum"></a>
## Enum: AlertSettingsEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SENDWHENENTERING | &quot;SendWhenEntering&quot;
SENDWHENEXITING | &quot;SendWhenExiting&quot;
SENDWHENENTERINGOREXITING | &quot;SendWhenEnteringOrExiting&quot;




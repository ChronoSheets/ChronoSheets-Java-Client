

# Geofence

A geofence
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geoFencingId** | **Integer** | The ID of the geofence |  [optional]
**orgId** | **Integer** | The ID of the organisation owning the geofence record |  [optional]
**createdByUserId** | **Integer** | The ID of the user/employee who created the geofence |  [optional]
**lastUpdatedByUserId** | **Integer** | The ID of the user/employee who last updated the geofence |  [optional]
**name** | **String** | A descriptive name of the geofence |  [optional]
**locationName** | **String** | The name of the approx. location of the geofence |  [optional]
**coordinates** | [**List&lt;BasicCoordinate&gt;**](BasicCoordinate.md) | A list of co-ordinates specifying the geofence |  [optional]
**createdAt** | **OffsetDateTime** | The date and time the geofence was created.  Time is in UTC. |  [optional]
**updatedAt** | **OffsetDateTime** | The date and time the geofence was updated last.  Time is in UTC. |  [optional]
**triggerJobCodeId** | **Integer** | The ID of the job code used when the employee enters/exits the geofence |  [optional]
**triggerTaskId** | **Integer** | The ID of the task used when the employee enters/exits the geofence |  [optional]
**triggerSettings** | [**TriggerSettingsEnum**](#TriggerSettingsEnum) | The settings for triggering actions |  [optional]
**alertToOrgGroupId** | **Integer** | The organisation group that will be notified when the geofence is triggered |  [optional]
**alertSettings** | [**AlertSettingsEnum**](#AlertSettingsEnum) | The settings for trigger alerts |  [optional]
**startTimeHour** | **Integer** | The hour start time. E.g. 13 would be 1pm.  Time is in 24hr format. |  [optional]
**startTimeMinute** | **Integer** | The minute start time.  E.g. 46 would be the 46th minute of the hour. |  [optional]
**endTimeHour** | **Integer** | The hour end time. E.g. 21 would be 9pm.  Time is in 24hr format. |  [optional]
**endTimeMinute** | **Integer** | The minute end time.  E.g. 13 would be the 13th minute of the hour. |  [optional]



## Enum: TriggerSettingsEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
STARTTIMESHEETWHENENTERING | &quot;StartTimesheetWhenEntering&quot;
STOPTIMESHEETWHENENTERING | &quot;StopTimesheetWhenEntering&quot;
STARTONENTERSTOPONLEAVE | &quot;StartOnEnterStopOnLeave&quot;



## Enum: AlertSettingsEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
SENDWHENENTERING | &quot;SendWhenEntering&quot;
SENDWHENEXITING | &quot;SendWhenExiting&quot;
SENDWHENENTERINGOREXITING | &quot;SendWhenEnteringOrExiting&quot;




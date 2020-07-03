

# CreateGeoFenceRequest

A request object for creating a new geofence
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the geo fence |  [optional]
**fenceCoordinates** | [**List&lt;BasicCoordinate&gt;**](BasicCoordinate.md) | A list of coordinates specifying the geofence region |  [optional]
**triggerJobCodeId** | **Integer** | The job code to be used when the person enters/leaves the geofence |  [optional]
**triggerTaskId** | **Integer** | The task to be used when the person enters/leaves the geofence |  [optional]
**sendAlertToOrgGroupId** | **Integer** | Send an alert to a user, specified by their user ID |  [optional]
**alertSettings** | [**AlertSettingsEnum**](#AlertSettingsEnum) | Define when you want the alerts to be setn |  [optional]
**triggerSettings** | [**TriggerSettingsEnum**](#TriggerSettingsEnum) | Define how to you want to trigger the timesheet automation |  [optional]
**startTimeHour** | **Integer** | The start hour in which this geofence should apply.  After this time, the geofence will be active. |  [optional]
**startTimeMinute** | **Integer** | The start minute in which this geofence should apply.  After this time, the geofence will be active. |  [optional]
**endTimeHour** | **Integer** | The end hour in which this geofence will stop applying.  After this time, the geofence will be inactive. |  [optional]
**endTimeMinute** | **Integer** | The end minute in which this geofence will stop applying.  After this time, the geofence will be inactive. |  [optional]



## Enum: AlertSettingsEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
SENDWHENENTERING | &quot;SendWhenEntering&quot;
SENDWHENEXITING | &quot;SendWhenExiting&quot;
SENDWHENENTERINGOREXITING | &quot;SendWhenEnteringOrExiting&quot;



## Enum: TriggerSettingsEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
STARTTIMESHEETWHENENTERING | &quot;StartTimesheetWhenEntering&quot;
STOPTIMESHEETWHENENTERING | &quot;StopTimesheetWhenEntering&quot;
STARTONENTERSTOPONLEAVE | &quot;StartOnEnterStopOnLeave&quot;




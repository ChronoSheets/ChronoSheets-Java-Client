

# TimesheetAutomationWithOrgAndGeofence

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orgId** | **Integer** |  |  [optional]
**geofenceName** | **String** |  |  [optional]
**coordinates** | [**List&lt;BasicCoordinate&gt;**](BasicCoordinate.md) |  |  [optional]
**userId** | **Integer** |  |  [optional]
**userName** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**automationId** | **Integer** |  |  [optional]
**automationActionType** | [**AutomationActionTypeEnum**](#AutomationActionTypeEnum) |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**latitude** | **Double** |  |  [optional]
**longitude** | **Double** |  |  [optional]
**isProcessed** | **Boolean** |  |  [optional]
**expires** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**clientDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: AutomationActionTypeEnum

Name | Value
---- | -----
ENTERGEOFENCE | &quot;EnterGeofence&quot;
EXITGEOFENCE | &quot;ExitGeofence&quot;
TAPONNFC | &quot;TapOnNfc&quot;





# CSTimesheetAutomationWithOrgAndGeofence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orgId** | **Integer** |  |  [optional]
**geofenceName** | **String** |  |  [optional]
**coordinates** | [**List&lt;CSBasicCoordinate&gt;**](CSBasicCoordinate.md) |  |  [optional]
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


<a name="AutomationActionTypeEnum"></a>
## Enum: AutomationActionTypeEnum
Name | Value
---- | -----
ENTERGEOFENCE | &quot;EnterGeofence&quot;
EXITGEOFENCE | &quot;ExitGeofence&quot;
TAPONNFC | &quot;TapOnNfc&quot;




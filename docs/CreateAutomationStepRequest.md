

# CreateAutomationStepRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geofencingId** | **Integer** |  |  [optional]
**nfcId** | **Integer** |  |  [optional]
**automationActionType** | [**AutomationActionTypeEnum**](#AutomationActionTypeEnum) |  |  [optional]
**latitude** | **Double** |  |  [optional]
**longitude** | **Double** |  |  [optional]
**clientTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: AutomationActionTypeEnum

Name | Value
---- | -----
ENTERGEOFENCE | &quot;EnterGeofence&quot;
EXITGEOFENCE | &quot;ExitGeofence&quot;
TAPONNFC | &quot;TapOnNfc&quot;




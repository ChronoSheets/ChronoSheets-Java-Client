
# CSUpdateJobCodeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The Id of the JobCode to be updated |  [optional]
**code** | **String** | The new JobCode to be set |  [optional]
**projectId** | **Integer** | The Id of the Project to be associated to |  [optional]
**clientId** | **Integer** | The Id of the Client to be associated to |  [optional]
**linkedTaskIds** | **List&lt;Integer&gt;** | A collection of Task Ids to be available when choosing this JobCode |  [optional]
**linkedOrgGroupIds** | **List&lt;Integer&gt;** | Restrict the access to this JobCode by specifying which Organisation Groups can have access.  Only employees in these Organisation Groups will be able to access this JobCode |  [optional]
**isDeleted** | **Boolean** | Whether or not this JobCode is to be marked as deleted |  [optional]




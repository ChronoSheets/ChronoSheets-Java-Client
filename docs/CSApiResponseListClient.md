
# CSApiResponseListClient

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List&lt;CSClient&gt;**](CSClient.md) | The main Data of the response |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The API response status. Indicates if the request was successful, failed or was unauthorised. |  [optional]
**message** | **String** | A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCEEDED | &quot;Succeeded&quot;
FATALEXCEPTION | &quot;FatalException&quot;
GENERALERROR | &quot;GeneralError&quot;
VALIDATIONERROR | &quot;ValidationError&quot;
UNAUTHORIZED | &quot;UnAuthorized&quot;
SESSIONEXPIRED | &quot;SessionExpired&quot;




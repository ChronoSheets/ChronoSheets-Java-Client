

# ClientSideUser

A user within ChronoSheets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The ID of the user |  [optional]
**organisationId** | **Integer** | The ID of the organisation |  [optional]
**userName** | **String** | The username of the user |  [optional]
**firstName** | **String** | The first name of the user |  [optional]
**lastName** | **String** | The last name of the user |  [optional]
**emailAddress** | **String** | The email address of the user |  [optional]
**roles** | **Long** | A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details |  [optional]
**alertSettings** | **Long** | A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details |  [optional]
**setupWizardRequired** | **Boolean** | Whether or not the setup wizard is required |  [optional]
**isSubscribedToNewsletter** | **Boolean** | Whether or not the user is subscribed to the user |  [optional]
**organisation** | [**Organisation**](Organisation.md) |  |  [optional]
**isPrimaryAccount** | **Boolean** | Whether or not this account is the organisation&#39;s primary account. |  [optional]




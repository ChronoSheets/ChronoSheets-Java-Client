
# CSUpdateUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Integer** | The Id of the User that is to be updated |  [optional]
**emailAddress** | **String** | The Email Address of the employee |  [optional]
**firstName** | **String** | The First Name of the employee |  [optional]
**lastName** | **String** | The Last Name of the employee |  [optional]
**isSubscribedToNewsletter** | **Boolean** | Whether or not the employee is subscribed to ChronoSheets newsletters |  [optional]
**isAccountActive** | **Boolean** | Whether or not the employee account is active |  [optional]
**roles** | **Long** | A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details |  [optional]
**alertSettings** | **Long** | A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details |  [optional]




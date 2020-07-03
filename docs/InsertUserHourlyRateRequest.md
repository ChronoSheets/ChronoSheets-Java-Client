

# InsertUserHourlyRateRequest

Fields for inserting a new set of Pay Rates for a user.  Archiving of the previous Pay Rate is done for you automatically
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Integer** | The Id of the User that is getting the new set of Pay Rates |  [optional]
**hourlyRate** | **Double** | The Hourly Rate the employee should receive during their usual rostered hours |  [optional]
**hourlyOvertimeRate** | **Double** | The Hourly Rate the employee should receive during outside of their usual rostered hours |  [optional]
**currentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The current date time |  [optional]




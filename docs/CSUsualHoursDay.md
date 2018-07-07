
# CSUsualHoursDay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dayType** | [**DayTypeEnum**](#DayTypeEnum) | Specify which day this collection of Roster timeslots is for (Monday-Sunday) |  [optional]
**timeSlots** | [**List&lt;CSTimeSlot&gt;**](CSTimeSlot.md) | A collection of TimeSlots within this day |  [optional]
**deleteUsualHours** | **List&lt;Integer&gt;** | Mark here which existing UsualHours are to be deleted |  [optional]


<a name="DayTypeEnum"></a>
## Enum: DayTypeEnum
Name | Value
---- | -----
MONDAY | &quot;Monday&quot;
TUESDAY | &quot;Tuesday&quot;
WEDNESDAY | &quot;Wednesday&quot;
THURSDAY | &quot;Thursday&quot;
FRIDAY | &quot;Friday&quot;
SATURDAY | &quot;Saturday&quot;
SUNDAY | &quot;Sunday&quot;




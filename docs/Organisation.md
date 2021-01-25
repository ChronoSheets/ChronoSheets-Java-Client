

# Organisation

An organisation in ChronoSheets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The ID of the organisation |  [optional]
**name** | **String** | The name of the organisation |  [optional]
**addressLine01** | **String** | Address line 1 of the organisation |  [optional]
**addressLine02** | **String** | Address line 2 of the organisation |  [optional]
**suburb** | **String** | The suburb where the organisation is located |  [optional]
**state** | **String** | The state where the organisation is located |  [optional]
**postcode** | **String** | The postcode of the organisation |  [optional]
**country** | **String** | The country of the organisation |  [optional]
**phone** | **String** | The primary phone contact number of the organisation |  [optional]
**emailAddress** | **String** | The primary email address of the organisation |  [optional]
**timezone** | **String** | The timezone of the organisation |  [optional]
**subscriptionCustomerId** | **String** | The customer ID of the payments subscription |  [optional]
**signupToken** | **String** | The sign up token |  [optional]
**isActive** | **Boolean** | Whether or not the organisation is active |  [optional]
**stripeCouponCode** | **String** | The payments coupon code |  [optional]
**subscriptionSource** | [**SubscriptionSourceEnum**](#SubscriptionSourceEnum) | The source of the subscription |  [optional]
**signUpSource** | [**SignUpSourceEnum**](#SignUpSourceEnum) | The source where the organisation signed up |  [optional]
**mobileSignUpCode** | **String** | A temporary mobile sign up code |  [optional]
**subscriptionCycleStart** | **OffsetDateTime** | The start date and time of the organisations subscription |  [optional]
**subscriptionCycleEnd** | **OffsetDateTime** | The end date and time of the organisations subscription |  [optional]
**pricingPlans** | [**List&lt;OrganisationPricingPlan&gt;**](OrganisationPricingPlan.md) | The organisation&#39;s pricing plans |  [optional]



## Enum: SubscriptionSourceEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
STRIPE | &quot;Stripe&quot;
APPLEINAPP | &quot;AppleInApp&quot;
GOOGLEINAPP | &quot;GoogleInApp&quot;



## Enum: SignUpSourceEnum

Name | Value
---- | -----
DESKTOP | &quot;Desktop&quot;
MOBILEIOS | &quot;MobileiOS&quot;
MOBILEANDROID | &quot;MobileAndroid&quot;






# Organisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**addressLine01** | **String** |  |  [optional]
**addressLine02** | **String** |  |  [optional]
**suburb** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**postcode** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**timezone** | **String** |  |  [optional]
**subscriptionCustomerId** | **String** |  |  [optional]
**signupToken** | **String** |  |  [optional]
**isActive** | **Boolean** |  |  [optional]
**stripeCouponCode** | **String** |  |  [optional]
**subscriptionSource** | [**SubscriptionSourceEnum**](#SubscriptionSourceEnum) |  |  [optional]
**signUpSource** | [**SignUpSourceEnum**](#SignUpSourceEnum) |  |  [optional]
**mobileSignUpCode** | **String** |  |  [optional]
**subscriptionCycleStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subscriptionCycleEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**pricingPlans** | [**List&lt;OrganisationPricingPlan&gt;**](OrganisationPricingPlan.md) |  |  [optional]



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




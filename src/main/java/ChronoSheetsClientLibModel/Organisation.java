/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import java.util.Arrays;
import ChronoSheetsClientLibModel.OrganisationPricingPlan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Organisation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T19:40:40.863+10:00[Australia/Sydney]")
public class Organisation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS_LINE01 = "AddressLine01";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE01)
  private String addressLine01;

  public static final String SERIALIZED_NAME_ADDRESS_LINE02 = "AddressLine02";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE02)
  private String addressLine02;

  public static final String SERIALIZED_NAME_SUBURB = "Suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTCODE = "Postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_TIMEZONE = "Timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CUSTOMER_ID = "SubscriptionCustomerId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CUSTOMER_ID)
  private String subscriptionCustomerId;

  public static final String SERIALIZED_NAME_SIGNUP_TOKEN = "SignupToken";
  @SerializedName(SERIALIZED_NAME_SIGNUP_TOKEN)
  private String signupToken;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_STRIPE_COUPON_CODE = "StripeCouponCode";
  @SerializedName(SERIALIZED_NAME_STRIPE_COUPON_CODE)
  private String stripeCouponCode;

  /**
   * Gets or Sets subscriptionSource
   */
  @JsonAdapter(SubscriptionSourceEnum.Adapter.class)
  public enum SubscriptionSourceEnum {
    NONE("None"),
    
    STRIPE("Stripe"),
    
    APPLEINAPP("AppleInApp"),
    
    GOOGLEINAPP("GoogleInApp");

    private String value;

    SubscriptionSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionSourceEnum fromValue(String value) {
      for (SubscriptionSourceEnum b : SubscriptionSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SOURCE = "SubscriptionSource";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SOURCE)
  private SubscriptionSourceEnum subscriptionSource;

  /**
   * Gets or Sets signUpSource
   */
  @JsonAdapter(SignUpSourceEnum.Adapter.class)
  public enum SignUpSourceEnum {
    DESKTOP("Desktop"),
    
    MOBILEIOS("MobileiOS"),
    
    MOBILEANDROID("MobileAndroid");

    private String value;

    SignUpSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignUpSourceEnum fromValue(String value) {
      for (SignUpSourceEnum b : SignUpSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SignUpSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignUpSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignUpSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignUpSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIGN_UP_SOURCE = "SignUpSource";
  @SerializedName(SERIALIZED_NAME_SIGN_UP_SOURCE)
  private SignUpSourceEnum signUpSource;

  public static final String SERIALIZED_NAME_MOBILE_SIGN_UP_CODE = "MobileSignUpCode";
  @SerializedName(SERIALIZED_NAME_MOBILE_SIGN_UP_CODE)
  private String mobileSignUpCode;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CYCLE_START = "SubscriptionCycleStart";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CYCLE_START)
  private OffsetDateTime subscriptionCycleStart;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CYCLE_END = "SubscriptionCycleEnd";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CYCLE_END)
  private OffsetDateTime subscriptionCycleEnd;

  public static final String SERIALIZED_NAME_PRICING_PLANS = "PricingPlans";
  @SerializedName(SERIALIZED_NAME_PRICING_PLANS)
  private List<OrganisationPricingPlan> pricingPlans = null;


  public Organisation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Organisation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Organisation addressLine01(String addressLine01) {
    
    this.addressLine01 = addressLine01;
    return this;
  }

   /**
   * Get addressLine01
   * @return addressLine01
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine01() {
    return addressLine01;
  }


  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }


  public Organisation addressLine02(String addressLine02) {
    
    this.addressLine02 = addressLine02;
    return this;
  }

   /**
   * Get addressLine02
   * @return addressLine02
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine02() {
    return addressLine02;
  }


  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }


  public Organisation suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public Organisation state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Organisation postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Organisation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Organisation phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Organisation emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Organisation timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public Organisation subscriptionCustomerId(String subscriptionCustomerId) {
    
    this.subscriptionCustomerId = subscriptionCustomerId;
    return this;
  }

   /**
   * Get subscriptionCustomerId
   * @return subscriptionCustomerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionCustomerId() {
    return subscriptionCustomerId;
  }


  public void setSubscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
  }


  public Organisation signupToken(String signupToken) {
    
    this.signupToken = signupToken;
    return this;
  }

   /**
   * Get signupToken
   * @return signupToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignupToken() {
    return signupToken;
  }


  public void setSignupToken(String signupToken) {
    this.signupToken = signupToken;
  }


  public Organisation isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public Organisation stripeCouponCode(String stripeCouponCode) {
    
    this.stripeCouponCode = stripeCouponCode;
    return this;
  }

   /**
   * Get stripeCouponCode
   * @return stripeCouponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStripeCouponCode() {
    return stripeCouponCode;
  }


  public void setStripeCouponCode(String stripeCouponCode) {
    this.stripeCouponCode = stripeCouponCode;
  }


  public Organisation subscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    
    this.subscriptionSource = subscriptionSource;
    return this;
  }

   /**
   * Get subscriptionSource
   * @return subscriptionSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionSourceEnum getSubscriptionSource() {
    return subscriptionSource;
  }


  public void setSubscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    this.subscriptionSource = subscriptionSource;
  }


  public Organisation signUpSource(SignUpSourceEnum signUpSource) {
    
    this.signUpSource = signUpSource;
    return this;
  }

   /**
   * Get signUpSource
   * @return signUpSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignUpSourceEnum getSignUpSource() {
    return signUpSource;
  }


  public void setSignUpSource(SignUpSourceEnum signUpSource) {
    this.signUpSource = signUpSource;
  }


  public Organisation mobileSignUpCode(String mobileSignUpCode) {
    
    this.mobileSignUpCode = mobileSignUpCode;
    return this;
  }

   /**
   * Get mobileSignUpCode
   * @return mobileSignUpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobileSignUpCode() {
    return mobileSignUpCode;
  }


  public void setMobileSignUpCode(String mobileSignUpCode) {
    this.mobileSignUpCode = mobileSignUpCode;
  }


  public Organisation subscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    
    this.subscriptionCycleStart = subscriptionCycleStart;
    return this;
  }

   /**
   * Get subscriptionCycleStart
   * @return subscriptionCycleStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSubscriptionCycleStart() {
    return subscriptionCycleStart;
  }


  public void setSubscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    this.subscriptionCycleStart = subscriptionCycleStart;
  }


  public Organisation subscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    
    this.subscriptionCycleEnd = subscriptionCycleEnd;
    return this;
  }

   /**
   * Get subscriptionCycleEnd
   * @return subscriptionCycleEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSubscriptionCycleEnd() {
    return subscriptionCycleEnd;
  }


  public void setSubscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    this.subscriptionCycleEnd = subscriptionCycleEnd;
  }


  public Organisation pricingPlans(List<OrganisationPricingPlan> pricingPlans) {
    
    this.pricingPlans = pricingPlans;
    return this;
  }

  public Organisation addPricingPlansItem(OrganisationPricingPlan pricingPlansItem) {
    if (this.pricingPlans == null) {
      this.pricingPlans = new ArrayList<OrganisationPricingPlan>();
    }
    this.pricingPlans.add(pricingPlansItem);
    return this;
  }

   /**
   * Get pricingPlans
   * @return pricingPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OrganisationPricingPlan> getPricingPlans() {
    return pricingPlans;
  }


  public void setPricingPlans(List<OrganisationPricingPlan> pricingPlans) {
    this.pricingPlans = pricingPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.id, organisation.id) &&
        Objects.equals(this.name, organisation.name) &&
        Objects.equals(this.addressLine01, organisation.addressLine01) &&
        Objects.equals(this.addressLine02, organisation.addressLine02) &&
        Objects.equals(this.suburb, organisation.suburb) &&
        Objects.equals(this.state, organisation.state) &&
        Objects.equals(this.postcode, organisation.postcode) &&
        Objects.equals(this.country, organisation.country) &&
        Objects.equals(this.phone, organisation.phone) &&
        Objects.equals(this.emailAddress, organisation.emailAddress) &&
        Objects.equals(this.timezone, organisation.timezone) &&
        Objects.equals(this.subscriptionCustomerId, organisation.subscriptionCustomerId) &&
        Objects.equals(this.signupToken, organisation.signupToken) &&
        Objects.equals(this.isActive, organisation.isActive) &&
        Objects.equals(this.stripeCouponCode, organisation.stripeCouponCode) &&
        Objects.equals(this.subscriptionSource, organisation.subscriptionSource) &&
        Objects.equals(this.signUpSource, organisation.signUpSource) &&
        Objects.equals(this.mobileSignUpCode, organisation.mobileSignUpCode) &&
        Objects.equals(this.subscriptionCycleStart, organisation.subscriptionCycleStart) &&
        Objects.equals(this.subscriptionCycleEnd, organisation.subscriptionCycleEnd) &&
        Objects.equals(this.pricingPlans, organisation.pricingPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addressLine01, addressLine02, suburb, state, postcode, country, phone, emailAddress, timezone, subscriptionCustomerId, signupToken, isActive, stripeCouponCode, subscriptionSource, signUpSource, mobileSignUpCode, subscriptionCycleStart, subscriptionCycleEnd, pricingPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine01: ").append(toIndentedString(addressLine01)).append("\n");
    sb.append("    addressLine02: ").append(toIndentedString(addressLine02)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    subscriptionCustomerId: ").append(toIndentedString(subscriptionCustomerId)).append("\n");
    sb.append("    signupToken: ").append(toIndentedString(signupToken)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    stripeCouponCode: ").append(toIndentedString(stripeCouponCode)).append("\n");
    sb.append("    subscriptionSource: ").append(toIndentedString(subscriptionSource)).append("\n");
    sb.append("    signUpSource: ").append(toIndentedString(signUpSource)).append("\n");
    sb.append("    mobileSignUpCode: ").append(toIndentedString(mobileSignUpCode)).append("\n");
    sb.append("    subscriptionCycleStart: ").append(toIndentedString(subscriptionCycleStart)).append("\n");
    sb.append("    subscriptionCycleEnd: ").append(toIndentedString(subscriptionCycleEnd)).append("\n");
    sb.append("    pricingPlans: ").append(toIndentedString(pricingPlans)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


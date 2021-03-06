/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import java.util.Arrays;
import ChronoSheetsClientLibModel.CSOrganisationPricingPlan;
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
 * CSOrganisation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSOrganisation {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AddressLine01")
  private String addressLine01 = null;

  @SerializedName("AddressLine02")
  private String addressLine02 = null;

  @SerializedName("Suburb")
  private String suburb = null;

  @SerializedName("State")
  private String state = null;

  @SerializedName("Postcode")
  private String postcode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("Timezone")
  private String timezone = null;

  @SerializedName("SubscriptionCustomerId")
  private String subscriptionCustomerId = null;

  @SerializedName("SignupToken")
  private String signupToken = null;

  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("StripeCouponCode")
  private String stripeCouponCode = null;

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

    public static SubscriptionSourceEnum fromValue(String text) {
      for (SubscriptionSourceEnum b : SubscriptionSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubscriptionSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubscriptionSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SubscriptionSource")
  private SubscriptionSourceEnum subscriptionSource = null;

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

    public static SignUpSourceEnum fromValue(String text) {
      for (SignUpSourceEnum b : SignUpSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignUpSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignUpSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignUpSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignUpSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SignUpSource")
  private SignUpSourceEnum signUpSource = null;

  @SerializedName("MobileSignUpCode")
  private String mobileSignUpCode = null;

  @SerializedName("SubscriptionCycleStart")
  private OffsetDateTime subscriptionCycleStart = null;

  @SerializedName("SubscriptionCycleEnd")
  private OffsetDateTime subscriptionCycleEnd = null;

  @SerializedName("PricingPlans")
  private List<CSOrganisationPricingPlan> pricingPlans = null;

  public CSOrganisation id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSOrganisation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CSOrganisation addressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
    return this;
  }

   /**
   * Get addressLine01
   * @return addressLine01
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine01() {
    return addressLine01;
  }

  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }

  public CSOrganisation addressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
    return this;
  }

   /**
   * Get addressLine02
   * @return addressLine02
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine02() {
    return addressLine02;
  }

  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }

  public CSOrganisation suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @ApiModelProperty(value = "")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public CSOrganisation state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CSOrganisation postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public CSOrganisation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CSOrganisation phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CSOrganisation emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CSOrganisation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CSOrganisation subscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
    return this;
  }

   /**
   * Get subscriptionCustomerId
   * @return subscriptionCustomerId
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionCustomerId() {
    return subscriptionCustomerId;
  }

  public void setSubscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
  }

  public CSOrganisation signupToken(String signupToken) {
    this.signupToken = signupToken;
    return this;
  }

   /**
   * Get signupToken
   * @return signupToken
  **/
  @ApiModelProperty(value = "")
  public String getSignupToken() {
    return signupToken;
  }

  public void setSignupToken(String signupToken) {
    this.signupToken = signupToken;
  }

  public CSOrganisation isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CSOrganisation stripeCouponCode(String stripeCouponCode) {
    this.stripeCouponCode = stripeCouponCode;
    return this;
  }

   /**
   * Get stripeCouponCode
   * @return stripeCouponCode
  **/
  @ApiModelProperty(value = "")
  public String getStripeCouponCode() {
    return stripeCouponCode;
  }

  public void setStripeCouponCode(String stripeCouponCode) {
    this.stripeCouponCode = stripeCouponCode;
  }

  public CSOrganisation subscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    this.subscriptionSource = subscriptionSource;
    return this;
  }

   /**
   * Get subscriptionSource
   * @return subscriptionSource
  **/
  @ApiModelProperty(value = "")
  public SubscriptionSourceEnum getSubscriptionSource() {
    return subscriptionSource;
  }

  public void setSubscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    this.subscriptionSource = subscriptionSource;
  }

  public CSOrganisation signUpSource(SignUpSourceEnum signUpSource) {
    this.signUpSource = signUpSource;
    return this;
  }

   /**
   * Get signUpSource
   * @return signUpSource
  **/
  @ApiModelProperty(value = "")
  public SignUpSourceEnum getSignUpSource() {
    return signUpSource;
  }

  public void setSignUpSource(SignUpSourceEnum signUpSource) {
    this.signUpSource = signUpSource;
  }

  public CSOrganisation mobileSignUpCode(String mobileSignUpCode) {
    this.mobileSignUpCode = mobileSignUpCode;
    return this;
  }

   /**
   * Get mobileSignUpCode
   * @return mobileSignUpCode
  **/
  @ApiModelProperty(value = "")
  public String getMobileSignUpCode() {
    return mobileSignUpCode;
  }

  public void setMobileSignUpCode(String mobileSignUpCode) {
    this.mobileSignUpCode = mobileSignUpCode;
  }

  public CSOrganisation subscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    this.subscriptionCycleStart = subscriptionCycleStart;
    return this;
  }

   /**
   * Get subscriptionCycleStart
   * @return subscriptionCycleStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSubscriptionCycleStart() {
    return subscriptionCycleStart;
  }

  public void setSubscriptionCycleStart(OffsetDateTime subscriptionCycleStart) {
    this.subscriptionCycleStart = subscriptionCycleStart;
  }

  public CSOrganisation subscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    this.subscriptionCycleEnd = subscriptionCycleEnd;
    return this;
  }

   /**
   * Get subscriptionCycleEnd
   * @return subscriptionCycleEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSubscriptionCycleEnd() {
    return subscriptionCycleEnd;
  }

  public void setSubscriptionCycleEnd(OffsetDateTime subscriptionCycleEnd) {
    this.subscriptionCycleEnd = subscriptionCycleEnd;
  }

  public CSOrganisation pricingPlans(List<CSOrganisationPricingPlan> pricingPlans) {
    this.pricingPlans = pricingPlans;
    return this;
  }

  public CSOrganisation addPricingPlansItem(CSOrganisationPricingPlan pricingPlansItem) {
    if (this.pricingPlans == null) {
      this.pricingPlans = new ArrayList<CSOrganisationPricingPlan>();
    }
    this.pricingPlans.add(pricingPlansItem);
    return this;
  }

   /**
   * Get pricingPlans
   * @return pricingPlans
  **/
  @ApiModelProperty(value = "")
  public List<CSOrganisationPricingPlan> getPricingPlans() {
    return pricingPlans;
  }

  public void setPricingPlans(List<CSOrganisationPricingPlan> pricingPlans) {
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
    CSOrganisation organisation = (CSOrganisation) o;
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
    sb.append("class CSOrganisation {\n");
    
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


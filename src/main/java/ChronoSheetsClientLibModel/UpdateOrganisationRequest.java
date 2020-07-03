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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Field for updating your Organisation
 */
@ApiModel(description = "Field for updating your Organisation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T19:40:40.863+10:00[Australia/Sydney]")
public class UpdateOrganisationRequest {
  public static final String SERIALIZED_NAME_ORGANSATION_ID = "OrgansationId";
  @SerializedName(SERIALIZED_NAME_ORGANSATION_ID)
  private Integer organsationId;

  public static final String SERIALIZED_NAME_ORGANISATION_NAME = "OrganisationName";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_NAME)
  private String organisationName;

  public static final String SERIALIZED_NAME_ADDRESS_LINE01 = "AddressLine01";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE01)
  private String addressLine01;

  public static final String SERIALIZED_NAME_ADDRESS_LINE02 = "AddressLine02";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE02)
  private String addressLine02;

  public static final String SERIALIZED_NAME_ORGANISATION_SUBURB = "OrganisationSuburb";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_SUBURB)
  private String organisationSuburb;

  public static final String SERIALIZED_NAME_ORGANISATION_STATE = "OrganisationState";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_STATE)
  private String organisationState;

  public static final String SERIALIZED_NAME_ORGANISATION_POSTCODE = "OrganisationPostcode";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_POSTCODE)
  private String organisationPostcode;

  public static final String SERIALIZED_NAME_ORGANISATION_COUNTRY = "OrganisationCountry";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_COUNTRY)
  private String organisationCountry;

  public static final String SERIALIZED_NAME_ORGANISATION_PHONE = "OrganisationPhone";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_PHONE)
  private String organisationPhone;

  public static final String SERIALIZED_NAME_ORGANISATION_EMAIL_ADDRESS = "OrganisationEmailAddress";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_EMAIL_ADDRESS)
  private String organisationEmailAddress;


  public UpdateOrganisationRequest organsationId(Integer organsationId) {
    
    this.organsationId = organsationId;
    return this;
  }

   /**
   * The Id of your Organisation.  This is validated based on your current Auth Token
   * @return organsationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Id of your Organisation.  This is validated based on your current Auth Token")

  public Integer getOrgansationId() {
    return organsationId;
  }


  public void setOrgansationId(Integer organsationId) {
    this.organsationId = organsationId;
  }


  public UpdateOrganisationRequest organisationName(String organisationName) {
    
    this.organisationName = organisationName;
    return this;
  }

   /**
   * The updated organisation name
   * @return organisationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated organisation name")

  public String getOrganisationName() {
    return organisationName;
  }


  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }


  public UpdateOrganisationRequest addressLine01(String addressLine01) {
    
    this.addressLine01 = addressLine01;
    return this;
  }

   /**
   * The updated Address Line 1 value
   * @return addressLine01
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated Address Line 1 value")

  public String getAddressLine01() {
    return addressLine01;
  }


  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }


  public UpdateOrganisationRequest addressLine02(String addressLine02) {
    
    this.addressLine02 = addressLine02;
    return this;
  }

   /**
   * The updated Address Line 2 value
   * @return addressLine02
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated Address Line 2 value")

  public String getAddressLine02() {
    return addressLine02;
  }


  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }


  public UpdateOrganisationRequest organisationSuburb(String organisationSuburb) {
    
    this.organisationSuburb = organisationSuburb;
    return this;
  }

   /**
   * The updated address suburb
   * @return organisationSuburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated address suburb")

  public String getOrganisationSuburb() {
    return organisationSuburb;
  }


  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }


  public UpdateOrganisationRequest organisationState(String organisationState) {
    
    this.organisationState = organisationState;
    return this;
  }

   /**
   * The updated address state
   * @return organisationState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated address state")

  public String getOrganisationState() {
    return organisationState;
  }


  public void setOrganisationState(String organisationState) {
    this.organisationState = organisationState;
  }


  public UpdateOrganisationRequest organisationPostcode(String organisationPostcode) {
    
    this.organisationPostcode = organisationPostcode;
    return this;
  }

   /**
   * The updated address postcode
   * @return organisationPostcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated address postcode")

  public String getOrganisationPostcode() {
    return organisationPostcode;
  }


  public void setOrganisationPostcode(String organisationPostcode) {
    this.organisationPostcode = organisationPostcode;
  }


  public UpdateOrganisationRequest organisationCountry(String organisationCountry) {
    
    this.organisationCountry = organisationCountry;
    return this;
  }

   /**
   * The updated address country
   * @return organisationCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated address country")

  public String getOrganisationCountry() {
    return organisationCountry;
  }


  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }


  public UpdateOrganisationRequest organisationPhone(String organisationPhone) {
    
    this.organisationPhone = organisationPhone;
    return this;
  }

   /**
   * The updated contact phone number
   * @return organisationPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated contact phone number")

  public String getOrganisationPhone() {
    return organisationPhone;
  }


  public void setOrganisationPhone(String organisationPhone) {
    this.organisationPhone = organisationPhone;
  }


  public UpdateOrganisationRequest organisationEmailAddress(String organisationEmailAddress) {
    
    this.organisationEmailAddress = organisationEmailAddress;
    return this;
  }

   /**
   * The update organisation email address
   * @return organisationEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The update organisation email address")

  public String getOrganisationEmailAddress() {
    return organisationEmailAddress;
  }


  public void setOrganisationEmailAddress(String organisationEmailAddress) {
    this.organisationEmailAddress = organisationEmailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrganisationRequest updateOrganisationRequest = (UpdateOrganisationRequest) o;
    return Objects.equals(this.organsationId, updateOrganisationRequest.organsationId) &&
        Objects.equals(this.organisationName, updateOrganisationRequest.organisationName) &&
        Objects.equals(this.addressLine01, updateOrganisationRequest.addressLine01) &&
        Objects.equals(this.addressLine02, updateOrganisationRequest.addressLine02) &&
        Objects.equals(this.organisationSuburb, updateOrganisationRequest.organisationSuburb) &&
        Objects.equals(this.organisationState, updateOrganisationRequest.organisationState) &&
        Objects.equals(this.organisationPostcode, updateOrganisationRequest.organisationPostcode) &&
        Objects.equals(this.organisationCountry, updateOrganisationRequest.organisationCountry) &&
        Objects.equals(this.organisationPhone, updateOrganisationRequest.organisationPhone) &&
        Objects.equals(this.organisationEmailAddress, updateOrganisationRequest.organisationEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organsationId, organisationName, addressLine01, addressLine02, organisationSuburb, organisationState, organisationPostcode, organisationCountry, organisationPhone, organisationEmailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrganisationRequest {\n");
    sb.append("    organsationId: ").append(toIndentedString(organsationId)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    addressLine01: ").append(toIndentedString(addressLine01)).append("\n");
    sb.append("    addressLine02: ").append(toIndentedString(addressLine02)).append("\n");
    sb.append("    organisationSuburb: ").append(toIndentedString(organisationSuburb)).append("\n");
    sb.append("    organisationState: ").append(toIndentedString(organisationState)).append("\n");
    sb.append("    organisationPostcode: ").append(toIndentedString(organisationPostcode)).append("\n");
    sb.append("    organisationCountry: ").append(toIndentedString(organisationCountry)).append("\n");
    sb.append("    organisationPhone: ").append(toIndentedString(organisationPhone)).append("\n");
    sb.append("    organisationEmailAddress: ").append(toIndentedString(organisationEmailAddress)).append("\n");
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


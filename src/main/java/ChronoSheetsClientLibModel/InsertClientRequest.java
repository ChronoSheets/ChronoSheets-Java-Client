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
 * Fields for inserting a new Client
 */
@ApiModel(description = "Fields for inserting a new Client")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-07T23:33:39.490+10:00[Australia/Sydney]")
public class InsertClientRequest {
  public static final String SERIALIZED_NAME_CLIENT_NAME = "ClientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENT_ADDRESS_LINE1 = "ClientAddressLine1";
  @SerializedName(SERIALIZED_NAME_CLIENT_ADDRESS_LINE1)
  private String clientAddressLine1;

  public static final String SERIALIZED_NAME_CLIENT_ADDRESS_LINE2 = "ClientAddressLine2";
  @SerializedName(SERIALIZED_NAME_CLIENT_ADDRESS_LINE2)
  private String clientAddressLine2;

  public static final String SERIALIZED_NAME_CLIENT_SUBURB = "ClientSuburb";
  @SerializedName(SERIALIZED_NAME_CLIENT_SUBURB)
  private String clientSuburb;

  public static final String SERIALIZED_NAME_CLIENT_STATE = "ClientState";
  @SerializedName(SERIALIZED_NAME_CLIENT_STATE)
  private String clientState;

  public static final String SERIALIZED_NAME_CLIENT_POST_CODE = "ClientPostCode";
  @SerializedName(SERIALIZED_NAME_CLIENT_POST_CODE)
  private String clientPostCode;

  public static final String SERIALIZED_NAME_PERSON_OF_CONTACT = "PersonOfContact";
  @SerializedName(SERIALIZED_NAME_PERSON_OF_CONTACT)
  private String personOfContact;

  public static final String SERIALIZED_NAME_CLIENT_PHONE_NUMBER = "ClientPhoneNumber";
  @SerializedName(SERIALIZED_NAME_CLIENT_PHONE_NUMBER)
  private String clientPhoneNumber;

  public static final String SERIALIZED_NAME_CLIENT_MOBILE_NUMBER = "ClientMobileNumber";
  @SerializedName(SERIALIZED_NAME_CLIENT_MOBILE_NUMBER)
  private String clientMobileNumber;

  public static final String SERIALIZED_NAME_CLIENT_EMAIL_ADDRESS = "ClientEmailAddress";
  @SerializedName(SERIALIZED_NAME_CLIENT_EMAIL_ADDRESS)
  private String clientEmailAddress;

  public static final String SERIALIZED_NAME_CLIENT_WEB_U_R_L = "ClientWebURL";
  @SerializedName(SERIALIZED_NAME_CLIENT_WEB_U_R_L)
  private String clientWebURL;


  public InsertClientRequest clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of the Client
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Client")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public InsertClientRequest clientAddressLine1(String clientAddressLine1) {
    
    this.clientAddressLine1 = clientAddressLine1;
    return this;
  }

   /**
   * Address line 1 of the Client
   * @return clientAddressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 1 of the Client")

  public String getClientAddressLine1() {
    return clientAddressLine1;
  }


  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }


  public InsertClientRequest clientAddressLine2(String clientAddressLine2) {
    
    this.clientAddressLine2 = clientAddressLine2;
    return this;
  }

   /**
   * Address line 2 of the Client
   * @return clientAddressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2 of the Client")

  public String getClientAddressLine2() {
    return clientAddressLine2;
  }


  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }


  public InsertClientRequest clientSuburb(String clientSuburb) {
    
    this.clientSuburb = clientSuburb;
    return this;
  }

   /**
   * The suburb of the Client&#39;s address
   * @return clientSuburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suburb of the Client's address")

  public String getClientSuburb() {
    return clientSuburb;
  }


  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }


  public InsertClientRequest clientState(String clientState) {
    
    this.clientState = clientState;
    return this;
  }

   /**
   * The state of the Client&#39;s address
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the Client's address")

  public String getClientState() {
    return clientState;
  }


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public InsertClientRequest clientPostCode(String clientPostCode) {
    
    this.clientPostCode = clientPostCode;
    return this;
  }

   /**
   * The post code of the Client&#39;s address
   * @return clientPostCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The post code of the Client's address")

  public String getClientPostCode() {
    return clientPostCode;
  }


  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }


  public InsertClientRequest personOfContact(String personOfContact) {
    
    this.personOfContact = personOfContact;
    return this;
  }

   /**
   * The name of the contact working with the Client
   * @return personOfContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the contact working with the Client")

  public String getPersonOfContact() {
    return personOfContact;
  }


  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }


  public InsertClientRequest clientPhoneNumber(String clientPhoneNumber) {
    
    this.clientPhoneNumber = clientPhoneNumber;
    return this;
  }

   /**
   * The phone number of the Client
   * @return clientPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number of the Client")

  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }


  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }


  public InsertClientRequest clientMobileNumber(String clientMobileNumber) {
    
    this.clientMobileNumber = clientMobileNumber;
    return this;
  }

   /**
   * The mobile phone number of the Client
   * @return clientMobileNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mobile phone number of the Client")

  public String getClientMobileNumber() {
    return clientMobileNumber;
  }


  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }


  public InsertClientRequest clientEmailAddress(String clientEmailAddress) {
    
    this.clientEmailAddress = clientEmailAddress;
    return this;
  }

   /**
   * The email address of the Client
   * @return clientEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the Client")

  public String getClientEmailAddress() {
    return clientEmailAddress;
  }


  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }


  public InsertClientRequest clientWebURL(String clientWebURL) {
    
    this.clientWebURL = clientWebURL;
    return this;
  }

   /**
   * The Client&#39;s website URL
   * @return clientWebURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Client's website URL")

  public String getClientWebURL() {
    return clientWebURL;
  }


  public void setClientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertClientRequest insertClientRequest = (InsertClientRequest) o;
    return Objects.equals(this.clientName, insertClientRequest.clientName) &&
        Objects.equals(this.clientAddressLine1, insertClientRequest.clientAddressLine1) &&
        Objects.equals(this.clientAddressLine2, insertClientRequest.clientAddressLine2) &&
        Objects.equals(this.clientSuburb, insertClientRequest.clientSuburb) &&
        Objects.equals(this.clientState, insertClientRequest.clientState) &&
        Objects.equals(this.clientPostCode, insertClientRequest.clientPostCode) &&
        Objects.equals(this.personOfContact, insertClientRequest.personOfContact) &&
        Objects.equals(this.clientPhoneNumber, insertClientRequest.clientPhoneNumber) &&
        Objects.equals(this.clientMobileNumber, insertClientRequest.clientMobileNumber) &&
        Objects.equals(this.clientEmailAddress, insertClientRequest.clientEmailAddress) &&
        Objects.equals(this.clientWebURL, insertClientRequest.clientWebURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, clientAddressLine1, clientAddressLine2, clientSuburb, clientState, clientPostCode, personOfContact, clientPhoneNumber, clientMobileNumber, clientEmailAddress, clientWebURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertClientRequest {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientAddressLine1: ").append(toIndentedString(clientAddressLine1)).append("\n");
    sb.append("    clientAddressLine2: ").append(toIndentedString(clientAddressLine2)).append("\n");
    sb.append("    clientSuburb: ").append(toIndentedString(clientSuburb)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    clientPostCode: ").append(toIndentedString(clientPostCode)).append("\n");
    sb.append("    personOfContact: ").append(toIndentedString(personOfContact)).append("\n");
    sb.append("    clientPhoneNumber: ").append(toIndentedString(clientPhoneNumber)).append("\n");
    sb.append("    clientMobileNumber: ").append(toIndentedString(clientMobileNumber)).append("\n");
    sb.append("    clientEmailAddress: ").append(toIndentedString(clientEmailAddress)).append("\n");
    sb.append("    clientWebURL: ").append(toIndentedString(clientWebURL)).append("\n");
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


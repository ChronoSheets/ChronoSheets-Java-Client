/*
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSInsertClientRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-27T00:07:52.261+10:00")
public class CSInsertClientRequest {
  @SerializedName("ClientName")
  private String clientName = null;

  @SerializedName("ClientAddressLine1")
  private String clientAddressLine1 = null;

  @SerializedName("ClientAddressLine2")
  private String clientAddressLine2 = null;

  @SerializedName("ClientSuburb")
  private String clientSuburb = null;

  @SerializedName("ClientState")
  private String clientState = null;

  @SerializedName("ClientPostCode")
  private String clientPostCode = null;

  @SerializedName("PersonOfContact")
  private String personOfContact = null;

  @SerializedName("ClientPhoneNumber")
  private String clientPhoneNumber = null;

  @SerializedName("ClientMobileNumber")
  private String clientMobileNumber = null;

  @SerializedName("ClientEmailAddress")
  private String clientEmailAddress = null;

  @SerializedName("ClientWebURL")
  private String clientWebURL = null;

  public CSInsertClientRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CSInsertClientRequest clientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
    return this;
  }

   /**
   * Get clientAddressLine1
   * @return clientAddressLine1
  **/
  @ApiModelProperty(value = "")
  public String getClientAddressLine1() {
    return clientAddressLine1;
  }

  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }

  public CSInsertClientRequest clientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
    return this;
  }

   /**
   * Get clientAddressLine2
   * @return clientAddressLine2
  **/
  @ApiModelProperty(value = "")
  public String getClientAddressLine2() {
    return clientAddressLine2;
  }

  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }

  public CSInsertClientRequest clientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
    return this;
  }

   /**
   * Get clientSuburb
   * @return clientSuburb
  **/
  @ApiModelProperty(value = "")
  public String getClientSuburb() {
    return clientSuburb;
  }

  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }

  public CSInsertClientRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Get clientState
   * @return clientState
  **/
  @ApiModelProperty(value = "")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CSInsertClientRequest clientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
    return this;
  }

   /**
   * Get clientPostCode
   * @return clientPostCode
  **/
  @ApiModelProperty(value = "")
  public String getClientPostCode() {
    return clientPostCode;
  }

  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }

  public CSInsertClientRequest personOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
    return this;
  }

   /**
   * Get personOfContact
   * @return personOfContact
  **/
  @ApiModelProperty(value = "")
  public String getPersonOfContact() {
    return personOfContact;
  }

  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }

  public CSInsertClientRequest clientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
    return this;
  }

   /**
   * Get clientPhoneNumber
   * @return clientPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }

  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }

  public CSInsertClientRequest clientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
    return this;
  }

   /**
   * Get clientMobileNumber
   * @return clientMobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getClientMobileNumber() {
    return clientMobileNumber;
  }

  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }

  public CSInsertClientRequest clientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
    return this;
  }

   /**
   * Get clientEmailAddress
   * @return clientEmailAddress
  **/
  @ApiModelProperty(value = "")
  public String getClientEmailAddress() {
    return clientEmailAddress;
  }

  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }

  public CSInsertClientRequest clientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
    return this;
  }

   /**
   * Get clientWebURL
   * @return clientWebURL
  **/
  @ApiModelProperty(value = "")
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
    CSInsertClientRequest insertClientRequest = (CSInsertClientRequest) o;
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
    sb.append("class CSInsertClientRequest {\n");
    
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


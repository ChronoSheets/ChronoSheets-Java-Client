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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-18T19:20:43.284+10:00")
public class CSClient {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

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

  @SerializedName("ProjectCount")
  private Integer projectCount = null;

  public CSClient id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the client
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the client")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSClient organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * The ID of your organisation
   * @return organisationId
  **/
  @ApiModelProperty(value = "The ID of your organisation")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CSClient clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of the client
   * @return clientName
  **/
  @ApiModelProperty(value = "The name of the client")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CSClient clientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
    return this;
  }

   /**
   * The address line 1 of the client
   * @return clientAddressLine1
  **/
  @ApiModelProperty(value = "The address line 1 of the client")
  public String getClientAddressLine1() {
    return clientAddressLine1;
  }

  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }

  public CSClient clientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
    return this;
  }

   /**
   * The address line 2 of the client
   * @return clientAddressLine2
  **/
  @ApiModelProperty(value = "The address line 2 of the client")
  public String getClientAddressLine2() {
    return clientAddressLine2;
  }

  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }

  public CSClient clientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
    return this;
  }

   /**
   * The address suburb of the client
   * @return clientSuburb
  **/
  @ApiModelProperty(value = "The address suburb of the client")
  public String getClientSuburb() {
    return clientSuburb;
  }

  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }

  public CSClient clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * The address state of the client
   * @return clientState
  **/
  @ApiModelProperty(value = "The address state of the client")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CSClient clientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
    return this;
  }

   /**
   * The postcode of the client
   * @return clientPostCode
  **/
  @ApiModelProperty(value = "The postcode of the client")
  public String getClientPostCode() {
    return clientPostCode;
  }

  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }

  public CSClient personOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
    return this;
  }

   /**
   * The contact person working under the client
   * @return personOfContact
  **/
  @ApiModelProperty(value = "The contact person working under the client")
  public String getPersonOfContact() {
    return personOfContact;
  }

  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }

  public CSClient clientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
    return this;
  }

   /**
   * The phone number of the client
   * @return clientPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the client")
  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }

  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }

  public CSClient clientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
    return this;
  }

   /**
   * The mobile phone number of the client
   * @return clientMobileNumber
  **/
  @ApiModelProperty(value = "The mobile phone number of the client")
  public String getClientMobileNumber() {
    return clientMobileNumber;
  }

  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }

  public CSClient clientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
    return this;
  }

   /**
   * The email address of the client
   * @return clientEmailAddress
  **/
  @ApiModelProperty(value = "The email address of the client")
  public String getClientEmailAddress() {
    return clientEmailAddress;
  }

  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }

  public CSClient clientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
    return this;
  }

   /**
   * The website URL of the client
   * @return clientWebURL
  **/
  @ApiModelProperty(value = "The website URL of the client")
  public String getClientWebURL() {
    return clientWebURL;
  }

  public void setClientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
  }

  public CSClient projectCount(Integer projectCount) {
    this.projectCount = projectCount;
    return this;
  }

   /**
   * The number of projects under the client
   * @return projectCount
  **/
  @ApiModelProperty(value = "The number of projects under the client")
  public Integer getProjectCount() {
    return projectCount;
  }

  public void setProjectCount(Integer projectCount) {
    this.projectCount = projectCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSClient client = (CSClient) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.organisationId, client.organisationId) &&
        Objects.equals(this.clientName, client.clientName) &&
        Objects.equals(this.clientAddressLine1, client.clientAddressLine1) &&
        Objects.equals(this.clientAddressLine2, client.clientAddressLine2) &&
        Objects.equals(this.clientSuburb, client.clientSuburb) &&
        Objects.equals(this.clientState, client.clientState) &&
        Objects.equals(this.clientPostCode, client.clientPostCode) &&
        Objects.equals(this.personOfContact, client.personOfContact) &&
        Objects.equals(this.clientPhoneNumber, client.clientPhoneNumber) &&
        Objects.equals(this.clientMobileNumber, client.clientMobileNumber) &&
        Objects.equals(this.clientEmailAddress, client.clientEmailAddress) &&
        Objects.equals(this.clientWebURL, client.clientWebURL) &&
        Objects.equals(this.projectCount, client.projectCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, clientName, clientAddressLine1, clientAddressLine2, clientSuburb, clientState, clientPostCode, personOfContact, clientPhoneNumber, clientMobileNumber, clientEmailAddress, clientWebURL, projectCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSClient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
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
    sb.append("    projectCount: ").append(toIndentedString(projectCount)).append("\n");
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


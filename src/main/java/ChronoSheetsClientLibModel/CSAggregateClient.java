/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
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
import ChronoSheetsClientLibModel.CSAggregateProject;
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

/**
 * CSAggregateClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T20:29:53.876+10:00")
public class CSAggregateClient {
  @SerializedName("ClientProjects")
  private List<CSAggregateProject> clientProjects = null;

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

  public CSAggregateClient clientProjects(List<CSAggregateProject> clientProjects) {
    this.clientProjects = clientProjects;
    return this;
  }

  public CSAggregateClient addClientProjectsItem(CSAggregateProject clientProjectsItem) {
    if (this.clientProjects == null) {
      this.clientProjects = new ArrayList<CSAggregateProject>();
    }
    this.clientProjects.add(clientProjectsItem);
    return this;
  }

   /**
   * Get clientProjects
   * @return clientProjects
  **/
  @ApiModelProperty(value = "")
  public List<CSAggregateProject> getClientProjects() {
    return clientProjects;
  }

  public void setClientProjects(List<CSAggregateProject> clientProjects) {
    this.clientProjects = clientProjects;
  }

  public CSAggregateClient id(Integer id) {
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

  public CSAggregateClient organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CSAggregateClient clientName(String clientName) {
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

  public CSAggregateClient clientAddressLine1(String clientAddressLine1) {
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

  public CSAggregateClient clientAddressLine2(String clientAddressLine2) {
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

  public CSAggregateClient clientSuburb(String clientSuburb) {
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

  public CSAggregateClient clientState(String clientState) {
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

  public CSAggregateClient clientPostCode(String clientPostCode) {
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

  public CSAggregateClient personOfContact(String personOfContact) {
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

  public CSAggregateClient clientPhoneNumber(String clientPhoneNumber) {
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

  public CSAggregateClient clientMobileNumber(String clientMobileNumber) {
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

  public CSAggregateClient clientEmailAddress(String clientEmailAddress) {
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

  public CSAggregateClient clientWebURL(String clientWebURL) {
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

  public CSAggregateClient projectCount(Integer projectCount) {
    this.projectCount = projectCount;
    return this;
  }

   /**
   * Get projectCount
   * @return projectCount
  **/
  @ApiModelProperty(value = "")
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
    CSAggregateClient aggregateClient = (CSAggregateClient) o;
    return Objects.equals(this.clientProjects, aggregateClient.clientProjects) &&
        Objects.equals(this.id, aggregateClient.id) &&
        Objects.equals(this.organisationId, aggregateClient.organisationId) &&
        Objects.equals(this.clientName, aggregateClient.clientName) &&
        Objects.equals(this.clientAddressLine1, aggregateClient.clientAddressLine1) &&
        Objects.equals(this.clientAddressLine2, aggregateClient.clientAddressLine2) &&
        Objects.equals(this.clientSuburb, aggregateClient.clientSuburb) &&
        Objects.equals(this.clientState, aggregateClient.clientState) &&
        Objects.equals(this.clientPostCode, aggregateClient.clientPostCode) &&
        Objects.equals(this.personOfContact, aggregateClient.personOfContact) &&
        Objects.equals(this.clientPhoneNumber, aggregateClient.clientPhoneNumber) &&
        Objects.equals(this.clientMobileNumber, aggregateClient.clientMobileNumber) &&
        Objects.equals(this.clientEmailAddress, aggregateClient.clientEmailAddress) &&
        Objects.equals(this.clientWebURL, aggregateClient.clientWebURL) &&
        Objects.equals(this.projectCount, aggregateClient.projectCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientProjects, id, organisationId, clientName, clientAddressLine1, clientAddressLine2, clientSuburb, clientState, clientPostCode, personOfContact, clientPhoneNumber, clientMobileNumber, clientEmailAddress, clientWebURL, projectCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSAggregateClient {\n");
    
    sb.append("    clientProjects: ").append(toIndentedString(clientProjects)).append("\n");
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

/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import ChronoSheetsClientLibModel.CsApiOrganisation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CsApiClientSideUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:45:21.699+10:00")
public class CsApiClientSideUser {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("Roles")
  private Long roles = null;

  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  @SerializedName("SetupWizardRequired")
  private Boolean setupWizardRequired = null;

  @SerializedName("Organisation")
  private CsApiOrganisation organisation = null;

  public CsApiClientSideUser id(Integer id) {
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

  public CsApiClientSideUser organisationId(Integer organisationId) {
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

  public CsApiClientSideUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CsApiClientSideUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CsApiClientSideUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CsApiClientSideUser roles(Long roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public Long getRoles() {
    return roles;
  }

  public void setRoles(Long roles) {
    this.roles = roles;
  }

  public CsApiClientSideUser alertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * Get alertSettings
   * @return alertSettings
  **/
  @ApiModelProperty(value = "")
  public Long getAlertSettings() {
    return alertSettings;
  }

  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }

  public CsApiClientSideUser setupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
    return this;
  }

   /**
   * Get setupWizardRequired
   * @return setupWizardRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isSetupWizardRequired() {
    return setupWizardRequired;
  }

  public void setSetupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
  }

  public CsApiClientSideUser organisation(CsApiOrganisation organisation) {
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")
  public CsApiOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(CsApiOrganisation organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiClientSideUser clientSideUser = (CsApiClientSideUser) o;
    return Objects.equals(this.id, clientSideUser.id) &&
        Objects.equals(this.organisationId, clientSideUser.organisationId) &&
        Objects.equals(this.userName, clientSideUser.userName) &&
        Objects.equals(this.firstName, clientSideUser.firstName) &&
        Objects.equals(this.lastName, clientSideUser.lastName) &&
        Objects.equals(this.roles, clientSideUser.roles) &&
        Objects.equals(this.alertSettings, clientSideUser.alertSettings) &&
        Objects.equals(this.setupWizardRequired, clientSideUser.setupWizardRequired) &&
        Objects.equals(this.organisation, clientSideUser.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, userName, firstName, lastName, roles, alertSettings, setupWizardRequired, organisation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiClientSideUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    setupWizardRequired: ").append(toIndentedString(setupWizardRequired)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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


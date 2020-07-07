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
import ChronoSheetsClientLibModel.Organisation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserForManagement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-07T23:33:39.490+10:00[Australia/Sydney]")
public class UserForManagement {
  public static final String SERIALIZED_NAME_IS_ACCOUNT_ACTIVE = "IsAccountActive";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_ACTIVE)
  private Boolean isAccountActive;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "OrganisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private Integer organisationId;

  public static final String SERIALIZED_NAME_USER_NAME = "UserName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Long roles;

  public static final String SERIALIZED_NAME_ALERT_SETTINGS = "AlertSettings";
  @SerializedName(SERIALIZED_NAME_ALERT_SETTINGS)
  private Long alertSettings;

  public static final String SERIALIZED_NAME_SETUP_WIZARD_REQUIRED = "SetupWizardRequired";
  @SerializedName(SERIALIZED_NAME_SETUP_WIZARD_REQUIRED)
  private Boolean setupWizardRequired;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER = "IsSubscribedToNewsletter";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER)
  private Boolean isSubscribedToNewsletter;

  public static final String SERIALIZED_NAME_ORGANISATION = "Organisation";
  @SerializedName(SERIALIZED_NAME_ORGANISATION)
  private Organisation organisation;

  public static final String SERIALIZED_NAME_IS_PRIMARY_ACCOUNT = "IsPrimaryAccount";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_ACCOUNT)
  private Boolean isPrimaryAccount;


  public UserForManagement isAccountActive(Boolean isAccountActive) {
    
    this.isAccountActive = isAccountActive;
    return this;
  }

   /**
   * Get isAccountActive
   * @return isAccountActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAccountActive() {
    return isAccountActive;
  }


  public void setIsAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
  }


  public UserForManagement id(Integer id) {
    
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


  public UserForManagement organisationId(Integer organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }


  public UserForManagement userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public UserForManagement firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserForManagement lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserForManagement emailAddress(String emailAddress) {
    
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


  public UserForManagement roles(Long roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRoles() {
    return roles;
  }


  public void setRoles(Long roles) {
    this.roles = roles;
  }


  public UserForManagement alertSettings(Long alertSettings) {
    
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * Get alertSettings
   * @return alertSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAlertSettings() {
    return alertSettings;
  }


  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }


  public UserForManagement setupWizardRequired(Boolean setupWizardRequired) {
    
    this.setupWizardRequired = setupWizardRequired;
    return this;
  }

   /**
   * Get setupWizardRequired
   * @return setupWizardRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSetupWizardRequired() {
    return setupWizardRequired;
  }


  public void setSetupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
  }


  public UserForManagement isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
    return this;
  }

   /**
   * Get isSubscribedToNewsletter
   * @return isSubscribedToNewsletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }


  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }


  public UserForManagement organisation(Organisation organisation) {
    
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Organisation getOrganisation() {
    return organisation;
  }


  public void setOrganisation(Organisation organisation) {
    this.organisation = organisation;
  }


  public UserForManagement isPrimaryAccount(Boolean isPrimaryAccount) {
    
    this.isPrimaryAccount = isPrimaryAccount;
    return this;
  }

   /**
   * Get isPrimaryAccount
   * @return isPrimaryAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimaryAccount() {
    return isPrimaryAccount;
  }


  public void setIsPrimaryAccount(Boolean isPrimaryAccount) {
    this.isPrimaryAccount = isPrimaryAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForManagement userForManagement = (UserForManagement) o;
    return Objects.equals(this.isAccountActive, userForManagement.isAccountActive) &&
        Objects.equals(this.id, userForManagement.id) &&
        Objects.equals(this.organisationId, userForManagement.organisationId) &&
        Objects.equals(this.userName, userForManagement.userName) &&
        Objects.equals(this.firstName, userForManagement.firstName) &&
        Objects.equals(this.lastName, userForManagement.lastName) &&
        Objects.equals(this.emailAddress, userForManagement.emailAddress) &&
        Objects.equals(this.roles, userForManagement.roles) &&
        Objects.equals(this.alertSettings, userForManagement.alertSettings) &&
        Objects.equals(this.setupWizardRequired, userForManagement.setupWizardRequired) &&
        Objects.equals(this.isSubscribedToNewsletter, userForManagement.isSubscribedToNewsletter) &&
        Objects.equals(this.organisation, userForManagement.organisation) &&
        Objects.equals(this.isPrimaryAccount, userForManagement.isPrimaryAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAccountActive, id, organisationId, userName, firstName, lastName, emailAddress, roles, alertSettings, setupWizardRequired, isSubscribedToNewsletter, organisation, isPrimaryAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForManagement {\n");
    sb.append("    isAccountActive: ").append(toIndentedString(isAccountActive)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    setupWizardRequired: ").append(toIndentedString(setupWizardRequired)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
    sb.append("    isPrimaryAccount: ").append(toIndentedString(isPrimaryAccount)).append("\n");
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


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
 * UserProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T19:40:40.863+10:00[Australia/Sydney]")
public class UserProfile {
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

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER = "IsSubscribedToNewsletter";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER)
  private Boolean isSubscribedToNewsletter;

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Long roles;

  public static final String SERIALIZED_NAME_ALERT_SETTINGS = "AlertSettings";
  @SerializedName(SERIALIZED_NAME_ALERT_SETTINGS)
  private Long alertSettings;

  public static final String SERIALIZED_NAME_ORGANISATION_NAME = "OrganisationName";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_NAME)
  private String organisationName;

  public static final String SERIALIZED_NAME_ORGANISATION_SUBURB = "OrganisationSuburb";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_SUBURB)
  private String organisationSuburb;

  public static final String SERIALIZED_NAME_ORGANISATION_COUNTRY = "OrganisationCountry";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_COUNTRY)
  private String organisationCountry;


  public UserProfile id(Integer id) {
    
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


  public UserProfile organisationId(Integer organisationId) {
    
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


  public UserProfile userName(String userName) {
    
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


  public UserProfile firstName(String firstName) {
    
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


  public UserProfile lastName(String lastName) {
    
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


  public UserProfile emailAddress(String emailAddress) {
    
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


  public UserProfile isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    
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


  public UserProfile roles(Long roles) {
    
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


  public UserProfile alertSettings(Long alertSettings) {
    
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


  public UserProfile organisationName(String organisationName) {
    
    this.organisationName = organisationName;
    return this;
  }

   /**
   * Get organisationName
   * @return organisationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganisationName() {
    return organisationName;
  }


  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }


  public UserProfile organisationSuburb(String organisationSuburb) {
    
    this.organisationSuburb = organisationSuburb;
    return this;
  }

   /**
   * Get organisationSuburb
   * @return organisationSuburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganisationSuburb() {
    return organisationSuburb;
  }


  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }


  public UserProfile organisationCountry(String organisationCountry) {
    
    this.organisationCountry = organisationCountry;
    return this;
  }

   /**
   * Get organisationCountry
   * @return organisationCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganisationCountry() {
    return organisationCountry;
  }


  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.id, userProfile.id) &&
        Objects.equals(this.organisationId, userProfile.organisationId) &&
        Objects.equals(this.userName, userProfile.userName) &&
        Objects.equals(this.firstName, userProfile.firstName) &&
        Objects.equals(this.lastName, userProfile.lastName) &&
        Objects.equals(this.emailAddress, userProfile.emailAddress) &&
        Objects.equals(this.isSubscribedToNewsletter, userProfile.isSubscribedToNewsletter) &&
        Objects.equals(this.roles, userProfile.roles) &&
        Objects.equals(this.alertSettings, userProfile.alertSettings) &&
        Objects.equals(this.organisationName, userProfile.organisationName) &&
        Objects.equals(this.organisationSuburb, userProfile.organisationSuburb) &&
        Objects.equals(this.organisationCountry, userProfile.organisationCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, userName, firstName, lastName, emailAddress, isSubscribedToNewsletter, roles, alertSettings, organisationName, organisationSuburb, organisationCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    organisationSuburb: ").append(toIndentedString(organisationSuburb)).append("\n");
    sb.append("    organisationCountry: ").append(toIndentedString(organisationCountry)).append("\n");
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


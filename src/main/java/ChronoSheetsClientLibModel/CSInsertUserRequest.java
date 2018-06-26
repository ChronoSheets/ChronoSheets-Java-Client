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
import org.threeten.bp.OffsetDateTime;

/**
 * CSInsertUserRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-27T00:07:52.261+10:00")
public class CSInsertUserRequest {
  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;

  @SerializedName("Roles")
  private Long roles = null;

  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("HourlyPayRate")
  private Double hourlyPayRate = null;

  @SerializedName("HourlyOvertimePayRate")
  private Double hourlyOvertimePayRate = null;

  @SerializedName("CurrentDate")
  private OffsetDateTime currentDate = null;

  public CSInsertUserRequest emailAddress(String emailAddress) {
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

  public CSInsertUserRequest firstName(String firstName) {
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

  public CSInsertUserRequest lastName(String lastName) {
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

  public CSInsertUserRequest isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
    return this;
  }

   /**
   * Get isSubscribedToNewsletter
   * @return isSubscribedToNewsletter
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }

  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  public CSInsertUserRequest roles(Long roles) {
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

  public CSInsertUserRequest alertSettings(Long alertSettings) {
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

  public CSInsertUserRequest userName(String userName) {
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

  public CSInsertUserRequest hourlyPayRate(Double hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
    return this;
  }

   /**
   * Get hourlyPayRate
   * @return hourlyPayRate
  **/
  @ApiModelProperty(value = "")
  public Double getHourlyPayRate() {
    return hourlyPayRate;
  }

  public void setHourlyPayRate(Double hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
  }

  public CSInsertUserRequest hourlyOvertimePayRate(Double hourlyOvertimePayRate) {
    this.hourlyOvertimePayRate = hourlyOvertimePayRate;
    return this;
  }

   /**
   * Get hourlyOvertimePayRate
   * @return hourlyOvertimePayRate
  **/
  @ApiModelProperty(value = "")
  public Double getHourlyOvertimePayRate() {
    return hourlyOvertimePayRate;
  }

  public void setHourlyOvertimePayRate(Double hourlyOvertimePayRate) {
    this.hourlyOvertimePayRate = hourlyOvertimePayRate;
  }

  public CSInsertUserRequest currentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
    return this;
  }

   /**
   * Get currentDate
   * @return currentDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertUserRequest insertUserRequest = (CSInsertUserRequest) o;
    return Objects.equals(this.emailAddress, insertUserRequest.emailAddress) &&
        Objects.equals(this.firstName, insertUserRequest.firstName) &&
        Objects.equals(this.lastName, insertUserRequest.lastName) &&
        Objects.equals(this.isSubscribedToNewsletter, insertUserRequest.isSubscribedToNewsletter) &&
        Objects.equals(this.roles, insertUserRequest.roles) &&
        Objects.equals(this.alertSettings, insertUserRequest.alertSettings) &&
        Objects.equals(this.userName, insertUserRequest.userName) &&
        Objects.equals(this.hourlyPayRate, insertUserRequest.hourlyPayRate) &&
        Objects.equals(this.hourlyOvertimePayRate, insertUserRequest.hourlyOvertimePayRate) &&
        Objects.equals(this.currentDate, insertUserRequest.currentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, firstName, lastName, isSubscribedToNewsletter, roles, alertSettings, userName, hourlyPayRate, hourlyOvertimePayRate, currentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertUserRequest {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    hourlyPayRate: ").append(toIndentedString(hourlyPayRate)).append("\n");
    sb.append("    hourlyOvertimePayRate: ").append(toIndentedString(hourlyOvertimePayRate)).append("\n");
    sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
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


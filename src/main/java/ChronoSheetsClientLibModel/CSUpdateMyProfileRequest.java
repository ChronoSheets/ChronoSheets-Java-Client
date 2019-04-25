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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSUpdateMyProfileRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-26T06:09:13.673+10:00")
public class CSUpdateMyProfileRequest {
  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("OldPassword")
  private String oldPassword = null;

  @SerializedName("NewPassword")
  private String newPassword = null;

  @SerializedName("ConfirmNewPassword")
  private String confirmNewPassword = null;

  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;

  @SerializedName("WantsToChangePassword")
  private Boolean wantsToChangePassword = null;

  public CSUpdateMyProfileRequest emailAddress(String emailAddress) {
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

  public CSUpdateMyProfileRequest firstName(String firstName) {
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

  public CSUpdateMyProfileRequest lastName(String lastName) {
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

  public CSUpdateMyProfileRequest oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Get oldPassword
   * @return oldPassword
  **/
  @ApiModelProperty(value = "")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public CSUpdateMyProfileRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @ApiModelProperty(value = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public CSUpdateMyProfileRequest confirmNewPassword(String confirmNewPassword) {
    this.confirmNewPassword = confirmNewPassword;
    return this;
  }

   /**
   * Get confirmNewPassword
   * @return confirmNewPassword
  **/
  @ApiModelProperty(value = "")
  public String getConfirmNewPassword() {
    return confirmNewPassword;
  }

  public void setConfirmNewPassword(String confirmNewPassword) {
    this.confirmNewPassword = confirmNewPassword;
  }

  public CSUpdateMyProfileRequest isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
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

  public CSUpdateMyProfileRequest wantsToChangePassword(Boolean wantsToChangePassword) {
    this.wantsToChangePassword = wantsToChangePassword;
    return this;
  }

   /**
   * Get wantsToChangePassword
   * @return wantsToChangePassword
  **/
  @ApiModelProperty(value = "")
  public Boolean isWantsToChangePassword() {
    return wantsToChangePassword;
  }

  public void setWantsToChangePassword(Boolean wantsToChangePassword) {
    this.wantsToChangePassword = wantsToChangePassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateMyProfileRequest updateMyProfileRequest = (CSUpdateMyProfileRequest) o;
    return Objects.equals(this.emailAddress, updateMyProfileRequest.emailAddress) &&
        Objects.equals(this.firstName, updateMyProfileRequest.firstName) &&
        Objects.equals(this.lastName, updateMyProfileRequest.lastName) &&
        Objects.equals(this.oldPassword, updateMyProfileRequest.oldPassword) &&
        Objects.equals(this.newPassword, updateMyProfileRequest.newPassword) &&
        Objects.equals(this.confirmNewPassword, updateMyProfileRequest.confirmNewPassword) &&
        Objects.equals(this.isSubscribedToNewsletter, updateMyProfileRequest.isSubscribedToNewsletter) &&
        Objects.equals(this.wantsToChangePassword, updateMyProfileRequest.wantsToChangePassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, firstName, lastName, oldPassword, newPassword, confirmNewPassword, isSubscribedToNewsletter, wantsToChangePassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateMyProfileRequest {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    confirmNewPassword: ").append(toIndentedString(confirmNewPassword)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    wantsToChangePassword: ").append(toIndentedString(wantsToChangePassword)).append("\n");
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


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
import org.threeten.bp.OffsetDateTime;

/**
 * CSRawReportItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-26T06:09:13.673+10:00")
public class CSRawReportItem {
  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("JobCode")
  private String jobCode = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("ClientName")
  private String clientName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PayAmount")
  private Double payAmount = null;

  @SerializedName("PayOvertimeAmount")
  private Double payOvertimeAmount = null;

  @SerializedName("TripCost")
  private Double tripCost = null;

  @SerializedName("TripDistanceMeters")
  private Double tripDistanceMeters = null;

  public CSRawReportItem organisationId(Integer organisationId) {
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

  public CSRawReportItem userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CSRawReportItem username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CSRawReportItem emailAddress(String emailAddress) {
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

  public CSRawReportItem jobCode(String jobCode) {
    this.jobCode = jobCode;
    return this;
  }

   /**
   * Get jobCode
   * @return jobCode
  **/
  @ApiModelProperty(value = "")
  public String getJobCode() {
    return jobCode;
  }

  public void setJobCode(String jobCode) {
    this.jobCode = jobCode;
  }

  public CSRawReportItem taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public CSRawReportItem clientName(String clientName) {
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

  public CSRawReportItem projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CSRawReportItem startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CSRawReportItem endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CSRawReportItem spanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
    return this;
  }

   /**
   * Get spanSeconds
   * @return spanSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getSpanSeconds() {
    return spanSeconds;
  }

  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }

  public CSRawReportItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CSRawReportItem payAmount(Double payAmount) {
    this.payAmount = payAmount;
    return this;
  }

   /**
   * Get payAmount
   * @return payAmount
  **/
  @ApiModelProperty(value = "")
  public Double getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }

  public CSRawReportItem payOvertimeAmount(Double payOvertimeAmount) {
    this.payOvertimeAmount = payOvertimeAmount;
    return this;
  }

   /**
   * Get payOvertimeAmount
   * @return payOvertimeAmount
  **/
  @ApiModelProperty(value = "")
  public Double getPayOvertimeAmount() {
    return payOvertimeAmount;
  }

  public void setPayOvertimeAmount(Double payOvertimeAmount) {
    this.payOvertimeAmount = payOvertimeAmount;
  }

  public CSRawReportItem tripCost(Double tripCost) {
    this.tripCost = tripCost;
    return this;
  }

   /**
   * Get tripCost
   * @return tripCost
  **/
  @ApiModelProperty(value = "")
  public Double getTripCost() {
    return tripCost;
  }

  public void setTripCost(Double tripCost) {
    this.tripCost = tripCost;
  }

  public CSRawReportItem tripDistanceMeters(Double tripDistanceMeters) {
    this.tripDistanceMeters = tripDistanceMeters;
    return this;
  }

   /**
   * Get tripDistanceMeters
   * @return tripDistanceMeters
  **/
  @ApiModelProperty(value = "")
  public Double getTripDistanceMeters() {
    return tripDistanceMeters;
  }

  public void setTripDistanceMeters(Double tripDistanceMeters) {
    this.tripDistanceMeters = tripDistanceMeters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSRawReportItem rawReportItem = (CSRawReportItem) o;
    return Objects.equals(this.organisationId, rawReportItem.organisationId) &&
        Objects.equals(this.userId, rawReportItem.userId) &&
        Objects.equals(this.username, rawReportItem.username) &&
        Objects.equals(this.emailAddress, rawReportItem.emailAddress) &&
        Objects.equals(this.jobCode, rawReportItem.jobCode) &&
        Objects.equals(this.taskName, rawReportItem.taskName) &&
        Objects.equals(this.clientName, rawReportItem.clientName) &&
        Objects.equals(this.projectName, rawReportItem.projectName) &&
        Objects.equals(this.startDate, rawReportItem.startDate) &&
        Objects.equals(this.endDate, rawReportItem.endDate) &&
        Objects.equals(this.spanSeconds, rawReportItem.spanSeconds) &&
        Objects.equals(this.description, rawReportItem.description) &&
        Objects.equals(this.payAmount, rawReportItem.payAmount) &&
        Objects.equals(this.payOvertimeAmount, rawReportItem.payOvertimeAmount) &&
        Objects.equals(this.tripCost, rawReportItem.tripCost) &&
        Objects.equals(this.tripDistanceMeters, rawReportItem.tripDistanceMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, userId, username, emailAddress, jobCode, taskName, clientName, projectName, startDate, endDate, spanSeconds, description, payAmount, payOvertimeAmount, tripCost, tripDistanceMeters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSRawReportItem {\n");
    
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    jobCode: ").append(toIndentedString(jobCode)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    spanSeconds: ").append(toIndentedString(spanSeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    payOvertimeAmount: ").append(toIndentedString(payOvertimeAmount)).append("\n");
    sb.append("    tripCost: ").append(toIndentedString(tripCost)).append("\n");
    sb.append("    tripDistanceMeters: ").append(toIndentedString(tripDistanceMeters)).append("\n");
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


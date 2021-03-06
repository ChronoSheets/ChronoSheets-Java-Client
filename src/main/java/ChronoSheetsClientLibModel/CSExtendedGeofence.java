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
import ChronoSheetsClientLibModel.CSBasicCoordinate;
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
import org.threeten.bp.OffsetDateTime;

/**
 * CSExtendedGeofence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSExtendedGeofence {
  @SerializedName("JobCode")
  private String jobCode = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("UpdatedBy")
  private String updatedBy = null;

  @SerializedName("AlertOrganisation")
  private String alertOrganisation = null;

  @SerializedName("GeoFencingId")
  private Integer geoFencingId = null;

  @SerializedName("OrgId")
  private Integer orgId = null;

  @SerializedName("CreatedByUserId")
  private Integer createdByUserId = null;

  @SerializedName("LastUpdatedByUserId")
  private Integer lastUpdatedByUserId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("LocationName")
  private String locationName = null;

  @SerializedName("Coordinates")
  private List<CSBasicCoordinate> coordinates = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("UpdatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("TriggerJobCodeId")
  private Integer triggerJobCodeId = null;

  @SerializedName("TriggerTaskId")
  private Integer triggerTaskId = null;

  /**
   * Gets or Sets triggerSettings
   */
  @JsonAdapter(TriggerSettingsEnum.Adapter.class)
  public enum TriggerSettingsEnum {
    NONE("None"),
    
    STARTTIMESHEETWHENENTERING("StartTimesheetWhenEntering"),
    
    STOPTIMESHEETWHENENTERING("StopTimesheetWhenEntering"),
    
    STARTONENTERSTOPONLEAVE("StartOnEnterStopOnLeave");

    private String value;

    TriggerSettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggerSettingsEnum fromValue(String text) {
      for (TriggerSettingsEnum b : TriggerSettingsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TriggerSettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerSettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggerSettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TriggerSettingsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TriggerSettings")
  private TriggerSettingsEnum triggerSettings = null;

  @SerializedName("AlertToOrgGroupId")
  private Integer alertToOrgGroupId = null;

  /**
   * Gets or Sets alertSettings
   */
  @JsonAdapter(AlertSettingsEnum.Adapter.class)
  public enum AlertSettingsEnum {
    NONE("None"),
    
    SENDWHENENTERING("SendWhenEntering"),
    
    SENDWHENEXITING("SendWhenExiting"),
    
    SENDWHENENTERINGOREXITING("SendWhenEnteringOrExiting");

    private String value;

    AlertSettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlertSettingsEnum fromValue(String text) {
      for (AlertSettingsEnum b : AlertSettingsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlertSettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlertSettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlertSettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlertSettingsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AlertSettings")
  private AlertSettingsEnum alertSettings = null;

  @SerializedName("StartTimeHour")
  private Integer startTimeHour = null;

  @SerializedName("StartTimeMinute")
  private Integer startTimeMinute = null;

  @SerializedName("EndTimeHour")
  private Integer endTimeHour = null;

  @SerializedName("EndTimeMinute")
  private Integer endTimeMinute = null;

  public CSExtendedGeofence jobCode(String jobCode) {
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

  public CSExtendedGeofence taskName(String taskName) {
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

  public CSExtendedGeofence createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CSExtendedGeofence updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public CSExtendedGeofence alertOrganisation(String alertOrganisation) {
    this.alertOrganisation = alertOrganisation;
    return this;
  }

   /**
   * Get alertOrganisation
   * @return alertOrganisation
  **/
  @ApiModelProperty(value = "")
  public String getAlertOrganisation() {
    return alertOrganisation;
  }

  public void setAlertOrganisation(String alertOrganisation) {
    this.alertOrganisation = alertOrganisation;
  }

  public CSExtendedGeofence geoFencingId(Integer geoFencingId) {
    this.geoFencingId = geoFencingId;
    return this;
  }

   /**
   * Get geoFencingId
   * @return geoFencingId
  **/
  @ApiModelProperty(value = "")
  public Integer getGeoFencingId() {
    return geoFencingId;
  }

  public void setGeoFencingId(Integer geoFencingId) {
    this.geoFencingId = geoFencingId;
  }

  public CSExtendedGeofence orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public CSExtendedGeofence createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public CSExtendedGeofence lastUpdatedByUserId(Integer lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
    return this;
  }

   /**
   * Get lastUpdatedByUserId
   * @return lastUpdatedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getLastUpdatedByUserId() {
    return lastUpdatedByUserId;
  }

  public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
  }

  public CSExtendedGeofence name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CSExtendedGeofence locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public CSExtendedGeofence coordinates(List<CSBasicCoordinate> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public CSExtendedGeofence addCoordinatesItem(CSBasicCoordinate coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<CSBasicCoordinate>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<CSBasicCoordinate> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<CSBasicCoordinate> coordinates) {
    this.coordinates = coordinates;
  }

  public CSExtendedGeofence createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CSExtendedGeofence updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CSExtendedGeofence triggerJobCodeId(Integer triggerJobCodeId) {
    this.triggerJobCodeId = triggerJobCodeId;
    return this;
  }

   /**
   * Get triggerJobCodeId
   * @return triggerJobCodeId
  **/
  @ApiModelProperty(value = "")
  public Integer getTriggerJobCodeId() {
    return triggerJobCodeId;
  }

  public void setTriggerJobCodeId(Integer triggerJobCodeId) {
    this.triggerJobCodeId = triggerJobCodeId;
  }

  public CSExtendedGeofence triggerTaskId(Integer triggerTaskId) {
    this.triggerTaskId = triggerTaskId;
    return this;
  }

   /**
   * Get triggerTaskId
   * @return triggerTaskId
  **/
  @ApiModelProperty(value = "")
  public Integer getTriggerTaskId() {
    return triggerTaskId;
  }

  public void setTriggerTaskId(Integer triggerTaskId) {
    this.triggerTaskId = triggerTaskId;
  }

  public CSExtendedGeofence triggerSettings(TriggerSettingsEnum triggerSettings) {
    this.triggerSettings = triggerSettings;
    return this;
  }

   /**
   * Get triggerSettings
   * @return triggerSettings
  **/
  @ApiModelProperty(value = "")
  public TriggerSettingsEnum getTriggerSettings() {
    return triggerSettings;
  }

  public void setTriggerSettings(TriggerSettingsEnum triggerSettings) {
    this.triggerSettings = triggerSettings;
  }

  public CSExtendedGeofence alertToOrgGroupId(Integer alertToOrgGroupId) {
    this.alertToOrgGroupId = alertToOrgGroupId;
    return this;
  }

   /**
   * Get alertToOrgGroupId
   * @return alertToOrgGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getAlertToOrgGroupId() {
    return alertToOrgGroupId;
  }

  public void setAlertToOrgGroupId(Integer alertToOrgGroupId) {
    this.alertToOrgGroupId = alertToOrgGroupId;
  }

  public CSExtendedGeofence alertSettings(AlertSettingsEnum alertSettings) {
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * Get alertSettings
   * @return alertSettings
  **/
  @ApiModelProperty(value = "")
  public AlertSettingsEnum getAlertSettings() {
    return alertSettings;
  }

  public void setAlertSettings(AlertSettingsEnum alertSettings) {
    this.alertSettings = alertSettings;
  }

  public CSExtendedGeofence startTimeHour(Integer startTimeHour) {
    this.startTimeHour = startTimeHour;
    return this;
  }

   /**
   * Get startTimeHour
   * @return startTimeHour
  **/
  @ApiModelProperty(value = "")
  public Integer getStartTimeHour() {
    return startTimeHour;
  }

  public void setStartTimeHour(Integer startTimeHour) {
    this.startTimeHour = startTimeHour;
  }

  public CSExtendedGeofence startTimeMinute(Integer startTimeMinute) {
    this.startTimeMinute = startTimeMinute;
    return this;
  }

   /**
   * Get startTimeMinute
   * @return startTimeMinute
  **/
  @ApiModelProperty(value = "")
  public Integer getStartTimeMinute() {
    return startTimeMinute;
  }

  public void setStartTimeMinute(Integer startTimeMinute) {
    this.startTimeMinute = startTimeMinute;
  }

  public CSExtendedGeofence endTimeHour(Integer endTimeHour) {
    this.endTimeHour = endTimeHour;
    return this;
  }

   /**
   * Get endTimeHour
   * @return endTimeHour
  **/
  @ApiModelProperty(value = "")
  public Integer getEndTimeHour() {
    return endTimeHour;
  }

  public void setEndTimeHour(Integer endTimeHour) {
    this.endTimeHour = endTimeHour;
  }

  public CSExtendedGeofence endTimeMinute(Integer endTimeMinute) {
    this.endTimeMinute = endTimeMinute;
    return this;
  }

   /**
   * Get endTimeMinute
   * @return endTimeMinute
  **/
  @ApiModelProperty(value = "")
  public Integer getEndTimeMinute() {
    return endTimeMinute;
  }

  public void setEndTimeMinute(Integer endTimeMinute) {
    this.endTimeMinute = endTimeMinute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSExtendedGeofence extendedGeofence = (CSExtendedGeofence) o;
    return Objects.equals(this.jobCode, extendedGeofence.jobCode) &&
        Objects.equals(this.taskName, extendedGeofence.taskName) &&
        Objects.equals(this.createdBy, extendedGeofence.createdBy) &&
        Objects.equals(this.updatedBy, extendedGeofence.updatedBy) &&
        Objects.equals(this.alertOrganisation, extendedGeofence.alertOrganisation) &&
        Objects.equals(this.geoFencingId, extendedGeofence.geoFencingId) &&
        Objects.equals(this.orgId, extendedGeofence.orgId) &&
        Objects.equals(this.createdByUserId, extendedGeofence.createdByUserId) &&
        Objects.equals(this.lastUpdatedByUserId, extendedGeofence.lastUpdatedByUserId) &&
        Objects.equals(this.name, extendedGeofence.name) &&
        Objects.equals(this.locationName, extendedGeofence.locationName) &&
        Objects.equals(this.coordinates, extendedGeofence.coordinates) &&
        Objects.equals(this.createdAt, extendedGeofence.createdAt) &&
        Objects.equals(this.updatedAt, extendedGeofence.updatedAt) &&
        Objects.equals(this.triggerJobCodeId, extendedGeofence.triggerJobCodeId) &&
        Objects.equals(this.triggerTaskId, extendedGeofence.triggerTaskId) &&
        Objects.equals(this.triggerSettings, extendedGeofence.triggerSettings) &&
        Objects.equals(this.alertToOrgGroupId, extendedGeofence.alertToOrgGroupId) &&
        Objects.equals(this.alertSettings, extendedGeofence.alertSettings) &&
        Objects.equals(this.startTimeHour, extendedGeofence.startTimeHour) &&
        Objects.equals(this.startTimeMinute, extendedGeofence.startTimeMinute) &&
        Objects.equals(this.endTimeHour, extendedGeofence.endTimeHour) &&
        Objects.equals(this.endTimeMinute, extendedGeofence.endTimeMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobCode, taskName, createdBy, updatedBy, alertOrganisation, geoFencingId, orgId, createdByUserId, lastUpdatedByUserId, name, locationName, coordinates, createdAt, updatedAt, triggerJobCodeId, triggerTaskId, triggerSettings, alertToOrgGroupId, alertSettings, startTimeHour, startTimeMinute, endTimeHour, endTimeMinute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSExtendedGeofence {\n");
    
    sb.append("    jobCode: ").append(toIndentedString(jobCode)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    alertOrganisation: ").append(toIndentedString(alertOrganisation)).append("\n");
    sb.append("    geoFencingId: ").append(toIndentedString(geoFencingId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    triggerJobCodeId: ").append(toIndentedString(triggerJobCodeId)).append("\n");
    sb.append("    triggerTaskId: ").append(toIndentedString(triggerTaskId)).append("\n");
    sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
    sb.append("    alertToOrgGroupId: ").append(toIndentedString(alertToOrgGroupId)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    startTimeHour: ").append(toIndentedString(startTimeHour)).append("\n");
    sb.append("    startTimeMinute: ").append(toIndentedString(startTimeMinute)).append("\n");
    sb.append("    endTimeHour: ").append(toIndentedString(endTimeHour)).append("\n");
    sb.append("    endTimeMinute: ").append(toIndentedString(endTimeMinute)).append("\n");
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


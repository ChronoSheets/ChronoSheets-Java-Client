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
 * CSTimesheetAutomationWithOrgAndGeofence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSTimesheetAutomationWithOrgAndGeofence {
  @SerializedName("OrgId")
  private Integer orgId = null;

  @SerializedName("GeofenceName")
  private String geofenceName = null;

  @SerializedName("Coordinates")
  private List<CSBasicCoordinate> coordinates = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("AutomationId")
  private Integer automationId = null;

  /**
   * Gets or Sets automationActionType
   */
  @JsonAdapter(AutomationActionTypeEnum.Adapter.class)
  public enum AutomationActionTypeEnum {
    ENTERGEOFENCE("EnterGeofence"),
    
    EXITGEOFENCE("ExitGeofence"),
    
    TAPONNFC("TapOnNfc");

    private String value;

    AutomationActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutomationActionTypeEnum fromValue(String text) {
      for (AutomationActionTypeEnum b : AutomationActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AutomationActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutomationActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutomationActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AutomationActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AutomationActionType")
  private AutomationActionTypeEnum automationActionType = null;

  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  @SerializedName("IsProcessed")
  private Boolean isProcessed = null;

  @SerializedName("Expires")
  private OffsetDateTime expires = null;

  @SerializedName("ClientDateTime")
  private OffsetDateTime clientDateTime = null;

  public CSTimesheetAutomationWithOrgAndGeofence orgId(Integer orgId) {
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

  public CSTimesheetAutomationWithOrgAndGeofence geofenceName(String geofenceName) {
    this.geofenceName = geofenceName;
    return this;
  }

   /**
   * Get geofenceName
   * @return geofenceName
  **/
  @ApiModelProperty(value = "")
  public String getGeofenceName() {
    return geofenceName;
  }

  public void setGeofenceName(String geofenceName) {
    this.geofenceName = geofenceName;
  }

  public CSTimesheetAutomationWithOrgAndGeofence coordinates(List<CSBasicCoordinate> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public CSTimesheetAutomationWithOrgAndGeofence addCoordinatesItem(CSBasicCoordinate coordinatesItem) {
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

  public CSTimesheetAutomationWithOrgAndGeofence userId(Integer userId) {
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

  public CSTimesheetAutomationWithOrgAndGeofence userName(String userName) {
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

  public CSTimesheetAutomationWithOrgAndGeofence firstName(String firstName) {
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

  public CSTimesheetAutomationWithOrgAndGeofence lastName(String lastName) {
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

  public CSTimesheetAutomationWithOrgAndGeofence automationId(Integer automationId) {
    this.automationId = automationId;
    return this;
  }

   /**
   * Get automationId
   * @return automationId
  **/
  @ApiModelProperty(value = "")
  public Integer getAutomationId() {
    return automationId;
  }

  public void setAutomationId(Integer automationId) {
    this.automationId = automationId;
  }

  public CSTimesheetAutomationWithOrgAndGeofence automationActionType(AutomationActionTypeEnum automationActionType) {
    this.automationActionType = automationActionType;
    return this;
  }

   /**
   * Get automationActionType
   * @return automationActionType
  **/
  @ApiModelProperty(value = "")
  public AutomationActionTypeEnum getAutomationActionType() {
    return automationActionType;
  }

  public void setAutomationActionType(AutomationActionTypeEnum automationActionType) {
    this.automationActionType = automationActionType;
  }

  public CSTimesheetAutomationWithOrgAndGeofence created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CSTimesheetAutomationWithOrgAndGeofence latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public CSTimesheetAutomationWithOrgAndGeofence longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public CSTimesheetAutomationWithOrgAndGeofence isProcessed(Boolean isProcessed) {
    this.isProcessed = isProcessed;
    return this;
  }

   /**
   * Get isProcessed
   * @return isProcessed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsProcessed() {
    return isProcessed;
  }

  public void setIsProcessed(Boolean isProcessed) {
    this.isProcessed = isProcessed;
  }

  public CSTimesheetAutomationWithOrgAndGeofence expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public CSTimesheetAutomationWithOrgAndGeofence clientDateTime(OffsetDateTime clientDateTime) {
    this.clientDateTime = clientDateTime;
    return this;
  }

   /**
   * Get clientDateTime
   * @return clientDateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClientDateTime() {
    return clientDateTime;
  }

  public void setClientDateTime(OffsetDateTime clientDateTime) {
    this.clientDateTime = clientDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimesheetAutomationWithOrgAndGeofence timesheetAutomationWithOrgAndGeofence = (CSTimesheetAutomationWithOrgAndGeofence) o;
    return Objects.equals(this.orgId, timesheetAutomationWithOrgAndGeofence.orgId) &&
        Objects.equals(this.geofenceName, timesheetAutomationWithOrgAndGeofence.geofenceName) &&
        Objects.equals(this.coordinates, timesheetAutomationWithOrgAndGeofence.coordinates) &&
        Objects.equals(this.userId, timesheetAutomationWithOrgAndGeofence.userId) &&
        Objects.equals(this.userName, timesheetAutomationWithOrgAndGeofence.userName) &&
        Objects.equals(this.firstName, timesheetAutomationWithOrgAndGeofence.firstName) &&
        Objects.equals(this.lastName, timesheetAutomationWithOrgAndGeofence.lastName) &&
        Objects.equals(this.automationId, timesheetAutomationWithOrgAndGeofence.automationId) &&
        Objects.equals(this.automationActionType, timesheetAutomationWithOrgAndGeofence.automationActionType) &&
        Objects.equals(this.created, timesheetAutomationWithOrgAndGeofence.created) &&
        Objects.equals(this.latitude, timesheetAutomationWithOrgAndGeofence.latitude) &&
        Objects.equals(this.longitude, timesheetAutomationWithOrgAndGeofence.longitude) &&
        Objects.equals(this.isProcessed, timesheetAutomationWithOrgAndGeofence.isProcessed) &&
        Objects.equals(this.expires, timesheetAutomationWithOrgAndGeofence.expires) &&
        Objects.equals(this.clientDateTime, timesheetAutomationWithOrgAndGeofence.clientDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, geofenceName, coordinates, userId, userName, firstName, lastName, automationId, automationActionType, created, latitude, longitude, isProcessed, expires, clientDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimesheetAutomationWithOrgAndGeofence {\n");
    
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    geofenceName: ").append(toIndentedString(geofenceName)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    automationId: ").append(toIndentedString(automationId)).append("\n");
    sb.append("    automationActionType: ").append(toIndentedString(automationActionType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    isProcessed: ").append(toIndentedString(isProcessed)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    clientDateTime: ").append(toIndentedString(clientDateTime)).append("\n");
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


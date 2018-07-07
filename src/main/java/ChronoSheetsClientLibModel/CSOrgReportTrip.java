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
import ChronoSheetsClientLibModel.CSTripCoordinate;
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
 * CSOrgReportTrip
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T19:28:27.850+10:00")
public class CSOrgReportTrip {
  @SerializedName("Username")
  private String username = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("TripId")
  private Integer tripId = null;

  @SerializedName("TimesheetId")
  private Integer timesheetId = null;

  @SerializedName("VehicleId")
  private Integer vehicleId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("OrgId")
  private Integer orgId = null;

  /**
   * Gets or Sets mobilePlatform
   */
  @JsonAdapter(MobilePlatformEnum.Adapter.class)
  public enum MobilePlatformEnum {
    UNKNOWN("Unknown"),
    
    IOS("iOS"),
    
    ANDROID("Android");

    private String value;

    MobilePlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MobilePlatformEnum fromValue(String text) {
      for (MobilePlatformEnum b : MobilePlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MobilePlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MobilePlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MobilePlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MobilePlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("VehicleName")
  private String vehicleName = null;

  @SerializedName("VehicleMake")
  private String vehicleMake = null;

  @SerializedName("VehicleModel")
  private String vehicleModel = null;

  @SerializedName("VehicleYear")
  private String vehicleYear = null;

  @SerializedName("CostPerKilometer")
  private Double costPerKilometer = null;

  @SerializedName("TripTotalCost")
  private Double tripTotalCost = null;

  @SerializedName("TotalTripDistanceMeters")
  private Double totalTripDistanceMeters = null;

  @SerializedName("StartAddress")
  private String startAddress = null;

  @SerializedName("EndAddress")
  private String endAddress = null;

  @SerializedName("PathCoordinates")
  private List<CSTripCoordinate> pathCoordinates = null;

  @SerializedName("CacheExpiryDate")
  private OffsetDateTime cacheExpiryDate = null;

  public CSOrgReportTrip username(String username) {
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

  public CSOrgReportTrip emailAddress(String emailAddress) {
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

  public CSOrgReportTrip firstName(String firstName) {
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

  public CSOrgReportTrip lastName(String lastName) {
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

  public CSOrgReportTrip tripId(Integer tripId) {
    this.tripId = tripId;
    return this;
  }

   /**
   * Get tripId
   * @return tripId
  **/
  @ApiModelProperty(value = "")
  public Integer getTripId() {
    return tripId;
  }

  public void setTripId(Integer tripId) {
    this.tripId = tripId;
  }

  public CSOrgReportTrip timesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
    return this;
  }

   /**
   * Get timesheetId
   * @return timesheetId
  **/
  @ApiModelProperty(value = "")
  public Integer getTimesheetId() {
    return timesheetId;
  }

  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  public CSOrgReportTrip vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public CSOrgReportTrip userId(Integer userId) {
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

  public CSOrgReportTrip orgId(Integer orgId) {
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

  public CSOrgReportTrip mobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
    return this;
  }

   /**
   * Get mobilePlatform
   * @return mobilePlatform
  **/
  @ApiModelProperty(value = "")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }

  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }

  public CSOrgReportTrip startDate(OffsetDateTime startDate) {
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

  public CSOrgReportTrip endDate(OffsetDateTime endDate) {
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

  public CSOrgReportTrip vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

   /**
   * Get vehicleName
   * @return vehicleName
  **/
  @ApiModelProperty(value = "")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public CSOrgReportTrip vehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
    return this;
  }

   /**
   * Get vehicleMake
   * @return vehicleMake
  **/
  @ApiModelProperty(value = "")
  public String getVehicleMake() {
    return vehicleMake;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public CSOrgReportTrip vehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
    return this;
  }

   /**
   * Get vehicleModel
   * @return vehicleModel
  **/
  @ApiModelProperty(value = "")
  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public CSOrgReportTrip vehicleYear(String vehicleYear) {
    this.vehicleYear = vehicleYear;
    return this;
  }

   /**
   * Get vehicleYear
   * @return vehicleYear
  **/
  @ApiModelProperty(value = "")
  public String getVehicleYear() {
    return vehicleYear;
  }

  public void setVehicleYear(String vehicleYear) {
    this.vehicleYear = vehicleYear;
  }

  public CSOrgReportTrip costPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
    return this;
  }

   /**
   * Get costPerKilometer
   * @return costPerKilometer
  **/
  @ApiModelProperty(value = "")
  public Double getCostPerKilometer() {
    return costPerKilometer;
  }

  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }

  public CSOrgReportTrip tripTotalCost(Double tripTotalCost) {
    this.tripTotalCost = tripTotalCost;
    return this;
  }

   /**
   * Get tripTotalCost
   * @return tripTotalCost
  **/
  @ApiModelProperty(value = "")
  public Double getTripTotalCost() {
    return tripTotalCost;
  }

  public void setTripTotalCost(Double tripTotalCost) {
    this.tripTotalCost = tripTotalCost;
  }

  public CSOrgReportTrip totalTripDistanceMeters(Double totalTripDistanceMeters) {
    this.totalTripDistanceMeters = totalTripDistanceMeters;
    return this;
  }

   /**
   * Get totalTripDistanceMeters
   * @return totalTripDistanceMeters
  **/
  @ApiModelProperty(value = "")
  public Double getTotalTripDistanceMeters() {
    return totalTripDistanceMeters;
  }

  public void setTotalTripDistanceMeters(Double totalTripDistanceMeters) {
    this.totalTripDistanceMeters = totalTripDistanceMeters;
  }

  public CSOrgReportTrip startAddress(String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

   /**
   * Get startAddress
   * @return startAddress
  **/
  @ApiModelProperty(value = "")
  public String getStartAddress() {
    return startAddress;
  }

  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  public CSOrgReportTrip endAddress(String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

   /**
   * Get endAddress
   * @return endAddress
  **/
  @ApiModelProperty(value = "")
  public String getEndAddress() {
    return endAddress;
  }

  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  public CSOrgReportTrip pathCoordinates(List<CSTripCoordinate> pathCoordinates) {
    this.pathCoordinates = pathCoordinates;
    return this;
  }

  public CSOrgReportTrip addPathCoordinatesItem(CSTripCoordinate pathCoordinatesItem) {
    if (this.pathCoordinates == null) {
      this.pathCoordinates = new ArrayList<CSTripCoordinate>();
    }
    this.pathCoordinates.add(pathCoordinatesItem);
    return this;
  }

   /**
   * Get pathCoordinates
   * @return pathCoordinates
  **/
  @ApiModelProperty(value = "")
  public List<CSTripCoordinate> getPathCoordinates() {
    return pathCoordinates;
  }

  public void setPathCoordinates(List<CSTripCoordinate> pathCoordinates) {
    this.pathCoordinates = pathCoordinates;
  }

  public CSOrgReportTrip cacheExpiryDate(OffsetDateTime cacheExpiryDate) {
    this.cacheExpiryDate = cacheExpiryDate;
    return this;
  }

   /**
   * Get cacheExpiryDate
   * @return cacheExpiryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCacheExpiryDate() {
    return cacheExpiryDate;
  }

  public void setCacheExpiryDate(OffsetDateTime cacheExpiryDate) {
    this.cacheExpiryDate = cacheExpiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSOrgReportTrip orgReportTrip = (CSOrgReportTrip) o;
    return Objects.equals(this.username, orgReportTrip.username) &&
        Objects.equals(this.emailAddress, orgReportTrip.emailAddress) &&
        Objects.equals(this.firstName, orgReportTrip.firstName) &&
        Objects.equals(this.lastName, orgReportTrip.lastName) &&
        Objects.equals(this.tripId, orgReportTrip.tripId) &&
        Objects.equals(this.timesheetId, orgReportTrip.timesheetId) &&
        Objects.equals(this.vehicleId, orgReportTrip.vehicleId) &&
        Objects.equals(this.userId, orgReportTrip.userId) &&
        Objects.equals(this.orgId, orgReportTrip.orgId) &&
        Objects.equals(this.mobilePlatform, orgReportTrip.mobilePlatform) &&
        Objects.equals(this.startDate, orgReportTrip.startDate) &&
        Objects.equals(this.endDate, orgReportTrip.endDate) &&
        Objects.equals(this.vehicleName, orgReportTrip.vehicleName) &&
        Objects.equals(this.vehicleMake, orgReportTrip.vehicleMake) &&
        Objects.equals(this.vehicleModel, orgReportTrip.vehicleModel) &&
        Objects.equals(this.vehicleYear, orgReportTrip.vehicleYear) &&
        Objects.equals(this.costPerKilometer, orgReportTrip.costPerKilometer) &&
        Objects.equals(this.tripTotalCost, orgReportTrip.tripTotalCost) &&
        Objects.equals(this.totalTripDistanceMeters, orgReportTrip.totalTripDistanceMeters) &&
        Objects.equals(this.startAddress, orgReportTrip.startAddress) &&
        Objects.equals(this.endAddress, orgReportTrip.endAddress) &&
        Objects.equals(this.pathCoordinates, orgReportTrip.pathCoordinates) &&
        Objects.equals(this.cacheExpiryDate, orgReportTrip.cacheExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, emailAddress, firstName, lastName, tripId, timesheetId, vehicleId, userId, orgId, mobilePlatform, startDate, endDate, vehicleName, vehicleMake, vehicleModel, vehicleYear, costPerKilometer, tripTotalCost, totalTripDistanceMeters, startAddress, endAddress, pathCoordinates, cacheExpiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSOrgReportTrip {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    tripId: ").append(toIndentedString(tripId)).append("\n");
    sb.append("    timesheetId: ").append(toIndentedString(timesheetId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    mobilePlatform: ").append(toIndentedString(mobilePlatform)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    vehicleMake: ").append(toIndentedString(vehicleMake)).append("\n");
    sb.append("    vehicleModel: ").append(toIndentedString(vehicleModel)).append("\n");
    sb.append("    vehicleYear: ").append(toIndentedString(vehicleYear)).append("\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    tripTotalCost: ").append(toIndentedString(tripTotalCost)).append("\n");
    sb.append("    totalTripDistanceMeters: ").append(toIndentedString(totalTripDistanceMeters)).append("\n");
    sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
    sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
    sb.append("    pathCoordinates: ").append(toIndentedString(pathCoordinates)).append("\n");
    sb.append("    cacheExpiryDate: ").append(toIndentedString(cacheExpiryDate)).append("\n");
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


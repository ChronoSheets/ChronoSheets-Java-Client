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
 * CSTrip
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-12T20:58:58.273+10:00")
public class CSTrip {
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

  public CSTrip tripId(Integer tripId) {
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

  public CSTrip timesheetId(Integer timesheetId) {
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

  public CSTrip vehicleId(Integer vehicleId) {
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

  public CSTrip userId(Integer userId) {
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

  public CSTrip orgId(Integer orgId) {
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

  public CSTrip mobilePlatform(MobilePlatformEnum mobilePlatform) {
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

  public CSTrip startDate(OffsetDateTime startDate) {
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

  public CSTrip endDate(OffsetDateTime endDate) {
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

  public CSTrip vehicleName(String vehicleName) {
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

  public CSTrip vehicleMake(String vehicleMake) {
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

  public CSTrip vehicleModel(String vehicleModel) {
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

  public CSTrip vehicleYear(String vehicleYear) {
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

  public CSTrip costPerKilometer(Double costPerKilometer) {
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

  public CSTrip tripTotalCost(Double tripTotalCost) {
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

  public CSTrip totalTripDistanceMeters(Double totalTripDistanceMeters) {
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

  public CSTrip startAddress(String startAddress) {
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

  public CSTrip endAddress(String endAddress) {
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

  public CSTrip pathCoordinates(List<CSTripCoordinate> pathCoordinates) {
    this.pathCoordinates = pathCoordinates;
    return this;
  }

  public CSTrip addPathCoordinatesItem(CSTripCoordinate pathCoordinatesItem) {
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

  public CSTrip cacheExpiryDate(OffsetDateTime cacheExpiryDate) {
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
    CSTrip trip = (CSTrip) o;
    return Objects.equals(this.tripId, trip.tripId) &&
        Objects.equals(this.timesheetId, trip.timesheetId) &&
        Objects.equals(this.vehicleId, trip.vehicleId) &&
        Objects.equals(this.userId, trip.userId) &&
        Objects.equals(this.orgId, trip.orgId) &&
        Objects.equals(this.mobilePlatform, trip.mobilePlatform) &&
        Objects.equals(this.startDate, trip.startDate) &&
        Objects.equals(this.endDate, trip.endDate) &&
        Objects.equals(this.vehicleName, trip.vehicleName) &&
        Objects.equals(this.vehicleMake, trip.vehicleMake) &&
        Objects.equals(this.vehicleModel, trip.vehicleModel) &&
        Objects.equals(this.vehicleYear, trip.vehicleYear) &&
        Objects.equals(this.costPerKilometer, trip.costPerKilometer) &&
        Objects.equals(this.tripTotalCost, trip.tripTotalCost) &&
        Objects.equals(this.totalTripDistanceMeters, trip.totalTripDistanceMeters) &&
        Objects.equals(this.startAddress, trip.startAddress) &&
        Objects.equals(this.endAddress, trip.endAddress) &&
        Objects.equals(this.pathCoordinates, trip.pathCoordinates) &&
        Objects.equals(this.cacheExpiryDate, trip.cacheExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tripId, timesheetId, vehicleId, userId, orgId, mobilePlatform, startDate, endDate, vehicleName, vehicleMake, vehicleModel, vehicleYear, costPerKilometer, tripTotalCost, totalTripDistanceMeters, startAddress, endAddress, pathCoordinates, cacheExpiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTrip {\n");
    
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


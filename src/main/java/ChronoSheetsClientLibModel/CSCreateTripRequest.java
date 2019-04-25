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
 * Contains fields for creating a Trip
 */
@ApiModel(description = "Contains fields for creating a Trip")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-26T06:09:13.673+10:00")
public class CSCreateTripRequest {
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;

  @SerializedName("VehicleId")
  private Integer vehicleId = null;

  @SerializedName("PathCoordsStringCsv")
  private String pathCoordsStringCsv = null;

  @SerializedName("DistanceMeters")
  private Double distanceMeters = null;

  /**
   * The Mobile platform that the Trip was recorded on
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

  public CSCreateTripRequest timesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
    return this;
  }

   /**
   * The associated Timesheet record Id.  The Trip will be linked to the Timesheet with this TimesheetId
   * @return timesheetId
  **/
  @ApiModelProperty(value = "The associated Timesheet record Id.  The Trip will be linked to the Timesheet with this TimesheetId")
  public Integer getTimesheetId() {
    return timesheetId;
  }

  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  public CSCreateTripRequest vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * The associated Vehicle Id.  The Trip will show that this Vehicle was used
   * @return vehicleId
  **/
  @ApiModelProperty(value = "The associated Vehicle Id.  The Trip will show that this Vehicle was used")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public CSCreateTripRequest pathCoordsStringCsv(String pathCoordsStringCsv) {
    this.pathCoordsStringCsv = pathCoordsStringCsv;
    return this;
  }

   /**
   * A CSV of GPS path co-ordinates.  Format example: -37.8433562,144.7226188;[Lat1],[Long1];........[LatN],[LongN]
   * @return pathCoordsStringCsv
  **/
  @ApiModelProperty(value = "A CSV of GPS path co-ordinates.  Format example: -37.8433562,144.7226188;[Lat1],[Long1];........[LatN],[LongN]")
  public String getPathCoordsStringCsv() {
    return pathCoordsStringCsv;
  }

  public void setPathCoordsStringCsv(String pathCoordsStringCsv) {
    this.pathCoordsStringCsv = pathCoordsStringCsv;
  }

  public CSCreateTripRequest distanceMeters(Double distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

   /**
   * The total distance of the Trip
   * @return distanceMeters
  **/
  @ApiModelProperty(value = "The total distance of the Trip")
  public Double getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(Double distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  public CSCreateTripRequest mobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
    return this;
  }

   /**
   * The Mobile platform that the Trip was recorded on
   * @return mobilePlatform
  **/
  @ApiModelProperty(value = "The Mobile platform that the Trip was recorded on")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }

  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSCreateTripRequest createTripRequest = (CSCreateTripRequest) o;
    return Objects.equals(this.timesheetId, createTripRequest.timesheetId) &&
        Objects.equals(this.vehicleId, createTripRequest.vehicleId) &&
        Objects.equals(this.pathCoordsStringCsv, createTripRequest.pathCoordsStringCsv) &&
        Objects.equals(this.distanceMeters, createTripRequest.distanceMeters) &&
        Objects.equals(this.mobilePlatform, createTripRequest.mobilePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetId, vehicleId, pathCoordsStringCsv, distanceMeters, mobilePlatform);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSCreateTripRequest {\n");
    
    sb.append("    timesheetId: ").append(toIndentedString(timesheetId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    pathCoordsStringCsv: ").append(toIndentedString(pathCoordsStringCsv)).append("\n");
    sb.append("    distanceMeters: ").append(toIndentedString(distanceMeters)).append("\n");
    sb.append("    mobilePlatform: ").append(toIndentedString(mobilePlatform)).append("\n");
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


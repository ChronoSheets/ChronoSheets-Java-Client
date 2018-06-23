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

/**
 * CsApiCreateTripRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-24T02:33:30.704+10:00")
public class CsApiCreateTripRequest {
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;

  @SerializedName("VehicleId")
  private Integer vehicleId = null;

  @SerializedName("PathCoordsStringCsv")
  private String pathCoordsStringCsv = null;

  @SerializedName("DistanceMeters")
  private Double distanceMeters = null;

  /**
   * 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android
   */
  @JsonAdapter(MobilePlatformEnum.Adapter.class)
  public enum MobilePlatformEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    MobilePlatformEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
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
        Integer value = jsonReader.nextInt();
        return MobilePlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;

  public CsApiCreateTripRequest timesheetId(Integer timesheetId) {
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

  public CsApiCreateTripRequest vehicleId(Integer vehicleId) {
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

  public CsApiCreateTripRequest pathCoordsStringCsv(String pathCoordsStringCsv) {
    this.pathCoordsStringCsv = pathCoordsStringCsv;
    return this;
  }

   /**
   * Get pathCoordsStringCsv
   * @return pathCoordsStringCsv
  **/
  @ApiModelProperty(value = "")
  public String getPathCoordsStringCsv() {
    return pathCoordsStringCsv;
  }

  public void setPathCoordsStringCsv(String pathCoordsStringCsv) {
    this.pathCoordsStringCsv = pathCoordsStringCsv;
  }

  public CsApiCreateTripRequest distanceMeters(Double distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

   /**
   * Get distanceMeters
   * @return distanceMeters
  **/
  @ApiModelProperty(value = "")
  public Double getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(Double distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  public CsApiCreateTripRequest mobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
    return this;
  }

   /**
   * 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android
   * @return mobilePlatform
  **/
  @ApiModelProperty(value = "0 = Unknown, 1 = iOS, 2 = Android")
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
    CsApiCreateTripRequest createTripRequest = (CsApiCreateTripRequest) o;
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
    sb.append("class CsApiCreateTripRequest {\n");
    
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


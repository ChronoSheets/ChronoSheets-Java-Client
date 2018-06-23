/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import java.util.ArrayList;
import java.util.List;

/**
 * CsApiInsertVehicleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:45:21.699+10:00")
public class CsApiInsertVehicleRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CostPerKilometer")
  private Double costPerKilometer = null;

  @SerializedName("Make")
  private String make = null;

  @SerializedName("Model")
  private String model = null;

  @SerializedName("Year")
  private String year = null;

  @SerializedName("LicencePlateNumber")
  private String licencePlateNumber = null;

  @SerializedName("LinkedOrgGroupIds")
  private List<Integer> linkedOrgGroupIds = null;

  public CsApiInsertVehicleRequest name(String name) {
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

  public CsApiInsertVehicleRequest costPerKilometer(Double costPerKilometer) {
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

  public CsApiInsertVehicleRequest make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public CsApiInsertVehicleRequest model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CsApiInsertVehicleRequest year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public CsApiInsertVehicleRequest licencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
    return this;
  }

   /**
   * Get licencePlateNumber
   * @return licencePlateNumber
  **/
  @ApiModelProperty(value = "")
  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }

  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }

  public CsApiInsertVehicleRequest linkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
    return this;
  }

  public CsApiInsertVehicleRequest addLinkedOrgGroupIdsItem(Integer linkedOrgGroupIdsItem) {
    if (this.linkedOrgGroupIds == null) {
      this.linkedOrgGroupIds = new ArrayList<Integer>();
    }
    this.linkedOrgGroupIds.add(linkedOrgGroupIdsItem);
    return this;
  }

   /**
   * Get linkedOrgGroupIds
   * @return linkedOrgGroupIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getLinkedOrgGroupIds() {
    return linkedOrgGroupIds;
  }

  public void setLinkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiInsertVehicleRequest insertVehicleRequest = (CsApiInsertVehicleRequest) o;
    return Objects.equals(this.name, insertVehicleRequest.name) &&
        Objects.equals(this.costPerKilometer, insertVehicleRequest.costPerKilometer) &&
        Objects.equals(this.make, insertVehicleRequest.make) &&
        Objects.equals(this.model, insertVehicleRequest.model) &&
        Objects.equals(this.year, insertVehicleRequest.year) &&
        Objects.equals(this.licencePlateNumber, insertVehicleRequest.licencePlateNumber) &&
        Objects.equals(this.linkedOrgGroupIds, insertVehicleRequest.linkedOrgGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, costPerKilometer, make, model, year, licencePlateNumber, linkedOrgGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiInsertVehicleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    licencePlateNumber: ").append(toIndentedString(licencePlateNumber)).append("\n");
    sb.append("    linkedOrgGroupIds: ").append(toIndentedString(linkedOrgGroupIds)).append("\n");
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


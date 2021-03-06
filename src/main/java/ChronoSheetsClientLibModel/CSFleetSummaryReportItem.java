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
 * CSFleetSummaryReportItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSFleetSummaryReportItem {
  @SerializedName("TotalDistanceMetersFiltered")
  private Double totalDistanceMetersFiltered = null;

  @SerializedName("TotalDistanceMeters")
  private Double totalDistanceMeters = null;

  @SerializedName("TotalRunningCostDollarsFiltered")
  private Double totalRunningCostDollarsFiltered = null;

  @SerializedName("TotalRunningCostDollars")
  private Double totalRunningCostDollars = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

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

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  @SerializedName("PermittedEmployees")
  private List<Integer> permittedEmployees = null;

  public CSFleetSummaryReportItem totalDistanceMetersFiltered(Double totalDistanceMetersFiltered) {
    this.totalDistanceMetersFiltered = totalDistanceMetersFiltered;
    return this;
  }

   /**
   * Get totalDistanceMetersFiltered
   * @return totalDistanceMetersFiltered
  **/
  @ApiModelProperty(value = "")
  public Double getTotalDistanceMetersFiltered() {
    return totalDistanceMetersFiltered;
  }

  public void setTotalDistanceMetersFiltered(Double totalDistanceMetersFiltered) {
    this.totalDistanceMetersFiltered = totalDistanceMetersFiltered;
  }

  public CSFleetSummaryReportItem totalDistanceMeters(Double totalDistanceMeters) {
    this.totalDistanceMeters = totalDistanceMeters;
    return this;
  }

   /**
   * Get totalDistanceMeters
   * @return totalDistanceMeters
  **/
  @ApiModelProperty(value = "")
  public Double getTotalDistanceMeters() {
    return totalDistanceMeters;
  }

  public void setTotalDistanceMeters(Double totalDistanceMeters) {
    this.totalDistanceMeters = totalDistanceMeters;
  }

  public CSFleetSummaryReportItem totalRunningCostDollarsFiltered(Double totalRunningCostDollarsFiltered) {
    this.totalRunningCostDollarsFiltered = totalRunningCostDollarsFiltered;
    return this;
  }

   /**
   * Get totalRunningCostDollarsFiltered
   * @return totalRunningCostDollarsFiltered
  **/
  @ApiModelProperty(value = "")
  public Double getTotalRunningCostDollarsFiltered() {
    return totalRunningCostDollarsFiltered;
  }

  public void setTotalRunningCostDollarsFiltered(Double totalRunningCostDollarsFiltered) {
    this.totalRunningCostDollarsFiltered = totalRunningCostDollarsFiltered;
  }

  public CSFleetSummaryReportItem totalRunningCostDollars(Double totalRunningCostDollars) {
    this.totalRunningCostDollars = totalRunningCostDollars;
    return this;
  }

   /**
   * Get totalRunningCostDollars
   * @return totalRunningCostDollars
  **/
  @ApiModelProperty(value = "")
  public Double getTotalRunningCostDollars() {
    return totalRunningCostDollars;
  }

  public void setTotalRunningCostDollars(Double totalRunningCostDollars) {
    this.totalRunningCostDollars = totalRunningCostDollars;
  }

  public CSFleetSummaryReportItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSFleetSummaryReportItem organisationId(Integer organisationId) {
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

  public CSFleetSummaryReportItem name(String name) {
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

  public CSFleetSummaryReportItem costPerKilometer(Double costPerKilometer) {
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

  public CSFleetSummaryReportItem make(String make) {
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

  public CSFleetSummaryReportItem model(String model) {
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

  public CSFleetSummaryReportItem year(String year) {
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

  public CSFleetSummaryReportItem licencePlateNumber(String licencePlateNumber) {
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

  public CSFleetSummaryReportItem isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CSFleetSummaryReportItem permittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
    return this;
  }

  public CSFleetSummaryReportItem addPermittedEmployeesItem(Integer permittedEmployeesItem) {
    if (this.permittedEmployees == null) {
      this.permittedEmployees = new ArrayList<Integer>();
    }
    this.permittedEmployees.add(permittedEmployeesItem);
    return this;
  }

   /**
   * Get permittedEmployees
   * @return permittedEmployees
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPermittedEmployees() {
    return permittedEmployees;
  }

  public void setPermittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSFleetSummaryReportItem fleetSummaryReportItem = (CSFleetSummaryReportItem) o;
    return Objects.equals(this.totalDistanceMetersFiltered, fleetSummaryReportItem.totalDistanceMetersFiltered) &&
        Objects.equals(this.totalDistanceMeters, fleetSummaryReportItem.totalDistanceMeters) &&
        Objects.equals(this.totalRunningCostDollarsFiltered, fleetSummaryReportItem.totalRunningCostDollarsFiltered) &&
        Objects.equals(this.totalRunningCostDollars, fleetSummaryReportItem.totalRunningCostDollars) &&
        Objects.equals(this.id, fleetSummaryReportItem.id) &&
        Objects.equals(this.organisationId, fleetSummaryReportItem.organisationId) &&
        Objects.equals(this.name, fleetSummaryReportItem.name) &&
        Objects.equals(this.costPerKilometer, fleetSummaryReportItem.costPerKilometer) &&
        Objects.equals(this.make, fleetSummaryReportItem.make) &&
        Objects.equals(this.model, fleetSummaryReportItem.model) &&
        Objects.equals(this.year, fleetSummaryReportItem.year) &&
        Objects.equals(this.licencePlateNumber, fleetSummaryReportItem.licencePlateNumber) &&
        Objects.equals(this.isDeleted, fleetSummaryReportItem.isDeleted) &&
        Objects.equals(this.permittedEmployees, fleetSummaryReportItem.permittedEmployees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDistanceMetersFiltered, totalDistanceMeters, totalRunningCostDollarsFiltered, totalRunningCostDollars, id, organisationId, name, costPerKilometer, make, model, year, licencePlateNumber, isDeleted, permittedEmployees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSFleetSummaryReportItem {\n");
    
    sb.append("    totalDistanceMetersFiltered: ").append(toIndentedString(totalDistanceMetersFiltered)).append("\n");
    sb.append("    totalDistanceMeters: ").append(toIndentedString(totalDistanceMeters)).append("\n");
    sb.append("    totalRunningCostDollarsFiltered: ").append(toIndentedString(totalRunningCostDollarsFiltered)).append("\n");
    sb.append("    totalRunningCostDollars: ").append(toIndentedString(totalRunningCostDollars)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    licencePlateNumber: ").append(toIndentedString(licencePlateNumber)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    permittedEmployees: ").append(toIndentedString(permittedEmployees)).append("\n");
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


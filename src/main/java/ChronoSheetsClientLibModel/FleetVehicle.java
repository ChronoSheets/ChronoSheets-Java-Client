/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
 * FleetVehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T19:40:40.863+10:00[Australia/Sydney]")
public class FleetVehicle {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "OrganisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private Integer organisationId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COST_PER_KILOMETER = "CostPerKilometer";
  @SerializedName(SERIALIZED_NAME_COST_PER_KILOMETER)
  private Double costPerKilometer;

  public static final String SERIALIZED_NAME_MAKE = "Make";
  @SerializedName(SERIALIZED_NAME_MAKE)
  private String make;

  public static final String SERIALIZED_NAME_MODEL = "Model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_YEAR = "Year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public static final String SERIALIZED_NAME_LICENCE_PLATE_NUMBER = "LicencePlateNumber";
  @SerializedName(SERIALIZED_NAME_LICENCE_PLATE_NUMBER)
  private String licencePlateNumber;

  public static final String SERIALIZED_NAME_IS_DELETED = "IsDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_PERMITTED_EMPLOYEES = "PermittedEmployees";
  @SerializedName(SERIALIZED_NAME_PERMITTED_EMPLOYEES)
  private List<Integer> permittedEmployees = null;


  public FleetVehicle id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public FleetVehicle organisationId(Integer organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }


  public FleetVehicle name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FleetVehicle costPerKilometer(Double costPerKilometer) {
    
    this.costPerKilometer = costPerKilometer;
    return this;
  }

   /**
   * Get costPerKilometer
   * @return costPerKilometer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCostPerKilometer() {
    return costPerKilometer;
  }


  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }


  public FleetVehicle make(String make) {
    
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMake() {
    return make;
  }


  public void setMake(String make) {
    this.make = make;
  }


  public FleetVehicle model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public FleetVehicle year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }


  public FleetVehicle licencePlateNumber(String licencePlateNumber) {
    
    this.licencePlateNumber = licencePlateNumber;
    return this;
  }

   /**
   * Get licencePlateNumber
   * @return licencePlateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }


  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }


  public FleetVehicle isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public FleetVehicle permittedEmployees(List<Integer> permittedEmployees) {
    
    this.permittedEmployees = permittedEmployees;
    return this;
  }

  public FleetVehicle addPermittedEmployeesItem(Integer permittedEmployeesItem) {
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
  @javax.annotation.Nullable
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
    FleetVehicle fleetVehicle = (FleetVehicle) o;
    return Objects.equals(this.id, fleetVehicle.id) &&
        Objects.equals(this.organisationId, fleetVehicle.organisationId) &&
        Objects.equals(this.name, fleetVehicle.name) &&
        Objects.equals(this.costPerKilometer, fleetVehicle.costPerKilometer) &&
        Objects.equals(this.make, fleetVehicle.make) &&
        Objects.equals(this.model, fleetVehicle.model) &&
        Objects.equals(this.year, fleetVehicle.year) &&
        Objects.equals(this.licencePlateNumber, fleetVehicle.licencePlateNumber) &&
        Objects.equals(this.isDeleted, fleetVehicle.isDeleted) &&
        Objects.equals(this.permittedEmployees, fleetVehicle.permittedEmployees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, name, costPerKilometer, make, model, year, licencePlateNumber, isDeleted, permittedEmployees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicle {\n");
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

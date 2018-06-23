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
import org.threeten.bp.OffsetDateTime;

/**
 * CsApiProject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:42:53.227+10:00")
public class CsApiProject {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ClientId")
  private Integer clientId = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("CostEstimation")
  private Double costEstimation = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  public CsApiProject id(Integer id) {
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

  public CsApiProject clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CsApiProject organisationId(Integer organisationId) {
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

  public CsApiProject projectName(String projectName) {
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

  public CsApiProject costEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
    return this;
  }

   /**
   * Get costEstimation
   * @return costEstimation
  **/
  @ApiModelProperty(value = "")
  public Double getCostEstimation() {
    return costEstimation;
  }

  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  public CsApiProject startDate(OffsetDateTime startDate) {
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

  public CsApiProject endDate(OffsetDateTime endDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiProject project = (CsApiProject) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.clientId, project.clientId) &&
        Objects.equals(this.organisationId, project.organisationId) &&
        Objects.equals(this.projectName, project.projectName) &&
        Objects.equals(this.costEstimation, project.costEstimation) &&
        Objects.equals(this.startDate, project.startDate) &&
        Objects.equals(this.endDate, project.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, organisationId, projectName, costEstimation, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiProject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    costEstimation: ").append(toIndentedString(costEstimation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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


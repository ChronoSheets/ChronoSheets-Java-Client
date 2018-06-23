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
 * CsApiSaveOrganisationGroupRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-24T02:33:30.704+10:00")
public class CsApiSaveOrganisationGroupRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public CsApiSaveOrganisationGroupRequest id(Integer id) {
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

  public CsApiSaveOrganisationGroupRequest organisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
    return this;
  }

   /**
   * Get organisationGroupName
   * @return organisationGroupName
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }

  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }

  public CsApiSaveOrganisationGroupRequest isDeleted(Boolean isDeleted) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiSaveOrganisationGroupRequest saveOrganisationGroupRequest = (CsApiSaveOrganisationGroupRequest) o;
    return Objects.equals(this.id, saveOrganisationGroupRequest.id) &&
        Objects.equals(this.organisationGroupName, saveOrganisationGroupRequest.organisationGroupName) &&
        Objects.equals(this.isDeleted, saveOrganisationGroupRequest.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationGroupName, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiSaveOrganisationGroupRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationGroupName: ").append(toIndentedString(organisationGroupName)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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


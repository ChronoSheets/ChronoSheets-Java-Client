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

/**
 * Fields used to save an OrganisationGroup
 */
@ApiModel(description = "Fields used to save an OrganisationGroup")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-18T19:20:43.284+10:00")
public class CSSaveOrganisationGroupRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public CSSaveOrganisationGroupRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Organisation Group you want to update/save
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Organisation Group you want to update/save")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSSaveOrganisationGroupRequest organisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
    return this;
  }

   /**
   * The updated name of the Organisation Group
   * @return organisationGroupName
  **/
  @ApiModelProperty(value = "The updated name of the Organisation Group")
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }

  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }

  public CSSaveOrganisationGroupRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether or not the Organisation Group is to be marked as deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Whether or not the Organisation Group is to be marked as deleted")
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
    CSSaveOrganisationGroupRequest saveOrganisationGroupRequest = (CSSaveOrganisationGroupRequest) o;
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
    sb.append("class CSSaveOrganisationGroupRequest {\n");
    
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


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
 * CSSetOrganisationGroupUsersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T20:29:53.876+10:00")
public class CSSetOrganisationGroupUsersRequest {
  @SerializedName("OrganisationGroupId")
  private Integer organisationGroupId = null;

  @SerializedName("CsvUserIds")
  private String csvUserIds = null;

  public CSSetOrganisationGroupUsersRequest organisationGroupId(Integer organisationGroupId) {
    this.organisationGroupId = organisationGroupId;
    return this;
  }

   /**
   * Get organisationGroupId
   * @return organisationGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationGroupId() {
    return organisationGroupId;
  }

  public void setOrganisationGroupId(Integer organisationGroupId) {
    this.organisationGroupId = organisationGroupId;
  }

  public CSSetOrganisationGroupUsersRequest csvUserIds(String csvUserIds) {
    this.csvUserIds = csvUserIds;
    return this;
  }

   /**
   * Get csvUserIds
   * @return csvUserIds
  **/
  @ApiModelProperty(value = "")
  public String getCsvUserIds() {
    return csvUserIds;
  }

  public void setCsvUserIds(String csvUserIds) {
    this.csvUserIds = csvUserIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSetOrganisationGroupUsersRequest setOrganisationGroupUsersRequest = (CSSetOrganisationGroupUsersRequest) o;
    return Objects.equals(this.organisationGroupId, setOrganisationGroupUsersRequest.organisationGroupId) &&
        Objects.equals(this.csvUserIds, setOrganisationGroupUsersRequest.csvUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationGroupId, csvUserIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSetOrganisationGroupUsersRequest {\n");
    
    sb.append("    organisationGroupId: ").append(toIndentedString(organisationGroupId)).append("\n");
    sb.append("    csvUserIds: ").append(toIndentedString(csvUserIds)).append("\n");
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


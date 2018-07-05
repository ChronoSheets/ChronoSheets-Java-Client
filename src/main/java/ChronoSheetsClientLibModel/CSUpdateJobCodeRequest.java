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
import java.util.ArrayList;
import java.util.List;

/**
 * CSUpdateJobCodeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T22:38:51.867+10:00")
public class CSUpdateJobCodeRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("ProjectId")
  private Integer projectId = null;

  @SerializedName("ClientId")
  private Integer clientId = null;

  @SerializedName("LinkedTaskIds")
  private List<Integer> linkedTaskIds = null;

  @SerializedName("LinkedOrgGroupIds")
  private List<Integer> linkedOrgGroupIds = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public CSUpdateJobCodeRequest id(Integer id) {
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

  public CSUpdateJobCodeRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CSUpdateJobCodeRequest projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public CSUpdateJobCodeRequest clientId(Integer clientId) {
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

  public CSUpdateJobCodeRequest linkedTaskIds(List<Integer> linkedTaskIds) {
    this.linkedTaskIds = linkedTaskIds;
    return this;
  }

  public CSUpdateJobCodeRequest addLinkedTaskIdsItem(Integer linkedTaskIdsItem) {
    if (this.linkedTaskIds == null) {
      this.linkedTaskIds = new ArrayList<Integer>();
    }
    this.linkedTaskIds.add(linkedTaskIdsItem);
    return this;
  }

   /**
   * Get linkedTaskIds
   * @return linkedTaskIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getLinkedTaskIds() {
    return linkedTaskIds;
  }

  public void setLinkedTaskIds(List<Integer> linkedTaskIds) {
    this.linkedTaskIds = linkedTaskIds;
  }

  public CSUpdateJobCodeRequest linkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
    return this;
  }

  public CSUpdateJobCodeRequest addLinkedOrgGroupIdsItem(Integer linkedOrgGroupIdsItem) {
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

  public CSUpdateJobCodeRequest isDeleted(Boolean isDeleted) {
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
    CSUpdateJobCodeRequest updateJobCodeRequest = (CSUpdateJobCodeRequest) o;
    return Objects.equals(this.id, updateJobCodeRequest.id) &&
        Objects.equals(this.code, updateJobCodeRequest.code) &&
        Objects.equals(this.projectId, updateJobCodeRequest.projectId) &&
        Objects.equals(this.clientId, updateJobCodeRequest.clientId) &&
        Objects.equals(this.linkedTaskIds, updateJobCodeRequest.linkedTaskIds) &&
        Objects.equals(this.linkedOrgGroupIds, updateJobCodeRequest.linkedOrgGroupIds) &&
        Objects.equals(this.isDeleted, updateJobCodeRequest.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, projectId, clientId, linkedTaskIds, linkedOrgGroupIds, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateJobCodeRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    linkedTaskIds: ").append(toIndentedString(linkedTaskIds)).append("\n");
    sb.append("    linkedOrgGroupIds: ").append(toIndentedString(linkedOrgGroupIds)).append("\n");
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


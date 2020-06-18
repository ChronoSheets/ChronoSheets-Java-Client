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
 * CSAggregateJobTask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-18T19:20:43.284+10:00")
public class CSAggregateJobTask {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Label")
  private String label = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public CSAggregateJobTask id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the task
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the task")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSAggregateJobTask label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label of the task
   * @return label
  **/
  @ApiModelProperty(value = "The label of the task")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CSAggregateJobTask isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A flag indicating that this task has been marked as deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "A flag indicating that this task has been marked as deleted")
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
    CSAggregateJobTask aggregateJobTask = (CSAggregateJobTask) o;
    return Objects.equals(this.id, aggregateJobTask.id) &&
        Objects.equals(this.label, aggregateJobTask.label) &&
        Objects.equals(this.isDeleted, aggregateJobTask.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSAggregateJobTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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


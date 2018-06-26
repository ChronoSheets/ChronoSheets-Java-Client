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
 * CSInsertTaskRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-27T00:07:52.261+10:00")
public class CSInsertTaskRequest {
  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("TripEnabled")
  private Boolean tripEnabled = null;

  public CSInsertTaskRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public CSInsertTaskRequest tripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
    return this;
  }

   /**
   * Get tripEnabled
   * @return tripEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isTripEnabled() {
    return tripEnabled;
  }

  public void setTripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertTaskRequest insertTaskRequest = (CSInsertTaskRequest) o;
    return Objects.equals(this.taskName, insertTaskRequest.taskName) &&
        Objects.equals(this.tripEnabled, insertTaskRequest.tripEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, tripEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertTaskRequest {\n");
    
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    tripEnabled: ").append(toIndentedString(tripEnabled)).append("\n");
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


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
import org.threeten.bp.OffsetDateTime;

/**
 * CsApiTaskSeriesReportItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T17:02:13.600+10:00")
public class CsApiTaskSeriesReportItem {
  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("TaskId")
  private Integer taskId = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

  public CsApiTaskSeriesReportItem startDate(OffsetDateTime startDate) {
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

  public CsApiTaskSeriesReportItem endDate(OffsetDateTime endDate) {
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

  public CsApiTaskSeriesReportItem taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public CsApiTaskSeriesReportItem taskName(String taskName) {
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

  public CsApiTaskSeriesReportItem spanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
    return this;
  }

   /**
   * Get spanSeconds
   * @return spanSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getSpanSeconds() {
    return spanSeconds;
  }

  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiTaskSeriesReportItem taskSeriesReportItem = (CsApiTaskSeriesReportItem) o;
    return Objects.equals(this.startDate, taskSeriesReportItem.startDate) &&
        Objects.equals(this.endDate, taskSeriesReportItem.endDate) &&
        Objects.equals(this.taskId, taskSeriesReportItem.taskId) &&
        Objects.equals(this.taskName, taskSeriesReportItem.taskName) &&
        Objects.equals(this.spanSeconds, taskSeriesReportItem.spanSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, taskId, taskName, spanSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiTaskSeriesReportItem {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    spanSeconds: ").append(toIndentedString(spanSeconds)).append("\n");
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


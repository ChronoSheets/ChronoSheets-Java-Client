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
import ChronoSheetsClientLibModel.Timesheet;
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
 * Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created
 */
@ApiModel(description = "Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T19:40:40.863+10:00[Australia/Sydney]")
public class BatchUpdateTimesheetRequest {
  public static final String SERIALIZED_NAME_TIMESHEETS = "Timesheets";
  @SerializedName(SERIALIZED_NAME_TIMESHEETS)
  private List<Timesheet> timesheets = null;


  public BatchUpdateTimesheetRequest timesheets(List<Timesheet> timesheets) {
    
    this.timesheets = timesheets;
    return this;
  }

  public BatchUpdateTimesheetRequest addTimesheetsItem(Timesheet timesheetsItem) {
    if (this.timesheets == null) {
      this.timesheets = new ArrayList<Timesheet>();
    }
    this.timesheets.add(timesheetsItem);
    return this;
  }

   /**
   * A collection of Timesheet objects to be either created or updated
   * @return timesheets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of Timesheet objects to be either created or updated")

  public List<Timesheet> getTimesheets() {
    return timesheets;
  }


  public void setTimesheets(List<Timesheet> timesheets) {
    this.timesheets = timesheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpdateTimesheetRequest batchUpdateTimesheetRequest = (BatchUpdateTimesheetRequest) o;
    return Objects.equals(this.timesheets, batchUpdateTimesheetRequest.timesheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpdateTimesheetRequest {\n");
    sb.append("    timesheets: ").append(toIndentedString(timesheets)).append("\n");
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


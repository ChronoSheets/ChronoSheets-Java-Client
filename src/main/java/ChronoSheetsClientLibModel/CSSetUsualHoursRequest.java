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
import ChronoSheetsClientLibModel.CSUsualHoursDay;
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
 * An object that can be used to set the Usual Hours (Rostered Hours) of an employee user account
 */
@ApiModel(description = "An object that can be used to set the Usual Hours (Rostered Hours) of an employee user account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSSetUsualHoursRequest {
  @SerializedName("UsualHoursData")
  private List<CSUsualHoursDay> usualHoursData = null;

  @SerializedName("UserId")
  private Integer userId = null;

  public CSSetUsualHoursRequest usualHoursData(List<CSUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
    return this;
  }

  public CSSetUsualHoursRequest addUsualHoursDataItem(CSUsualHoursDay usualHoursDataItem) {
    if (this.usualHoursData == null) {
      this.usualHoursData = new ArrayList<CSUsualHoursDay>();
    }
    this.usualHoursData.add(usualHoursDataItem);
    return this;
  }

   /**
   * A Collection of days (Mon-Sun) with updated Roster timeslots
   * @return usualHoursData
  **/
  @ApiModelProperty(value = "A Collection of days (Mon-Sun) with updated Roster timeslots")
  public List<CSUsualHoursDay> getUsualHoursData() {
    return usualHoursData;
  }

  public void setUsualHoursData(List<CSUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
  }

  public CSSetUsualHoursRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The Id of the User that these updated Rostered Hours will be applied to
   * @return userId
  **/
  @ApiModelProperty(value = "The Id of the User that these updated Rostered Hours will be applied to")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSetUsualHoursRequest setUsualHoursRequest = (CSSetUsualHoursRequest) o;
    return Objects.equals(this.usualHoursData, setUsualHoursRequest.usualHoursData) &&
        Objects.equals(this.userId, setUsualHoursRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualHoursData, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSetUsualHoursRequest {\n");
    
    sb.append("    usualHoursData: ").append(toIndentedString(usualHoursData)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


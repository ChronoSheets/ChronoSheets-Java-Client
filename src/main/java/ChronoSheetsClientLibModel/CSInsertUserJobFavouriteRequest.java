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
 * Used to mark a JobCode as a Favourite.  Favourites can be used in the Mobile app and on the ChronoSheets website
 */
@ApiModel(description = "Used to mark a JobCode as a Favourite.  Favourites can be used in the Mobile app and on the ChronoSheets website")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T19:28:27.850+10:00")
public class CSInsertUserJobFavouriteRequest {
  @SerializedName("JobId")
  private Integer jobId = null;

  public CSInsertUserJobFavouriteRequest jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The Id of the JobCode that is being marked as a favourite
   * @return jobId
  **/
  @ApiModelProperty(value = "The Id of the JobCode that is being marked as a favourite")
  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertUserJobFavouriteRequest insertUserJobFavouriteRequest = (CSInsertUserJobFavouriteRequest) o;
    return Objects.equals(this.jobId, insertUserJobFavouriteRequest.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertUserJobFavouriteRequest {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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


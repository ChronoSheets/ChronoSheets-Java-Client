/*
 * The ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  </p>  <p>      First Steps:       <ol>          <li>Make sure you've <a href='/HomeV2/App/sign-up'>signed up to ChronoSheets</a> to get yourself a user account</li>          <li>Confirm your account by following the link sent to your email address.  This will activate your account</li>          <li>Use your username and password to obtain an Auth Token by using the DoLogin method inside the UserProfile section below.  Use the Auth Token as an argument to the other methods</li>          <li>Try different methods in the API Playground to learn about the API</li>          <li>If you're stuck, try the full getting started guide on the <a href='/Home/ApiDocs'>API Toolkit</a> page.</li>      </ol>  </p>  <p>      Further Steps:       <ul>          <li>Create a mobile app (iOS, Android or Windows) using one of the ChronoSheets Mobile SDKs</li>          <li>Create a custom integration with your app using one of the ChronoSheets API Client Libraries.</li>      </ul>      Read more about the API Toolkit on the <a href='/Home/ApiDocs'>API Toolkit</a> page.  </p></div>
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
import org.threeten.bp.OffsetDateTime;

/**
 * Fields for inserting a new set of Pay Rates for a user.  Archiving of the previous Pay Rate is done for you automatically
 */
@ApiModel(description = "Fields for inserting a new set of Pay Rates for a user.  Archiving of the previous Pay Rate is done for you automatically")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T17:56:39.742+10:00")
public class CSInsertUserHourlyRateRequest {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("HourlyRate")
  private Double hourlyRate = null;

  @SerializedName("HourlyOvertimeRate")
  private Double hourlyOvertimeRate = null;

  @SerializedName("CurrentDate")
  private OffsetDateTime currentDate = null;

  public CSInsertUserHourlyRateRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The Id of the User that is getting the new set of Pay Rates
   * @return userId
  **/
  @ApiModelProperty(value = "The Id of the User that is getting the new set of Pay Rates")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CSInsertUserHourlyRateRequest hourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
    return this;
  }

   /**
   * The Hourly Rate the employee should receive during their usual rostered hours
   * @return hourlyRate
  **/
  @ApiModelProperty(value = "The Hourly Rate the employee should receive during their usual rostered hours")
  public Double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public CSInsertUserHourlyRateRequest hourlyOvertimeRate(Double hourlyOvertimeRate) {
    this.hourlyOvertimeRate = hourlyOvertimeRate;
    return this;
  }

   /**
   * The Hourly Rate the employee should receive during outside of their usual rostered hours
   * @return hourlyOvertimeRate
  **/
  @ApiModelProperty(value = "The Hourly Rate the employee should receive during outside of their usual rostered hours")
  public Double getHourlyOvertimeRate() {
    return hourlyOvertimeRate;
  }

  public void setHourlyOvertimeRate(Double hourlyOvertimeRate) {
    this.hourlyOvertimeRate = hourlyOvertimeRate;
  }

  public CSInsertUserHourlyRateRequest currentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
    return this;
  }

   /**
   * The current date time
   * @return currentDate
  **/
  @ApiModelProperty(value = "The current date time")
  public OffsetDateTime getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertUserHourlyRateRequest insertUserHourlyRateRequest = (CSInsertUserHourlyRateRequest) o;
    return Objects.equals(this.userId, insertUserHourlyRateRequest.userId) &&
        Objects.equals(this.hourlyRate, insertUserHourlyRateRequest.hourlyRate) &&
        Objects.equals(this.hourlyOvertimeRate, insertUserHourlyRateRequest.hourlyOvertimeRate) &&
        Objects.equals(this.currentDate, insertUserHourlyRateRequest.currentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hourlyRate, hourlyOvertimeRate, currentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertUserHourlyRateRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    hourlyRate: ").append(toIndentedString(hourlyRate)).append("\n");
    sb.append("    hourlyOvertimeRate: ").append(toIndentedString(hourlyOvertimeRate)).append("\n");
    sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
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


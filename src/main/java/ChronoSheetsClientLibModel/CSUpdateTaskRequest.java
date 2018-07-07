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

/**
 * Fields used to update a Task
 */
@ApiModel(description = "Fields used to update a Task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T17:56:39.742+10:00")
public class CSUpdateTaskRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  @SerializedName("TripEnabled")
  private Boolean tripEnabled = null;

  public CSUpdateTaskRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Task that is to be updated
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Task that is to be updated")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSUpdateTaskRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * The updated Task Name
   * @return taskName
  **/
  @ApiModelProperty(value = "The updated Task Name")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public CSUpdateTaskRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether or not this Task should be marked as deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Whether or not this Task should be marked as deleted")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CSUpdateTaskRequest tripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
    return this;
  }

   /**
   * Whether or not this Task should have GPS Trip Recording enabled
   * @return tripEnabled
  **/
  @ApiModelProperty(value = "Whether or not this Task should have GPS Trip Recording enabled")
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
    CSUpdateTaskRequest updateTaskRequest = (CSUpdateTaskRequest) o;
    return Objects.equals(this.id, updateTaskRequest.id) &&
        Objects.equals(this.taskName, updateTaskRequest.taskName) &&
        Objects.equals(this.isDeleted, updateTaskRequest.isDeleted) &&
        Objects.equals(this.tripEnabled, updateTaskRequest.tripEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, isDeleted, tripEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateTaskRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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


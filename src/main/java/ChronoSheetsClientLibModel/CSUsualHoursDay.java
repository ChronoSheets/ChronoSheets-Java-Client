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
import ChronoSheetsClientLibModel.CSTimeSlot;
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
 * CSUsualHoursDay
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T17:56:39.742+10:00")
public class CSUsualHoursDay {
  /**
   * Specify which day this collection of Roster timeslots is for (Monday-Sunday)
   */
  @JsonAdapter(DayTypeEnum.Adapter.class)
  public enum DayTypeEnum {
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday"),
    
    SUNDAY("Sunday");

    private String value;

    DayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayTypeEnum fromValue(String text) {
      for (DayTypeEnum b : DayTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DayType")
  private DayTypeEnum dayType = null;

  @SerializedName("TimeSlots")
  private List<CSTimeSlot> timeSlots = null;

  @SerializedName("DeleteUsualHours")
  private List<Integer> deleteUsualHours = null;

  public CSUsualHoursDay dayType(DayTypeEnum dayType) {
    this.dayType = dayType;
    return this;
  }

   /**
   * Specify which day this collection of Roster timeslots is for (Monday-Sunday)
   * @return dayType
  **/
  @ApiModelProperty(value = "Specify which day this collection of Roster timeslots is for (Monday-Sunday)")
  public DayTypeEnum getDayType() {
    return dayType;
  }

  public void setDayType(DayTypeEnum dayType) {
    this.dayType = dayType;
  }

  public CSUsualHoursDay timeSlots(List<CSTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }

  public CSUsualHoursDay addTimeSlotsItem(CSTimeSlot timeSlotsItem) {
    if (this.timeSlots == null) {
      this.timeSlots = new ArrayList<CSTimeSlot>();
    }
    this.timeSlots.add(timeSlotsItem);
    return this;
  }

   /**
   * A collection of TimeSlots within this day
   * @return timeSlots
  **/
  @ApiModelProperty(value = "A collection of TimeSlots within this day")
  public List<CSTimeSlot> getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(List<CSTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  public CSUsualHoursDay deleteUsualHours(List<Integer> deleteUsualHours) {
    this.deleteUsualHours = deleteUsualHours;
    return this;
  }

  public CSUsualHoursDay addDeleteUsualHoursItem(Integer deleteUsualHoursItem) {
    if (this.deleteUsualHours == null) {
      this.deleteUsualHours = new ArrayList<Integer>();
    }
    this.deleteUsualHours.add(deleteUsualHoursItem);
    return this;
  }

   /**
   * Mark here which existing UsualHours are to be deleted
   * @return deleteUsualHours
  **/
  @ApiModelProperty(value = "Mark here which existing UsualHours are to be deleted")
  public List<Integer> getDeleteUsualHours() {
    return deleteUsualHours;
  }

  public void setDeleteUsualHours(List<Integer> deleteUsualHours) {
    this.deleteUsualHours = deleteUsualHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUsualHoursDay usualHoursDay = (CSUsualHoursDay) o;
    return Objects.equals(this.dayType, usualHoursDay.dayType) &&
        Objects.equals(this.timeSlots, usualHoursDay.timeSlots) &&
        Objects.equals(this.deleteUsualHours, usualHoursDay.deleteUsualHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayType, timeSlots, deleteUsualHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUsualHoursDay {\n");
    
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    deleteUsualHours: ").append(toIndentedString(deleteUsualHours)).append("\n");
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


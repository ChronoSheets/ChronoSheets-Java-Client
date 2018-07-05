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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T22:38:51.867+10:00")
public class CSUsualHoursDay {
  /**
   * Gets or Sets dayType
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
   * Get dayType
   * @return dayType
  **/
  @ApiModelProperty(value = "")
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
   * Get timeSlots
   * @return timeSlots
  **/
  @ApiModelProperty(value = "")
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
   * Get deleteUsualHours
   * @return deleteUsualHours
  **/
  @ApiModelProperty(value = "")
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


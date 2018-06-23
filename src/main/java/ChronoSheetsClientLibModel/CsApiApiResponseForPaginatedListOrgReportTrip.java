/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import ChronoSheetsClientLibModel.CsApiOrgReportTrip;
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
 * CsApiApiResponseForPaginatedListOrgReportTrip
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:45:21.699+10:00")
public class CsApiApiResponseForPaginatedListOrgReportTrip {
  @SerializedName("TotalSetCount")
  private Integer totalSetCount = null;

  @SerializedName("Data")
  private List<CsApiOrgReportTrip> data = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("Succeeded"),
    
    FATALEXCEPTION("FatalException"),
    
    GENERALERROR("GeneralError"),
    
    VALIDATIONERROR("ValidationError"),
    
    UNAUTHORIZED("UnAuthorized"),
    
    SESSIONEXPIRED("SessionExpired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("Message")
  private String message = null;

  public CsApiApiResponseForPaginatedListOrgReportTrip totalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
    return this;
  }

   /**
   * Get totalSetCount
   * @return totalSetCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalSetCount() {
    return totalSetCount;
  }

  public void setTotalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
  }

  public CsApiApiResponseForPaginatedListOrgReportTrip data(List<CsApiOrgReportTrip> data) {
    this.data = data;
    return this;
  }

  public CsApiApiResponseForPaginatedListOrgReportTrip addDataItem(CsApiOrgReportTrip dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CsApiOrgReportTrip>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<CsApiOrgReportTrip> getData() {
    return data;
  }

  public void setData(List<CsApiOrgReportTrip> data) {
    this.data = data;
  }

  public CsApiApiResponseForPaginatedListOrgReportTrip status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CsApiApiResponseForPaginatedListOrgReportTrip message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiApiResponseForPaginatedListOrgReportTrip apiResponseForPaginatedListOrgReportTrip = (CsApiApiResponseForPaginatedListOrgReportTrip) o;
    return Objects.equals(this.totalSetCount, apiResponseForPaginatedListOrgReportTrip.totalSetCount) &&
        Objects.equals(this.data, apiResponseForPaginatedListOrgReportTrip.data) &&
        Objects.equals(this.status, apiResponseForPaginatedListOrgReportTrip.status) &&
        Objects.equals(this.message, apiResponseForPaginatedListOrgReportTrip.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSetCount, data, status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiApiResponseForPaginatedListOrgReportTrip {\n");
    
    sb.append("    totalSetCount: ").append(toIndentedString(totalSetCount)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


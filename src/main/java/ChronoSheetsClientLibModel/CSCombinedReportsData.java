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
import ChronoSheetsClientLibModel.CSClientSeriesReportItem;
import ChronoSheetsClientLibModel.CSClientTotalsReportItem;
import ChronoSheetsClientLibModel.CSJobSeriesReportItem;
import ChronoSheetsClientLibModel.CSJobTotalsReportItem;
import ChronoSheetsClientLibModel.CSProjectSeriesReportItem;
import ChronoSheetsClientLibModel.CSProjectTotalsReportItem;
import ChronoSheetsClientLibModel.CSTaskSeriesReportItem;
import ChronoSheetsClientLibModel.CSTaskTotalsReportItem;
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
 * CSCombinedReportsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T23:19:15.777+10:00")
public class CSCombinedReportsData {
  @SerializedName("SeriesJobCodes")
  private List<CSJobSeriesReportItem> seriesJobCodes = null;

  @SerializedName("SeriesTasks")
  private List<CSTaskSeriesReportItem> seriesTasks = null;

  @SerializedName("SeriesClients")
  private List<CSClientSeriesReportItem> seriesClients = null;

  @SerializedName("SeriesProjects")
  private List<CSProjectSeriesReportItem> seriesProjects = null;

  @SerializedName("TotalsJobCodes")
  private List<CSJobTotalsReportItem> totalsJobCodes = null;

  @SerializedName("TotalsTasks")
  private List<CSTaskTotalsReportItem> totalsTasks = null;

  @SerializedName("TotalsClients")
  private List<CSClientTotalsReportItem> totalsClients = null;

  @SerializedName("TotalsProjects")
  private List<CSProjectTotalsReportItem> totalsProjects = null;

  public CSCombinedReportsData seriesJobCodes(List<CSJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
    return this;
  }

  public CSCombinedReportsData addSeriesJobCodesItem(CSJobSeriesReportItem seriesJobCodesItem) {
    if (this.seriesJobCodes == null) {
      this.seriesJobCodes = new ArrayList<CSJobSeriesReportItem>();
    }
    this.seriesJobCodes.add(seriesJobCodesItem);
    return this;
  }

   /**
   * Get seriesJobCodes
   * @return seriesJobCodes
  **/
  @ApiModelProperty(value = "")
  public List<CSJobSeriesReportItem> getSeriesJobCodes() {
    return seriesJobCodes;
  }

  public void setSeriesJobCodes(List<CSJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
  }

  public CSCombinedReportsData seriesTasks(List<CSTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
    return this;
  }

  public CSCombinedReportsData addSeriesTasksItem(CSTaskSeriesReportItem seriesTasksItem) {
    if (this.seriesTasks == null) {
      this.seriesTasks = new ArrayList<CSTaskSeriesReportItem>();
    }
    this.seriesTasks.add(seriesTasksItem);
    return this;
  }

   /**
   * Get seriesTasks
   * @return seriesTasks
  **/
  @ApiModelProperty(value = "")
  public List<CSTaskSeriesReportItem> getSeriesTasks() {
    return seriesTasks;
  }

  public void setSeriesTasks(List<CSTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
  }

  public CSCombinedReportsData seriesClients(List<CSClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
    return this;
  }

  public CSCombinedReportsData addSeriesClientsItem(CSClientSeriesReportItem seriesClientsItem) {
    if (this.seriesClients == null) {
      this.seriesClients = new ArrayList<CSClientSeriesReportItem>();
    }
    this.seriesClients.add(seriesClientsItem);
    return this;
  }

   /**
   * Get seriesClients
   * @return seriesClients
  **/
  @ApiModelProperty(value = "")
  public List<CSClientSeriesReportItem> getSeriesClients() {
    return seriesClients;
  }

  public void setSeriesClients(List<CSClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
  }

  public CSCombinedReportsData seriesProjects(List<CSProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
    return this;
  }

  public CSCombinedReportsData addSeriesProjectsItem(CSProjectSeriesReportItem seriesProjectsItem) {
    if (this.seriesProjects == null) {
      this.seriesProjects = new ArrayList<CSProjectSeriesReportItem>();
    }
    this.seriesProjects.add(seriesProjectsItem);
    return this;
  }

   /**
   * Get seriesProjects
   * @return seriesProjects
  **/
  @ApiModelProperty(value = "")
  public List<CSProjectSeriesReportItem> getSeriesProjects() {
    return seriesProjects;
  }

  public void setSeriesProjects(List<CSProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
  }

  public CSCombinedReportsData totalsJobCodes(List<CSJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
    return this;
  }

  public CSCombinedReportsData addTotalsJobCodesItem(CSJobTotalsReportItem totalsJobCodesItem) {
    if (this.totalsJobCodes == null) {
      this.totalsJobCodes = new ArrayList<CSJobTotalsReportItem>();
    }
    this.totalsJobCodes.add(totalsJobCodesItem);
    return this;
  }

   /**
   * Get totalsJobCodes
   * @return totalsJobCodes
  **/
  @ApiModelProperty(value = "")
  public List<CSJobTotalsReportItem> getTotalsJobCodes() {
    return totalsJobCodes;
  }

  public void setTotalsJobCodes(List<CSJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
  }

  public CSCombinedReportsData totalsTasks(List<CSTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
    return this;
  }

  public CSCombinedReportsData addTotalsTasksItem(CSTaskTotalsReportItem totalsTasksItem) {
    if (this.totalsTasks == null) {
      this.totalsTasks = new ArrayList<CSTaskTotalsReportItem>();
    }
    this.totalsTasks.add(totalsTasksItem);
    return this;
  }

   /**
   * Get totalsTasks
   * @return totalsTasks
  **/
  @ApiModelProperty(value = "")
  public List<CSTaskTotalsReportItem> getTotalsTasks() {
    return totalsTasks;
  }

  public void setTotalsTasks(List<CSTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
  }

  public CSCombinedReportsData totalsClients(List<CSClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
    return this;
  }

  public CSCombinedReportsData addTotalsClientsItem(CSClientTotalsReportItem totalsClientsItem) {
    if (this.totalsClients == null) {
      this.totalsClients = new ArrayList<CSClientTotalsReportItem>();
    }
    this.totalsClients.add(totalsClientsItem);
    return this;
  }

   /**
   * Get totalsClients
   * @return totalsClients
  **/
  @ApiModelProperty(value = "")
  public List<CSClientTotalsReportItem> getTotalsClients() {
    return totalsClients;
  }

  public void setTotalsClients(List<CSClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
  }

  public CSCombinedReportsData totalsProjects(List<CSProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
    return this;
  }

  public CSCombinedReportsData addTotalsProjectsItem(CSProjectTotalsReportItem totalsProjectsItem) {
    if (this.totalsProjects == null) {
      this.totalsProjects = new ArrayList<CSProjectTotalsReportItem>();
    }
    this.totalsProjects.add(totalsProjectsItem);
    return this;
  }

   /**
   * Get totalsProjects
   * @return totalsProjects
  **/
  @ApiModelProperty(value = "")
  public List<CSProjectTotalsReportItem> getTotalsProjects() {
    return totalsProjects;
  }

  public void setTotalsProjects(List<CSProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSCombinedReportsData combinedReportsData = (CSCombinedReportsData) o;
    return Objects.equals(this.seriesJobCodes, combinedReportsData.seriesJobCodes) &&
        Objects.equals(this.seriesTasks, combinedReportsData.seriesTasks) &&
        Objects.equals(this.seriesClients, combinedReportsData.seriesClients) &&
        Objects.equals(this.seriesProjects, combinedReportsData.seriesProjects) &&
        Objects.equals(this.totalsJobCodes, combinedReportsData.totalsJobCodes) &&
        Objects.equals(this.totalsTasks, combinedReportsData.totalsTasks) &&
        Objects.equals(this.totalsClients, combinedReportsData.totalsClients) &&
        Objects.equals(this.totalsProjects, combinedReportsData.totalsProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seriesJobCodes, seriesTasks, seriesClients, seriesProjects, totalsJobCodes, totalsTasks, totalsClients, totalsProjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSCombinedReportsData {\n");
    
    sb.append("    seriesJobCodes: ").append(toIndentedString(seriesJobCodes)).append("\n");
    sb.append("    seriesTasks: ").append(toIndentedString(seriesTasks)).append("\n");
    sb.append("    seriesClients: ").append(toIndentedString(seriesClients)).append("\n");
    sb.append("    seriesProjects: ").append(toIndentedString(seriesProjects)).append("\n");
    sb.append("    totalsJobCodes: ").append(toIndentedString(totalsJobCodes)).append("\n");
    sb.append("    totalsTasks: ").append(toIndentedString(totalsTasks)).append("\n");
    sb.append("    totalsClients: ").append(toIndentedString(totalsClients)).append("\n");
    sb.append("    totalsProjects: ").append(toIndentedString(totalsProjects)).append("\n");
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


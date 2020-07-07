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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrganisationPricingPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-07T23:33:39.490+10:00[Australia/Sydney]")
public class OrganisationPricingPlan {
  public static final String SERIALIZED_NAME_PLAN_ID = "PlanId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;


  public OrganisationPricingPlan planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public OrganisationPricingPlan quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationPricingPlan organisationPricingPlan = (OrganisationPricingPlan) o;
    return Objects.equals(this.planId, organisationPricingPlan.planId) &&
        Objects.equals(this.quantity, organisationPricingPlan.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationPricingPlan {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


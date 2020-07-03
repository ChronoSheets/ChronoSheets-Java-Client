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


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiCallback;
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.ApiResponse;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.Pair;
import ChronoSheetsClient.ProgressRequestBody;
import ChronoSheetsClient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ChronoSheetsClientLibModel.ApiResponseBoolean;
import ChronoSheetsClientLibModel.ApiResponseInt32;
import ChronoSheetsClientLibModel.ApiResponseListInt32;
import ChronoSheetsClientLibModel.ApiResponseListTimesheet;
import ChronoSheetsClientLibModel.BatchUpdateTimesheetRequest;
import org.threeten.bp.OffsetDateTime;
import ChronoSheetsClientLibModel.Timesheet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimesheetsApi {
    private ApiClient localVarApiClient;

    public TimesheetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimesheetsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for timesheetsCreateSingleTimesheet
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsCreateSingleTimesheetCall(String xChronosheetsAuth, Timesheet request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Timesheets/CreateSingleTimesheet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timesheetsCreateSingleTimesheetValidateBeforeCall(String xChronosheetsAuth, Timesheet request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsCreateSingleTimesheet(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling timesheetsCreateSingleTimesheet(Async)");
        }
        

        okhttp3.Call localVarCall = timesheetsCreateSingleTimesheetCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @return ApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseInt32 timesheetsCreateSingleTimesheet(String xChronosheetsAuth, Timesheet request) throws ApiException {
        ApiResponse<ApiResponseInt32> localVarResp = timesheetsCreateSingleTimesheetWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @return ApiResponse&lt;ApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseInt32> timesheetsCreateSingleTimesheetWithHttpInfo(String xChronosheetsAuth, Timesheet request) throws ApiException {
        okhttp3.Call localVarCall = timesheetsCreateSingleTimesheetValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsCreateSingleTimesheetAsync(String xChronosheetsAuth, Timesheet request, final ApiCallback<ApiResponseInt32> _callback) throws ApiException {

        okhttp3.Call localVarCall = timesheetsCreateSingleTimesheetValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for timesheetsDeleteTimesheet
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsDeleteTimesheetCall(Integer timesheetId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Timesheets/DeleteTimesheet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (timesheetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("TimesheetId", timesheetId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timesheetsDeleteTimesheetValidateBeforeCall(Integer timesheetId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'timesheetId' is set
        if (timesheetId == null) {
            throw new ApiException("Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet(Async)");
        }
        

        okhttp3.Call localVarCall = timesheetsDeleteTimesheetCall(timesheetId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseBoolean timesheetsDeleteTimesheet(Integer timesheetId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseBoolean> localVarResp = timesheetsDeleteTimesheetWithHttpInfo(timesheetId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseBoolean> timesheetsDeleteTimesheetWithHttpInfo(Integer timesheetId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = timesheetsDeleteTimesheetValidateBeforeCall(timesheetId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsDeleteTimesheetAsync(Integer timesheetId, String xChronosheetsAuth, final ApiCallback<ApiResponseBoolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = timesheetsDeleteTimesheetValidateBeforeCall(timesheetId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for timesheetsGetTimesheets
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsGetTimesheetsCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Timesheets/GetTimesheets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("StartDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("EndDate", endDate));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timesheetsGetTimesheetsValidateBeforeCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling timesheetsGetTimesheets(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling timesheetsGetTimesheets(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsGetTimesheets(Async)");
        }
        

        okhttp3.Call localVarCall = timesheetsGetTimesheetsCall(startDate, endDate, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseListTimesheet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListTimesheet timesheetsGetTimesheets(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseListTimesheet> localVarResp = timesheetsGetTimesheetsWithHttpInfo(startDate, endDate, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseListTimesheet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListTimesheet> timesheetsGetTimesheetsWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = timesheetsGetTimesheetsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseListTimesheet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsGetTimesheetsAsync(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ApiCallback<ApiResponseListTimesheet> _callback) throws ApiException {

        okhttp3.Call localVarCall = timesheetsGetTimesheetsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListTimesheet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for timesheetsUpdateTimesheets
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create or update.  If the timesheet Id is specified, then an update will be performed, else the timesheet record will be created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsUpdateTimesheetsCall(String xChronosheetsAuth, BatchUpdateTimesheetRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Timesheets/UpdateTimesheets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timesheetsUpdateTimesheetsValidateBeforeCall(String xChronosheetsAuth, BatchUpdateTimesheetRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling timesheetsUpdateTimesheets(Async)");
        }
        

        okhttp3.Call localVarCall = timesheetsUpdateTimesheetsCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create or update.  If the timesheet Id is specified, then an update will be performed, else the timesheet record will be created. (required)
     * @return ApiResponseListInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListInt32 timesheetsUpdateTimesheets(String xChronosheetsAuth, BatchUpdateTimesheetRequest request) throws ApiException {
        ApiResponse<ApiResponseListInt32> localVarResp = timesheetsUpdateTimesheetsWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create or update.  If the timesheet Id is specified, then an update will be performed, else the timesheet record will be created. (required)
     * @return ApiResponse&lt;ApiResponseListInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListInt32> timesheetsUpdateTimesheetsWithHttpInfo(String xChronosheetsAuth, BatchUpdateTimesheetRequest request) throws ApiException {
        okhttp3.Call localVarCall = timesheetsUpdateTimesheetsValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseListInt32>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create or update.  If the timesheet Id is specified, then an update will be performed, else the timesheet record will be created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timesheetsUpdateTimesheetsAsync(String xChronosheetsAuth, BatchUpdateTimesheetRequest request, final ApiCallback<ApiResponseListInt32> _callback) throws ApiException {

        okhttp3.Call localVarCall = timesheetsUpdateTimesheetsValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListInt32>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

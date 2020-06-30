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


import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSCreateAutomationStepRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimesheetAutomationApi {
    private ApiClient apiClient;

    public TimesheetAutomationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimesheetAutomationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for timesheetAutomationCreateAutomationStep
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetAutomationCreateAutomationStepCall(CSCreateAutomationStepRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/TimesheetAutomation/CreateAutomationStep";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null)
        localVarHeaderParams.put("x-chronosheets-auth", apiClient.parameterToString(xChronosheetsAuth));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call timesheetAutomationCreateAutomationStepValidateBeforeCall(CSCreateAutomationStepRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling timesheetAutomationCreateAutomationStep(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetAutomationCreateAutomationStep(Async)");
        }
        

        com.squareup.okhttp.Call call = timesheetAutomationCreateAutomationStepCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseInt32 timesheetAutomationCreateAutomationStep(CSCreateAutomationStepRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseInt32> resp = timesheetAutomationCreateAutomationStepWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseInt32> timesheetAutomationCreateAutomationStepWithHttpInfo(CSCreateAutomationStepRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = timesheetAutomationCreateAutomationStepValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseInt32>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetAutomationCreateAutomationStepAsync(CSCreateAutomationStepRequest request, String xChronosheetsAuth, final ApiCallback<CSApiResponseInt32> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = timesheetAutomationCreateAutomationStepValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseInt32>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for timesheetAutomationGetTimesheetAutomationAuditTrail
     * @param geofenceId The ID of the Geofence (required)
     * @param userId  (required)
     * @param sort  (required)
     * @param order  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many records (optional)
     * @param take Take this many records (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetAutomationGetTimesheetAutomationAuditTrailCall(Integer geofenceId, Integer userId, String sort, String order, String xChronosheetsAuth, Integer skip, Integer take, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/TimesheetAutomation/GetTimesheetAutomationAuditTrail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (geofenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GeofenceId", geofenceId));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Sort", sort));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Order", order));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Take", take));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null)
        localVarHeaderParams.put("x-chronosheets-auth", apiClient.parameterToString(xChronosheetsAuth));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call timesheetAutomationGetTimesheetAutomationAuditTrailValidateBeforeCall(Integer geofenceId, Integer userId, String sort, String order, String xChronosheetsAuth, Integer skip, Integer take, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'geofenceId' is set
        if (geofenceId == null) {
            throw new ApiException("Missing the required parameter 'geofenceId' when calling timesheetAutomationGetTimesheetAutomationAuditTrail(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling timesheetAutomationGetTimesheetAutomationAuditTrail(Async)");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new ApiException("Missing the required parameter 'sort' when calling timesheetAutomationGetTimesheetAutomationAuditTrail(Async)");
        }
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException("Missing the required parameter 'order' when calling timesheetAutomationGetTimesheetAutomationAuditTrail(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetAutomationGetTimesheetAutomationAuditTrail(Async)");
        }
        

        com.squareup.okhttp.Call call = timesheetAutomationGetTimesheetAutomationAuditTrailCall(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.
     * 
     * @param geofenceId The ID of the Geofence (required)
     * @param userId  (required)
     * @param sort  (required)
     * @param order  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many records (optional)
     * @param take Take this many records (optional)
     * @return CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence timesheetAutomationGetTimesheetAutomationAuditTrail(Integer geofenceId, Integer userId, String sort, String order, String xChronosheetsAuth, Integer skip, Integer take) throws ApiException {
        ApiResponse<CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence> resp = timesheetAutomationGetTimesheetAutomationAuditTrailWithHttpInfo(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take);
        return resp.getData();
    }

    /**
     * Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.
     * 
     * @param geofenceId The ID of the Geofence (required)
     * @param userId  (required)
     * @param sort  (required)
     * @param order  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many records (optional)
     * @param take Take this many records (optional)
     * @return ApiResponse&lt;CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence> timesheetAutomationGetTimesheetAutomationAuditTrailWithHttpInfo(Integer geofenceId, Integer userId, String sort, String order, String xChronosheetsAuth, Integer skip, Integer take) throws ApiException {
        com.squareup.okhttp.Call call = timesheetAutomationGetTimesheetAutomationAuditTrailValidateBeforeCall(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission. (asynchronously)
     * 
     * @param geofenceId The ID of the Geofence (required)
     * @param userId  (required)
     * @param sort  (required)
     * @param order  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many records (optional)
     * @param take Take this many records (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetAutomationGetTimesheetAutomationAuditTrailAsync(Integer geofenceId, Integer userId, String sort, String order, String xChronosheetsAuth, Integer skip, Integer take, final ApiCallback<CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = timesheetAutomationGetTimesheetAutomationAuditTrailValidateBeforeCall(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

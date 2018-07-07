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


import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseListInt32;
import ChronoSheetsClientLibModel.CSApiResponseListTimesheet;
import ChronoSheetsClientLibModel.CSBatchUpdateTimesheetRequest;
import ChronoSheetsClientLibModel.CSTimesheet;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimesheetsApi {
    private ApiClient apiClient;

    public TimesheetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimesheetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for timesheetsCreateSingleTimesheet
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetsCreateSingleTimesheetCall(CSTimesheet request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Timesheets/CreateSingleTimesheet";

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call timesheetsCreateSingleTimesheetValidateBeforeCall(CSTimesheet request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling timesheetsCreateSingleTimesheet(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsCreateSingleTimesheet(Async)");
        }
        

        com.squareup.okhttp.Call call = timesheetsCreateSingleTimesheetCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseInt32 timesheetsCreateSingleTimesheet(CSTimesheet request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseInt32> resp = timesheetsCreateSingleTimesheetWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseInt32> timesheetsCreateSingleTimesheetWithHttpInfo(CSTimesheet request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = timesheetsCreateSingleTimesheetValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseInt32>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param request A Timesheet Request object containing values for the new Timesheet to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetsCreateSingleTimesheetAsync(CSTimesheet request, String xChronosheetsAuth, final ApiCallback<CSApiResponseInt32> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = timesheetsCreateSingleTimesheetValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseInt32>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for timesheetsDeleteTimesheet
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetsDeleteTimesheetCall(Integer timesheetId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Timesheets/DeleteTimesheet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (timesheetId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("TimesheetId", timesheetId));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call timesheetsDeleteTimesheetValidateBeforeCall(Integer timesheetId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'timesheetId' is set
        if (timesheetId == null) {
            throw new ApiException("Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet(Async)");
        }
        

        com.squareup.okhttp.Call call = timesheetsDeleteTimesheetCall(timesheetId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseBoolean timesheetsDeleteTimesheet(Integer timesheetId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseBoolean> resp = timesheetsDeleteTimesheetWithHttpInfo(timesheetId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseBoolean> timesheetsDeleteTimesheetWithHttpInfo(Integer timesheetId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = timesheetsDeleteTimesheetValidateBeforeCall(timesheetId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param timesheetId The ID of the Timesheet you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetsDeleteTimesheetAsync(Integer timesheetId, String xChronosheetsAuth, final ApiCallback<CSApiResponseBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = timesheetsDeleteTimesheetValidateBeforeCall(timesheetId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for timesheetsGetTimesheets
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetsGetTimesheetsCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Timesheets/GetTimesheets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartDate", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndDate", endDate));

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
    private com.squareup.okhttp.Call timesheetsGetTimesheetsValidateBeforeCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = timesheetsGetTimesheetsCall(startDate, endDate, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseListTimesheet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseListTimesheet timesheetsGetTimesheets(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseListTimesheet> resp = timesheetsGetTimesheetsWithHttpInfo(startDate, endDate, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseListTimesheet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseListTimesheet> timesheetsGetTimesheetsWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = timesheetsGetTimesheetsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseListTimesheet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param startDate The start date of the date range (required)
     * @param endDate The end date of the date range (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetsGetTimesheetsAsync(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, final ApiCallback<CSApiResponseListTimesheet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = timesheetsGetTimesheetsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseListTimesheet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for timesheetsUpdateTimesheets
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call timesheetsUpdateTimesheetsCall(CSBatchUpdateTimesheetRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Timesheets/UpdateTimesheets";

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
    private com.squareup.okhttp.Call timesheetsUpdateTimesheetsValidateBeforeCall(CSBatchUpdateTimesheetRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling timesheetsUpdateTimesheets(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets(Async)");
        }
        

        com.squareup.okhttp.Call call = timesheetsUpdateTimesheetsCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseListInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseListInt32 timesheetsUpdateTimesheets(CSBatchUpdateTimesheetRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseListInt32> resp = timesheetsUpdateTimesheetsWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
     * 
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseListInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseListInt32> timesheetsUpdateTimesheetsWithHttpInfo(CSBatchUpdateTimesheetRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = timesheetsUpdateTimesheetsValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseListInt32>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission. (asynchronously)
     * 
     * @param request A BatchUpdateTimesheet Request object containing values for the new Timesheets to create (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call timesheetsUpdateTimesheetsAsync(CSBatchUpdateTimesheetRequest request, String xChronosheetsAuth, final ApiCallback<CSApiResponseListInt32> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = timesheetsUpdateTimesheetsValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseListInt32>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

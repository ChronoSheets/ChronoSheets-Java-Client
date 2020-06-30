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


import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListOrgReportTranscript;
import ChronoSheetsClientLibModel.CSApiResponseTranscription;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranscriptsApi {
    private ApiClient apiClient;

    public TranscriptsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TranscriptsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for transcriptsGetMyTranscript
     * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transcriptsGetMyTranscriptCall(Integer fileAttachmentId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Transcripts/GetMyTranscript";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fileAttachmentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("FileAttachmentId", fileAttachmentId));

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
    private com.squareup.okhttp.Call transcriptsGetMyTranscriptValidateBeforeCall(Integer fileAttachmentId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileAttachmentId' is set
        if (fileAttachmentId == null) {
            throw new ApiException("Missing the required parameter 'fileAttachmentId' when calling transcriptsGetMyTranscript(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscript(Async)");
        }
        

        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptCall(fileAttachmentId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an audio to text transcript for a particular audio file attachment
     * 
     * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseTranscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseTranscription transcriptsGetMyTranscript(Integer fileAttachmentId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseTranscription> resp = transcriptsGetMyTranscriptWithHttpInfo(fileAttachmentId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get an audio to text transcript for a particular audio file attachment
     * 
     * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseTranscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseTranscription> transcriptsGetMyTranscriptWithHttpInfo(Integer fileAttachmentId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptValidateBeforeCall(fileAttachmentId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseTranscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an audio to text transcript for a particular audio file attachment (asynchronously)
     * 
     * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transcriptsGetMyTranscriptAsync(Integer fileAttachmentId, String xChronosheetsAuth, final ApiCallback<CSApiResponseTranscription> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptValidateBeforeCall(fileAttachmentId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseTranscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for transcriptsGetMyTranscripts
     * @param startDate The Start date of the date range.  Transcripts after this date will be obtained. (required)
     * @param endDate The End date of the date range.  Transcripts before this date will be obtained. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many transcripts (optional)
     * @param take Take this many transcripts (optional)
     * @param keyword Search the text content of the transcript keywords (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transcriptsGetMyTranscriptsCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Transcripts/GetMyTranscripts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartDate", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndDate", endDate));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Take", take));
        if (keyword != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Keyword", keyword));

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
    private com.squareup.okhttp.Call transcriptsGetMyTranscriptsValidateBeforeCall(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling transcriptsGetMyTranscripts(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling transcriptsGetMyTranscripts(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscripts(Async)");
        }
        

        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptsCall(startDate, endDate, xChronosheetsAuth, skip, take, keyword, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.
     * 
     * @param startDate The Start date of the date range.  Transcripts after this date will be obtained. (required)
     * @param endDate The End date of the date range.  Transcripts before this date will be obtained. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many transcripts (optional)
     * @param take Take this many transcripts (optional)
     * @param keyword Search the text content of the transcript keywords (optional)
     * @return CSApiResponseForPaginatedListOrgReportTranscript
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseForPaginatedListOrgReportTranscript transcriptsGetMyTranscripts(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword) throws ApiException {
        ApiResponse<CSApiResponseForPaginatedListOrgReportTranscript> resp = transcriptsGetMyTranscriptsWithHttpInfo(startDate, endDate, xChronosheetsAuth, skip, take, keyword);
        return resp.getData();
    }

    /**
     * Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.
     * 
     * @param startDate The Start date of the date range.  Transcripts after this date will be obtained. (required)
     * @param endDate The End date of the date range.  Transcripts before this date will be obtained. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many transcripts (optional)
     * @param take Take this many transcripts (optional)
     * @param keyword Search the text content of the transcript keywords (optional)
     * @return ApiResponse&lt;CSApiResponseForPaginatedListOrgReportTranscript&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseForPaginatedListOrgReportTranscript> transcriptsGetMyTranscriptsWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword) throws ApiException {
        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, skip, take, keyword, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseForPaginatedListOrgReportTranscript>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get my file transcripts.  Get audio to text transcripts that you&#39;ve created. (asynchronously)
     * 
     * @param startDate The Start date of the date range.  Transcripts after this date will be obtained. (required)
     * @param endDate The End date of the date range.  Transcripts before this date will be obtained. (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param skip Skip this many transcripts (optional)
     * @param take Take this many transcripts (optional)
     * @param keyword Search the text content of the transcript keywords (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transcriptsGetMyTranscriptsAsync(OffsetDateTime startDate, OffsetDateTime endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword, final ApiCallback<CSApiResponseForPaginatedListOrgReportTranscript> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = transcriptsGetMyTranscriptsValidateBeforeCall(startDate, endDate, xChronosheetsAuth, skip, take, keyword, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseForPaginatedListOrgReportTranscript>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

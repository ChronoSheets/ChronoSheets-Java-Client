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


import ChronoSheetsClientLibModel.CSApiResponseInsertUserResponse;
import ChronoSheetsClientLibModel.CSApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.CSApiResponseUpdateUserResponse;
import ChronoSheetsClientLibModel.CSApiResponseUserForManagement;
import ChronoSheetsClientLibModel.CSInsertUserRequest;
import ChronoSheetsClientLibModel.CSUpdateUserRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for usersCreateTimesheetUser
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersCreateTimesheetUserCall(CSInsertUserRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Users/CreateTimesheetUser";

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
    private com.squareup.okhttp.Call usersCreateTimesheetUserValidateBeforeCall(CSInsertUserRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling usersCreateTimesheetUser(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser(Async)");
        }
        

        com.squareup.okhttp.Call call = usersCreateTimesheetUserCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a user in your organisation
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseInsertUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseInsertUserResponse usersCreateTimesheetUser(CSInsertUserRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseInsertUserResponse> resp = usersCreateTimesheetUserWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Create a user in your organisation
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseInsertUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseInsertUserResponse> usersCreateTimesheetUserWithHttpInfo(CSInsertUserRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = usersCreateTimesheetUserValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseInsertUserResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a user in your organisation (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersCreateTimesheetUserAsync(CSInsertUserRequest request, String xChronosheetsAuth, final ApiCallback<CSApiResponseInsertUserResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = usersCreateTimesheetUserValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseInsertUserResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for usersGetTimesheetUser
     * @param userId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersGetTimesheetUserCall(Integer userId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Users/GetTimesheetUser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

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
    private com.squareup.okhttp.Call usersGetTimesheetUserValidateBeforeCall(Integer userId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling usersGetTimesheetUser(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser(Async)");
        }
        

        com.squareup.okhttp.Call call = usersGetTimesheetUserCall(userId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a particular user in your organisation
     * 
     * @param userId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseUserForManagement usersGetTimesheetUser(Integer userId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseUserForManagement> resp = usersGetTimesheetUserWithHttpInfo(userId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get a particular user in your organisation
     * 
     * @param userId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseUserForManagement> usersGetTimesheetUserWithHttpInfo(Integer userId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = usersGetTimesheetUserValidateBeforeCall(userId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseUserForManagement>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a particular user in your organisation (asynchronously)
     * 
     * @param userId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersGetTimesheetUserAsync(Integer userId, String xChronosheetsAuth, final ApiCallback<CSApiResponseUserForManagement> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = usersGetTimesheetUserValidateBeforeCall(userId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseUserForManagement>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for usersGetTimesheetUsers
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersGetTimesheetUsersCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Users/GetTimesheetUsers";

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
    private com.squareup.okhttp.Call usersGetTimesheetUsersValidateBeforeCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = usersGetTimesheetUsersCall(xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get users for your organisation
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseListUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseListUserForManagement usersGetTimesheetUsers(String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseListUserForManagement> resp = usersGetTimesheetUsersWithHttpInfo(xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get users for your organisation
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseListUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseListUserForManagement> usersGetTimesheetUsersWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = usersGetTimesheetUsersValidateBeforeCall(xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseListUserForManagement>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get users for your organisation (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersGetTimesheetUsersAsync(String xChronosheetsAuth, final ApiCallback<CSApiResponseListUserForManagement> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = usersGetTimesheetUsersValidateBeforeCall(xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseListUserForManagement>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for usersUpdateTimesheetUser
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersUpdateTimesheetUserCall(CSUpdateUserRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Users/UpdateTimesheetUser";

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
    private com.squareup.okhttp.Call usersUpdateTimesheetUserValidateBeforeCall(CSUpdateUserRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling usersUpdateTimesheetUser(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser(Async)");
        }
        

        com.squareup.okhttp.Call call = usersUpdateTimesheetUserCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a user
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseUpdateUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseUpdateUserResponse usersUpdateTimesheetUser(CSUpdateUserRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseUpdateUserResponse> resp = usersUpdateTimesheetUserWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Update a user
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseUpdateUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseUpdateUserResponse> usersUpdateTimesheetUserWithHttpInfo(CSUpdateUserRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = usersUpdateTimesheetUserValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseUpdateUserResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a user (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersUpdateTimesheetUserAsync(CSUpdateUserRequest request, String xChronosheetsAuth, final ApiCallback<CSApiResponseUpdateUserResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = usersUpdateTimesheetUserValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseUpdateUserResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

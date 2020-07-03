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


import ChronoSheetsClientLibModel.ApiResponseInsertUserResponse;
import ChronoSheetsClientLibModel.ApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.ApiResponseUpdateUserResponse;
import ChronoSheetsClientLibModel.ApiResponseUserForManagement;
import ChronoSheetsClientLibModel.InsertUserRequest;
import ChronoSheetsClientLibModel.UpdateUserRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient localVarApiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for usersCreateTimesheetUser
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert User Request object containing values for the new User to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersCreateTimesheetUserCall(String xChronosheetsAuth, InsertUserRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Users/CreateTimesheetUser";

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
    private okhttp3.Call usersCreateTimesheetUserValidateBeforeCall(String xChronosheetsAuth, InsertUserRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling usersCreateTimesheetUser(Async)");
        }
        

        okhttp3.Call localVarCall = usersCreateTimesheetUserCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Create a user account in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert User Request object containing values for the new User to create (required)
     * @return ApiResponseInsertUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseInsertUserResponse usersCreateTimesheetUser(String xChronosheetsAuth, InsertUserRequest request) throws ApiException {
        ApiResponse<ApiResponseInsertUserResponse> localVarResp = usersCreateTimesheetUserWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Create a user account in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert User Request object containing values for the new User to create (required)
     * @return ApiResponse&lt;ApiResponseInsertUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseInsertUserResponse> usersCreateTimesheetUserWithHttpInfo(String xChronosheetsAuth, InsertUserRequest request) throws ApiException {
        okhttp3.Call localVarCall = usersCreateTimesheetUserValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseInsertUserResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a user account in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert User Request object containing values for the new User to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersCreateTimesheetUserAsync(String xChronosheetsAuth, InsertUserRequest request, final ApiCallback<ApiResponseInsertUserResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersCreateTimesheetUserValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseInsertUserResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersGetTimesheetUser
     * @param userId The User ID of the UserForManagement you want to get (required)
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
    public okhttp3.Call usersGetTimesheetUserCall(Integer userId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Users/GetTimesheetUser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("UserId", userId));
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
    private okhttp3.Call usersGetTimesheetUserValidateBeforeCall(Integer userId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling usersGetTimesheetUser(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser(Async)");
        }
        

        okhttp3.Call localVarCall = usersGetTimesheetUserCall(userId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get a particular user in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param userId The User ID of the UserForManagement you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseUserForManagement usersGetTimesheetUser(Integer userId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseUserForManagement> localVarResp = usersGetTimesheetUserWithHttpInfo(userId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get a particular user in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param userId The User ID of the UserForManagement you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseUserForManagement> usersGetTimesheetUserWithHttpInfo(Integer userId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = usersGetTimesheetUserValidateBeforeCall(userId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseUserForManagement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a particular user in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions. (asynchronously)
     * 
     * @param userId The User ID of the UserForManagement you want to get (required)
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
    public okhttp3.Call usersGetTimesheetUserAsync(Integer userId, String xChronosheetsAuth, final ApiCallback<ApiResponseUserForManagement> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersGetTimesheetUserValidateBeforeCall(userId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseUserForManagement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersGetTimesheetUsers
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
    public okhttp3.Call usersGetTimesheetUsersCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Users/GetTimesheetUsers";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersGetTimesheetUsersValidateBeforeCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers(Async)");
        }
        

        okhttp3.Call localVarCall = usersGetTimesheetUsersCall(xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get users accounts in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseListUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListUserForManagement usersGetTimesheetUsers(String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseListUserForManagement> localVarResp = usersGetTimesheetUsersWithHttpInfo(xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get users accounts in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseListUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListUserForManagement> usersGetTimesheetUsersWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = usersGetTimesheetUsersValidateBeforeCall(xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseListUserForManagement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get users accounts in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions. (asynchronously)
     * 
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
    public okhttp3.Call usersGetTimesheetUsersAsync(String xChronosheetsAuth, final ApiCallback<ApiResponseListUserForManagement> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersGetTimesheetUsersValidateBeforeCall(xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListUserForManagement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersUpdateTimesheetUser
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update User Request object containing updated fields.  Make sure to specify the User Id in the request object so that ChronoSheets knows which User to update (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUpdateTimesheetUserCall(String xChronosheetsAuth, UpdateUserRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Users/UpdateTimesheetUser";

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
    private okhttp3.Call usersUpdateTimesheetUserValidateBeforeCall(String xChronosheetsAuth, UpdateUserRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling usersUpdateTimesheetUser(Async)");
        }
        

        okhttp3.Call localVarCall = usersUpdateTimesheetUserCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Update a user account.  Requires the &#39;ManageOrganisationUsers&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update User Request object containing updated fields.  Make sure to specify the User Id in the request object so that ChronoSheets knows which User to update (required)
     * @return ApiResponseUpdateUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseUpdateUserResponse usersUpdateTimesheetUser(String xChronosheetsAuth, UpdateUserRequest request) throws ApiException {
        ApiResponse<ApiResponseUpdateUserResponse> localVarResp = usersUpdateTimesheetUserWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Update a user account.  Requires the &#39;ManageOrganisationUsers&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update User Request object containing updated fields.  Make sure to specify the User Id in the request object so that ChronoSheets knows which User to update (required)
     * @return ApiResponse&lt;ApiResponseUpdateUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseUpdateUserResponse> usersUpdateTimesheetUserWithHttpInfo(String xChronosheetsAuth, UpdateUserRequest request) throws ApiException {
        okhttp3.Call localVarCall = usersUpdateTimesheetUserValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseUpdateUserResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a user account.  Requires the &#39;ManageOrganisationUsers&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update User Request object containing updated fields.  Make sure to specify the User Id in the request object so that ChronoSheets knows which User to update (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUpdateTimesheetUserAsync(String xChronosheetsAuth, UpdateUserRequest request, final ApiCallback<ApiResponseUpdateUserResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersUpdateTimesheetUserValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseUpdateUserResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

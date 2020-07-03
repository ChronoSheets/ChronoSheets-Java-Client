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
import ChronoSheetsClientLibModel.ApiResponseClient;
import ChronoSheetsClientLibModel.ApiResponseInt32;
import ChronoSheetsClientLibModel.ApiResponseListClient;
import ChronoSheetsClientLibModel.InsertClientRequest;
import ChronoSheetsClientLibModel.SaveClientRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsApi {
    private ApiClient localVarApiClient;

    public ClientsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clientsCreateClient
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert Client Request object containing values for the new Client to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsCreateClientCall(String xChronosheetsAuth, InsertClientRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Clients/CreateClient";

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
    private okhttp3.Call clientsCreateClientValidateBeforeCall(String xChronosheetsAuth, InsertClientRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling clientsCreateClient(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling clientsCreateClient(Async)");
        }
        

        okhttp3.Call localVarCall = clientsCreateClientCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert Client Request object containing values for the new Client to create (required)
     * @return ApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseInt32 clientsCreateClient(String xChronosheetsAuth, InsertClientRequest request) throws ApiException {
        ApiResponse<ApiResponseInt32> localVarResp = clientsCreateClientWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert Client Request object containing values for the new Client to create (required)
     * @return ApiResponse&lt;ApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseInt32> clientsCreateClientWithHttpInfo(String xChronosheetsAuth, InsertClientRequest request) throws ApiException {
        okhttp3.Call localVarCall = clientsCreateClientValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert Client Request object containing values for the new Client to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsCreateClientAsync(String xChronosheetsAuth, InsertClientRequest request, final ApiCallback<ApiResponseInt32> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsCreateClientValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clientsGetClient
     * @param clientId The ID of the Client you want to get (required)
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
    public okhttp3.Call clientsGetClientCall(Integer clientId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Clients/GetClient";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ClientId", clientId));
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
    private okhttp3.Call clientsGetClientValidateBeforeCall(Integer clientId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling clientsGetClient(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling clientsGetClient(Async)");
        }
        

        okhttp3.Call localVarCall = clientsGetClientCall(clientId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     * 
     * @param clientId The ID of the Client you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseClient clientsGetClient(Integer clientId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseClient> localVarResp = clientsGetClientWithHttpInfo(clientId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     * 
     * @param clientId The ID of the Client you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseClient> clientsGetClientWithHttpInfo(Integer clientId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = clientsGetClientValidateBeforeCall(clientId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseClient>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions. (asynchronously)
     * 
     * @param clientId The ID of the Client you want to get (required)
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
    public okhttp3.Call clientsGetClientAsync(Integer clientId, String xChronosheetsAuth, final ApiCallback<ApiResponseClient> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsGetClientValidateBeforeCall(clientId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseClient>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clientsGetClients
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
    public okhttp3.Call clientsGetClientsCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Clients/GetClients";

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
    private okhttp3.Call clientsGetClientsValidateBeforeCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling clientsGetClients(Async)");
        }
        

        okhttp3.Call localVarCall = clientsGetClientsCall(xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseListClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListClient clientsGetClients(String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseListClient> localVarResp = clientsGetClientsWithHttpInfo(xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseListClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListClient> clientsGetClientsWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = clientsGetClientsValidateBeforeCall(xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseListClient>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions. (asynchronously)
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
    public okhttp3.Call clientsGetClientsAsync(String xChronosheetsAuth, final ApiCallback<ApiResponseListClient> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsGetClientsValidateBeforeCall(xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListClient>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clientsUpdateClient
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsUpdateClientCall(String xChronosheetsAuth, SaveClientRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/Clients/UpdateClient";

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
    private okhttp3.Call clientsUpdateClientValidateBeforeCall(String xChronosheetsAuth, SaveClientRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling clientsUpdateClient(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling clientsUpdateClient(Async)");
        }
        

        okhttp3.Call localVarCall = clientsUpdateClientCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update (required)
     * @return ApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseBoolean clientsUpdateClient(String xChronosheetsAuth, SaveClientRequest request) throws ApiException {
        ApiResponse<ApiResponseBoolean> localVarResp = clientsUpdateClientWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update (required)
     * @return ApiResponse&lt;ApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseBoolean> clientsUpdateClientWithHttpInfo(String xChronosheetsAuth, SaveClientRequest request) throws ApiException {
        okhttp3.Call localVarCall = clientsUpdateClientValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Save Client Request object containing updated fields.  Make sure to specify the Client Id in the request object so that ChronoSheets knows which Client to update (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsUpdateClientAsync(String xChronosheetsAuth, SaveClientRequest request, final ApiCallback<ApiResponseBoolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsUpdateClientValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

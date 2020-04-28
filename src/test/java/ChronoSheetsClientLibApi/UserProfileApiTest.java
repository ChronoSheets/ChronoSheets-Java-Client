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

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseDoLoginResponse;
import ChronoSheetsClientLibModel.CSApiResponseUpdateProfileResponse;
import ChronoSheetsClientLibModel.CSApiResponseUserProfile;
import ChronoSheetsClientLibModel.CSDoLoginRequest;
import ChronoSheetsClientLibModel.CSUpdateMyProfileRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserProfileApi
 */
@Ignore
public class UserProfileApiTest {

    private final UserProfileApi api = new UserProfileApi();

    
    /**
     * Login to your ChronoSheets account and obtain an Auth Token which you can use for other ChronoSheets API methods.    Does not require any special permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userProfileDoLoginTest() throws ApiException {
        CSDoLoginRequest request = null;
        CSApiResponseDoLoginResponse response = api.userProfileDoLogin(request);

        // TODO: test validations
    }
    
    /**
     * Logout of your ChronoSheets account.  This method ends and deletes your active session.    Does not require any special permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userProfileDoLogoutTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.userProfileDoLogout(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get your own profile.  Use this method to obtain detailed information about your ChronoSheets user profile.    Does not require any special permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userProfileGetMyProfileTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseUserProfile response = api.userProfileGetMyProfile(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Keep a session alive.  Use this method to keep a session active.  You could use this to &#39;ping&#39; ChronoSheets every &#39;x&#39; minutes to make sure your Auth Token will keep working.    Does not require any special permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userProfileKeepSessionAliveTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.userProfileKeepSessionAlive(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update your own profile.  Use this method to update your profile information or update/change your password.    Does not require any special permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userProfileUpdateMyProfileTest() throws ApiException {
        CSUpdateMyProfileRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseUpdateProfileResponse response = api.userProfileUpdateMyProfile(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}

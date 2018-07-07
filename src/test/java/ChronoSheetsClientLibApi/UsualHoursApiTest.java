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

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseListUsualHoursDay;
import ChronoSheetsClientLibModel.CSSetUsualHoursRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsualHoursApi
 */
@Ignore
public class UsualHoursApiTest {

    private final UsualHoursApi api = new UsualHoursApi();

    
    /**
     * Get usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usualHoursGetUsualHoursTest() throws ApiException {
        Integer userId = null;
        String xChronosheetsAuth = null;
        CSApiResponseListUsualHoursDay response = api.usualHoursGetUsualHours(userId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Set usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usualHoursSetUsualHoursTest() throws ApiException {
        CSSetUsualHoursRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.usualHoursSetUsualHours(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}

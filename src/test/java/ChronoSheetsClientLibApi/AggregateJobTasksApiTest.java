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
import ChronoSheetsClientLibModel.CSApiResponseListAggregateJobCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AggregateJobTasksApi
 */
@Ignore
public class AggregateJobTasksApiTest {

    private final AggregateJobTasksApi api = new AggregateJobTasksApi();

    
    /**
     * Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateJobTasksGetAggregateJobTasksTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseListAggregateJobCode response = api.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);

        // TODO: test validations
    }
    
}

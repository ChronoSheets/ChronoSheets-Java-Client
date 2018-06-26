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

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseJobCode;
import ChronoSheetsClientLibModel.CSApiResponseListJobCode;
import ChronoSheetsClientLibModel.CSInsertJobCodeRequest;
import ChronoSheetsClientLibModel.CSUpdateJobCodeRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobCodesApi
 */
@Ignore
public class JobCodesApiTest {

    private final JobCodesApi api = new JobCodesApi();

    
    /**
     * Create a job code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCodesCreateJobCodeTest() throws ApiException {
        CSInsertJobCodeRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.jobCodesCreateJobCode(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Delete a job code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCodesDeleteJobCodeTest() throws ApiException {
        Integer jobCodeId = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.jobCodesDeleteJobCode(jobCodeId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular job code by job code id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCodesGetJobCodeByIdTest() throws ApiException {
        Integer jobCodeId = null;
        String xChronosheetsAuth = null;
        CSApiResponseJobCode response = api.jobCodesGetJobCodeById(jobCodeId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get job codes for your organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCodesGetJobCodesTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseListJobCode response = api.jobCodesGetJobCodes(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update a job code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCodesUpdateJobCodeTest() throws ApiException {
        CSUpdateJobCodeRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.jobCodesUpdateJobCode(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}

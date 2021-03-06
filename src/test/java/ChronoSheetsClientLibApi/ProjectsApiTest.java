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
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseListProject;
import ChronoSheetsClientLibModel.CSApiResponseProject;
import ChronoSheetsClientLibModel.CSInsertProjectRequest;
import ChronoSheetsClientLibModel.CSUpdateProjectRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Create a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsCreateProjectTest() throws ApiException {
        CSInsertProjectRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.projectsCreateProject(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a project by its Id.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsGetProjectByIdTest() throws ApiException {
        Integer projectId = null;
        String xChronosheetsAuth = null;
        CSApiResponseProject response = api.projectsGetProjectById(projectId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get projects for a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsGetProjectsForClientTest() throws ApiException {
        Integer clientId = null;
        String xChronosheetsAuth = null;
        CSApiResponseListProject response = api.projectsGetProjectsForClient(clientId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsUpdateProjectTest() throws ApiException {
        CSUpdateProjectRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.projectsUpdateProject(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}

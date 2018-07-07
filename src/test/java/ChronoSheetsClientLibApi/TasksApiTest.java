/*
 * The ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  </p>  <p>      First Steps:       <ol>          <li>Make sure you've <a href='/HomeV2/App/sign-up'>signed up to ChronoSheets</a> to get yourself a user account</li>          <li>Confirm your account by following the link sent to your email address.  This will activate your account</li>          <li>Use your username and password to obtain an Auth Token by using the DoLogin method inside the UserProfile section below.  Use the Auth Token as an argument to the other methods</li>          <li>Try different methods in the API Playground to learn about the API</li>          <li>If you're stuck, try the full getting started guide on the <a href='/Home/ApiDocs'>API Toolkit</a> page.</li>      </ol>  </p>  <p>      Further Steps:       <ul>          <li>Create a mobile app (iOS, Android or Windows) using one of the ChronoSheets Mobile SDKs</li>          <li>Create a custom integration with your app using one of the ChronoSheets API Client Libraries.</li>      </ul>      Read more about the API Toolkit on the <a href='/Home/ApiDocs'>API Toolkit</a> page.  </p></div>
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
import ChronoSheetsClientLibModel.CSApiResponseListTimesheetTask;
import ChronoSheetsClientLibModel.CSApiResponseTimesheetTask;
import ChronoSheetsClientLibModel.CSInsertTaskRequest;
import ChronoSheetsClientLibModel.CSUpdateTaskRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksCreateTaskTest() throws ApiException {
        CSInsertTaskRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.tasksCreateTask(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksDeleteTaskTest() throws ApiException {
        Integer taskId = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.tasksDeleteTask(taskId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTaskByIdTest() throws ApiException {
        Integer taskId = null;
        String xChronosheetsAuth = null;
        CSApiResponseTimesheetTask response = api.tasksGetTaskById(taskId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTasksTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseListTimesheetTask response = api.tasksGetTasks(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTasksForJobTest() throws ApiException {
        Integer jobId = null;
        String xChronosheetsAuth = null;
        CSApiResponseListTimesheetTask response = api.tasksGetTasksForJob(jobId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksUpdateTaskTest() throws ApiException {
        CSUpdateTaskRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.tasksUpdateTask(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}

# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ChronoSheetsClient.*;
import ChronoSheetsClient.auth.*;
import ChronoSheetsClientLibModel.*;
import ChronoSheetsClientLibApi.AggregateJobTasksApi;

import java.io.File;
import java.util.*;

public class AggregateJobTasksApiExample {

    public static void main(String[] args) {
        
        AggregateJobTasksApi apiInstance = new AggregateJobTasksApi();
        String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
        try {
            CSApiResponseListAggregateJobCode result = apiInstance.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregateJobTasksApi#aggregateJobTasksGetAggregateJobTasks");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.chronosheets.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AggregateJobTasksApi* | [**aggregateJobTasksGetAggregateJobTasks**](docs/AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /api/AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsCreateClient**](docs/ClientsApi.md#clientsCreateClient) | **PUT** /api/Clients/CreateClient | Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ClientsApi* | [**clientsGetClient**](docs/ClientsApi.md#clientsGetClient) | **GET** /api/Clients/GetClient | Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsGetClients**](docs/ClientsApi.md#clientsGetClients) | **GET** /api/Clients/GetClients | Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsUpdateClient**](docs/ClientsApi.md#clientsUpdateClient) | **POST** /api/Clients/UpdateClient | Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*FleetApi* | [**fleetCreateVehicle**](docs/FleetApi.md#fleetCreateVehicle) | **PUT** /api/Fleet/CreateVehicle | Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.
*FleetApi* | [**fleetGetVehicleById**](docs/FleetApi.md#fleetGetVehicleById) | **GET** /api/Fleet/GetVehicleById | Get a particular vehicle.  Does not require any special permission.
*FleetApi* | [**fleetGetVehicles**](docs/FleetApi.md#fleetGetVehicles) | **GET** /api/Fleet/GetVehicles | Get a collection of vehicles that are under your organisation.    Does not require any special permission.
*FleetApi* | [**fleetUpdateVehicle**](docs/FleetApi.md#fleetUpdateVehicle) | **POST** /api/Fleet/UpdateVehicle | Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.
*JobCodesApi* | [**jobCodesCreateJobCode**](docs/JobCodesApi.md#jobCodesCreateJobCode) | **PUT** /api/JobCodes/CreateJobCode | Create a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*JobCodesApi* | [**jobCodesDeleteJobCode**](docs/JobCodesApi.md#jobCodesDeleteJobCode) | **DELETE** /api/JobCodes/DeleteJobCode | Delete a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*JobCodesApi* | [**jobCodesGetJobCodeById**](docs/JobCodesApi.md#jobCodesGetJobCodeById) | **GET** /api/JobCodes/GetJobCodeById | Get a particular job code by job code id.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
*JobCodesApi* | [**jobCodesGetJobCodes**](docs/JobCodesApi.md#jobCodesGetJobCodes) | **GET** /api/JobCodes/GetJobCodes | Get job codes for your organisation.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
*JobCodesApi* | [**jobCodesUpdateJobCode**](docs/JobCodesApi.md#jobCodesUpdateJobCode) | **POST** /api/JobCodes/UpdateJobCode | Update a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*OrganisationApi* | [**organisationGetOrganisation**](docs/OrganisationApi.md#organisationGetOrganisation) | **GET** /api/Organisation/GetOrganisation | Get your organisation.    Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationApi* | [**organisationUpdateOrganisation**](docs/OrganisationApi.md#organisationUpdateOrganisation) | **POST** /api/Organisation/UpdateOrganisation | Update an organisation.    Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationGroupUsersApi* | [**organisationGroupUsersGetOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersGetOrganisationGroupUsers) | **GET** /api/OrganisationGroupUsers/GetOrganisationGroupUsers | Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupUsersApi* | [**organisationGroupUsersUpdateOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersUpdateOrganisationGroupUsers) | **POST** /api/OrganisationGroupUsers/UpdateOrganisationGroupUsers | Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsCreateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsCreateOrganisationGroup) | **PUT** /api/OrganisationGroups/CreateOrganisationGroup | Create an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroup) | **GET** /api/OrganisationGroups/GetOrganisationGroup | Get a particular organisation group.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroups**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroups) | **GET** /api/OrganisationGroups/GetOrganisationGroups | Get a collection of organisation groups that are under your organisation.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForJob**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForJob) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForJob | Get org groups for a particular job.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForVehicle**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForVehicle) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForVehicle | Get org groups for a particular vehicle.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageFleet&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsUpdateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsUpdateOrganisationGroup) | **POST** /api/OrganisationGroups/UpdateOrganisationGroup | Update an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*ProjectsApi* | [**projectsCreateProject**](docs/ProjectsApi.md#projectsCreateProject) | **PUT** /api/Projects/CreateProject | Create a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ProjectsApi* | [**projectsGetProjectById**](docs/ProjectsApi.md#projectsGetProjectById) | **GET** /api/Projects/GetProjectById | Get a project by its Id.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ProjectsApi* | [**projectsGetProjectsForClient**](docs/ProjectsApi.md#projectsGetProjectsForClient) | **GET** /api/Projects/GetProjectsForClient | Get projects for a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ProjectsApi* | [**projectsUpdateProject**](docs/ProjectsApi.md#projectsUpdateProject) | **POST** /api/Projects/UpdateProject | Update a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ReportsApi* | [**reportsGetAllChartsDataAdmin**](docs/ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /api/Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetAllChartsDataUser**](docs/ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /api/Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
*ReportsApi* | [**reportsGetOrgTripById**](docs/ReportsApi.md#reportsGetOrgTripById) | **GET** /api/Reports/GetOrgTripById | Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrganisationTimesheetFileAttachments**](docs/ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /api/Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrganisationTrips**](docs/ReportsApi.md#reportsGetOrganisationTrips) | **GET** /api/Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetRawDataAdmin**](docs/ReportsApi.md#reportsGetRawDataAdmin) | **GET** /api/Reports/GetRawDataAdmin | Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsProjectCostingsAdmin**](docs/ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /api/Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsUserJobsOverTime**](docs/ReportsApi.md#reportsUserJobsOverTime) | **GET** /api/Reports/UserJobsOverTime | Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.
*TasksApi* | [**tasksCreateTask**](docs/TasksApi.md#tasksCreateTask) | **PUT** /api/Tasks/CreateTask | Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TasksApi* | [**tasksDeleteTask**](docs/TasksApi.md#tasksDeleteTask) | **DELETE** /api/Tasks/DeleteTask | Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TasksApi* | [**tasksGetTaskById**](docs/TasksApi.md#tasksGetTaskById) | **GET** /api/Tasks/GetTaskById | Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksGetTasks**](docs/TasksApi.md#tasksGetTasks) | **GET** /api/Tasks/GetTasks | Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksGetTasksForJob**](docs/TasksApi.md#tasksGetTasksForJob) | **GET** /api/Tasks/GetTasksForJob | Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksUpdateTask**](docs/TasksApi.md#tasksUpdateTask) | **POST** /api/Tasks/UpdateTask | Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TimesheetsApi* | [**timesheetsCreateSingleTimesheet**](docs/TimesheetsApi.md#timesheetsCreateSingleTimesheet) | **PUT** /api/Timesheets/CreateSingleTimesheet | Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsDeleteTimesheet**](docs/TimesheetsApi.md#timesheetsDeleteTimesheet) | **DELETE** /api/Timesheets/DeleteTimesheet | Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsGetTimesheets**](docs/TimesheetsApi.md#timesheetsGetTimesheets) | **GET** /api/Timesheets/GetTimesheets | Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsUpdateTimesheets**](docs/TimesheetsApi.md#timesheetsUpdateTimesheets) | **POST** /api/Timesheets/UpdateTimesheets | Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
*TripsApi* | [**tripsCreateTrip**](docs/TripsApi.md#tripsCreateTrip) | **POST** /api/Trips/CreateTrip | Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.
*TripsApi* | [**tripsGetMyTripById**](docs/TripsApi.md#tripsGetMyTripById) | **GET** /api/Trips/GetMyTripById | Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.
*TripsApi* | [**tripsGetMyTrips**](docs/TripsApi.md#tripsGetMyTrips) | **GET** /api/Trips/GetMyTrips | Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesCreateJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesCreateJobFavourite) | **PUT** /api/UserJobFavourites/CreateJobFavourite | Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesDeleteJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesDeleteJobFavourite) | **DELETE** /api/UserJobFavourites/DeleteJobFavourite | Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesGetJobFavourites**](docs/UserJobFavouritesApi.md#userJobFavouritesGetJobFavourites) | **GET** /api/UserJobFavourites/GetJobFavourites | Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserPayRatesApi* | [**userPayRatesCreatePayRate**](docs/UserPayRatesApi.md#userPayRatesCreatePayRate) | **PUT** /api/UserPayRates/CreatePayRate | Create a new pay rate for a particular user, archiving the previous pay rate.    Requires the &#39;ManageOrganisationUsers&#39; permission.
*UserPayRatesApi* | [**userPayRatesGetPayRates**](docs/UserPayRatesApi.md#userPayRatesGetPayRates) | **GET** /api/UserPayRates/GetPayRates | Get a collection of pay rates for a particular user, specified by user id.    Requires the &#39;ManageOrganisationUsers&#39; permission.
*UserProfileApi* | [**userProfileDoLogin**](docs/UserProfileApi.md#userProfileDoLogin) | **POST** /api/UserProfile/DoLogin | Login to your ChronoSheets account and obtain an Auth Token which you can use for other ChronoSheets API methods.    Does not require any special permissions.
*UserProfileApi* | [**userProfileDoLogout**](docs/UserProfileApi.md#userProfileDoLogout) | **DELETE** /api/UserProfile/DoLogout | Logout of your ChronoSheets account.  This method ends and deletes your active session.    Does not require any special permissions.
*UserProfileApi* | [**userProfileGetMyProfile**](docs/UserProfileApi.md#userProfileGetMyProfile) | **GET** /api/UserProfile/GetMyProfile | Get your own profile.  Use this method to obtain detailed information about your ChronoSheets user profile.    Does not require any special permissions.
*UserProfileApi* | [**userProfileKeepSessionAlive**](docs/UserProfileApi.md#userProfileKeepSessionAlive) | **GET** /api/UserProfile/KeepSessionAlive | Keep a session alive.  Use this method to keep a session active.  You could use this to &#39;ping&#39; ChronoSheets every &#39;x&#39; minutes to make sure your Auth Token will keep working.    Does not require any special permissions.
*UserProfileApi* | [**userProfileUpdateMyProfile**](docs/UserProfileApi.md#userProfileUpdateMyProfile) | **POST** /api/UserProfile/UpdateMyProfile | Update your own profile.  Use this method to update your profile information or update/change your password.    Does not require any special permissions.
*UsersApi* | [**usersCreateTimesheetUser**](docs/UsersApi.md#usersCreateTimesheetUser) | **PUT** /api/Users/CreateTimesheetUser | Create a user account in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; permission.
*UsersApi* | [**usersGetTimesheetUser**](docs/UsersApi.md#usersGetTimesheetUser) | **GET** /api/Users/GetTimesheetUser | Get a particular user in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
*UsersApi* | [**usersGetTimesheetUsers**](docs/UsersApi.md#usersGetTimesheetUsers) | **GET** /api/Users/GetTimesheetUsers | Get users accounts in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
*UsersApi* | [**usersUpdateTimesheetUser**](docs/UsersApi.md#usersUpdateTimesheetUser) | **POST** /api/Users/UpdateTimesheetUser | Update a user account.  Requires the &#39;ManageOrganisationUsers&#39; permission.
*UsualHoursApi* | [**usualHoursGetUsualHours**](docs/UsualHoursApi.md#usualHoursGetUsualHours) | **GET** /api/UsualHours/GetUsualHours | Get usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*UsualHoursApi* | [**usualHoursSetUsualHours**](docs/UsualHoursApi.md#usualHoursSetUsualHours) | **POST** /api/UsualHours/SetUsualHours | Set usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationUsers&#39; permissions.


## Documentation for Models

 - [CSAggregateJobCode](docs/CSAggregateJobCode.md)
 - [CSAggregateJobTask](docs/CSAggregateJobTask.md)
 - [CSApiResponseBoolean](docs/CSApiResponseBoolean.md)
 - [CSApiResponseClient](docs/CSApiResponseClient.md)
 - [CSApiResponseCombinedReportsData](docs/CSApiResponseCombinedReportsData.md)
 - [CSApiResponseDoLoginResponse](docs/CSApiResponseDoLoginResponse.md)
 - [CSApiResponseFleetVehicle](docs/CSApiResponseFleetVehicle.md)
 - [CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment](docs/CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)
 - [CSApiResponseForPaginatedListOrgReportTrip](docs/CSApiResponseForPaginatedListOrgReportTrip.md)
 - [CSApiResponseForPaginatedListRawReportItem](docs/CSApiResponseForPaginatedListRawReportItem.md)
 - [CSApiResponseForPaginatedListTrip](docs/CSApiResponseForPaginatedListTrip.md)
 - [CSApiResponseInsertUserResponse](docs/CSApiResponseInsertUserResponse.md)
 - [CSApiResponseInt32](docs/CSApiResponseInt32.md)
 - [CSApiResponseJobCode](docs/CSApiResponseJobCode.md)
 - [CSApiResponseListAggregateJobCode](docs/CSApiResponseListAggregateJobCode.md)
 - [CSApiResponseListClient](docs/CSApiResponseListClient.md)
 - [CSApiResponseListFleetVehicle](docs/CSApiResponseListFleetVehicle.md)
 - [CSApiResponseListInt32](docs/CSApiResponseListInt32.md)
 - [CSApiResponseListJobCode](docs/CSApiResponseListJobCode.md)
 - [CSApiResponseListJobSeriesReportItem](docs/CSApiResponseListJobSeriesReportItem.md)
 - [CSApiResponseListOrganisationGroup](docs/CSApiResponseListOrganisationGroup.md)
 - [CSApiResponseListProject](docs/CSApiResponseListProject.md)
 - [CSApiResponseListProjectCostingReportItem](docs/CSApiResponseListProjectCostingReportItem.md)
 - [CSApiResponseListTimesheet](docs/CSApiResponseListTimesheet.md)
 - [CSApiResponseListTimesheetTask](docs/CSApiResponseListTimesheetTask.md)
 - [CSApiResponseListUserForManagement](docs/CSApiResponseListUserForManagement.md)
 - [CSApiResponseListUserHourlyRate](docs/CSApiResponseListUserHourlyRate.md)
 - [CSApiResponseListUserJobFavourite](docs/CSApiResponseListUserJobFavourite.md)
 - [CSApiResponseListUsualHoursDay](docs/CSApiResponseListUsualHoursDay.md)
 - [CSApiResponseOrganisation](docs/CSApiResponseOrganisation.md)
 - [CSApiResponseOrganisationGroup](docs/CSApiResponseOrganisationGroup.md)
 - [CSApiResponseProject](docs/CSApiResponseProject.md)
 - [CSApiResponseTimesheetTask](docs/CSApiResponseTimesheetTask.md)
 - [CSApiResponseTrip](docs/CSApiResponseTrip.md)
 - [CSApiResponseUpdateOrganisationResponse](docs/CSApiResponseUpdateOrganisationResponse.md)
 - [CSApiResponseUpdateProfileResponse](docs/CSApiResponseUpdateProfileResponse.md)
 - [CSApiResponseUpdateUserResponse](docs/CSApiResponseUpdateUserResponse.md)
 - [CSApiResponseUserForManagement](docs/CSApiResponseUserForManagement.md)
 - [CSApiResponseUserProfile](docs/CSApiResponseUserProfile.md)
 - [CSBatchUpdateTimesheetRequest](docs/CSBatchUpdateTimesheetRequest.md)
 - [CSClient](docs/CSClient.md)
 - [CSClientSeriesReportItem](docs/CSClientSeriesReportItem.md)
 - [CSClientSideUser](docs/CSClientSideUser.md)
 - [CSClientTotalsReportItem](docs/CSClientTotalsReportItem.md)
 - [CSCombinedReportsData](docs/CSCombinedReportsData.md)
 - [CSCreateTripRequest](docs/CSCreateTripRequest.md)
 - [CSDoLoginRequest](docs/CSDoLoginRequest.md)
 - [CSDoLoginResponse](docs/CSDoLoginResponse.md)
 - [CSFleetVehicle](docs/CSFleetVehicle.md)
 - [CSInsertClientRequest](docs/CSInsertClientRequest.md)
 - [CSInsertJobCodeRequest](docs/CSInsertJobCodeRequest.md)
 - [CSInsertOrganisationGroupRequest](docs/CSInsertOrganisationGroupRequest.md)
 - [CSInsertProjectRequest](docs/CSInsertProjectRequest.md)
 - [CSInsertTaskRequest](docs/CSInsertTaskRequest.md)
 - [CSInsertUserHourlyRateRequest](docs/CSInsertUserHourlyRateRequest.md)
 - [CSInsertUserJobFavouriteRequest](docs/CSInsertUserJobFavouriteRequest.md)
 - [CSInsertUserRequest](docs/CSInsertUserRequest.md)
 - [CSInsertUserResponse](docs/CSInsertUserResponse.md)
 - [CSInsertVehicleRequest](docs/CSInsertVehicleRequest.md)
 - [CSJobCode](docs/CSJobCode.md)
 - [CSJobSeriesReportItem](docs/CSJobSeriesReportItem.md)
 - [CSJobTotalsReportItem](docs/CSJobTotalsReportItem.md)
 - [CSOrgReportTimesheetFileAttachment](docs/CSOrgReportTimesheetFileAttachment.md)
 - [CSOrgReportTrip](docs/CSOrgReportTrip.md)
 - [CSOrganisation](docs/CSOrganisation.md)
 - [CSOrganisationGroup](docs/CSOrganisationGroup.md)
 - [CSProject](docs/CSProject.md)
 - [CSProjectCostingReportItem](docs/CSProjectCostingReportItem.md)
 - [CSProjectSeriesReportItem](docs/CSProjectSeriesReportItem.md)
 - [CSProjectTotalsReportItem](docs/CSProjectTotalsReportItem.md)
 - [CSRawReportItem](docs/CSRawReportItem.md)
 - [CSSaveClientRequest](docs/CSSaveClientRequest.md)
 - [CSSaveOrganisationGroupRequest](docs/CSSaveOrganisationGroupRequest.md)
 - [CSSaveVehicleRequest](docs/CSSaveVehicleRequest.md)
 - [CSSetOrganisationGroupUsersRequest](docs/CSSetOrganisationGroupUsersRequest.md)
 - [CSSetUsualHoursRequest](docs/CSSetUsualHoursRequest.md)
 - [CSTaskSeriesReportItem](docs/CSTaskSeriesReportItem.md)
 - [CSTaskTotalsReportItem](docs/CSTaskTotalsReportItem.md)
 - [CSTimeSlot](docs/CSTimeSlot.md)
 - [CSTimesheet](docs/CSTimesheet.md)
 - [CSTimesheetTask](docs/CSTimesheetTask.md)
 - [CSTrip](docs/CSTrip.md)
 - [CSTripCoordinate](docs/CSTripCoordinate.md)
 - [CSUpdateJobCodeRequest](docs/CSUpdateJobCodeRequest.md)
 - [CSUpdateMyProfileRequest](docs/CSUpdateMyProfileRequest.md)
 - [CSUpdateOrganisationRequest](docs/CSUpdateOrganisationRequest.md)
 - [CSUpdateOrganisationResponse](docs/CSUpdateOrganisationResponse.md)
 - [CSUpdateProfileResponse](docs/CSUpdateProfileResponse.md)
 - [CSUpdateProjectRequest](docs/CSUpdateProjectRequest.md)
 - [CSUpdateTaskRequest](docs/CSUpdateTaskRequest.md)
 - [CSUpdateUserRequest](docs/CSUpdateUserRequest.md)
 - [CSUpdateUserResponse](docs/CSUpdateUserResponse.md)
 - [CSUserForManagement](docs/CSUserForManagement.md)
 - [CSUserHourlyRate](docs/CSUserHourlyRate.md)
 - [CSUserJobFavourite](docs/CSUserJobFavourite.md)
 - [CSUserProfile](docs/CSUserProfile.md)
 - [CSUsualHoursDay](docs/CSUsualHoursDay.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### x-chronosheets-auth

- **Type**: API key
- **API key parameter name**: x-chronosheets-auth
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




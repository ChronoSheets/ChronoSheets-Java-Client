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
            CsApiApiResponseListAggregateJobCode result = apiInstance.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);
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
*AggregateJobTasksApi* | [**aggregateJobTasksGetAggregateJobTasks**](docs/AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /api/AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated
*ClientsApi* | [**clientsCreateClient**](docs/ClientsApi.md#clientsCreateClient) | **PUT** /api/Clients/CreateClient | Create a client
*ClientsApi* | [**clientsGetClient**](docs/ClientsApi.md#clientsGetClient) | **GET** /api/Clients/GetClient | Get a particular client
*ClientsApi* | [**clientsGetClients**](docs/ClientsApi.md#clientsGetClients) | **GET** /api/Clients/GetClients | Get a collection of clients that are under your organisation
*ClientsApi* | [**clientsUpdateClient**](docs/ClientsApi.md#clientsUpdateClient) | **POST** /api/Clients/UpdateClient | Update a client
*FleetApi* | [**fleetCreateVehicle**](docs/FleetApi.md#fleetCreateVehicle) | **PUT** /api/Fleet/CreateVehicle | Create a vehicle
*FleetApi* | [**fleetGetVehicleById**](docs/FleetApi.md#fleetGetVehicleById) | **GET** /api/Fleet/GetVehicleById | Get a particular vehicle
*FleetApi* | [**fleetGetVehicles**](docs/FleetApi.md#fleetGetVehicles) | **GET** /api/Fleet/GetVehicles | Get a collection of vehicles that are under your organisation
*FleetApi* | [**fleetUpdateVehicle**](docs/FleetApi.md#fleetUpdateVehicle) | **POST** /api/Fleet/UpdateVehicle | Update a vehicle
*JobCodesApi* | [**jobCodesCreateJobCode**](docs/JobCodesApi.md#jobCodesCreateJobCode) | **PUT** /api/JobCodes/CreateJobCode | Create a job code
*JobCodesApi* | [**jobCodesDeleteJobCode**](docs/JobCodesApi.md#jobCodesDeleteJobCode) | **DELETE** /api/JobCodes/DeleteJobCode | Delete a job code
*JobCodesApi* | [**jobCodesGetJobCodeById**](docs/JobCodesApi.md#jobCodesGetJobCodeById) | **GET** /api/JobCodes/GetJobCodeById | Get a particular job code by job code id
*JobCodesApi* | [**jobCodesGetJobCodes**](docs/JobCodesApi.md#jobCodesGetJobCodes) | **GET** /api/JobCodes/GetJobCodes | Get job codes for your organisation
*JobCodesApi* | [**jobCodesUpdateJobCode**](docs/JobCodesApi.md#jobCodesUpdateJobCode) | **POST** /api/JobCodes/UpdateJobCode | Update a job code
*OrganisationApi* | [**organisationGetOrganisation**](docs/OrganisationApi.md#organisationGetOrganisation) | **GET** /api/Organisation/GetOrganisation | Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationApi* | [**organisationUpdateOrganisation**](docs/OrganisationApi.md#organisationUpdateOrganisation) | **POST** /api/Organisation/UpdateOrganisation | Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationGroupUsersApi* | [**organisationGroupUsersGetOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersGetOrganisationGroupUsers) | **GET** /api/OrganisationGroupUsers/GetOrganisationGroupUsers | Get a collection of organisation group users that belong to an organisation group
*OrganisationGroupUsersApi* | [**organisationGroupUsersUpdateOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersUpdateOrganisationGroupUsers) | **POST** /api/OrganisationGroupUsers/UpdateOrganisationGroupUsers | Set the users who belong to an organisation group
*OrganisationGroupsApi* | [**organisationGroupsCreateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsCreateOrganisationGroup) | **PUT** /api/OrganisationGroups/CreateOrganisationGroup | Create an organisation group
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroup) | **GET** /api/OrganisationGroups/GetOrganisationGroup | Get a particular organisation group
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroups**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroups) | **GET** /api/OrganisationGroups/GetOrganisationGroups | Get a collection of organisation groups that are under your organisation
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForJob**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForJob) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForJob | Get org groups for a particular job
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForVehicle**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForVehicle) | **GET** /api/OrganisationGroups/GetOrganisationGroupsForVehicle | Get org groups for a particular vehicle
*OrganisationGroupsApi* | [**organisationGroupsUpdateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsUpdateOrganisationGroup) | **POST** /api/OrganisationGroups/UpdateOrganisationGroup | Update an organisation group
*ProjectsApi* | [**projectsCreateProject**](docs/ProjectsApi.md#projectsCreateProject) | **PUT** /api/Projects/CreateProject | Create a project
*ProjectsApi* | [**projectsGetProjectById**](docs/ProjectsApi.md#projectsGetProjectById) | **GET** /api/Projects/GetProjectById | Get project by Id
*ProjectsApi* | [**projectsGetProjectsForClient**](docs/ProjectsApi.md#projectsGetProjectsForClient) | **GET** /api/Projects/GetProjectsForClient | Get projects for a particular client
*ProjectsApi* | [**projectsUpdateProject**](docs/ProjectsApi.md#projectsUpdateProject) | **POST** /api/Projects/UpdateProject | Update a project
*ReportsApi* | [**reportsGetAllChartsDataAdmin**](docs/ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /api/Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects)
*ReportsApi* | [**reportsGetAllChartsDataUser**](docs/ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /api/Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs and Tasks)
*ReportsApi* | [**reportsGetOrgTripById**](docs/ReportsApi.md#reportsGetOrgTripById) | **GET** /api/Reports/GetOrgTripById | Get trip by Id, for reporting purposes
*ReportsApi* | [**reportsGetOrganisationTimesheetFileAttachments**](docs/ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /api/Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments
*ReportsApi* | [**reportsGetOrganisationTrips**](docs/ReportsApi.md#reportsGetOrganisationTrips) | **GET** /api/Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation)
*ReportsApi* | [**reportsGetRawDataAdmin**](docs/ReportsApi.md#reportsGetRawDataAdmin) | **GET** /api/Reports/GetRawDataAdmin | Get Timesheets Raw Data
*ReportsApi* | [**reportsProjectCostingsAdmin**](docs/ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /api/Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users
*ReportsApi* | [**reportsUserJobsOverTime**](docs/ReportsApi.md#reportsUserJobsOverTime) | **GET** /api/Reports/UserJobsOverTime | Timeseries jobs data for the logged in user
*TasksApi* | [**tasksCreateTask**](docs/TasksApi.md#tasksCreateTask) | **PUT** /api/Tasks/CreateTask | Create a task
*TasksApi* | [**tasksDeleteTask**](docs/TasksApi.md#tasksDeleteTask) | **DELETE** /api/Tasks/DeleteTask | Delete a task
*TasksApi* | [**tasksGetTaskById**](docs/TasksApi.md#tasksGetTaskById) | **GET** /api/Tasks/GetTaskById | Get a particular task by id
*TasksApi* | [**tasksGetTasks**](docs/TasksApi.md#tasksGetTasks) | **GET** /api/Tasks/GetTasks | Get tasks in your organisation
*TasksApi* | [**tasksGetTasksForJob**](docs/TasksApi.md#tasksGetTasksForJob) | **GET** /api/Tasks/GetTasksForJob | Get tasks for a particular job
*TasksApi* | [**tasksUpdateTask**](docs/TasksApi.md#tasksUpdateTask) | **POST** /api/Tasks/UpdateTask | Update a task
*TimesheetsApi* | [**timesheetsCreateSingleTimesheet**](docs/TimesheetsApi.md#timesheetsCreateSingleTimesheet) | **PUT** /api/Timesheets/CreateSingleTimesheet | Inserts a single timesheet record
*TimesheetsApi* | [**timesheetsDeleteTimesheet**](docs/TimesheetsApi.md#timesheetsDeleteTimesheet) | **DELETE** /api/Timesheets/DeleteTimesheet | Delete a timesheet
*TimesheetsApi* | [**timesheetsGetTimesheets**](docs/TimesheetsApi.md#timesheetsGetTimesheets) | **GET** /api/Timesheets/GetTimesheets | Get timesheets between start and end dates
*TimesheetsApi* | [**timesheetsUpdateTimesheets**](docs/TimesheetsApi.md#timesheetsUpdateTimesheets) | **POST** /api/Timesheets/UpdateTimesheets | Batch update timesheets
*TripsApi* | [**tripsCreateTrip**](docs/TripsApi.md#tripsCreateTrip) | **POST** /api/Trips/CreateTrip | Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.
*TripsApi* | [**tripsGetMyTripById**](docs/TripsApi.md#tripsGetMyTripById) | **GET** /api/Trips/GetMyTripById | Get trip by Id
*TripsApi* | [**tripsGetMyTrips**](docs/TripsApi.md#tripsGetMyTrips) | **GET** /api/Trips/GetMyTrips | Get my trips
*UserJobFavouritesApi* | [**userJobFavouritesCreateJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesCreateJobFavourite) | **PUT** /api/UserJobFavourites/CreateJobFavourite | Create a job favourite
*UserJobFavouritesApi* | [**userJobFavouritesDeleteJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesDeleteJobFavourite) | **DELETE** /api/UserJobFavourites/DeleteJobFavourite | Delete a job favourite
*UserJobFavouritesApi* | [**userJobFavouritesGetJobFavourites**](docs/UserJobFavouritesApi.md#userJobFavouritesGetJobFavourites) | **GET** /api/UserJobFavourites/GetJobFavourites | Get your job favourites
*UserPayRatesApi* | [**userPayRatesCreatePayRate**](docs/UserPayRatesApi.md#userPayRatesCreatePayRate) | **PUT** /api/UserPayRates/CreatePayRate | Create a new pay rate for a particular user, archiving the previous pay rate
*UserPayRatesApi* | [**userPayRatesGetPayRates**](docs/UserPayRatesApi.md#userPayRatesGetPayRates) | **GET** /api/UserPayRates/GetPayRates | Get a collection of pay rates for a particular user, specified by user id
*UserProfileApi* | [**userProfileDoLogin**](docs/UserProfileApi.md#userProfileDoLogin) | **POST** /api/UserProfile/DoLogin | 
*UserProfileApi* | [**userProfileDoLogout**](docs/UserProfileApi.md#userProfileDoLogout) | **DELETE** /api/UserProfile/DoLogout | 
*UserProfileApi* | [**userProfileGetMyProfile**](docs/UserProfileApi.md#userProfileGetMyProfile) | **GET** /api/UserProfile/GetMyProfile | 
*UserProfileApi* | [**userProfileKeepSessionAlive**](docs/UserProfileApi.md#userProfileKeepSessionAlive) | **GET** /api/UserProfile/KeepSessionAlive | 
*UserProfileApi* | [**userProfileUpdateMyProfile**](docs/UserProfileApi.md#userProfileUpdateMyProfile) | **POST** /api/UserProfile/UpdateMyProfile | 
*UsersApi* | [**usersCreateTimesheetUser**](docs/UsersApi.md#usersCreateTimesheetUser) | **PUT** /api/Users/CreateTimesheetUser | Create a user in your organisation
*UsersApi* | [**usersGetTimesheetUser**](docs/UsersApi.md#usersGetTimesheetUser) | **GET** /api/Users/GetTimesheetUser | Get a particular user in your organisation
*UsersApi* | [**usersGetTimesheetUsers**](docs/UsersApi.md#usersGetTimesheetUsers) | **GET** /api/Users/GetTimesheetUsers | Get users for your organisation
*UsersApi* | [**usersUpdateTimesheetUser**](docs/UsersApi.md#usersUpdateTimesheetUser) | **POST** /api/Users/UpdateTimesheetUser | Update a user
*UsualHoursApi* | [**usualHoursGetUsualHours**](docs/UsualHoursApi.md#usualHoursGetUsualHours) | **GET** /api/UsualHours/GetUsualHours | Get usual hours (rostered hours) for an employee
*UsualHoursApi* | [**usualHoursSetUsualHours**](docs/UsualHoursApi.md#usualHoursSetUsualHours) | **POST** /api/UsualHours/SetUsualHours | Set usual hours (rostered hours) for an employee


## Documentation for Models

 - [CsApiAggregateJobCode](docs/CsApiAggregateJobCode.md)
 - [CsApiAggregateJobTask](docs/CsApiAggregateJobTask.md)
 - [CsApiApiResponseBoolean](docs/CsApiApiResponseBoolean.md)
 - [CsApiApiResponseClient](docs/CsApiApiResponseClient.md)
 - [CsApiApiResponseCombinedReportsData](docs/CsApiApiResponseCombinedReportsData.md)
 - [CsApiApiResponseDoLoginResponse](docs/CsApiApiResponseDoLoginResponse.md)
 - [CsApiApiResponseFleetVehicle](docs/CsApiApiResponseFleetVehicle.md)
 - [CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment](docs/CsApiApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)
 - [CsApiApiResponseForPaginatedListOrgReportTrip](docs/CsApiApiResponseForPaginatedListOrgReportTrip.md)
 - [CsApiApiResponseForPaginatedListRawReportItem](docs/CsApiApiResponseForPaginatedListRawReportItem.md)
 - [CsApiApiResponseForPaginatedListTrip](docs/CsApiApiResponseForPaginatedListTrip.md)
 - [CsApiApiResponseInsertUserResponse](docs/CsApiApiResponseInsertUserResponse.md)
 - [CsApiApiResponseInt32](docs/CsApiApiResponseInt32.md)
 - [CsApiApiResponseJobCode](docs/CsApiApiResponseJobCode.md)
 - [CsApiApiResponseListAggregateJobCode](docs/CsApiApiResponseListAggregateJobCode.md)
 - [CsApiApiResponseListClient](docs/CsApiApiResponseListClient.md)
 - [CsApiApiResponseListFleetVehicle](docs/CsApiApiResponseListFleetVehicle.md)
 - [CsApiApiResponseListInt32](docs/CsApiApiResponseListInt32.md)
 - [CsApiApiResponseListJobCode](docs/CsApiApiResponseListJobCode.md)
 - [CsApiApiResponseListJobSeriesReportItem](docs/CsApiApiResponseListJobSeriesReportItem.md)
 - [CsApiApiResponseListOrganisationGroup](docs/CsApiApiResponseListOrganisationGroup.md)
 - [CsApiApiResponseListProject](docs/CsApiApiResponseListProject.md)
 - [CsApiApiResponseListProjectCostingReportItem](docs/CsApiApiResponseListProjectCostingReportItem.md)
 - [CsApiApiResponseListTimesheet](docs/CsApiApiResponseListTimesheet.md)
 - [CsApiApiResponseListTimesheetTask](docs/CsApiApiResponseListTimesheetTask.md)
 - [CsApiApiResponseListUserForManagement](docs/CsApiApiResponseListUserForManagement.md)
 - [CsApiApiResponseListUserHourlyRate](docs/CsApiApiResponseListUserHourlyRate.md)
 - [CsApiApiResponseListUserJobFavourite](docs/CsApiApiResponseListUserJobFavourite.md)
 - [CsApiApiResponseListUsualHoursDay](docs/CsApiApiResponseListUsualHoursDay.md)
 - [CsApiApiResponseOrganisation](docs/CsApiApiResponseOrganisation.md)
 - [CsApiApiResponseOrganisationGroup](docs/CsApiApiResponseOrganisationGroup.md)
 - [CsApiApiResponseProject](docs/CsApiApiResponseProject.md)
 - [CsApiApiResponseSignupResponse](docs/CsApiApiResponseSignupResponse.md)
 - [CsApiApiResponseTimesheetTask](docs/CsApiApiResponseTimesheetTask.md)
 - [CsApiApiResponseTrip](docs/CsApiApiResponseTrip.md)
 - [CsApiApiResponseUpdateOrganisationResponse](docs/CsApiApiResponseUpdateOrganisationResponse.md)
 - [CsApiApiResponseUpdateUserResponse](docs/CsApiApiResponseUpdateUserResponse.md)
 - [CsApiApiResponseUserForManagement](docs/CsApiApiResponseUserForManagement.md)
 - [CsApiApiResponseUserProfile](docs/CsApiApiResponseUserProfile.md)
 - [CsApiBatchUpdateTimesheetRequest](docs/CsApiBatchUpdateTimesheetRequest.md)
 - [CsApiClient](docs/CsApiClient.md)
 - [CsApiClientSeriesReportItem](docs/CsApiClientSeriesReportItem.md)
 - [CsApiClientSideUser](docs/CsApiClientSideUser.md)
 - [CsApiClientTotalsReportItem](docs/CsApiClientTotalsReportItem.md)
 - [CsApiCombinedReportsData](docs/CsApiCombinedReportsData.md)
 - [CsApiCreateTripRequest](docs/CsApiCreateTripRequest.md)
 - [CsApiDoLoginRequest](docs/CsApiDoLoginRequest.md)
 - [CsApiDoLoginResponse](docs/CsApiDoLoginResponse.md)
 - [CsApiFleetVehicle](docs/CsApiFleetVehicle.md)
 - [CsApiInsertClientRequest](docs/CsApiInsertClientRequest.md)
 - [CsApiInsertJobCodeRequest](docs/CsApiInsertJobCodeRequest.md)
 - [CsApiInsertOrganisationGroupRequest](docs/CsApiInsertOrganisationGroupRequest.md)
 - [CsApiInsertProjectRequest](docs/CsApiInsertProjectRequest.md)
 - [CsApiInsertTaskRequest](docs/CsApiInsertTaskRequest.md)
 - [CsApiInsertUserHourlyRateRequest](docs/CsApiInsertUserHourlyRateRequest.md)
 - [CsApiInsertUserJobFavouriteRequest](docs/CsApiInsertUserJobFavouriteRequest.md)
 - [CsApiInsertUserRequest](docs/CsApiInsertUserRequest.md)
 - [CsApiInsertUserResponse](docs/CsApiInsertUserResponse.md)
 - [CsApiInsertVehicleRequest](docs/CsApiInsertVehicleRequest.md)
 - [CsApiJobCode](docs/CsApiJobCode.md)
 - [CsApiJobSeriesReportItem](docs/CsApiJobSeriesReportItem.md)
 - [CsApiJobTotalsReportItem](docs/CsApiJobTotalsReportItem.md)
 - [CsApiOrgReportTimesheetFileAttachment](docs/CsApiOrgReportTimesheetFileAttachment.md)
 - [CsApiOrgReportTrip](docs/CsApiOrgReportTrip.md)
 - [CsApiOrganisation](docs/CsApiOrganisation.md)
 - [CsApiOrganisationGroup](docs/CsApiOrganisationGroup.md)
 - [CsApiProject](docs/CsApiProject.md)
 - [CsApiProjectCostingReportItem](docs/CsApiProjectCostingReportItem.md)
 - [CsApiProjectSeriesReportItem](docs/CsApiProjectSeriesReportItem.md)
 - [CsApiProjectTotalsReportItem](docs/CsApiProjectTotalsReportItem.md)
 - [CsApiRawReportItem](docs/CsApiRawReportItem.md)
 - [CsApiSaveClientRequest](docs/CsApiSaveClientRequest.md)
 - [CsApiSaveOrganisationGroupRequest](docs/CsApiSaveOrganisationGroupRequest.md)
 - [CsApiSaveVehicleRequest](docs/CsApiSaveVehicleRequest.md)
 - [CsApiSetOrganisationGroupUsersRequest](docs/CsApiSetOrganisationGroupUsersRequest.md)
 - [CsApiSetUsualHoursRequest](docs/CsApiSetUsualHoursRequest.md)
 - [CsApiSignupResponse](docs/CsApiSignupResponse.md)
 - [CsApiTaskSeriesReportItem](docs/CsApiTaskSeriesReportItem.md)
 - [CsApiTaskTotalsReportItem](docs/CsApiTaskTotalsReportItem.md)
 - [CsApiTimeSlot](docs/CsApiTimeSlot.md)
 - [CsApiTimesheet](docs/CsApiTimesheet.md)
 - [CsApiTimesheetTask](docs/CsApiTimesheetTask.md)
 - [CsApiTrip](docs/CsApiTrip.md)
 - [CsApiTripCoordinate](docs/CsApiTripCoordinate.md)
 - [CsApiUpdateJobCodeRequest](docs/CsApiUpdateJobCodeRequest.md)
 - [CsApiUpdateMyProfileRequest](docs/CsApiUpdateMyProfileRequest.md)
 - [CsApiUpdateOrganisationRequest](docs/CsApiUpdateOrganisationRequest.md)
 - [CsApiUpdateOrganisationResponse](docs/CsApiUpdateOrganisationResponse.md)
 - [CsApiUpdateProjectRequest](docs/CsApiUpdateProjectRequest.md)
 - [CsApiUpdateTaskRequest](docs/CsApiUpdateTaskRequest.md)
 - [CsApiUpdateUserRequest](docs/CsApiUpdateUserRequest.md)
 - [CsApiUpdateUserResponse](docs/CsApiUpdateUserResponse.md)
 - [CsApiUserForManagement](docs/CsApiUserForManagement.md)
 - [CsApiUserHourlyRate](docs/CsApiUserHourlyRate.md)
 - [CsApiUserJobFavourite](docs/CsApiUserJobFavourite.md)
 - [CsApiUserProfile](docs/CsApiUserProfile.md)
 - [CsApiUsualHoursDay](docs/CsApiUsualHoursDay.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### x-chronosheets-auth

- **Type**: API key
- **API key parameter name**: x-chronosheets-auth
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




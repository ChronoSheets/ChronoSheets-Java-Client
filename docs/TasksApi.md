# TasksApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tasksCreateTask**](TasksApi.md#tasksCreateTask) | **PUT** /api/Tasks/CreateTask | Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
[**tasksDeleteTask**](TasksApi.md#tasksDeleteTask) | **DELETE** /api/Tasks/DeleteTask | Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
[**tasksGetTaskById**](TasksApi.md#tasksGetTaskById) | **GET** /api/Tasks/GetTaskById | Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksGetTasks**](TasksApi.md#tasksGetTasks) | **GET** /api/Tasks/GetTasks | Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksGetTasksForJob**](TasksApi.md#tasksGetTasksForJob) | **GET** /api/Tasks/GetTasksForJob | Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksUpdateTask**](TasksApi.md#tasksUpdateTask) | **POST** /api/Tasks/UpdateTask | Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.


<a name="tasksCreateTask"></a>
# **tasksCreateTask**
> CSApiResponseInt32 tasksCreateTask(request, xChronosheetsAuth)

Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
CSInsertTaskRequest request = new CSInsertTaskRequest(); // CSInsertTaskRequest | An Insert Task Request object containing values for the new Task to create
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseInt32 result = apiInstance.tasksCreateTask(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksCreateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSInsertTaskRequest**](CSInsertTaskRequest.md)| An Insert Task Request object containing values for the new Task to create |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseInt32**](CSApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tasksDeleteTask"></a>
# **tasksDeleteTask**
> CSApiResponseBoolean tasksDeleteTask(taskId, xChronosheetsAuth)

Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
Integer taskId = 56; // Integer | The ID of the Task you want to delete
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.tasksDeleteTask(taskId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksDeleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Integer**| The ID of the Task you want to delete |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tasksGetTaskById"></a>
# **tasksGetTaskById**
> CSApiResponseTimesheetTask tasksGetTaskById(taskId, xChronosheetsAuth)

Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
Integer taskId = 56; // Integer | The ID of the TimesheetTask you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseTimesheetTask result = apiInstance.tasksGetTaskById(taskId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Integer**| The ID of the TimesheetTask you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseTimesheetTask**](CSApiResponseTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tasksGetTasks"></a>
# **tasksGetTasks**
> CSApiResponseListTimesheetTask tasksGetTasks(xChronosheetsAuth)

Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListTimesheetTask result = apiInstance.tasksGetTasks(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListTimesheetTask**](CSApiResponseListTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tasksGetTasksForJob"></a>
# **tasksGetTasksForJob**
> CSApiResponseListTimesheetTask tasksGetTasksForJob(jobId, xChronosheetsAuth)

Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
Integer jobId = 56; // Integer | The ID of the job
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseListTimesheetTask result = apiInstance.tasksGetTasksForJob(jobId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTasksForJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| The ID of the job |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseListTimesheetTask**](CSApiResponseListTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="tasksUpdateTask"></a>
# **tasksUpdateTask**
> CSApiResponseBoolean tasksUpdateTask(request, xChronosheetsAuth)

Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.TasksApi;


TasksApi apiInstance = new TasksApi();
CSUpdateTaskRequest request = new CSUpdateTaskRequest(); // CSUpdateTaskRequest | An Update Task Request object containing updated fields.  Make sure to specify the Task Id in the request object so that ChronoSheets knows which Task to update
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CSApiResponseBoolean result = apiInstance.tasksUpdateTask(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksUpdateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CSUpdateTaskRequest**](CSUpdateTaskRequest.md)| An Update Task Request object containing updated fields.  Make sure to specify the Task Id in the request object so that ChronoSheets knows which Task to update |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CSApiResponseBoolean**](CSApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


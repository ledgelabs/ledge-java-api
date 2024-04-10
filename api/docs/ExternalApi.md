# ExternalApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGoal**](ExternalApi.md#createGoal) | **POST** /external/{key}/goal |  |
| [**createQuest**](ExternalApi.md#createQuest) | **POST** /external/quests |  |
| [**createQuestSchedule**](ExternalApi.md#createQuestSchedule) | **POST** /external/{key}/questSchedule |  |
| [**getExternalUser**](ExternalApi.md#getExternalUser) | **GET** /external/{key}/external-user |  |
| [**getMyGoals**](ExternalApi.md#getMyGoals) | **GET** /external/my-goals |  |
| [**getMyQuests**](ExternalApi.md#getMyQuests) | **GET** /external/my-quests |  |
| [**registerUser**](ExternalApi.md#registerUser) | **POST** /external/{key}/user |  |
| [**trackActivity**](ExternalApi.md#trackActivity) | **POST** /external/{key}/activity |  |


<a id="createGoal"></a>
# **createGoal**
> TrackActivity200Response createGoal(key, createGoalRequest)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String key = "key_example"; // String | 
    CreateGoalRequest createGoalRequest = new CreateGoalRequest(); // CreateGoalRequest | 
    try {
      TrackActivity200Response result = apiInstance.createGoal(key, createGoalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#createGoal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**|  | |
| **createGoalRequest** | [**CreateGoalRequest**](CreateGoalRequest.md)|  | |

### Return type

[**TrackActivity200Response**](TrackActivity200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |

<a id="createQuest"></a>
# **createQuest**
> TrackActivity200Response createQuest(apiKey, createQuestRequest)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String apiKey = "apiKey_example"; // String | 
    CreateQuestRequest createQuestRequest = new CreateQuestRequest(); // CreateQuestRequest | 
    try {
      TrackActivity200Response result = apiInstance.createQuest(apiKey, createQuestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#createQuest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **createQuestRequest** | [**CreateQuestRequest**](CreateQuestRequest.md)|  | |

### Return type

[**TrackActivity200Response**](TrackActivity200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |

<a id="createQuestSchedule"></a>
# **createQuestSchedule**
> CreateQuestSchedule200Response createQuestSchedule(key, createQuestScheduleRequest)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String key = "key_example"; // String | 
    CreateQuestScheduleRequest createQuestScheduleRequest = new CreateQuestScheduleRequest(); // CreateQuestScheduleRequest | 
    try {
      CreateQuestSchedule200Response result = apiInstance.createQuestSchedule(key, createQuestScheduleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#createQuestSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**|  | |
| **createQuestScheduleRequest** | [**CreateQuestScheduleRequest**](CreateQuestScheduleRequest.md)|  | |

### Return type

[**CreateQuestSchedule200Response**](CreateQuestSchedule200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |

<a id="getExternalUser"></a>
# **getExternalUser**
> User getExternalUser(key, externalId, gameId)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String key = "key_example"; // String | 
    String externalId = "externalId_example"; // String | 
    String gameId = "gameId_example"; // String | 
    try {
      User result = apiInstance.getExternalUser(key, externalId, gameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#getExternalUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**|  | |
| **externalId** | **String**|  | |
| **gameId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |

<a id="getMyGoals"></a>
# **getMyGoals**
> List&lt;Goal&gt; getMyGoals(apiKey)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String apiKey = "apiKey_example"; // String | given by the Ledge admins.
    try {
      List<Goal> result = apiInstance.getMyGoals(apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#getMyGoals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| given by the Ledge admins. | |

### Return type

[**List&lt;Goal&gt;**](Goal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | quests created by this api key |  -  |
| **0** |  |  -  |

<a id="getMyQuests"></a>
# **getMyQuests**
> List&lt;Quest&gt; getMyQuests(apiKey)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String apiKey = "apiKey_example"; // String | given by the Ledge admins.
    try {
      List<Quest> result = apiInstance.getMyQuests(apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#getMyQuests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| given by the Ledge admins. | |

### Return type

[**List&lt;Quest&gt;**](Quest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | quests created by this api key |  -  |
| **0** |  |  -  |

<a id="registerUser"></a>
# **registerUser**
> User registerUser(key, externalUser)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String key = "key_example"; // String | 
    ExternalUser externalUser = new ExternalUser(); // ExternalUser | 
    try {
      User result = apiInstance.registerUser(key, externalUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#registerUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**|  | |
| **externalUser** | [**ExternalUser**](ExternalUser.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |

<a id="trackActivity"></a>
# **trackActivity**
> TrackActivity200Response trackActivity(key, externalActivity)



### Example
```java
// Import classes:
import io.ledge.openapi.ApiClient;
import io.ledge.openapi.ApiException;
import io.ledge.openapi.Configuration;
import io.ledge.openapi.models.*;
import io.ledge.openapi.api.ExternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExternalApi apiInstance = new ExternalApi(defaultClient);
    String key = "key_example"; // String | 
    ExternalActivity externalActivity = new ExternalActivity(); // ExternalActivity | 
    try {
      TrackActivity200Response result = apiInstance.trackActivity(key, externalActivity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalApi#trackActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**|  | |
| **externalActivity** | [**ExternalActivity**](ExternalActivity.md)|  | |

### Return type

[**TrackActivity200Response**](TrackActivity200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** |  |  -  |


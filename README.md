# ledge-java-api

@ledge/external-api
- API version: 1.0.0
  - Build date: 2024-04-10T12:19:48.827328-07:00[America/Vancouver]
  - Generator version: 7.4.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.ledge</groupId>
  <artifactId>ledge-java-api</artifactId>
  <version>0.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'ledge-java-api' jar has been published to maven central.
    mavenLocal()       // Needed if the 'ledge-java-api' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "io.ledge:ledge-java-api:0.0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ledge-java-api-0.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ExternalApi* | [**createGoal**](docs/ExternalApi.md#createGoal) | **POST** /external/{key}/goal | 
*ExternalApi* | [**createQuest**](docs/ExternalApi.md#createQuest) | **POST** /external/quests | 
*ExternalApi* | [**createQuestSchedule**](docs/ExternalApi.md#createQuestSchedule) | **POST** /external/{key}/questSchedule | 
*ExternalApi* | [**getExternalUser**](docs/ExternalApi.md#getExternalUser) | **GET** /external/{key}/external-user | 
*ExternalApi* | [**getMyGoals**](docs/ExternalApi.md#getMyGoals) | **GET** /external/my-goals | 
*ExternalApi* | [**getMyQuests**](docs/ExternalApi.md#getMyQuests) | **GET** /external/my-quests | 
*ExternalApi* | [**registerUser**](docs/ExternalApi.md#registerUser) | **POST** /external/{key}/user | 
*ExternalApi* | [**trackActivity**](docs/ExternalApi.md#trackActivity) | **POST** /external/{key}/activity | 


## Documentation for Models

 - [ActivityType](docs/ActivityType.md)
 - [CreateGoalRequest](docs/CreateGoalRequest.md)
 - [CreateQuestRequest](docs/CreateQuestRequest.md)
 - [CreateQuestSchedule200Response](docs/CreateQuestSchedule200Response.md)
 - [CreateQuestScheduleRequest](docs/CreateQuestScheduleRequest.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ExternalActivity](docs/ExternalActivity.md)
 - [ExternalUser](docs/ExternalUser.md)
 - [Gender](docs/Gender.md)
 - [Goal](docs/Goal.md)
 - [Quest](docs/Quest.md)
 - [QuestSchedule](docs/QuestSchedule.md)
 - [QuestType](docs/QuestType.md)
 - [TrackActivity200Response](docs/TrackActivity200Response.md)
 - [User](docs/User.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




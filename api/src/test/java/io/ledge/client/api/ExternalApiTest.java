/*
 * @ledge/external-api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.ledge.client.api;

import io.ledge.client.ApiException;
import org.openapitools.client.model.CreateGoalRequest;
import org.openapitools.client.model.CreateQuestRequest;
import org.openapitools.client.model.CreateQuestSchedule200Response;
import org.openapitools.client.model.CreateQuestScheduleRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ExternalActivity;
import org.openapitools.client.model.ExternalUser;
import org.openapitools.client.model.Goal;
import org.openapitools.client.model.Quest;
import org.openapitools.client.model.TrackActivity200Response;
import org.openapitools.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalApi
 */
@Disabled
public class ExternalApiTest {

    private final ExternalApi api = new ExternalApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGoalTest() throws ApiException {
        String key = null;
        CreateGoalRequest createGoalRequest = null;
        TrackActivity200Response response = api.createGoal(key, createGoalRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createQuestTest() throws ApiException {
        String apiKey = null;
        CreateQuestRequest createQuestRequest = null;
        TrackActivity200Response response = api.createQuest(apiKey, createQuestRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createQuestScheduleTest() throws ApiException {
        String key = null;
        CreateQuestScheduleRequest createQuestScheduleRequest = null;
        CreateQuestSchedule200Response response = api.createQuestSchedule(key, createQuestScheduleRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExternalUserTest() throws ApiException {
        String key = null;
        String externalId = null;
        String gameId = null;
        User response = api.getExternalUser(key, externalId, gameId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyGoalsTest() throws ApiException {
        String apiKey = null;
        List<Goal> response = api.getMyGoals(apiKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyQuestsTest() throws ApiException {
        String apiKey = null;
        List<Quest> response = api.getMyQuests(apiKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerUserTest() throws ApiException {
        String key = null;
        ExternalUser externalUser = null;
        User response = api.registerUser(key, externalUser);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void trackActivityTest() throws ApiException {
        String key = null;
        ExternalActivity externalActivity = null;
        TrackActivity200Response response = api.trackActivity(key, externalActivity);
        // TODO: test validations
    }

}

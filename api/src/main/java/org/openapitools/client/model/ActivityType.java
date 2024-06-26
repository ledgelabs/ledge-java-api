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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enums
 */
@JsonAdapter(ActivityType.Adapter.class)
public enum ActivityType {
  
  USER_SIGN_UP("USER_SIGN_UP"),
  
  REFERRAL("REFERRAL"),
  
  GAME_CLICK("GAME_CLICK"),
  
  SOCIAL_CLICK("SOCIAL_CLICK"),
  
  EXTERNAL("EXTERNAL"),
  
  ACTIVITY_RESUMED("ACTIVITY_RESUMED"),
  
  ACTIVITY_PAUSED("ACTIVITY_PAUSED"),
  
  ACTIVITY_STOPPED("ACTIVITY_STOPPED"),
  
  FOREGROUND_SERVICE_START("FOREGROUND_SERVICE_START"),
  
  FOREGROUND_SERVICE_STOP("FOREGROUND_SERVICE_STOP"),
  
  GAME_INSTALLED("GAME_INSTALLED");

  private String value;

  ActivityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityType fromValue(String value) {
    for (ActivityType b : ActivityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ActivityType.fromValue(value);
  }
}


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


package io.ledge.openapi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Gender
 */
@JsonAdapter(Gender.Adapter.class)
public enum Gender {
  
  MALE("male"),
  
  FEMALE("female"),
  
  OTHER("other"),
  
  UNKNOWN("unknown");

  private String value;

  Gender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Gender fromValue(String value) {
    for (Gender b : Gender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Gender> {
    @Override
    public void write(final JsonWriter jsonWriter, final Gender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Gender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Gender.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Gender.fromValue(value);
  }
}


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.ledge.openapi.model.QuestSchedule;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.ledge.openapi.JSON;

/**
 * CreateQuestSchedule200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T12:23:48.277888-07:00[America/Vancouver]", comments = "Generator version: 7.4.0")
public class CreateQuestSchedule200Response {
  public static final String SERIALIZED_NAME_QUEST_SCHEDULE = "questSchedule";
  @SerializedName(SERIALIZED_NAME_QUEST_SCHEDULE)
  private QuestSchedule questSchedule;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public CreateQuestSchedule200Response() {
  }

  public CreateQuestSchedule200Response questSchedule(QuestSchedule questSchedule) {
    this.questSchedule = questSchedule;
    return this;
  }

   /**
   * Get questSchedule
   * @return questSchedule
  **/
  @javax.annotation.Nullable
  public QuestSchedule getQuestSchedule() {
    return questSchedule;
  }

  public void setQuestSchedule(QuestSchedule questSchedule) {
    this.questSchedule = questSchedule;
  }


  public CreateQuestSchedule200Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQuestSchedule200Response createQuestSchedule200Response = (CreateQuestSchedule200Response) o;
    return Objects.equals(this.questSchedule, createQuestSchedule200Response.questSchedule) &&
        Objects.equals(this.message, createQuestSchedule200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questSchedule, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQuestSchedule200Response {\n");
    sb.append("    questSchedule: ").append(toIndentedString(questSchedule)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("questSchedule");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateQuestSchedule200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateQuestSchedule200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateQuestSchedule200Response is not found in the empty JSON string", CreateQuestSchedule200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateQuestSchedule200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateQuestSchedule200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateQuestSchedule200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `questSchedule`
      if (jsonObj.get("questSchedule") != null && !jsonObj.get("questSchedule").isJsonNull()) {
        QuestSchedule.validateJsonElement(jsonObj.get("questSchedule"));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateQuestSchedule200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateQuestSchedule200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateQuestSchedule200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateQuestSchedule200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateQuestSchedule200Response>() {
           @Override
           public void write(JsonWriter out, CreateQuestSchedule200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateQuestSchedule200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateQuestSchedule200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateQuestSchedule200Response
  * @throws IOException if the JSON string is invalid with respect to CreateQuestSchedule200Response
  */
  public static CreateQuestSchedule200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateQuestSchedule200Response.class);
  }

 /**
  * Convert an instance of CreateQuestSchedule200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


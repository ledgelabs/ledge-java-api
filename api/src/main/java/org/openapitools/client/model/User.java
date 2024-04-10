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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Gender;

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

import io.ledge.client.JSON;

/**
 * Model User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-09T14:21:54.111467-07:00[America/Vancouver]", comments = "Generator version: 7.4.0")
public class User {
  public static final String SERIALIZED_NAME_LAST_LOGIN = "lastLogin";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_MERGED_WITH = "mergedWith";
  @SerializedName(SERIALIZED_NAME_MERGED_WITH)
  private String mergedWith;

  public static final String SERIALIZED_NAME_GAME_ID = "gameId";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_REFERRED_BY_ID = "referredById";
  @SerializedName(SERIALIZED_NAME_REFERRED_BY_ID)
  private String referredById;

  public static final String SERIALIZED_NAME_ENABLE_NOTIFICATIONS = "enableNotifications";
  @SerializedName(SERIALIZED_NAME_ENABLE_NOTIFICATIONS)
  private Boolean enableNotifications;

  public static final String SERIALIZED_NAME_HAS_ACCEPTED_LEGAL = "hasAcceptedLegal";
  @SerializedName(SERIALIZED_NAME_HAS_ACCEPTED_LEGAL)
  private Boolean hasAcceptedLegal;

  public static final String SERIALIZED_NAME_HAS_ONBOARDED = "hasOnboarded";
  @SerializedName(SERIALIZED_NAME_HAS_ONBOARDED)
  private Boolean hasOnboarded;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Gender gender;

  public static final String SERIALIZED_NAME_BIRTH_YEAR = "birthYear";
  @SerializedName(SERIALIZED_NAME_BIRTH_YEAR)
  private Double birthYear;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_REMAINING_REFERRALS = "remainingReferrals";
  @SerializedName(SERIALIZED_NAME_REMAINING_REFERRALS)
  private Double remainingReferrals;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_USERTAG = "usertag";
  @SerializedName(SERIALIZED_NAME_USERTAG)
  private Double usertag;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public User() {
  }

  public User lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public User verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @javax.annotation.Nonnull
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public User mergedWith(String mergedWith) {
    this.mergedWith = mergedWith;
    return this;
  }

   /**
   * Get mergedWith
   * @return mergedWith
  **/
  @javax.annotation.Nullable
  public String getMergedWith() {
    return mergedWith;
  }

  public void setMergedWith(String mergedWith) {
    this.mergedWith = mergedWith;
  }


  public User gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  @javax.annotation.Nullable
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  public User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public User referredById(String referredById) {
    this.referredById = referredById;
    return this;
  }

   /**
   * Get referredById
   * @return referredById
  **/
  @javax.annotation.Nullable
  public String getReferredById() {
    return referredById;
  }

  public void setReferredById(String referredById) {
    this.referredById = referredById;
  }


  public User enableNotifications(Boolean enableNotifications) {
    this.enableNotifications = enableNotifications;
    return this;
  }

   /**
   * Get enableNotifications
   * @return enableNotifications
  **/
  @javax.annotation.Nonnull
  public Boolean getEnableNotifications() {
    return enableNotifications;
  }

  public void setEnableNotifications(Boolean enableNotifications) {
    this.enableNotifications = enableNotifications;
  }


  public User hasAcceptedLegal(Boolean hasAcceptedLegal) {
    this.hasAcceptedLegal = hasAcceptedLegal;
    return this;
  }

   /**
   * Get hasAcceptedLegal
   * @return hasAcceptedLegal
  **/
  @javax.annotation.Nonnull
  public Boolean getHasAcceptedLegal() {
    return hasAcceptedLegal;
  }

  public void setHasAcceptedLegal(Boolean hasAcceptedLegal) {
    this.hasAcceptedLegal = hasAcceptedLegal;
  }


  public User hasOnboarded(Boolean hasOnboarded) {
    this.hasOnboarded = hasOnboarded;
    return this;
  }

   /**
   * Get hasOnboarded
   * @return hasOnboarded
  **/
  @javax.annotation.Nonnull
  public Boolean getHasOnboarded() {
    return hasOnboarded;
  }

  public void setHasOnboarded(Boolean hasOnboarded) {
    this.hasOnboarded = hasOnboarded;
  }


  public User gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nonnull
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }


  public User birthYear(Double birthYear) {
    this.birthYear = birthYear;
    return this;
  }

   /**
   * Get birthYear
   * @return birthYear
  **/
  @javax.annotation.Nonnull
  public Double getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(Double birthYear) {
    this.birthYear = birthYear;
  }


  public User avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nonnull
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public User remainingReferrals(Double remainingReferrals) {
    this.remainingReferrals = remainingReferrals;
    return this;
  }

   /**
   * Get remainingReferrals
   * @return remainingReferrals
  **/
  @javax.annotation.Nonnull
  public Double getRemainingReferrals() {
    return remainingReferrals;
  }

  public void setRemainingReferrals(Double remainingReferrals) {
    this.remainingReferrals = remainingReferrals;
  }


  public User code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public User usertag(Double usertag) {
    this.usertag = usertag;
    return this;
  }

   /**
   * Get usertag
   * @return usertag
  **/
  @javax.annotation.Nonnull
  public Double getUsertag() {
    return usertag;
  }

  public void setUsertag(Double usertag) {
    this.usertag = usertag;
  }


  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public User phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public User updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public User createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public User id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.verified, user.verified) &&
        Objects.equals(this.mergedWith, user.mergedWith) &&
        Objects.equals(this.gameId, user.gameId) &&
        Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.referredById, user.referredById) &&
        Objects.equals(this.enableNotifications, user.enableNotifications) &&
        Objects.equals(this.hasAcceptedLegal, user.hasAcceptedLegal) &&
        Objects.equals(this.hasOnboarded, user.hasOnboarded) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.birthYear, user.birthYear) &&
        Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.remainingReferrals, user.remainingReferrals) &&
        Objects.equals(this.code, user.code) &&
        Objects.equals(this.usertag, user.usertag) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.phoneNumber, user.phoneNumber) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.id, user.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastLogin, verified, mergedWith, gameId, externalId, referredById, enableNotifications, hasAcceptedLegal, hasOnboarded, gender, birthYear, avatar, remainingReferrals, code, usertag, username, name, phoneNumber, email, updatedAt, createdAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    mergedWith: ").append(toIndentedString(mergedWith)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    referredById: ").append(toIndentedString(referredById)).append("\n");
    sb.append("    enableNotifications: ").append(toIndentedString(enableNotifications)).append("\n");
    sb.append("    hasAcceptedLegal: ").append(toIndentedString(hasAcceptedLegal)).append("\n");
    sb.append("    hasOnboarded: ").append(toIndentedString(hasOnboarded)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthYear: ").append(toIndentedString(birthYear)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    remainingReferrals: ").append(toIndentedString(remainingReferrals)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    usertag: ").append(toIndentedString(usertag)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("lastLogin");
    openapiFields.add("verified");
    openapiFields.add("mergedWith");
    openapiFields.add("gameId");
    openapiFields.add("externalId");
    openapiFields.add("referredById");
    openapiFields.add("enableNotifications");
    openapiFields.add("hasAcceptedLegal");
    openapiFields.add("hasOnboarded");
    openapiFields.add("gender");
    openapiFields.add("birthYear");
    openapiFields.add("avatar");
    openapiFields.add("remainingReferrals");
    openapiFields.add("code");
    openapiFields.add("usertag");
    openapiFields.add("username");
    openapiFields.add("name");
    openapiFields.add("phoneNumber");
    openapiFields.add("email");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lastLogin");
    openapiRequiredFields.add("verified");
    openapiRequiredFields.add("mergedWith");
    openapiRequiredFields.add("gameId");
    openapiRequiredFields.add("externalId");
    openapiRequiredFields.add("referredById");
    openapiRequiredFields.add("enableNotifications");
    openapiRequiredFields.add("hasAcceptedLegal");
    openapiRequiredFields.add("hasOnboarded");
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("birthYear");
    openapiRequiredFields.add("avatar");
    openapiRequiredFields.add("remainingReferrals");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("usertag");
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phoneNumber");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to User
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mergedWith") != null && !jsonObj.get("mergedWith").isJsonNull()) && !jsonObj.get("mergedWith").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mergedWith` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mergedWith").toString()));
      }
      if ((jsonObj.get("gameId") != null && !jsonObj.get("gameId").isJsonNull()) && !jsonObj.get("gameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gameId").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("referredById") != null && !jsonObj.get("referredById").isJsonNull()) && !jsonObj.get("referredById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referredById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referredById").toString()));
      }
      // validate the required field `gender`
      Gender.validateJsonElement(jsonObj.get("gender"));
      if (!jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


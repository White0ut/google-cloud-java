/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class SecurityPolicyReference implements ApiMessage {
  private final String securityPolicy;

  private SecurityPolicyReference() {
    this.securityPolicy = null;
  }

  private SecurityPolicyReference(String securityPolicy) {
    this.securityPolicy = securityPolicy;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("securityPolicy".equals(fieldName)) {
      return securityPolicy;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getSecurityPolicy() {
    return securityPolicy;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SecurityPolicyReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SecurityPolicyReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SecurityPolicyReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SecurityPolicyReference();
  }

  public static class Builder {
    private String securityPolicy;

    Builder() {}

    public Builder mergeFrom(SecurityPolicyReference other) {
      if (other == SecurityPolicyReference.getDefaultInstance()) return this;
      if (other.getSecurityPolicy() != null) {
        this.securityPolicy = other.securityPolicy;
      }
      return this;
    }

    Builder(SecurityPolicyReference source) {
      this.securityPolicy = source.securityPolicy;
    }

    public String getSecurityPolicy() {
      return securityPolicy;
    }

    public Builder setSecurityPolicy(String securityPolicy) {
      this.securityPolicy = securityPolicy;
      return this;
    }

    public SecurityPolicyReference build() {
      return new SecurityPolicyReference(securityPolicy);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setSecurityPolicy(this.securityPolicy);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SecurityPolicyReference{" + "securityPolicy=" + securityPolicy + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SecurityPolicyReference) {
      SecurityPolicyReference that = (SecurityPolicyReference) o;
      return Objects.equals(this.securityPolicy, that.getSecurityPolicy());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityPolicy);
  }
}

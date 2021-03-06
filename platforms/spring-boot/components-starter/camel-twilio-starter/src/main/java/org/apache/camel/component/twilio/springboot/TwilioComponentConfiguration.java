/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.twilio.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.twilio.internal.TwilioApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Twilio component allows you to interact with the Twilio REST APIs using
 * Twilio Java SDK.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.twilio")
public class TwilioComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the twilio component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private TwilioConfigurationNestedConfiguration configuration;
    /**
     * To use the shared REST client. The option is a
     * com.twilio.http.TwilioRestClient type.
     */
    private String restClient;
    /**
     * The account to use.
     */
    private String username;
    /**
     * Auth token for the account.
     */
    private String password;
    /**
     * The account SID to use.
     */
    private String accountSid;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public TwilioConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            TwilioConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getRestClient() {
        return restClient;
    }

    public void setRestClient(String restClient) {
        this.restClient = restClient;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class TwilioConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.twilio.TwilioConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private TwilioApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;

        public TwilioApiName getApiName() {
            return apiName;
        }

        public void setApiName(TwilioApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }
    }
}
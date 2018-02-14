/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.identity.carbon.user.consent.mgt.backend.jsonParser;

/**
 * Class that contains the fields to keep the JSON fields of the data controller.
 */
public class JSONDataController {

    private String organizationName;
    private String phone;
    private String contact;
    private String email;
    private String policyUrl;
    private JSONAddress address;

    public String getOrg() {

        return organizationName;
    }

    public void setOrg(String org) {

        this.organizationName = org;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getContact() {

        return contact;
    }

    public void setContact(String contact) {

        this.contact = contact;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPolicyUrl() {

        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {

        this.policyUrl = policyUrl;
    }

    public JSONAddress getAddress() {

        return address;
    }

    public void setAddress(JSONAddress address) {

        this.address = address;
    }
}

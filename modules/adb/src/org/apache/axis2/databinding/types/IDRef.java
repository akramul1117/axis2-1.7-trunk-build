/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.databinding.types;


/**
 * Custom class for supporting XSD data type IDRef
 *
 * @see <a href="http://www.w3.org/TR/xmlschema-2/#IDREF">XML Schema 3.3.10 IDREFS</a>
 */
public class IDRef extends NCName {

    private static final long serialVersionUID = 6821835065939868576L;

    public IDRef() {
        super();
    }

    /**
     * ctor for IDRef
     *
     * @throws IllegalArgumentException will be thrown if validation fails
     */
    public IDRef(String stValue) throws IllegalArgumentException {
        super(stValue);
    }
}

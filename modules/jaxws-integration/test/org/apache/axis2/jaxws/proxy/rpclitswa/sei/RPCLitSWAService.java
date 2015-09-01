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

package org.apache.axis2.jaxws.proxy.rpclitswa.sei;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b15-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "RPCLitSWAService", targetNamespace = "http://org/apache/axis2/jaxws/proxy/rpclitswa", wsdlLocation = "rpclitswa.wsdl")
public class RPCLitSWAService
    extends Service
{

    private final static URL RPCLITSWAERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("file:/C:/defects/rpclitswa.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        RPCLITSWAERVICE_WSDL_LOCATION = url;
    }

    public RPCLitSWAService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RPCLitSWAService() {
        super(RPCLITSWAERVICE_WSDL_LOCATION, new QName("http://org/apache/axis2/jaxws/proxy/rpclitswa", "RPCLitSWAService"));
    }

    /**
     * 
     * @return
     *     returns RPCLitSWA
     */
    @WebEndpoint(name = "RPCLitSWA")
    public RPCLitSWA getRPCLitSWA() {
        return (RPCLitSWA)super.getPort(new QName("http://org/apache/axis2/jaxws/proxy/rpclitswa", "RPCLitSWA"), RPCLitSWA.class);
    }

}

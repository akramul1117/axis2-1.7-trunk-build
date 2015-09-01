/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.axis2.classloader;

import java.util.jar.Manifest;
import java.io.IOException;
import java.net.URL;

/**
 * This is a location which is searched by
 * 
 * @version $Rev: 704201 $ $Date: 2008-10-14 00:52:25 +0600 (Tue, 14 Oct 2008) $
 */
public interface ResourceLocation {
    URL getCodeSource();    
    ResourceHandle getResourceHandle(String resourceName);
    Manifest getManifest() throws IOException;
    void close();
}

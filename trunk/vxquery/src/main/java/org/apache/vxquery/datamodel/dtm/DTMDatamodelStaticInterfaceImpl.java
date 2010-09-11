/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.vxquery.datamodel.dtm;

import org.apache.vxquery.datamodel.DatamodelStaticInterface;
import org.apache.vxquery.datamodel.NameCache;
import org.apache.vxquery.datamodel.NodeFactory;
import org.apache.vxquery.datamodel.atomic.AtomicValueFactory;

public class DTMDatamodelStaticInterfaceImpl implements DatamodelStaticInterface {
    private final NameCache nameCache;
    private final AtomicValueFactory avf;
    private final DTMNodeFactory nf;

    public DTMDatamodelStaticInterfaceImpl() {
        this.nameCache = new NameCache();
        avf = new AtomicValueFactory(nameCache);
        nf = new DTMNodeFactory(nameCache, avf);
    }

    @Override
    public AtomicValueFactory getAtomicValueFactory() {
        return avf;
    }

    @Override
    public NodeFactory getNodeFactory() {
        return nf;
    }
}
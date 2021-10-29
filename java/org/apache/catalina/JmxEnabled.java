/*
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
package org.apache.catalina;

import javax.management.MBeanRegistration;
import javax.management.ObjectName;

/**
 * This interface is implemented by components that will be registered with an
 * MBean server when they are created and unregistered when they are destroyed.
 * 这个接口由组件实现 当前组件被创建是注册到MBean 的服务中并且当前他们销毁的时候取消注册。
 * It is primarily intended to be implemented by components that implement
 * {@link Lifecycle} but is not exclusively for them.
 *  它主要是旨用于实现Lifecycle的组件来实现，但并不是仅仅用于它们。
 */
public interface JmxEnabled extends MBeanRegistration {

    /**
     * @return the domain under which this component will be / has been
     * registered.
     */
    String getDomain();


    /**
     * Specify the domain under which this component should be registered. Used
     * with components that cannot (easily) navigate the component hierarchy to
     * determine the correct domain to use.
     *
     * @param domain The name of the domain under which this component should be
     *               registered
     */
    void setDomain(String domain);


    /**
     * @return the name under which this component has been registered with JMX.
     */
    ObjectName getObjectName();
}

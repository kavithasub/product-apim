/*
 *   Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.apimgt.migration.dto;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class APIHandlersDTO {
    private Element handlersElement;
    private NodeList handlerNodes;

    public Element getHandlersElement() {
        return handlersElement;
    }

    public void setHandlersElement(Element handlersElement) {
        this.handlersElement = handlersElement;
    }

    public NodeList getHandlerNodes() {
        return handlerNodes;
    }

    public void setHandlerNodes(NodeList handlerNodes) {
        this.handlerNodes = handlerNodes;
    }
}

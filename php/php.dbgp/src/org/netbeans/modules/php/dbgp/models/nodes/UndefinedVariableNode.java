/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.dbgp.models.nodes;

import java.util.Set;

import org.netbeans.modules.php.dbgp.models.VariablesModelFilter.FilterType;
import org.netbeans.modules.php.dbgp.packets.Property;
import org.openide.util.NbBundle;

/**
 * @author ads
 *
 */
class UndefinedVariableNode extends org.netbeans.modules.php.dbgp.models.VariablesModel.AbstractVariableNode {
    private static final String TYPE_UNDEF = "TYPE_Undef"; // NOI18N
    public static final String UNDEF_VARIABLE_ICON = "org/netbeans/modules/php/dbgp/resources/undefined"; // NOI18N

    protected UndefinedVariableNode(Property property, AbstractModelNode parent) {
        super(property, parent);
    }

    @Override
    public String getIconBase() {
        return UNDEF_VARIABLE_ICON;
    }

    @Override
    public String getType() {
        return NbBundle.getMessage(UndefinedVariableNode.class, TYPE_UNDEF);
    }

    @Override
    protected boolean isTypeApplied(Set<FilterType> filters) {
        return filters.contains(FilterType.UNINIT);
    }

}

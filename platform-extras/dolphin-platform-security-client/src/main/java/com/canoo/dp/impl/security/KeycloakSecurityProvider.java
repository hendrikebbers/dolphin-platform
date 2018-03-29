/*
 * Copyright 2015-2018 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.dp.impl.security;

import com.canoo.dp.impl.platform.client.AbstractServiceProvider;
import com.canoo.dp.impl.platform.core.Assert;
import com.canoo.platform.client.ClientConfiguration;
import com.canoo.platform.client.security.Security;
import org.apiguardian.api.API;

import static org.apiguardian.api.API.Status.INTERNAL;

@API(since = "0.19.0", status = INTERNAL)
public class KeycloakSecurityProvider extends AbstractServiceProvider<Security> {

    public KeycloakSecurityProvider() {
        super(Security.class);
    }

    @Override
    protected Security createService(final ClientConfiguration configuration) {
        Assert.requireNonNull(configuration, "configuration");
        return new KeycloakSecurity(configuration);
    }
}
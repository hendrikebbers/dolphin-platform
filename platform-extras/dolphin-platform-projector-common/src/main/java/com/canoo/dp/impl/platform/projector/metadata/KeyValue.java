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
package com.canoo.dp.impl.platform.projector.metadata;

import com.canoo.platform.remoting.Property;
import com.canoo.platform.remoting.RemotingBean;

@RemotingBean
public interface KeyValue<T> {

    Property<String> keyProperty();

    Property<T> valueProperty();

    default void setKey(String key) {
        keyProperty().set(key);
    }

    default void setValue(T value) {
        valueProperty().set(value);
    }

    default String getKey() {
        return keyProperty().get();
    }

    default T getValue() {
        return valueProperty().get();
    }
}

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

package org.apache.rocketmq.flink.common.serialization;

import java.io.Serializable;
import org.apache.flink.api.java.typeutils.ResultTypeQueryable;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * The interface Message ext deserialization scheme.
 *
 * @param <T> the type parameter
 */
public interface MessageExtDeserializationScheme<T> extends ResultTypeQueryable<T>, Serializable {
    /**
     * Deserialize messageExt to type T you want to output.
     *
     * @param messageExt the messageExt
     * @return the t
     */
    T deserializeMessageExt(MessageExt messageExt);
}

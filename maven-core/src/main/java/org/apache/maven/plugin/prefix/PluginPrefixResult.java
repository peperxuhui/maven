package org.apache.maven.plugin.prefix;

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

import org.apache.maven.artifact.repository.ArtifactRepository;

/**
 * Describes the result of a plugin prefix resolution request.
 * 
 * @author Benjamin Bentmann
 */
public interface PluginPrefixResult
{

    /**
     * The resolved group id for the plugin.
     * 
     * @return The resolved group id for the plugin, never {@code null}.
     */
    String getGroupId();

    /**
     * The resolved artifact id for the plugin.
     * 
     * @return The resolved artifact id for the plugin, never {@code null}.
     */
    String getArtifactId();

    /**
     * The repository from which the plugin prefix was resolved.
     * 
     * @return The repository from which the plugin prefix was resolved or {@code null} if the prefix was resolved from
     *         the supplied POM.
     */
    ArtifactRepository getRepository();

}
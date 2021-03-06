/*
 * This file is part of Dependency-Track.
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
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.owasp.dependencytrack.notification;

public class NotificationConstants {

    public enum Scope {
        SYSTEM,
        PORTFOLIO
    }

    public enum Group {
        // System Groups
        DATASOURCE_MIRRORING,
        REPOSITORY,
        INDEXING_SERVICE,
        FILE_SYSTEM,

        // Portfolio Groups
        NEW_VULNERABILITY,
        NEW_OUTDATED_COMPONENT,
        FIXED_VULNERABILITY,
        FIXED_OUTDATED,
        GLOBAL_AUDIT_CHANGE,
        PROJECT_AUDIT_CHANGE
    }

    public static class Title {
        public static final String NVD_MIRROR = "NVD Mirroring";
        public static final String NSP_MIRROR = "NSP Mirroring";
        public static final String VULNDB_MIRROR = "VulnDB Mirroring";
        public static final String COMPONENT_INDEXER = "Component Indexing Service";
        public static final String LICENSE_INDEXER = "License Indexing Service";
        public static final String PROJECT_INDEXER = "Project Indexing Service";
        public static final String VULNERABILITY_INDEXER = "Vulnerability Indexing Service";
        public static final String CORE_INDEXING_SERVICES = "Core Indexing Services";
        public static final String FILE_SYSTEM_ERROR = "File System Error";
        public static final String REPO_ERROR = "Repository Error";
        public static final String NEW_VULNERABILITY = "New Vulnerability Identified";
        public static final String NEW_VULNERABLE_DEPENDENCY = "Vulnerable Dependency Introduced";
        public static final String EXPLOITABLE_ANALYSIS_DECISION = "Exploitable Analysis Decision";
    }

}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
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
package org.apache.logging.log4j.core.config.plugins;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.logging.log4j.core.config.plugins.visitors.PluginVisitor;

/**
 * Meta-annotation to denote the class name to use that implements
 * {@link org.apache.logging.log4j.core.config.plugins.visitors.PluginVisitor} for the annotated annotation.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface PluginVisitorStrategy {

    /**
     * The class to use that implements {@link org.apache.logging.log4j.core.config.plugins.visitors.PluginVisitor}
     * for the given annotation. The generic type in {@code PluginVisitor} should match the annotation this annotation
     * is applied to.
     */
    Class<? extends PluginVisitor<? extends Annotation>> value();
}

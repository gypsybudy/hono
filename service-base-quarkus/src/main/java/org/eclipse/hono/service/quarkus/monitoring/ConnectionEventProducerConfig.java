/**
 * Copyright (c) 2021 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */


package org.eclipse.hono.service.quarkus.monitoring;

import io.quarkus.arc.config.ConfigProperties;


/**
 * Standard {@link ConnectionEventProducerConfig} which can be bound to environment
 * variables by Quarkus.
 *
 */
@ConfigProperties(prefix = "hono.connectionEvents", namingStrategy = ConfigProperties.NamingStrategy.VERBATIM, failOnMismatchingMember = false)
public class ConnectionEventProducerConfig extends org.eclipse.hono.service.monitoring.ConnectionEventProducerConfig {
}

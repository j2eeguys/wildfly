/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.model;

import java.util.HashMap;
import java.util.Map;

/**
 * An enumeration of all the possible XML attributes in the domain schema, by name.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public enum Attribute {
    // always first
    UNKNOWN(null),

    // domain 1.0 attributes in alpha order
    ALLOWED("allowed"),
    DEFAULT_INTERFACE("default-interface"),
    FIXED_PORT("fixed-port"),
    GROUP("group"),
    INTERFACE("interface"),
    JAVA_HOME("java-home"),
    NAME("name"),
    MAX_SIZE("max-size"),
    MODULE("module"),
    MULTICAST_ADDRESS("multicast-address"),
    MULTICAST_PORT("multicast-port"),
    PATH("path"),
    PATTERN("pattern"),
    HOST("host"),
    PORT("port"),
    PORT_OFFSET("port-offset"),
    PREFIX("prefix"),
    PROFILE("profile"),
    REF("ref"),
    REPOSITORY("repository"),
    RUNTIME_NAME("runtime-name"),
    SCAN_ENABLED("scan-enabled"),
    SCAN_INTERVAL("scan-interval"),
    SHA1("sha1"),
    SIZE("size"),
    SOCKET_BINDING_GROUP("socket-binding-group"),
    START("start"),
    VALUE("value"),
    MAX_THREADS("max-threads"),
    ;

    private final String name;

    Attribute(final String name) {
        this.name = name;
    }

    /**
     * Get the local name of this element.
     *
     * @return the local name
     */
    public String getLocalName() {
        return name;
    }

    private static final Map<String, Attribute> MAP;

    static {
        final Map<String, Attribute> map = new HashMap<String, Attribute>();
        for (Attribute element : values()) {
            final String name = element.getLocalName();
            if (name != null) map.put(name, element);
        }
        MAP = map;
    }

    public static Attribute forName(String localName) {
        final Attribute element = MAP.get(localName);
        return element == null ? UNKNOWN : element;
    }
}

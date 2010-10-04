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

package org.jboss.as.server.manager;

import org.jboss.as.model.DomainModel;

/**
 * Contract for communicating with a domain controller.
 *
 * @author John Bailey
 */
public interface DomainControllerConnection {
    /**
     * Register with the domain controller.
     *
     * @return The latest domain model
     */
    DomainModel register();

    /*
     * Unregister from the domain controller.
     */
    void unregister();

    /**
     * Get the file repository for the domain controller.  This can be used to pull contents from the domain
     * controllers repository.
     *
     * @return The file repository
     */
    FileRepository getRemoteFileRepository();
}

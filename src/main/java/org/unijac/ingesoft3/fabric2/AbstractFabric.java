package org.unijac.ingesoft3.fabric2;

import org.unijac.ingesoft3.fabric1.Connection;

/**
 * Created by alexhd on 9/9/14.
 */
public abstract class AbstractFabric {
    protected AbstractFabric() {
    }

    protected abstract Connection createConnection(String type);
}

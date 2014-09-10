package org.unijac.ingesoft3.fabric1;

/**
 * Created by alexhd on 9/9/14.
 */
public class PostgresqlConnection extends Connection {
    public PostgresqlConnection() {
    }

    @Override
    public String description() {
        return "Postgresql Connection";
    }
}

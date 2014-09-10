package org.unijac.ingesoft3.fabric2;

import org.unijac.ingesoft3.fabric1.*;

/**
 * Created by alexhd on 9/9/14.
 */
public class HeirAbstractFabric  extends AbstractFabric {

    @Override
    public Connection createConnection(String type) {
        if(type.equalsIgnoreCase("oracle")) {
            return new OracleConnection();
        } else if (type.equalsIgnoreCase("sqlserver")) {
            return new SqlServerConnection();
        } else if (type.equalsIgnoreCase("mysql")) {
            return new MySqlConnection();
        }
        return new PostgresqlConnection();
    }
}

package org.unijac.ingesoft3.fabric1;

/**
 * Created by alexhd on 9/9/14.
 */
public class Fabric {

    protected String type;

    public Fabric(String type) {
        this.type = type;
    }

    public Connection createConnection(){
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

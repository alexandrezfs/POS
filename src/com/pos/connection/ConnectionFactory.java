package com.pos.connection;

/**
 * Created by alexandrenguyen on 18/12/14.
 */
public class ConnectionFactory {

    private static volatile Connection connection = null;

    public synchronized static Connection getInstance() {

        if(connection == null) {
            connection = new Connection();
        }

        return connection;
    }

}

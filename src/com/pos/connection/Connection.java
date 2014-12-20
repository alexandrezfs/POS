package com.pos.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by alexandrenguyen on 18/12/14.
 */
public class Connection {

    private java.sql.Connection connect = null;
    private Statement statement = null;

    public Connection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?user=sqluser&password=sqluserpw");
            statement = connect.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public java.sql.Connection getConnect() {
        return connect;
    }

    public void setConnect(java.sql.Connection connect) {
        this.connect = connect;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}

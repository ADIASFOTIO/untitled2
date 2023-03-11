package org.generation.codeLavoro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.generation.codeLavoro.model.data.services.JDBCConstants.*;


public class Main {
    public static void main(String[] args){




    }


    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}

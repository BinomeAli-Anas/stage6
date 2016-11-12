/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miro
 */
public class Conx {
    private static final String DB_AGENCE_URL = "jdbc:mysql://127.0.0.1/erp";
    private static final String DB_AGENCE_USER = "root";
    private static final String DB_AGENCE_MDP = "admin";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnexion() throws SQLException {
        return DriverManager.getConnection(DB_AGENCE_URL, DB_AGENCE_USER, DB_AGENCE_MDP);
    }
}

    


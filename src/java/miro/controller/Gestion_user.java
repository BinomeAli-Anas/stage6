/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miro.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import miro.util.Conx;
import model.User;

/**
 *
 * @author Miro
 */
public class Gestion_user {
    
    public static int Verif(User u) throws SQLException{
        int reponse=0;
        String sql="select * from user where username='"+u.username+"' and password='"+u.password+"'";
        ResultSet rs=Conx.getConnexion().createStatement().executeQuery(sql);
        if(rs.next()){
            if(rs.getString(4).equalsIgnoreCase("administrateur")){
                 reponse=1;
            }
           if(rs.getString(4).equalsIgnoreCase("gestionnaire commercial")){
                 reponse=2;
            }
        }
        return reponse;    
    }
    
}

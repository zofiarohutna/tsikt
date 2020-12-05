/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/*
*all libraries we need 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Žofia
 * Connection between client and database 
 */
public class javaconnect {

    /**
     *
     * @return con  
     * Method which call for connection to database in other classes
     */
    public static Connection connectdb(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/login", "login", "login"); //connection under variable con (URL, name, password)
            return con; 
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return null;
        
    }
   
}

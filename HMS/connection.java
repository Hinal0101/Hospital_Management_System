
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;
import java.sql.*;
/**
 *
 * @author WIN
 */
public class connection {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}

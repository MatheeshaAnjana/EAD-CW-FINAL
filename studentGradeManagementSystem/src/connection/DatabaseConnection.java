/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Matheesha Anjana
 */
public class DatabaseConnection {
    private static String db_Url="jdbc:mysql://localhost:3307/studentGradeManagementSystem";
    private static String db_UserName="root";
    private static String db_Password="";
    private static Connection conn = null;
    
   /** private DatabaseConnection(){
    }
    public static DatabaseConnection getobj(){
    DatabaseConnection obj = new DatabaseConnection();
    return obj;
    }*/
    
    public static Connection getConnection()
    {
        if(conn==null)
        {
            try{
     Class.forName("com.mysql.cj.jdbc.Driver");
     conn= DriverManager.getConnection(db_Url,db_UserName,db_Password);
     System.out.println(conn.toString());
     
     }catch(Exception ee){
         System.err.println(ee.toString());
     
     }   
        }
        return conn;
    }
}

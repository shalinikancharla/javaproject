package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //creating a connection
        String username="root";
        String password="root";
        String Url="jdbc:mysql://localhost:3306/company";
        Connection con=DriverManager.getConnection(Url,username,password);

        //creating statement
        Statement st=con.createStatement();
        //execute dml query
        String  sql="insert into student values(6,'syama','IT','PKS')";
                st.executeUpdate(sql);

    }
}

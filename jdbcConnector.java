import java.sql.*;
class jdbcConnecton
{
    public static void main(String args[]) {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sonoo","root","root");  
  
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("create database student");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        st.close();
        con.close();  
    }
}
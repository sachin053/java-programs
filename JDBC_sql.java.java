
import java.util.*;
        import java.sql.*;

class JDBC_firstprogram {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException
    {
        //predifined class c is capital specify the name of driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        //connection is an interface closeable

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seci_21","root","");

        Statement s = con.createStatement();

        ResultSet rs = s.executeQuery("select * from student_details");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
    }
}

package SQL;

import kidvaProp.shesavsebi;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class sqlConn {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        try (FileInputStream f = new FileInputStream("src/main/resources/db.properties")) {


            Properties pros = new Properties();
            pros.load(f);


            String url = pros.getProperty("url");
            String user = pros.getProperty("User");
            String password = pros.getProperty("Password");


            conn = DriverManager.getConnection(url, user, password);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
    public void db() throws SQLException {
       shesavsebi shes= new shesavsebi();
        try {
            Connection conn = sqlConn.getConnection();

            Statement stmt = conn.createStatement();
            String sql = "SELECT FirstName, LastName, Phone " +
                    "FROM [database].[dbo].[TblStudents]";

              ResultSet rs = stmt.executeQuery(sql);

            shes.Name(rs.getString("FirstName" + "LastName"));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

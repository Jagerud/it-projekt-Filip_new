package TechnicalServices;

import java.sql.*;


public class DBFacadeSingleton {
    private static DBFacadeSingleton dBFacadeSingleton = new DBFacadeSingleton();

    private DBFacadeSingleton() {

    }

    public static DBFacadeSingleton getDBFacadeSingleton() {
        return dBFacadeSingleton;
    }

    public static void setStudentGrade(String id, String grade) throws Exception {
       // try {
            System.out.println(id + "   " + grade);
            /*
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
            Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5caral311", "zPttfbC80");



            PreparedStatement st = conn.prepareStatement("UPDATE StudentGrade SET Grade = (?) WHERE ID = (?)");
            st.setString(1, grade);
            st.setString(2, id);
            st.executeUpdate();
            conn.close(); */
            System.out.println("Updated DB"); /*
        } catch (ClassNotFoundException | SQLException cnfe) {
            //Problem med att ladda drivern?
            System.err.println("ERROR: " + cnfe.toString());
            System.exit(1);
        } */
    }

    public static void getStudentGrade(String id) throws Exception {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
            Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5caral311", "zPttfbC80");

            String query = "SELECT Grade FROM StudentGrade WHERE ID = '0'";
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            String grade = "";
            while (rs.next()) {
                grade = rs.getString("Grade");
            }

            conn.close();
            System.out.println(grade);
        } catch (ClassNotFoundException | SQLException cnfe) {
            //Problem med att ladda drivern?
            System.err.println("ERROR: " + cnfe.toString());
            System.exit(1);
        }
    }
}
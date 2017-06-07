
    package TechnicalServices;

    import java.sql.*;

    public class DBFacade {

        public DBFacade(){}

        public void setStudentGrade (String id, String grade) throws Exception {
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
                Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5caral311", "zPttfbC80");

                System.out.println(id + "   " + grade);

                PreparedStatement st = conn.prepareStatement("UPDATE StudentGrade SET Grade = (?) WHERE ID = (?)");
                st.setString(1, grade);
                st.setString(2, id);
                st.executeUpdate();
                conn.close();
                System.out.println("Updated DB");

            }
            catch (ClassNotFoundException | SQLException cnfe) {
                //Problem med att ladda drivern?
                System.err.println ("ERROR: " + cnfe.toString());
                System.exit(1);
            }
        }
        public void getStudentGrade (String id) throws Exception {
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
                Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5caral311", "zPttfbC80");

                PreparedStatement st = conn.prepareStatement("SELECT Grade WHERE ID = (?)");
                st.executeUpdate();
                conn.close();
                System.out.println(st);
            }
            catch (ClassNotFoundException | SQLException cnfe) {
                //Problem med att ladda drivern?
                System.err.println ("ERROR: " + cnfe.toString());
                System.exit(1);
            }
        }
    }

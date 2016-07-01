
    package BetygReg;

    import java.sql.*;

    public class DBFacade {

        public DBFacade(){}

        public void setStudentGrade (String id, String grade) throws Exception {
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
                Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5caral311", "zPttfbC80");

                PreparedStatement st = conn.prepareStatement("UPDATE StudentGrade SET Grade = (?) WHERE ID = (?)");
                st.setString(1, grade);
                st.setString(2, id);
                st.executeUpdate();
                conn.close();
                System.out.println("Updated DB");

            }
            catch (ClassNotFoundException cnfe) {
                //Problem med att ladda drivern?
                System.err.println ("ERROR: " + cnfe.toString());
                System.exit(1);
            }
            catch (SQLException sqle) {
                //Problem kommunicera med DB (ingen anslutning, ogiltigt login ...)
                System.err.println ("ERROR: " + sqle.toString());
                System.exit(1);
            }
        }
    }


package BetygReg;

import java.io.FileNotFoundException;

public class Start {
    public static void main (String[] args) throws Exception {
        //CourseAdmin courseAdmin = new CourseAdmin();
        //courseAdmin.getCourseList();

        PersistentStorage ps = new PersistentStorage();
        ps.setGrade("1", "VG");

    }
}

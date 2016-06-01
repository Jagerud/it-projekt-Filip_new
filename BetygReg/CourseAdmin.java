package BetygReg;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CourseAdmin {

    //private  String findFile = null;
    //private  ArrayList<String> list;

    public void getCourseList() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        CourseList cList = new CourseList("test");
        System.out.print("Choose course:");


        //
        //
        //
        //
        //
        //Huvudanvädningsfall finns nedan i kod men inte inmatning för tillfället
        //
        //
        //
        //
        System.out.println(cList.getCourses());
        System.out.println("students in 725G00: ");
        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getName());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("2").getName());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("1").getName());
        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());
        cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().setGrade("VG");
        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("1").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());

        //String students = "";

        //String input = sc.nextLine();

        //System.out.println(cList.getCourseList().get(0).getName());
        //cList.getCourse().poop();
        //Object troll = cList.getCourse().getStudentList().getStudentHashMap().get("0");

        //Tester
        //System.out.println(cList.getHCourse("725G00").getAssignmentHList().get("0").getName());
        //System.out.println(cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());
        //cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().setGrade("VG");

        //System.out.println(cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());

//        System.out.println(cList.getHCourse("725G00").getStudents());
//        System.out.println(cList.getHCourse("725G00").getStudentList().getStudents());

//        System.out.println(cList.getHCourse("725G00").getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getName());
        //cList.getHCourse("11").getName();
        //cList.getHCourse("725G00").getName();
        //System.out.println(cList.getHCourse("725G00").getAssignmentHList().get("0").getName());
/*        Iterator it = cList.getHCourse("725G00").getStudentList().getStudentHashMap().entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            students = students + pair.getKey() +  ", ";
            it.remove(); // avoids a ConcurrentModificationException
        }
        */
        //lel

        //Hämtar listan över kurser
        //findFile = "courseID.txt";
        //String content = new Scanner(new File(findFile)).useDelimiter("\\Z").next();
        //Filens innehåll --> array
        //list = new ArrayList<>(Arrays.asList(content.split("\n")));
        /*while(true) {
            //System.out.println(list);
            //System.out.println("Which course would you ike to view?\nIf you would like to end the session write \"end\".");
            //Välj relevant
            //String cID = sc.nextLine();
            //cID = cID.toUpperCase();
            StudentList sList = new StudentList();
            //Grade grade = new Grade();
            if (cID.toUpperCase().equals("END")) {
                if (sList.getList() == null) {
                    System.exit(1);
                }
                sList.getStudent().getGradeObject().saveGrade(sList.getList());
                System.out.println(sList.getStudent().getGradeObject());
            }
            //Hämta studenter
            if (list.contains(cID)) {
                sList.getRelevant(cID);
            } else {
                System.out.println("ERROR 404! Course not found.");
            }
        }
        public
        */
    }
}

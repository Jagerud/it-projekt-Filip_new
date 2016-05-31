package BetygReg;

import java.io.FileNotFoundException;

public class CourseAdmin {

    //private  String findFile = null;
    //private  ArrayList<String> list;

    public void getCourse() throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        CourseList cList = new CourseList("test");

        //Tester
        System.out.println(cList.getHCourse("725G00").getAssignementHList().get("0").getName());
        System.out.println(cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());
        cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().setGrade("VG");

        System.out.println(cList.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());
        System.out.println(cList.getCourses());
        System.out.println(cList.getHCourse("725G00").getStudents()); //TODO inte kopplade till kurs?



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

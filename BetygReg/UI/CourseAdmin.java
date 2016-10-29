package BetygReg.UI;

import BetygReg.Domain.CourseList;
import BetygReg.Domain.PersistentStorage;
import BetygReg.TechnicalServices.DBFacade;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CourseAdmin {
    public static void getCourseList() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        DomainFacade domainFacade = new DomainFacade();

        while (true) {

            //
            //
            //
            //
            //
            //Huvudanvädningsfall finns nedan
            //
            //
            //
            //
            //System.out.println(domainFacade.getCourseList().get(0).getStudentList().getStudentHashMap().containsKey("0"));
            //System.out.println(domainFacade.getCourseList().get(0).getStudentList().getStudentHashMap().get("0").getName());

            //System.out.println(domainFacade.getCourseList().get(0).getStudentList().getStudentHashMap().get("0").getName());
/*
        while (true) {

            System.out.println("Wanna change names on assignments (1) or handle student grades? (0)");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println(domainFacade.getCourseList().get(0).getAssignmentLists().get(0).getAssignments("0"));
                System.out.println("Here is the name change!");
                System.out.println(domainFacade.getCourseList().get(0).getAssignmentLists().get(0).getAssignmentName("0"));
                System.out.println("Is now:");
                domainFacade.getCourseList().get(0).getAssignmentLists().get(0).renameAssignment("0", "New taskname!");
                System.out.println(domainFacade.getCourseList().get(0).getAssignmentLists().get(0).getAssignmentName("0"));
            } else if (check == 0) {
                break;
            }
        }
*/
            System.out.print("Make selections by typing 0-2 \nChoose course:");

            System.out.println(domainFacade.getCourses()); //via fasad
            //System.out.println(domainFacade.getCourses());       //samma som ovan utan fasad
            //String studentInput = sc.next();
            int courseInput = sc.nextInt();
            //System.out.println(studentInput);


            System.out.println("Choose student: ");
            System.out.println(domainFacade.getCourseList().get(courseInput).getStudents()); //fasad

            //System.out.println(domainFacade.getCourseHash().get(studentInput).get); //fasad

            //System.out.println(domainFacade.getCourseList().get(studentInput).getStudents());
            String studentInput = sc.next();
            //System.out.println(domainFacade.getCourseList().get(studentInput).getStudentList().getStudentName("0"));

            domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).addObserver(domainFacade.getCourseList().get(courseInput)); //Adding observer to student
            //domainFacade.getCourseList().get(studentInput).getStudentList().getStudentHashMap().get(input2).addObserver(domainFacade.getCourseList().get(studentInput)); //Adding observer to student
            System.out.println(domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).getName());

            String assignmentInput, gradeInput;
            while (true) {
                System.out.println("Choose assignment");
                System.out.println(domainFacade.getCourseList().get(courseInput).getAssignmentLists().get(0).getAssignments(studentInput));
                assignmentInput = sc.next();
                System.out.println("Student grade on assignment " + assignmentInput + " ");
                //System.out.println(domainFacade.getCourseList().get(studentInput).getName());
                System.out.println(domainFacade.getStudentGrade(courseInput, studentInput, assignmentInput));

                System.out.println("Set grade");
                gradeInput = sc.next();
                domainFacade.setStudentGrade(courseInput, studentInput, assignmentInput, gradeInput);
                System.out.println(domainFacade.getStudentGrade(courseInput, studentInput, assignmentInput));


                //System.out.println(domainFacade.getStudentGrade(studentInput, input2, "1"));
                //System.out.println(domainFacade.getStudentGrade(studentInput, input2, "2"));
                //domainFacade.setStudentGrade(studentInput, input2, "1", "G");
                //domainFacade.setStudentGrade(studentInput, input2, "2", "G");

                System.out.println(domainFacade.getStudentGrade(courseInput, studentInput, "0"));
                System.out.println(domainFacade.getStudentGrade(courseInput, studentInput, "1"));
                System.out.println(domainFacade.getStudentGrade(courseInput, studentInput, "2"));

                System.out.print("Course grade: ");
                System.out.println(domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).progress());
                System.out.println("Wanna register more assignments\n0 to exit");
                String end = sc.next();
                if (end.compareTo("0") == 0) {
                    break;
                }
            }

            System.out.println("Wanna register on Ladok?");
            int end = sc.nextInt();
            if (end == 0) {
                System.out.println("You can register later");

            } else {
                System.out.println("Registering in Ladok");
                try {                                     //TODO Registrering i DB funkar ej
                    domainFacade.setGrade(assignmentInput, gradeInput);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            //System.out.println(domainFacade.getHCourse("725G00").getStudentGrade("0", "0"));
            //          System.out.println(domainFacade.getCourseHash().get("725G00").getName());

            //System.out.println("inte samma");
        }
        //
        //
        //
        // domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().setGrade("VG");
        // System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());
        //
        // domainFacade.setStudentGrade(input,input2,"1","G");
        // System.out.println(domainFacade.getStudentGrade(input,input2,"1"));




  /*      System.out.println(domainFacade.getCourseHash().get(input).getStudentGrade(input2,input3));/*
        System.out.println(domainFacade.getCourseList().get(input).getStudentHlist().get("0").getStudentGrade("0"));/*
        System.out.println(domainFacade.getCourseList().get(input).getStudentHlist().get("0").getaList().getAssignmentGrade("0"));/*
        System.out.println(domainFacade.getCourseList().get(input).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getGrade());/*

        System.out.println("students in 725G00: ");
        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getName());

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("2").getName());

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("1").getName());

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());
        domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().setGrade("G");

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());
        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("2").getAssignmentGrade().getGrade());


        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("1").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());

        System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("1").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());


        //String students = "";

        //String input = sc.nextLine();

        //System.out.println(domainFacade.getCourseList().get(0).getName());
        //domainFacade.getCourse().poop();
        //Object troll = domainFacade.getCourse().getStudentList().getStudentHashMap().get("0");

        //Tester
        //System.out.println(domainFacade.getHCourse("725G00").getAssignmentHList().get("0").getName());
        //System.out.println(domainFacade.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());
        //domainFacade.getHCourse("725G01").getStudentList().get("0").getGradeObject().setGrade("VG");

        //System.out.println(domainFacade.getHCourse("725G01").getStudentList().get("0").getGradeObject().getGrade());

//        System.out.println(domainFacade.getHCourse("725G00").getStudents());
//        System.out.println(domainFacade.getHCourse("725G00").getStudentList().getStudents());

//        System.out.println(domainFacade.getHCourse("725G00").getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getName());
        //domainFacade.getHCourse("11").getName();
        //domainFacade.getHCourse("725G00").getName();
        //System.out.println(domainFacade.getHCourse("725G00").getAssignmentHList().get("0").getName());
/*        Iterator it = domainFacade.getHCourse("725G00").getStudentList().getStudentHashMap().entrySet().iterator();

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

    public static void main(String[] args) throws FileNotFoundException {
        getCourseList();
    }
}

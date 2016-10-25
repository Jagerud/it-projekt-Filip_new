package BetygReg.UI;

import BetygReg.Domain.CourseList;
import BetygReg.Domain.PersistentStorage;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseAdmin {

    //private  String findFile = null;
    //private  ArrayList<String> list;

    public void getCourseList() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        CourseList cList = new CourseList("test");
        PersistentStorage pS = new PersistentStorage();

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
            //System.out.println(cList.getCourseList().get(0).getStudentList().getStudentHashMap().containsKey("0"));
            //System.out.println(cList.getCourseList().get(0).getStudentList().getStudentHashMap().get("0").getName());

            //System.out.println(cList.getCourseList().get(0).getStudentList().getStudentHashMap().get("0").getName());
/*
        while (true) {

            System.out.println("Wanna change names on assignments (1) or handle student grades? (0)");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println(cList.getCourseList().get(0).getAssignmentLists().get(0).getAssignments("0"));
                System.out.println("Here is the name change!");
                System.out.println(cList.getCourseList().get(0).getAssignmentLists().get(0).getAssignmentName("0"));
                System.out.println("Is now:");
                cList.getCourseList().get(0).getAssignmentLists().get(0).renameAssignment("0", "New taskname!");
                System.out.println(cList.getCourseList().get(0).getAssignmentLists().get(0).getAssignmentName("0"));
            } else if (check == 0) {
                break;
            }
        }
*/
            System.out.print("Choose course:");


            System.out.println(cList.getCourses());
            int input = sc.nextInt();
            System.out.println(input);


            System.out.println("choose student: ");
            System.out.println(cList.getCourseList().get(input).getStudents());
            String input2 = sc.next();
            //System.out.println(cList.getCourseList().get(input).getStudentList().getStudentName("0"));
            cList.getCourseList().get(input).getStudentList().getStudentHashMap().get(input2).addObserver(cList.getCourseList().get(input)); //Adding observer to student
            System.out.println(cList.getCourseList().get(input).getStudentList().getStudentHashMap().get(input2).getName());
            while (true) {
            System.out.println("Choose assignment");
            System.out.println(cList.getCourseList().get(input).getAssignmentLists().get(0).getAssignments(input2));
            String input3 = sc.next();
            System.out.println("Student: ");
            //System.out.println(cList.getCourseList().get(input).getName());
            //skriv ut uppgift
            System.out.println(cList.getStudentGrade(input, input2, input3));

                System.out.println("Set grade");
                String input4 = sc.next();
                cList.setStudentGrade(input, input2, input3, input4);
                System.out.println(cList.getStudentGrade(input, input2, input3));


                //System.out.println(cList.getStudentGrade(input, input2, "1"));
                //System.out.println(cList.getStudentGrade(input, input2, "2"));
                //cList.setStudentGrade(input, input2, "1", "G");
                //cList.setStudentGrade(input, input2, "2", "G");

                System.out.println(cList.getStudentGrade(input, input2, "0"));
                System.out.println(cList.getStudentGrade(input, input2, "1"));
                System.out.println(cList.getStudentGrade(input, input2, "2"));

                System.out.print("Course grade: ");
                System.out.println(cList.getCourseList().get(input).getStudentList().getStudentHashMap().get(input2).progress());
                System.out.println("Wanna register more assignments?");
                String ass = sc.next();
                if (ass.compareTo("0")==0){
                    break;
                }
            }

            System.out.println("Wanna register on Ladok?");
            int end = sc.nextInt();
            if (end == 0) {
                System.out.println("You can register later");

            } else {
                System.out.println("Registering in Ladok");
            /*try {                                     //TODO Registrering i DB funkar ej
                pS.setGrade(input3, input4);
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            }



            //System.out.println(cList.getHCourse("725G00").getStudentGrade("0", "0"));
            //          System.out.println(cList.getCourseHash().get("725G00").getName());

            //System.out.println("inte samma");
        }
        //
        //
        //
        // cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().setGrade("VG");
        // System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());
        //
        // cList.setStudentGrade(input,input2,"1","G");
        // System.out.println(cList.getStudentGrade(input,input2,"1"));




  /*      System.out.println(cList.getCourseHash().get(input).getStudentGrade(input2,input3));/*
        System.out.println(cList.getCourseList().get(input).getStudentHlist().get("0").getStudentGrade("0"));/*
        System.out.println(cList.getCourseList().get(input).getStudentHlist().get("0").getaList().getAssignmentGrade("0"));/*
        System.out.println(cList.getCourseList().get(input).getStudentHlist().get("0").getaList().getAssignmentHList().get("0").getGrade());/*

        System.out.println("students in 725G00: ");
        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getName());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("2").getName());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("1").getName());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());
        cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().setGrade("G");

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());
        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("2").getAssignmentGrade().getGrade());


        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("0").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("1").getaList().getAssignmentHList().get("0").getAssignmentGrade().getGrade());

        System.out.println(cList.getCourseList().get(0).getStudentHlist().get("1").getaList().getAssignmentHList().get("1").getAssignmentGrade().getGrade());


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
        //}
    }
}

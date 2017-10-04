package edu.betygreg.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import edu.betygreg.data.DataFacade;
import edu.betygreg.domain.Doer;
import edu.betygreg.domain.DomainFacade;
import edu.betygreg.domain.Grade;

public class CourseAdmin {
    private static void run(DomainFacade domainFacade) {
        Doer doer = new Doer();
        Scanner sc = new Scanner(System.in);

        while (true) {
/*          //Annat användingsfall
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
            int courseInput = sc.nextInt();
            System.out.println("Choose student: ");
            //System.out.println(domainFacade.getCourseList().get(courseInput).getStudents()); //fasad
            System.out.println("students in 725G00: ");
            System.out.print(domainFacade.getCourseList().get(0).getStudentHlist().get("0").getName() + " ");
//            System.out.println(domainFacade.getCourseHash().get("725G00").getStudentHlist().get("0").getName()); //TODO nullpointer, vill använda hashs

            System.out.print(domainFacade.getCourseList().get(0).getStudentHlist().get("1").getName() + " ");

            System.out.println(domainFacade.getCourseList().get(0).getStudentHlist().get("2").getName());
            String studentInput = sc.next();

            domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).addObserver(domainFacade.getCourseList().get(courseInput)); //Adding observer to student
            System.out.println(domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).getName());

            String assignmentInput, gradeInput;

            while (true) {

                System.out.println("Choose assignment");
                System.out.println(domainFacade.getCourseList().get(courseInput).getAssignmentLists().get(0).getAssignments(studentInput));
                //domainFacade.getCourseList().get(courseInput).update();
                assignmentInput = sc.next();
                System.out.println("Student grade on assignment " + assignmentInput + " ");
                //System.out.println(domainFacade.getCourseList().get(studentInput).getName());
                try {
                    System.out.println(domainFacade.getGrade(assignmentInput).getGrade());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Set grade");

                gradeInput = sc.next();
                doer.putAssignMentGrade(assignmentInput, domainFacade.setStudentGrade(courseInput, studentInput, assignmentInput, gradeInput));
                System.out.println("\nAssignment grades for student: \n");

                System.out.print("Course grade: ");
                try {
                    System.out.println(domainFacade.getCourseList().get(courseInput).getStudentList().getStudentHashMap().get(studentInput).progress(gradeInput)); //TODO nullpointer
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Do you want to register more assignments?\n\n0 to register or change student");
                String end = sc.next();
                if (end.compareTo("0") == 0) {
                    break;
                }
            }
            System.out.println("Do you want to register on Ladok or grade more students?\n1 to register and 0 to continue");
            int end = sc.nextInt();
            if (end == 0) {
                System.out.println("You can register later");

            } else {
                System.out.println("Registering in Ladok");
                try {
                	Iterator i = doer.getAssignmentGrade().entrySet().iterator();

                    while(i.hasNext()) {
                        Map.Entry me = (Map.Entry)i.next();
                        System.out.println("Assignment: " + me.getKey().toString() + " Grade: " + ((Grade)me.getValue()).getGrade());
                        domainFacade.setGrade(me.getKey().toString(), (Grade)me.getValue()); //TODO fattar inte detta riktigt Carl, funkar inte med grade nu iaf
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args)  {
        DataFacade dataFacade = new DataFacade();
        DomainFacade domainFacade = new DomainFacade(dataFacade);
        run(domainFacade);
    }
}

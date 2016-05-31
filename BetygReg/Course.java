package BetygReg;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String name;
    //enrolled students?
    private StudentList sList = new StudentList();
    private AssignmentList aList = new AssignmentList();

    public Course(String name){
        this.name = name;
    }
    public ArrayList<Student> getStudentList(){     //returnerar Studentobjekt i en arraylist
        return sList.getList();
    }
    public HashMap<String, Assignment> getAssignementHList(){ //returnerar Assignmentobjekt i hashmap
        return aList.getAssignmentHList();
    }


}

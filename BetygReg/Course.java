package BetygReg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Course {

    private String name;
    //enrolled students?
    private StudentList sList = new StudentList();
    private AssignmentList aList = new AssignmentList();

    public Course(String name){
        this.name = name;
    }
    /*public HashMap<String,Student> getStudentList(){     //returnerar Studentobjekt i en arraylist
        return sList.getStudentHashMap();
 */
    public StudentList getStudentList(){
        return sList;
    }

    public String getStudents(){
        String students = "";

        Iterator it = sList.getStudentHashMap().entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            students = students + pair.getKey() +  ", ";
            it.remove(); // avoids a ConcurrentModificationException
        }
        return students;
    }

    public HashMap<String, Assignment> getAssignmentHList(){ //returnerar Assignmentobjekt i hashmap
        return aList.getAssignmentHList();
    }
}

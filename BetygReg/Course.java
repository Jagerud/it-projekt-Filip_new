package BetygReg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Course {
    private String name;
    //enrolled students?
    //private HashMap<String,AssignmentList> assignmentListHashMap = new HashMap<>();
    private ArrayList<AssignmentList>  assignmentLists = new ArrayList<>();

    //private AssignmentList aList = new AssignmentList();
    private StudentList sList;

    public Course(String name){
        this.name = name;
        addBullshitToAssignmentList();
        sList = new StudentList(assignmentLists);
    }
    /*public HashMap<String,Student> getStudentList(){     //returnerar Studentobjekt i en arraylist
        return sList.getStudentHashMap();
 */
    public void addAssignmentList(AssignmentList a){
        assignmentLists.add(a);
    }
    public ArrayList<AssignmentList> getAssignmentLists(){
        return assignmentLists;
    }
    public StudentList getStudentList(){
        return sList;
    }
    public HashMap<String, Student> getStudentHlist(){
        return sList.getStudentHashMap();
    }
    public void poop(){
        System.out.println("oioioioio");
    }
    public String getName(){
        return name;
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
    /*public HashMap<String, Assignment> getAssignmentHList(){ //returnerar Assignmentobjekt i hashmap
        return aList.getAssignmentHList();
    }
   /* public HashMap<String, AssignmentList> getAssignmentListHashMap(){
        return assignmentListHashMap;
    }
    private void addBullshitToAssignmentHash(){
        AssignmentList aList1 = new AssignmentList();
        AssignmentList aList2 = new AssignmentList();
        AssignmentList aList3 = new AssignmentList();
        assignmentListHashMap.put(getStudentHlist().get("0").getName(),aList1); //hämtar studenters namn som key,
        assignmentListHashMap.put(getStudentHlist().get("1").getName(),aList2);
        assignmentListHashMap.put(getStudentHlist().get("2").getName(),aList3);
    } */
    private void addBullshitToAssignmentList(){
        AssignmentList aList1 = new AssignmentList();
        AssignmentList aList2 = new AssignmentList();
        AssignmentList aList3 = new AssignmentList();
        assignmentLists.add(aList1);
        assignmentLists.add(aList2);
        assignmentLists.add(aList3);
    }

}

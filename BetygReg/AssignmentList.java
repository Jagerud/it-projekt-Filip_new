package BetygReg;

import java.util.HashMap;

/**
 * Created by Jaeger on 2016-05-31.
 */
public class AssignmentList {
    private HashMap<String, Assignment> assignmentHList = new HashMap<>();
    private String name;//TODO tänk här
    private String id;
    public AssignmentList(){

        addBullshit();
    }
    public HashMap<String, Assignment> getAssignmentHList(){
        return assignmentHList;
    }
    public String getAssignmentGrade(String key){
        return assignmentHList.get(key).getGrade();
    }
    public void setAssignmentGrade(String key, String grade){
        assignmentHList.get(key).setGrade(grade);
    }
    public void renameAssignment(String key, String name){
        assignmentHList.get(key).setName(name);
    }
    public String getAssignmentName(String key){
        return assignmentHList.get(key).getName();
    }

    private void addBullshit(){
        Assignment shit1 = new Assignment("0","Task0");
        Assignment shit2 = new Assignment("1","Task1");
        Assignment shit3 = new Assignment("2","Task2");
        assignmentHList.put(shit1.getId(),shit1);
        assignmentHList.put(shit2.getId(),shit2);
        assignmentHList.put(shit3.getId(),shit3);



    }

}
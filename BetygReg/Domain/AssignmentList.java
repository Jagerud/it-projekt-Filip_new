package Domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Jaeger on 2016-05-31.
 */
public class AssignmentList {
    private HashMap<String, Assignment> assignmentHList = new HashMap<>();
    private String name;//TODO tänk här
    private String id;

    public AssignmentList() {

        addTempAssignmentHash();
    }

    public HashMap<String, Assignment> getAssignmentHList() {
        return assignmentHList;
    }

    public String getAssignmentGrade(String key) {
        return assignmentHList.get(key).getGrade();
    }
    public Grade getAssignmentGradeObject(String key) {
        return assignmentHList.get(key).getGradeObject();
    }

    public void setAssignmentGrade(String key, String grade) {
        assignmentHList.get(key).setGrade(grade);
    }

    public void renameAssignment(String key, String name) {
        assignmentHList.get(key).setName(name);
    }

    public String getAssignmentName(String key) {
        return assignmentHList.get(key).getName();
    }

    public String getAssignments(String key) {


        String assignments = "";

        Iterator it = assignmentHList.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            assignments = assignments + pair.getKey() + ", ";
            //it.remove(); // avoids a ConcurrentModificationException
        }
        return assignments;
    }

    private void addTempAssignmentHash() {
        Assignment assignment0 = new Assignment("0", "Task0");
        Assignment assignment1 = new Assignment("1", "Task1");
        Assignment assignment2 = new Assignment("2", "Task2");
        assignmentHList.put(assignment0.getId(), assignment0);
        assignmentHList.put(assignment1.getId(), assignment1);
        assignmentHList.put(assignment2.getId(), assignment2);


    }

}
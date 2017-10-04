package edu.betygreg.domain;

import java.util.HashMap;

public class Doer {
    private HashMap<String, Grade> assignmentGrade = new HashMap<>();

    public Doer (){

    }


    public HashMap<String, Grade> getAssignmentGrade() {
        return assignmentGrade;
    }

    public void setAssignmentGrade(HashMap<String, Grade> assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }
    public void putAssignMentGrade (String assignmentInput, Grade gradeInput) {
        assignmentGrade.put(assignmentInput, gradeInput);
    }

}

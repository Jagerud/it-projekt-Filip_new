package edu.betygreg.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Doer {
    private HashMap<String, Grade> assignmentGrade = new HashMap<>();
    private int points = 0;
    private boolean success = false, fail = false;

    public Doer (){

    }

    public HashMap<String, Grade> getAssignmentGrade() {
        return assignmentGrade;
    }

    public void setAssignmentGrade(HashMap<String, Grade> assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }
    public void putAssignmentGrade (String assignmentInput, Grade gradeInput) {
        assignmentGrade.put(assignmentInput, gradeInput);
    }

    public void emptyHashMap() {
    	assignmentGrade = new HashMap<>();
    }
    
    public String progress() { //går inte komplettera
    	
    	Iterator i = assignmentGrade.entrySet().iterator();
    	int counter = 0;

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            if (((Grade) me.getValue()).getGrade().compareTo("VG") == 0 || ((Grade) me.getValue()).getGrade().compareTo("4") == 0 || 
            		((Grade) me.getValue()).getGrade().compareTo("5") == 0) {
            	success = true;
            }
            else {
            	success = false;
            }
            if (((Grade) me.getValue()).getGrade().compareTo("U") == 0) {
            	fail = true;
            }
            else {
            	fail = false;
            }
            counter ++;
        }
        if (fail || counter < 3) {
            return "Incomplete course results.";
        } else if (success){
            return "VG";
        }
        else {
        	return "G";
        }
    }
}

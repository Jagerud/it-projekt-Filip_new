package Tests;

import java.util.HashMap;
import java.util.Map.Entry;

import src.edu.betygreg.domain.Assignment;
import src.edu.betygreg.domain.AssignmentList;

public class AssignmentListTest {

	public void assignmentListTest () {
		AssignmentList testAssignmentList = new AssignmentList();
		HashMap<String, Assignment> assignmentTestList = new HashMap<String, Assignment>();
		assignmentTestList = testAssignmentList.getAssignmentHList();
		
		
		System.out.println("The AssignmentList should contain the assignments: 0, 1 and 2.");
		System.out.println("The AssignmentList contains: ");
		for (Entry<String, Assignment> abc : assignmentTestList.entrySet()){
			System.out.println(abc.getValue().getName());
    	}	

	}

}

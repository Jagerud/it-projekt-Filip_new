package Tests;

import src.edu.betygreg.domain.Assignment;

public class AssignmentTest {

	public void assignmentTest () {
		Assignment testAssignment = new Assignment("0", "Projekt");
		
		System.out.println("Get assignment name and ID.");
		System.out.println("Name: " + testAssignment.getName() + "\n" + "ID: " + testAssignment.getId());
		System.out.println("Assign the grade G to the assignment.");
		testAssignment.setGrade("G");

	}

}

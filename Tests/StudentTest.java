package Tests;

import src.edu.betygreg.domain.AssignmentList;
import src.edu.betygreg.domain.Student;

public class StudentTest {

	public void studentTest() {
		
		AssignmentList a = new AssignmentList();
		Student testStudent = new Student("0", "Håkan", a);
		
		System.out.println("The students ID is " + testStudent.getId() + " and the students name is " + testStudent.getName());
		System.out.println(testStudent.progress("VG"));
		
	}
	
}

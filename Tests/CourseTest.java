package Tests;

import src.edu.betygreg.domain.Course;

public class CourseTest {
	
	public void courseTest() {
		Course testCourse = new Course("725G00");
		System.out.println("The name of the course is " + testCourse.getName());
		
	}

}

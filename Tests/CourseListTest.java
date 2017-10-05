package Tests;

import src.edu.betygreg.domain.CourseList;

public class CourseListTest {
	
	public void courseListTest() {
		CourseList testCourseList = new CourseList("Test Course List");
		
		System.out.println("The courses in this list are: " + testCourseList.getCourses());
		
	}

}

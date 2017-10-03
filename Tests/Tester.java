package Tests;

public class Tester {
	
	public static void main(String[] args) {
		
		AssignmentTest a = new AssignmentTest();
		AssignmentListTest b = new AssignmentListTest();
		CourseTest c = new CourseTest();
		CourseListTest d = new CourseListTest();
		StudentTest e = new StudentTest();
		
		a.assignmentTest();
		b.assignmentListTest();
		c.courseTest();
		d.courseListTest();
		e.studentTest();
	}

}

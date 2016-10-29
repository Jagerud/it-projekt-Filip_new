package BetygReg.UI;

import BetygReg.Domain.Course;
import BetygReg.Domain.CourseList;

import java.util.ArrayList;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade {

    CourseList courseList = new CourseList("test");


    public String getCourses() {
        return courseList.getCourses();
    }
    public ArrayList<Course> getCourseList(){
        return courseList.getCourseList();
    }
    public String getStudentGrade(int courseKey, String listKey, String studentKey ){
        return courseList.getCourseList().get(courseKey).getStudentGrade(listKey, studentKey);
    }
    public void setStudentGrade(int courseKey, String listKey, String studentKey, String grade){
        courseList.getCourseList().get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }
}

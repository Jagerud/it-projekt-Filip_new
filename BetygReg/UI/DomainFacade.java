package UI;

import Domain.Course;
import Domain.CourseList;
import Domain.GradeConvert;
import Domain.TechnicalServicesFacade;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade {

    private CourseList courseList = new CourseList("test");
    private TechnicalServicesFacade technicalServicesFacade = new TechnicalServicesFacade();
    private GradeConvert conv = new GradeConvert();

    public DomainFacade() {

    }

    public String getCourses() {
        return courseList.getCourses();
    }

    public ArrayList<Course> getCourseList() {
        return courseList.getCourseList();
    }

    public HashMap<String, Course> getCourseHash() {
        return courseList.getCourseHash();
    }

    public String getStudentGrade(int courseKey, String listKey, String studentKey) {
        return courseList.getCourseList().get(courseKey).getStudentGrade(listKey, studentKey);
    }

    public void setStudentGrade(int courseKey, String listKey, String studentKey, String grade) {
        courseList.getCourseList().get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }

    public void setGrade(String id, String grade) throws Exception {
        technicalServicesFacade.setGrade(id, grade);
    }

    public void getGrade(String id) throws Exception {
        technicalServicesFacade.getGrade(id);
    }

    public String convertGrade(String grade) {
        return conv.ConvertGrade(grade);
    }

}

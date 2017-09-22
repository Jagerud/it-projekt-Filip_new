package UI;

import Domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade implements Observer {

    private CourseList courseList = new CourseList("test");
    private TechnicalServicesFacade technicalServicesFacade; //= new TechnicalServicesFacade();
    //private GradeConvert gradeConvert = new GradeConvert();

    public DomainFacade(TechnicalServicesFacade technicalServicesFacade) {
        this.technicalServicesFacade = technicalServicesFacade;
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
    /*
    public String getStudentGrade(int courseKey, String listKey, String studentKey) {
        return courseList.getCourseList().get(courseKey).getStudentGrade(listKey, studentKey);
    }

    public Grade getStudentGradeObject(int courseKey, String listKey, String studentKey) {
        return courseList.getCourseList().get(courseKey).getStudentGradeObejct(listKey, studentKey);
    }
    */
    public void setStudentGrade(int courseKey, String listKey, String studentKey, String grade) {
        courseList.getCourseList().get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }

    public void setGrade(String id, String grade) throws Exception {
        technicalServicesFacade.setGrade(id, grade);
    }
    public String getGrade(String id) throws Exception {
        return technicalServicesFacade.getGrade(id);
    }
    /*
    public String convertGrade(Grade grade, String newGrade, String student, String assignment) {
        return gradeConvert.convertGrade(grade, newGrade, student, assignment);
    }
    */

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
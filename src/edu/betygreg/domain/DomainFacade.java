package edu.betygreg.domain;


import edu.betygreg.data.DataFacade;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade {

    private CourseList courseList = new CourseList("test");
    private DataFacade dataFacade; //= new DataFacade();
    private GradeConverter gradeConverter = new GradeConverter();
    //private GradeConverter gradeConvert = new GradeConverter();
    private Doer doer = new Doer();

    public DomainFacade(DataFacade dataFacade) {
        this.dataFacade = dataFacade;
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
    public Grade setStudentGrade(int courseKey, String listKey, String studentKey, String grade) {
        return courseList.getCourseList().get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }

    public void setGrade(String id, Grade grade) throws Exception {
        dataFacade.setGrade(id, gradeConverter.getAsString(grade));
    }
    public Grade getGrade(String id) throws Exception {
        return gradeConverter.getAsObject(id);
        //return dataFacade.getGrade(id);
    }
    public void emptyHashMap() {
    	doer.emptyHashMap();
    }
    public String progress() {
    	return doer.progress();
    }
    public void putAssignmentGrade (String assignmentInput, Grade gradeInput) {
        doer.putAssignmentGrade(assignmentInput, gradeInput);
    }
    public HashMap<String, Grade> getAssignmentGrade() {
        return doer.getAssignmentGrade();
    }
    /*
    public String convertGrade(Grade grade, String newGrade, String student, String assignment) {
        return gradeConvert.convertGrade(grade, newGrade, student, assignment);
    }

*/
}
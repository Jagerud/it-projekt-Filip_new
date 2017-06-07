package UI;


import Domain.Course;
import Domain.CourseList;
import Domain.PersistentStorage;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade {

    CourseList courseList = new CourseList("test");
    PersistentStorage persistentStorage = new PersistentStorage();

    public DomainFacade(){

    }

    public String getCourses() {
        return courseList.getCourses();
    }
    public ArrayList<Course> getCourseList(){
        return courseList.getCourseList();
    }
    public HashMap<String,Course> getCourseHash(){
        return courseList.getCourseHash();
    }

    public String getStudentGrade(int courseKey, String listKey, String studentKey ){
        return courseList.getCourseList().get(courseKey).getStudentGrade(listKey, studentKey);
    }
    public void setStudentGrade(int courseKey, String listKey, String studentKey, String grade){
        courseList.getCourseList().get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }
    public void setGrade (String id, String grade) throws Exception {
        persistentStorage.setGrade(id, grade);
    }
    public void getGrade (String id) throws Exception {
        persistentStorage.getGrade(id);
    }
}

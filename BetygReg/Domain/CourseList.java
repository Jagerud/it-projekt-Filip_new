package BetygReg.Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Jaeger on 2016-05-30.
 */
public class CourseList {

    private HashMap<String, Course> courseHash = new HashMap<>();
    private String name;
    private ArrayList<Course> courseList = new ArrayList<>();

    //private Course activeCourse = new Course("725G00"); //manuell inmatning av första kurs, ska hätmas ifrån databas
    public CourseList(String name) {
        this.name = name;
        //courseList.add(activeCourse); //Hämtar kurser ifrån databas? annars från här
        //courseHash.put("10",test);
        addTempCourseHash();
        addTempCourseList();

    }

    //public Course getCourse(){
    //    return test;
    //}
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course name) {
        courseList.add(name);
    }

    /* public Course getActiveCourse(){
         courseList.get(
         return activeCourse;
     } */
    /*
    public String getStudentGrade(int courseKey, String listKey, String studentKey) {

        return courseList.get(courseKey).getStudentGrade(listKey, studentKey);
    }
    public Grade getStudentGradeOject(int courseKey, String listKey, String studentKey){
        return courseList.get(courseKey).getStudentGradeObejct(listKey, studentKey);
    }
    */

    public void setStudentGrade(int courseKey, String listKey, String studentKey, String grade) {
        courseList.get(courseKey).setStudentGrade(listKey, studentKey, grade);
    }

    public void addHCourse(String nameKey, Course course) {
        courseHash.put(nameKey, course);
    }

    public Course getHCourse(String nameKey) {
        return courseHash.get(nameKey);
    }

    //public StudentList getStudentList(){
    public HashMap<String, Course> getCourseHash() {
        return courseHash;
    }

    //}
    public String getCourses() {
        String courses = "";
        /*for(int i=0;i<courseHash.size();i++ ) {
            courses = "" + courseHash.get(i) + " ";
            courseHash.
        }*/
        Iterator it = courseHash.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            courses = courses + pair.getKey() + ", ";
            it.remove(); // avoids a ConcurrentModificationException
        }
        return courses;
    }

    private void addTempCourseHash() {
        Course course0 = new Course("0 725G00 - Projektledningsmojelimoj");
        courseHash.put("725G00", course0);
        Course course1 = new Course("1 725G01 - Materialkunskap");
        courseHash.put("725G01", course1);
        Course course2 = new Course("2 725G02 - Programmeringsskoj");
        courseHash.put("725G02", course2);

    }

    private void addTempCourseList() {
        Course course_0 = new Course("0 725G00 - Projektledningsmojelimoj");
        courseList.add(course_0);
        Course course_1 = new Course("1 725G01 - Materialkunskap");
        courseList.add(course_1);
        Course course_2 = new Course("2 725G02 - Programmeringsskoj");
        courseList.add(course_2);

    }
}

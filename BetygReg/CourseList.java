package BetygReg;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaeger on 2016-05-30.
 */
public class CourseList {
    private HashMap<String,Course> courseHash = new HashMap<>();
    private ArrayList<Course> courseList = new ArrayList<>();
    private Course activeCourse = new Course("725G00"); //manuell inmatning av första kurs, ska hätmas ifrån databas
    public CourseList(){
        //courseList.add(activeCourse); //Hämtar kurser ifrån databas? annars från här
        addBullshit();

    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }
    public void addCourse(Course name){
        courseList.add(name);
    }
   /* public Course getActiveCourse(){
        courseList.get(
        return activeCourse;
    } */
    public void addHCourse(String nameKey, Course course){
        courseHash.put(nameKey,course);
    }
    public Course getHCourse(String nameKey){
        return courseHash.get(nameKey);
    }
    //public StudentList getStudentList(){

    //}
    public void addBullshit(){
        Course shit1 = new Course("725G00 - Projektledningsmojelimoj");
        courseHash.put("725G00",shit1);
        Course shit2 = new Course("725G01 - Materialkunskap");
        courseHash.put("725G01",shit2);
        Course shit3 = new Course("725G02 - Programmeringsskoj");
        courseHash.put("725G02",shit3);

    }
}

package BetygReg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Jaeger on 2016-05-30.
 */
public class CourseList {
   // private Course test = new Course("0");

    private HashMap<String,Course> courseHash = new HashMap<>();
    private String name;
    private ArrayList<Course> courseList = new ArrayList<>();
    //private Course activeCourse = new Course("725G00"); //manuell inmatning av första kurs, ska hätmas ifrån databas
    public CourseList(String name){
        this.name = name;
        //courseList.add(activeCourse); //Hämtar kurser ifrån databas? annars från här
        //courseHash.put("10",test);
        addBullshit();
        addBullshitList();

    }
    //public Course getCourse(){
    //    return test;
    //}
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
    public HashMap<String,Course> getCourseHash(){
        return courseHash;
    }
    //}
    public String getCourses(){
        String courses = "";
        /*for(int i=0;i<courseHash.size();i++ ) {
            courses = "" + courseHash.get(i) + " ";
            courseHash.
        }*/
        Iterator it = courseHash.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            courses = courses + pair.getKey() +  ", ";
            it.remove(); // avoids a ConcurrentModificationException
        }
        return courses;
    }
    private void addBullshit(){
        Course shit1 = new Course("725G00 - Projektledningsmojelimoj");
        courseHash.put("725G00",shit1);
        Course shit2 = new Course("725G01 - Materialkunskap");
        courseHash.put("725G01",shit2);
        Course shit3 = new Course("725G02 - Programmeringsskoj");
        courseHash.put("725G02",shit3);
        courseHash.put("11",new Course("Funka som fan"));

    }
    private void addBullshitList(){
        Course shit1 = new Course("0 725G00 - Projektledningsmojelimoj");
        courseList.add(shit1);
        Course shit2 = new Course("1 725G01 - Materialkunskap");
        courseList.add(shit2);
        Course shit3 = new Course("2 725G02 - Programmeringsskoj");
        courseList.add(shit3);

    }
}

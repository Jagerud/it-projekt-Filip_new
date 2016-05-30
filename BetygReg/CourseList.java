package BetygReg;

import java.util.HashMap;

public class CourseList {
    private HashMap<String,Course> courseHash = new HashMap<>();
    private Course activeCourse = new Course("725G00"); //manuell inmatning av första kurs, ska hämtas ifrån databas

    public void addHCourse(String nameKey, Course course){
        courseHash.put(nameKey,course);
    }
    public Course getHCourse(String nameKey){
        return courseHash.get(nameKey);
    }
}

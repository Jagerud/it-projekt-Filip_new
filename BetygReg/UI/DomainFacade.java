package BetygReg.UI;

import BetygReg.Domain.CourseList;

/**
 * Created by Jaeger on 2016-10-25.
 */
public class DomainFacade {

    CourseList courseList = new CourseList("test");

    public String getCourses() {
        return courseList.getCourses();
    }
}

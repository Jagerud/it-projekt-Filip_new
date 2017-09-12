package Domain;

import TechnicalServices.DBFacadeSingleton;

public class TechnicalServicesFacade {

    public TechnicalServicesFacade() {
    }

    public void setGrade(String id, String grade) throws Exception {
        DBFacadeSingleton.setStudentGrade(id, grade);
    }

    public void getGrade(String id) throws Exception {
        DBFacadeSingleton.getStudentGrade(id);
    }
}

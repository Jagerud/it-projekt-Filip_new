package Domain;

import TechnicalServices.DBFacadeSingleton;

public class TechnicalServicesFacade {

    public TechnicalServicesFacade() {
    }

    public void setGrade(String id, String grade) throws Exception {
        DBFacadeSingleton.getDBFacadeSingleton().setStudentGrade(id, grade);
    }

    public String getGrade(String id) throws Exception {
        return DBFacadeSingleton.getDBFacadeSingleton().getStudentGrade(id);
    }
}

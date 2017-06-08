package Domain;

import TechnicalServices.DBFacadeSingleton;

public class PersistentStorage {

    private DBFacadeSingleton dbFasad;

    public PersistentStorage() {
        dbFasad = dbFasad.getDBFacadeSingleton();
    }

    public void setGrade(String id, String grade) throws Exception {
        dbFasad.setStudentGrade(id, grade);
    }

    public void getGrade(String id) throws Exception {
        dbFasad.getStudentGrade(id);
    }
}

package Domain;

import TechnicalServices.DBFacade;

public class PersistentStorage {

    private DBFacade dbFasad;

    public PersistentStorage() {
        dbFasad = new DBFacade();
    }

    public void setGrade (String id, String grade) throws Exception {
        dbFasad.setStudentGrade(id, grade);
    }

    public void getGrade (String id) throws Exception {
        dbFasad.getStudentGrade(id);
    }
}

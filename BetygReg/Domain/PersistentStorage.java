package BetygReg.Domain;

import BetygReg.TechnicalServices.DBFacade;

public class PersistentStorage {

    private DBFacade dbFasad;

    public PersistentStorage() {
        dbFasad = new DBFacade();
    }

    public void setGrade (String id, String grade) throws Exception {
        this.dbFasad.setStudentGrade(id, grade);
    }
}
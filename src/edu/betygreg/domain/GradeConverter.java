
package edu.betygreg.domain;

import edu.betygreg.data.DataFacade;

public class GradeConverter {
    private GradeFactory gradeFactory = new GradeFactory();
    private DataFacade dataFacade = new DataFacade();
    private Grade grade = null;

    public GradeConverter(){

    }

    public Grade getGrade (String id) {    //kan nog inte mata in grade förresten
        try {
            grade = gradeFactory.getGrade(dataFacade.getGrade(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return grade;
    }
    public void setGrade (String id, Grade grade){
        try {
            dataFacade.setGrade(id, grade.getGrade());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

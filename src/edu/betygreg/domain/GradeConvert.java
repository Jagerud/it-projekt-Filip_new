
package edu.betygreg.domain;

import edu.betygreg.data.DataFacade;

public class GradeConvert {
    private GradeFactory gradeFactory = new GradeFactory();
    private DataFacade dataFacade = new DataFacade();

    public Grade getGrade (Grade grade, String id) {    //kan nog inte mata in grade förresten
        try {
            grade = gradeFactory.getGrade(dataFacade.getGrade(id));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return grade;
    }

}

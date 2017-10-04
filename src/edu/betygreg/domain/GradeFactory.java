package edu.betygreg.domain;

/**
 * Created by Jaeger on 2017-09-20.
 */
public class GradeFactory {

    public Grade getGrade (String gradeType) {
        if (gradeType == null){
            return null;
        }
        if (gradeType.equalsIgnoreCase("U") || gradeType.equalsIgnoreCase("G") || gradeType.equalsIgnoreCase("VG")){
            return new GradeFil(gradeType);
        }
        if (gradeType.equalsIgnoreCase("1") || gradeType.equalsIgnoreCase("2") || gradeType.equalsIgnoreCase("3")
                || gradeType.equalsIgnoreCase("4")|| gradeType.equalsIgnoreCase("5")){
            return new GradeTek(gradeType);
        }
        return null;
    }
}

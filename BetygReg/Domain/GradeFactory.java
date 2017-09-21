package Domain;

/**
 * Created by Jaeger on 2017-09-20.
 */
public class GradeFactory {

    public Grade getGrade (String gradeType) {
        if (gradeType == null){
            return null;
        }
        //TODO kanske änndra till 12345/Ugvg ist för fil/tek?
        if (gradeType.equalsIgnoreCase("FIL")){
            return new GradeFil();
        }
        if (gradeType.equalsIgnoreCase("TEK")){
            return new GradeTek();
        }
        return null;
    }
}

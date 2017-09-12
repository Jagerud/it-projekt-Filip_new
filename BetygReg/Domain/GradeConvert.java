package Domain;
import java.util.Observable;
public class GradeConvert extends Observable implements GradeInterface {
    @Override
    public String convertGrade(Grade grade, String newGrade, String student, String assignment) {
        switch (newGrade) {
            case "3":
            case "G":
                grade.setGrade("G");
                break;
            case "4":
            case "5":
            case "VG":
                grade.setGrade("VG");
                break;
            case "1":
            case "2":
            case "U":
                grade.setGrade("U");
                break;
        }
        setChanged();
        notifyObservers("The student " + student + " has gotten the grade " + newGrade + " on assignment " + assignment);
        //TODO ligger observable högre upp än observer?
        return newGrade;
    }
}

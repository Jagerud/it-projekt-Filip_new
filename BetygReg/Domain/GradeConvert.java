package Domain;

public class GradeConvert implements GradeInterface {

    public String grade = "U";

    @Override
    public String ConvertGrade(String newGrade) {
        switch (newGrade) {
            case "3":
            case "G":
                grade = "G";
                break;
            case "4":
            case "5":
            case "VG":
                grade = "VG";
                break;
            case "1":
            case "2":
            case "U":
                grade = "U";
                break;
        }
        return grade;
    }
}

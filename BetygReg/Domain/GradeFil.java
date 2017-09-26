package BetygReg.Domain;

public class GradeFil implements Grade {
    private String grade = "U";

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public void setGrade(String grade) {
        this.grade = grade;
        /*
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");
        }
        */
    }
}

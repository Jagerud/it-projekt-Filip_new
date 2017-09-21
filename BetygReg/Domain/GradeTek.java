package Domain;

public class GradeTek implements Grade {
    private String grade = "U"; //TODO kan den vara u?

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public void setGrade(String grade) {
        this.grade = grade;
        /*
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0 ||
                grade.compareTo(grades[3]) == 0 || grade.compareTo(grades[4]) == 0) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");
            */
        }
    }
}

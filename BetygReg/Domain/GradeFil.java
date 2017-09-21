package Domain;

public class GradeFil implements Grade {
    private String grade = "U";
    private String[] grades = new String[]{"U", "G", "VG"};

    @Override
    public String getGrade() {
        return null;
    }

    @Override
    public void setGrade(String grade) {
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");
        }
    }
}

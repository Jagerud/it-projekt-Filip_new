package edu.betygreg.domain;

public class GradeFil implements Grade {
    private String grade = "U";
    public GradeFil (String grade){
        this.grade = grade;
    }

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public Grade setGrade(String grade) {
        this.grade = grade;
        /*
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");
        }
        */
        return this;
    }
}

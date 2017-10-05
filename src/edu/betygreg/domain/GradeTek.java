package edu.betygreg.domain;

public class GradeTek implements Grade {
    private String grade = "U"; //TODO kan den vara u?

    public GradeTek (String grade){
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
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0 ||
                grade.compareTo(grades[3]) == 0 || grade.compareTo(grades[4]) == 0) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");

        }
        */
        return this;
    }
}

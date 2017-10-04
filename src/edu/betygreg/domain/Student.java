package edu.betygreg.domain;

import java.util.Observable;

public class Student extends Observable {

    private String id;
    private String name;
    private AssignmentList aList;
    private int points = 0;
    //private String grade;
    //private Grade gradeObject;

    public Student(String id, String name, AssignmentList aList) {
        this.id = id;
        this.name = name;
        this.aList = aList;

        //grade = grades;
        //gradeObject =  new Grade();
        //grade2 = grades2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
/*
    public String getStudentGrade(String key) {
        return aList.getAssignmentGrade(key);
    }
    public Grade getStudentGradeObject (String key){
        return aList.getAssignmentGradeObject(key);
    }
*/
    public Grade setStudentGrade(String key, String grade) {
        setChanged();
        notifyObservers("The student " + name + " has gotten the grade " + grade + " on assignment " + key);
        return aList.setAssignmentGrade(key, grade);
    }

    public String progress(String grade) { //går inte komplettera
        if (grade.compareTo("VG") == 0) {
            points++;
        } else if (grade.compareTo("U") == 0) {
            return "Incomplete course results";
        }
        if (grade.compareTo("4") == 0) {
            points++;
        } else if (grade.compareTo("U") == 0) {
            return "Incomplete course results";
        }
        if (grade.compareTo("5") == 0) {
            points++;
        } else if (grade.compareTo("U") == 0) {
            return "Incomplete course results";
        }
        if (points < 0) {
            return "Incomplete course results";
        }
        if (points == 0) {
            return "G";
        } else {
            return "VG";
        }

    }

    public AssignmentList getaList() {
        return aList;
    }
}


	/*public String getGradeObject(){
        return grade;
	} */
	/*public void alterGrade(){
		System.out.println("Set grade. (u, g, vg)");
		Scanner sc = new Scanner(System.in);
		gradeObject.setGrade(sc.nextLine().toLowerCase());
		while(!gradeObject.getGrade().equals("g") && !gradeObject.getGrade().equals("vg") && !gradeObject.getGrade().equals("u")){
			System.out.println("Invalid grade.");
			gradeObject.setGrade(sc.nextLine());
		}

	}
	public Grade getGradeObject(){
		return gradeObject;
	}
	*/

package edu.betygreg.domain;

import java.util.Observable;

public class Student extends Observable {

    private String id;
    private String name;
    private AssignmentList aList;
    private boolean fail = false;
    private boolean success = false;
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

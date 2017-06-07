package Domain;

import java.util.Observable;

public class Student extends Observable {

	private String id;
    private String name;
    private AssignmentList aList;
    private int points = 0;
	//private String grade;
	//private Grade gradeObject;

	public Student (String id, String name, AssignmentList aList){
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
    public String getStudentGrade(String key){
        return aList.getAssignmentGrade(key);
    }
    public void setStudentGrade(String key, String grade){
        aList.setAssignmentGrade(key,grade);
        setChanged();
        notifyObservers("Studenten " + name + " har fått betyget " + getStudentGrade(key) + " på upppgift " + key);
    }
    public String progress(){ //går inte komplettera
        if(aList.getAssignmentGrade("0").compareTo("VG")==0){
            points++;
        }else if(aList.getAssignmentGrade("0").compareTo("U")==0){
            return "Incomplete course results";
        }
        if(aList.getAssignmentGrade("1").compareTo("VG")==0){
            points++;
        }else if(aList.getAssignmentGrade("1").compareTo("U")==0){
            return "Incomplete course results";
        }
        if(aList.getAssignmentGrade("2").compareTo("VG")==0){
            points++;
        }else if(aList.getAssignmentGrade("2").compareTo("U")==0){
            return "Incomplete course results";
        }
        if(points<0){
            return "Incomplete course results";
        }if(points==0){
            return "G";
        }else{
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

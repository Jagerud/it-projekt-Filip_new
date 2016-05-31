package BetygReg;
import javafx.scene.Parent;

import java.util.*;

public class Student {

	private String id;
    private String name;
	//private String grade;
	//private Grade gradeObject;

	public Student(String id, String name){
		this.id = id;
        this.name = name;
		//grade = grades;
		//gradeObject =  new Grade();
		//grade2 = grades2;
	}

	/*public String getGradeObject(){
		return grade;
	} */
	/*public void alterGrade(){ //TODO where the fuck=?!==!=!
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
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}


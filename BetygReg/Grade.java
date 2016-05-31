package BetygReg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Grade {
	private String[] grades = new String[]{"U","G","VG"};
    private String grade = "U";

    public Grade(){

	}
/*
	public void saveGrade(ArrayList<String> list){
		try {
			File file = new File("studentList.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(list.toString());
			bw.write(grade);		//Skriver till string grade som sparas i grade
			bw.close();

			System.out.println("Grades registered.");

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(1); //Oklart om vi ska ha system.exit() dolt i kod här
	}
	*/

	public String getGrade(){
		return grade;
	}
	public void setGrade(String grade){         //Kontroll av inmatning
        if(grade.compareTo(grades[0])==0 || grade.compareTo(grades[1])==0 || grade.compareTo(grades[2])==0) {
            this.grade = grade;
        }

	}
}

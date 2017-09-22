package Domain;
//TODO fix calls to old grade?
public interface Grade {
    String grade = null;

    String getGrade();
    void setGrade(String grade);

}
        //Kontroll av inmatning

/*
    public void setGrade(String grade) {         //Kontroll av inmatning
        if (grade.compareTo(grades[0]) == 0 || grade.compareTo(grades[1]) == 0 || grade.compareTo(grades[2]) == 0 ||
                grade.equals("1") || grade.equals("2") || grade.equals("3") || grade.equals("4") || grade.equals("5")) {
            this.grade = grade;
        } else {
            System.out.println("Wrong input");
        }
    }
}
*/
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
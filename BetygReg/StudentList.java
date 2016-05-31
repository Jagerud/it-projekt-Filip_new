package BetygReg;

import java.io.*;
import java.util.*;

public class StudentList {

	//private String findFile;
	//private ArrayList<String> studentList;
	//private ArrayList<String> list2 = new ArrayList<>();
	private ArrayList<Student> studentList = new ArrayList<>(); //TODO Fyll med student
    private HashMap<String, Student> studentHashMap = new HashMap<>();

	//private boolean loop;
	//private Student current;
	public StudentList(){
        addBullShit();
	}
	//TODO hämta alla studentobjekt och spara i en array kallad studentlist
	public void getRelevant(String cID) throws FileNotFoundException{
		/*Scanner sc = new Scanner(System.in);
		loop = true;
		//Grade grade = new Grade();		//kolla upp när de ska initieras
		findFile = "studentList.txt";
		//Hämta lista med studenter+betyg
		String content = new Scanner(new File(findFile)).useDelimiter("\\Z").next();
		//Ta bort hakarna
		content = content.substring(1);
		content = content.substring(0, content.length()-1);
		//studentList;
		//studentList = new ArrayList<>(Arrays.asList(content.split(", "))); //behandlar en string just nu, ska vara array

		//Hämta ut relevanta studenter som läser den valda kursen
		/*for(int i = 0; i<studentList.size(); i++){
			String a = ( studentList.get(i).substring(0, studentList.get(i).indexOf(" ")));
			if(a.equals(cID)){
				String b = ( studentList.get(i).substring(studentList.get(i).indexOf(" ")+1));
				list2.add(b);
			}
		}

		while(loop){
			if(list2.isEmpty()){
				System.out.println("There are no students in this course.");
				break;
			}
			System.out.println(list2);
			System.out.println("Which student would you like to view?");
			//Student ID
			String inputedStudent = sc.nextLine();
			while(!list2.contains(inputedStudent+" u") && !list2.contains(inputedStudent+" g") && !list2.contains(inputedStudent+" vg")){
				System.out.println("That student is not in this course.");
				inputedStudent = sc.nextLine();
			}
			inputedStudent = inputedStudent.toLowerCase();
			//Studentens betyg
			//String relGrade = list2.get(0).substring(9, 10);
			//String relGrade2 = list2.get(0).subtring(11);
			current = new Student(inputedStudent);
			current.alterGrade();
			for(int i = 0; i< studentList.size(); i++){
				if(studentList.get(i).contains(cID+" "+inputedStudent)){
					studentList.set(i, cID+" "+inputedStudent+" "+current.getGrade().getGrade());
				}
			}
			for(int i = 0; i<list2.size(); i++){
				if(list2.get(i).contains(inputedStudent)){
					list2.set(i, inputedStudent+" "+current.getGrade().getGrade());
				}
			}
			//Allt utom "y" och "end" tolkas som nej.
			System.out.println("Do you want to change course? (y/n)\nIf you would like to end the session write \"end\".");
			findFile = sc.nextLine();
			if(findFile.toUpperCase().equals("Y")){
				loop = false;
				list2.clear();
			}
			else if(findFile.toUpperCase().equals("END")){
				current.getGrade().saveGrade(studentList);
			}
		}*/
	}
	/*public ArrayList<Student> getList(){
		return studentList;
	} */
    public HashMap<String,Student> getStudentHashMap(){
        return studentHashMap;
    }
	public void addBullShit(){
        Student shit1 = new Student("0","shit1");
        Student shit2 = new Student("1","shit2");
        Student shit3 = new Student("2","shit3");
        studentHashMap.put(shit1.getId(),shit1);
        studentHashMap.put(shit2.getId(),shit2);
        studentHashMap.put(shit3.getId(),shit3);

	}
}

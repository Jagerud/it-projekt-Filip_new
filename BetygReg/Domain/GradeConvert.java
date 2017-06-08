package BetygReg.Domain;

public class GradeConvert implements GradeInterface {
	
	public String grade = "U";
	@Override
	public String ConvertGrade(String newGrade) {
		if(newGrade.equals("2") || newGrade.equals("3") || newGrade.equals("G")){
			grade = "G";
		}
		else if(newGrade.equals("4") || newGrade.equals("5") || newGrade.equals("VG")){
			grade = "VG";
		}
		else if(newGrade.equals("1")){
			grade = "U";
		}
		return grade;
	}
}

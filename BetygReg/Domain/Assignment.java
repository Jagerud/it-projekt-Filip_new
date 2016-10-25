package BetygReg.Domain;

/**
 * Created by Jaeger on 2016-05-31.
 */
public class Assignment {
    private String id = null;       //TODO Hashmappa för att spara id och namn
    private String name = null;
    private Grade assignmentGrade = new Grade();

    public Assignment(String id, String name){
        this.id = id;
        this.name = name;
    }
    /*public void setAssignmentGrade(String grade){
        assignmentGrade.setGrade(grade);
    }*/
    public Grade getAssignmentGrade(){
        return assignmentGrade;
    }
    public String getGrade(){
        return assignmentGrade.getGrade();
    }
    public void setGrade(String grade){
        assignmentGrade.setGrade(grade);
    }
      //Oklart om de ska ändras utifrån
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

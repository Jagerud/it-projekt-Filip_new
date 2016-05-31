package BetygReg;

public class Assignment {
    private String id = null;       //TODO Hashmappa för att spara id och namn
    private String name = null;

    public Assignment(String id, String name){
        this.id = id;
        this.name = name;
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

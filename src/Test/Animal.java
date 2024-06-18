package Test;

public class Animal {
    private String type;
    String noise = "noise msg";

//    public abstract void noise();
//    public abstract void eat();

    public Animal(String typeIn) {
        this.type = typeIn;
    }

    public void setType(String typeIn) {
        this.type = typeIn;
    }

    public String getType() {
        return type;
    }

}

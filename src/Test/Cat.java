package Test;

public class Cat extends Animal {
    private int regNo;

    // constructors

    public Cat(int regNoIn){
        super("cat");
        regNo = regNoIn;
    }

    public Cat(Dog dog){
        super("Cat");
        regNo = dog.regNo;
    }


    // setter and getter
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void eat(){
        System.out.println("cat eat");
    }
    public void noise(){
        System.out.println("cat noise");
    }
}

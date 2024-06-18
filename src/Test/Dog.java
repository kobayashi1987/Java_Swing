package Test;

public class Dog extends Animal{

    protected int regNo;

    // here we use two derived class constructors

    public Dog(){
        super("Dog");
    }

    public Dog(int regNoIn){
        super("Dog");
        this.regNo = regNoIn;
    }

    // Copy Constructor

    public Dog(Dog dog){
        super("Dog");
        regNo = dog.regNo;
    }



    public void eat(){
        System.out.println("this is a dog eating");
    }

    public void speak(){
        System.out.println("this is a dog speaking");
    }



    public void noise(){
        System.out.println("this is a dog noise from ");
    }
}

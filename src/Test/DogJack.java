package Test;

public class DogJack extends Shibainu{

    public String name;

    public DogJack(int regNoIn, String nameIn){
        super(regNoIn, "ShibaInu");
        name = nameIn;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("This is DogJack eating");
    }
}

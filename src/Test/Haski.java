package Test;

public class Haski extends Dog{
    public String breed;

    public Haski(int regNoIn, String breedIn) {
        super(regNoIn);
        breed = breedIn;
    }

    @Override
    public void eat() {

        System.out.println("this is Haski eating");
    }
}





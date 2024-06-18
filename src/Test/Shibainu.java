package Test;

public class Shibainu extends Dog{
    public String breed;

    public Shibainu(int regNoIn, String breedIn) {
        super(regNoIn);
        breed = breedIn;
    }

    @Override
    public void eat() {

        System.out.println("this is Shibainu eating");
    }
}

package Test;

public class Akitainu extends Dog{
    public String breed;

    public Akitainu(int regNoIn, String breedIn) {
        super(regNoIn);
        breed = breedIn;
    }

    @Override
    public void eat() {

        System.out.println("this is Akitainu eating");
    }
}



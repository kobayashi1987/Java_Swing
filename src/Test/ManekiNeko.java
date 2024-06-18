package Test;

public class ManekiNeko extends Cat{
    protected String breed = "manekineko";
    public ManekiNeko(int regNoIn) {
        super(regNoIn);
    }

    public void maneki(){
        System.out.println("招き猫 brings fortune");
    }
}

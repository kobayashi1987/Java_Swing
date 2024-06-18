package EnumTest;

public class Jacket {

    public JacketSize size;
    public JacketColor color;

    public Jacket(JacketSize size, JacketColor color){
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Jacket  ");
        return str.append(size).append("  in  ").append(color).toString();
    }
}

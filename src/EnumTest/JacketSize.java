package EnumTest;

public enum JacketSize {
    extra_small(10),small(20), medium(30),large(40), extra_large(50);

    private int size;

    // enum constructor ,
    JacketSize(int sizeIn)
    {
        this.size = sizeIn;
    }

    // method to return the size
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        switch (this) {
            case extra_small:
                return "XS";
            case small:
                return "S";
            case medium:
                return "M";
            case large:
                return "L";
            case extra_large:
                return "XL";
            default:
                return "Size null";
        }
    }
}

package EnumTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Define some jackets

        Jacket[] jackets ={new Jacket(JacketSize.extra_small, JacketColor.blue),
        new Jacket(JacketSize.small, JacketColor.red),
        new Jacket(JacketSize.medium, JacketColor.green),
        new Jacket(JacketSize.large, JacketColor.yellow),};

        // Output colors
        System.out.println("Now showing the colors:.....");
        for (Jacket jacket : jackets) {
            System.out.println(jacket.color);
        }

        // Output the size
        System.out.println("Now showing the size...");
        for (Jacket jacket : jackets) {
            System.out.println(jacket.size);
        }

        //Output the jacket object using println, toString method
        System.out.println("Now showing the Jacket Objects...");
        for (Jacket jacket : jackets) {
            System.out.println(jacket);
        }
    }
}

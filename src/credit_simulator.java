import java.util.Scanner;

public class credit_simulator {
    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda :");

        String name = input.nextLine();
        System.out.println("My name is " +name);

        input.close();
    }

}

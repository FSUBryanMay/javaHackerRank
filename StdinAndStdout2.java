import java.util.Scanner;

public class StdinAndStdout2{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i =  console.nextInt();
        double d = console.nextDouble();

        console.nextLine();
        String s = console.nextLine();

        console.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
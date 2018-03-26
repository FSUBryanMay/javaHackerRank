import java.util.Scanner;

public class JavaLoops1{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int integer = console.nextInt();

        console.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(integer + " x " + i + " = " + (integer * i));
        }
    }
}
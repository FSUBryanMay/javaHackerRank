import java.util.Scanner;

public class JavaOutputFormatting{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("================================");

        for(int i = 0; i < 3; i++){
            String string = console.next();
            int integer = console.nextInt();

            System.out.printf("%-15s%03d%n", string, integer);
        }

        console.close();

        System.out.println("================================");
    }
}
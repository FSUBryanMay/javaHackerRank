import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        console.close();

        if((n % 2 == 1) || ((n % 2 == 0) && ((n >= 6) && (n <= 20)))){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
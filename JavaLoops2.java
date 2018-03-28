import java.util.Scanner;

public class JavaLoops2{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfQueries = console.nextInt();

        for(int i = 0; i < numberOfQueries; i++){
            int a = console.nextInt();
            int b = console.nextInt();
            int n = console.nextInt();

            int sum = a;

            for(int j = 0; j < n; j++){
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        console.close();
    }
}
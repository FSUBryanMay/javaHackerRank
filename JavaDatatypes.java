import java.util.Scanner;

public class JavaDatatypes{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfTestCases = console.nextInt();

        for(int i = 0; i < numberOfTestCases; i++){
            long integer = console.nextLong();

            if(integer >= Math.pow(-2, 7) && integer <= (Math.pow(2, 7) - 1)){
                System.out.println(integer + " can be fitted in:");
                System.out.println("* byte");
            }
            else if(integer >= Math.pow(-2, 15) && integer <= (Math.pow(2, 15) - 1)){
                System.out.println(integer + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
            }
            else if(integer >= Math.pow(-2, 31) && integer <= (Math.pow(2, 31) - 1)){
                System.out.println(integer + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
            }
            
            else if(integer >= Math.pow(-2, 63) && integer <= (Math.pow(2, 63) - 1)){
                System.out.println(integer + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else{
                System.out.println(integer + " can't be fitted anywhere:");
            }
        }

        console.close();
    }
}
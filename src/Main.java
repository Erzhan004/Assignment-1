import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("write n:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Problem 1. Min: " + Assigment1.min(arr));
       System.out.println("Problem 2. Average: " + Assigment1.average(arr,0,0));
        Assigment1.isPrime(n);
        System.out.println("Problem 4. Factorial : " +  Assigment1.factorial(n));
        System.out.println("Problem 5. Fibonacci : " +  Assigment1.fibonacci(n));
        System.out.println("Problem 6." +'\n'+ "write a and n (pow(a,n)):");
        System.out.println( "pow: " + Assigment1.pow(scanner.nextInt(),scanner.nextInt()));
        System.out.println("Problem 7." +'\n'+ "write the word to find all permutations :");
        Assigment1.permutations( scanner.next());
        System.out.println("Problem 8." +'\n'+ "write a string to check if all elements are digits:");
        System.out.println(Assigment1.allDigits(scanner.next()));
        System.out.println("Problem 9. write n and k ( binomial Coefficient):");
        System.out.println("binomial Coefficient: " + Assigment1.binomialCoefficient(scanner.nextInt(),scanner.nextInt()));
        System.out.println("Problem 10. write n and k (GCD):");
        System.out.println("GCD:" + Assigment1.GCD(scanner.nextInt(),scanner.nextInt()));

    }
}
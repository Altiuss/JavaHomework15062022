//Implement the method that check if the given number is prime


import java.util.Scanner;

public class Secondlevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isPrime(sc.nextInt())) {
            System.out.println("Number is prime");
        } else
            System.out.println("Number is not prime");


    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

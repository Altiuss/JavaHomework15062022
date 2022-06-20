//Implement the program that read Integers from Scanner and prints the sum of all integers were input.
// The program will finish when 0 input.


import java.util.Scanner;

public class FirstLevel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x;
        do {
            x = sc.nextInt();
            sum = sum + x;

        } while (x != 0);
        System.out.println(sum);
    }
}

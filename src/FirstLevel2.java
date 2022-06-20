//Given two integers number1 and number2.
// Implement method that returns the sum of all numbers between number1 and number2 that divisible by 3.
// Example: getSumDivisibleByTreeNumbers(20,10) -> 45


public class FirstLevel2 {
    public static void main(String[] args) {

        System.out.println(getSumDivisibleByTreeNumbers(20, 10));
    }

    private static int getSumDivisibleByTreeNumbers(int num1, int num2) {
        if (num1 > num2) {
            int x = num1;
            num1 = num2;
            num2 = x;

        }
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }

        }
        return sum;

    }
}

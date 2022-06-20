//Given two integers year1 and year2.
// Implement method that returns the quantity of leap years between year1 and year2.Example:
// getQuantityOfLeapYears (2000,2022) -> 6

public class FirstLevel4 {
    public static void main(String[] args) {
        System.out.println(getQuantityOfLeapYears(2000, 2022));

    }

    private static int getQuantityOfLeapYears(int year1, int year2) {
        if (year1 > year2) {
            int x = year1;
            year1 = year2;
            year2 = x;
        }
        int count = 0;
        for (int year = year1; year <= year2; year++) {
            if (isLeap(year)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

}

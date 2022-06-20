//First level: 1. Implement method “countdown” that prints numbers from 5 to 1, than prints „start“. Implement it using both type of loop
//countdown() -> 5
//
//    4
//    3
//    2
//    1
//    Start


public class FirstLevel1 {
    public static void main(String[] args) {
        countDown();
    }

    private static void countDown() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Start");
        System.out.println();


        int i = 5;
        while (i > 0) {
            System.out.println(i--);

        }
        System.out.print("Start");

    }
}
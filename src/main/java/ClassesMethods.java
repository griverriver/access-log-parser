public class ClassesMethods {
    public static void main(String[] args) {
        System.out.printf("%.3f%n", fraction(6.37279));
        System.out.println(sumLastNums(723648223));
        System.out.println(charToNum('0'));
        System.out.println(isPositive(-43));
        System.out.println(is2Digits(47));
        System.out.println(isUpperCase('R'));
        System.out.println(isInRange(6, 1, 4));
        System.out.println(isDivisor(4, 7));
        System.out.println(isEqual(3, 3, 3));


        int numSum = lastNumSum(5, 11);
        numSum = lastNumSum(numSum, 123);
        numSum = lastNumSum(numSum, 14);
        numSum = lastNumSum(numSum, 1);
        System.out.println(numSum);

    }

    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        int a = x % 10;
        int b = (x / 10) % 10;
        return a + b;
    }

    public static int charToNum(char x) {
        return (int) x;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return (x > 9) && (x < 100);
    }

    public static boolean isUpperCase(char x) {
        return (x >= 'A') && (x <= 'Z');
    }

    public static boolean isInRange(int a, int b, int num) {
        return ((num >= a) && (num <= b)) || ((num >= b) && (num <= a));
    }

    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}

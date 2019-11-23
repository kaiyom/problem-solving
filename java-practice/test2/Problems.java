public class Problems {

    public static void main(String[] args) {

        printMultiplicationTable(2);

//        printIsEvenOrOdd(23);

//        printEvenOrOdd(5, 12);

//        sumOfDigits(1000);

//        printPattern1('@');
//        printPattern2('#');
//        printPattern3('$');
//        printPattern4('&');
    }

    public static void printMultiplicationTable(int num) {
        for (int i = 1, result; i <= 10; i++) {
            result = num*i;
            System.out.printf("%d X %d = %d\n", num, i, result);
        }
    }

    public static void printIsEvenOrOdd(int num) {
        String result = num%2 == 1 ? "Odd" : "Even";
        System.out.println(result);
    }

    public static void printEvenOrOdd(int start, int end) {

        for (int i = start; i <= end; i++) {

            System.out.print(i + "\tis ");
            printIsEvenOrOdd(i);
        }
    }

    public static void sumOfDigits(int num) {
        int holder = num;
        int sum = 0;

        while (true) {
            sum += holder % 10;

            holder /= 10;

            if(holder <= 10) {
                sum += holder;
                break;
            }
        }

        System.out.println(sum);
    }

    public static void printPattern1(char designWith) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c ", designWith);
            }
            System.out.println();
        }
    }

    public static void printPattern2(char designWith) {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c ", designWith);
            }
            System.out.println();
        }
    }

    public static void printPattern3(char designWith) {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 8; j >= i; j--) {
                System.out.printf("%c ", designWith);
            }
            System.out.println();
        }
    }

    public static void printPattern4(char designWith) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 8; j >= i; j--) {
                System.out.printf("%c ", designWith);
            }
            System.out.println();
        }
    }

}

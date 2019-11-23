
public class Problems {

    public static void main(String[] args) {
        printDayNameBy(2);
//        calculator(6, 4, "%");
//        comparator(23, 3);
//        twoDigitSum(45);
    }

    public static void twoDigitSum(int number) {
        int digit1 = number / 10;
        int digit2 = number % 10;

        int result = digit1 + digit2;

        System.out.println(result);
    }

    public static void comparator(int num1, int num2) {
        String result = "",
            newLine = "\n";

        if(num1 < num2) result += num1 + " < " + num2+ newLine;

        if(num1 > num2) result += num1 + " > " + num2 + newLine;

        if(num1 == num2) result += num1 + " == " + num2+ newLine;

        if(num1 != num2) result += num1 + " != " + num2+ newLine;

        System.out.println(result);
    }

    public static void calculator(int firstOperand, int secondOperand, String operator) {
        int result = 0;

        switch (operator) {
            case "+" : result = firstOperand + secondOperand;
                break;
            case "-" : result = firstOperand - secondOperand;
                break;
            case "*" : result = firstOperand * secondOperand;
                break;
            case "/" : result = firstOperand / secondOperand;
                break;
            case "%" : result = firstOperand % secondOperand;
                break;
        }

        System.out.println(result);
    }

    public static void printDayNameBy(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Saturday";
                break;
            case 2:
                dayName = "Sunday";
                break;
            case 3:
                dayName = "Monday";
                break;
            case 4:
                dayName = "Tuesday";
                break;
            case 5:
                dayName = "Wednesday";
                break;
            case 6:
                dayName = "Thursday";
                break;
            case 7:
                dayName = "Friday";
                break;
            default:
                dayName = "wrong input";
        }

        System.out.println(dayName);
    }
}

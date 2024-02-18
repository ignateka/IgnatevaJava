import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * Метод сравнения чисел
     * @param a
     * @param b
     * @return - Результат сравнения
     */
    private static String numbersComparing(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    /**
     * Метод совершения математических действий (сложение, вычитание, умножение, деление)
     * @param reader - сканер, вводимых пользователем, значений
     * @param a
     * @param b
     * @return - Результат математического действия
     */
    private static int performingMathOper(Scanner reader, int a, int b) {
        System.out.println("Введите знак математического действия (+, -, /, *)");
        char sign = reader.next().charAt(0);
        if (sign == '+') {
            return a + b;
        } else if (sign == '-') {
            return a - b;
        } else if (sign == '/') {
            return a / b;
        } else if (sign == '*') {
            return a * b;
        }
        return 0;
    }

    /**
     * Метод сравнения строк
     * @param a
     * @param b
     * @return - Результат сравнения
     */
    private static String stringComparison (String a, String b) {
        if (a.equals(b)) {
            return "Строки идентичны";
        } else {
            return "Строки неидентичны";
        }
    }

    /**
     * Метод вычисления четных значений
     * @param numberArray - массив чисел
     * @return - массив четных значений
     */
    private static List<Integer> calculatingEvenNumbs(int[] numberArray) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
                evenNumbers.add(numberArray[i]);
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            int a = reader.nextInt();
            int b = reader.nextInt();

            System.out.println(numbersComparing(a, b));
            System.out.println(performingMathOper(reader, a, b));

            System.out.println("Введите две строки: ");
            String strA = reader.next();
            String strB = reader.next();
            System.out.println(stringComparison(strA, strB));

            int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Четные числа: ");
            System.out.println(calculatingEvenNumbs(numberArray));

            reader.close();
        } catch (Exception ex) {
            System.out.println("Введено некорректное значение");
        }
    }
}
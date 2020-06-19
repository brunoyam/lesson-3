import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void forDemonstration() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
            if (i == 5) break;   // оператор прерывания цикла

            System.out.println("next step");
        }

    }

    public static void emptyForDemonstration() {
        int i = 0;
        for (;;) {    // можно опускать любые аргументы, если требуется
            System.out.println("Hello, world");
            if (i >= 10) break;    // граничное условие своими руками
            ++i;   // действие после каждой итерации своими руками
        }

    }

    public static void whileDemonstration() {
        Scanner scanner = new Scanner(System.in);

        String st;

        int i = 0;
        while (true) {
            System.out.println(i++);
            System.out.println("Хотите повторить? (Yes or No)");
            st = scanner.next();
            if ("Yes".equals(st)) {
                System.out.println("Ок, повторяем");
            } else {
                if ("No".equals(st)) break;
            }
        }

    }

    public static void doWhileDemonstration() {
        int i = 0;
        do {
            System.out.println(++i);
        } while (i <= 10);
    }

    public static void arrayDemonstration1() {
        int[] a = new int[5];  // массив целых чисел на 5 элементов; тип может быть любой
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 20;
        a[4] = 25;

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

        String[] stringArray = {"hello", "java", "world", "lalala", "abacaba"}; // массив строк на 5 элементов
        for (int i = 0; i < stringArray.length; ++i) {
            System.out.println(stringArray[i]);
        }

        // System.out.println(a[6]);  // некорректно, будет ошибка
    }

    public static void arrayDemonstration2() {
        int[][] grid = new int[10][10]; // простая таблица умножения
        for (int i = 1; i < grid.length; ++i) {
            for (int j = 1; j < grid[i].length; ++j) {
                grid[i][j] = i * j;
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void romanToInteger() {  // перевод числа из римского в арабское
        Scanner scanner = new Scanner(System.in);

        int[] map = new int[89];

        map['I'] = 1;  // здесь происходит неявное преобразование к int, и мы кладем в ячейку 73 массива число 1
        map['V'] = 5;  // в ячейку 86 пишем число 5
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;

        String roman = scanner.next();

        int result = 0;
        int prev = 0;

        /*
        // вариант с кучей условий
        for (int i = 0; i < roman.length(); ++i) {
            if (roman.charAt(i) == 'I') {
                if (roman.charAt(i + 1) != 'X' && roman.charAt(i + 1) != 'V') {
                    result += 1;
                } else {
                    result -= 1;
                }
            }
            if (roman.charAt(i) == 'V') {
                result += 5;
            }
            if (roman.charAt(i) == 'X') {
                if (roman.charAt(i + 1) != 'L' && roman.charAt(i + 1) != 'D' && roman.charAt(i + 1) != 'C' && roman.charAt(i + 1) != 'M') {
                    result += 10;
                } else {
                    result -= 10;
                }
            }
            // и так далее
        }
        */

        for (int i = roman.length() - 1; i >= 0; --i) {
            char ch = roman.charAt(i);
            int cur = map[ch];

            /*
            // вместо этого можно использовать тернарный оператор
            if (cur >= prev) {
                result += cur;
            } else {
                result -= cur;
            }
            */

            result += cur >= prev ? cur : -cur;

            prev = cur;
        }

        System.out.println(result);
    }

    public static void sumFrom1toN() {  // сумма чисел от 1 до N, N вводим с клавиатуры
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int res = 0;

        for (int i = 1; i <= n; ++i) {
            res += i;
        }

        System.out.println(res);
    }

    public static void factorial() {  // произведение чисел от 1 до n
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int res = 1;

        for (int i = 1; i <= n; ++i) {
            res *= i;
        }

        System.out.println(res);
    }

    public static void arraySort() { // сортировка массива
        int[] a = {10, 16, 2, 5, -1, 5};
        Arrays.sort(a);   // сам метод сортировки
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void nPowerK() { // возвести n в степень k
        Scanner scanner = new Scanner(System.in);

        int n, k;

        n = scanner.nextInt();
        k = scanner.nextInt();

        int res = 1;

        for (int i = 0; i < k; ++i) {
            res *= n;
        }

        System.out.println(res);
    }

    public static void reverseInt() { // развернуть число
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String st = String.valueOf(a); // превратить число в строку

        String result = new StringBuilder(st).reverse().toString();   // развернуть строку

        System.out.println(result);
    }

    public static void isPalindrome() {  // проверить, является ли строка палиндромом
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("Стркоа палиндром");
        } else {
            System.out.println("Стркоа не палиндром");
        }
    }


    public static void main(String[] args) {
        isPalindrome();
    }
}

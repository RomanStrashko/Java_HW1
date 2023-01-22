import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ex5();
    }

    static void ex1() {
        /*
        1.Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         */
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до n будет равна " + sum + "!");
    }

    static void ex2() {
        /*
        2.Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        System.out.println("Произведение чисел от 1 до n равна " + mult + "!");
    }

    static void ex3() {
        /*
        3.Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        String s = "";

        for (int i = 2; i < 1000; i++) {
            int n = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n == 2) {
                s += i;
                s += ", ";
            }
        }
        System.out.println(s);
    }

    static void ex4() {
        /*
        4.Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию,
        которую надо выполнить с этими числами"... "ответ: ...")
         */
        System.out.println("Простой калькулятор");
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        System.out.println("Введите знак операции: ");
        char c = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        double res = 0;

        switch (c) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.printf("Ошибка! Вы ввели неверный знак операции!");
                return;
        }
        System.out.println(a + " " + c + " " + b + " " + "=" + " " + res);
    }

    static void ex5() {
        /*
        5*. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
         */
        //2? + ?5 = 69
        System.out.println("Задано уравнение 2a + b5 = 69. Нужно востанновить выражение.");
        String s = "2a + b5 = 69";
        String str = "";
        int a = 0;
        int b = 0;
        int res = 0;
        for (int i = 20; i < 30; i++) {
            for (int j = 35; j < 50; j++) {
                a = i / 10;
                b = j % 10;
                if (a == 2 && b == 5) {
                    res = i + j;
                    if (res == 69) {
                        str = i + " " + "+" + " " + j + " " + "=" + " " + "69";
                        System.out.println("Востановленное выражение:" + " " + str);
                    }
                }
            }
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main lab = new Main();

        System.out.println("Лабораторная работа №1");
        System.out.println("Вариант 6\n");
        lab.menu_main();
        int choice_task = sc.nextInt();

        switch(choice_task){
            case (1):{
                lab.menu_task1();
                int choice = sc.nextInt();

                while (choice!=0){
                    if(choice==1) lab.runTask1_3();
                    if(choice==2) lab.runTask1_4();
                    if(choice==3) lab.runTask1_8();
                    if(choice==4) lab.runTask1_9();
                    if(choice==5) lab.runTask1_10();
                    if(choice!=1 & choice!=2 & choice!=3 & choice!=4 & choice!=5){
                        System.out.println("Такого задания нет! Выберите другое.");
                    }
                    lab.menu_task1();
                    choice = sc.nextInt();
                }
                break;
            }
            case(2):{
                lab.menu_task2();
                int choice = sc.nextInt();

                while (choice!=0){
                    if(choice==1) lab.runTask2_2();
                    if(choice==2) lab.runTask2_5();
                    if(choice==3) lab.runTask2_6();
                    if(choice==4) lab.runTask2_7();
                    if(choice==5) lab.runTask2_10();
                    if(choice!=1 & choice!=2 & choice!=3 & choice!=4 & choice!=5){
                        System.out.println("Такого задания нет! Выберите другое.");
                    }
                    lab.menu_task2();
                    choice = sc.nextInt();
                }
                break;
            }
            case(3):{

                lab.menu_task3();
                int choice = sc.nextInt();

                while (choice!=0){
                    if(choice==1) lab.runTask3_1();
                    if(choice==2) lab.runTask3_4();
                    if(choice==3) lab.runTask3_6();
                    if(choice==4) lab.runTask3_7();
                    if(choice==5) lab.runTask3_9();
                    if(choice!=1 & choice!=2 & choice!=3 & choice!=4 & choice!=5){
                        System.out.println("Такого задания нет! Выберите другое.");
                    }
                    lab.menu_task3();
                    choice = sc.nextInt();
                }
                break;
            }
            case(4):{
                lab.menu_task4();
                int choice = sc.nextInt();

                while (choice!=0){
                    if(choice==1) lab.runTask4_1();
                    if(choice==2) lab.runTask4_2();
                    if(choice==3) lab.runTask4_5();
                    if(choice==4) lab.runTask4_8();
                    if(choice==5) lab.runTask4_10();
                    if(choice!=1 & choice!=2 & choice!=3 & choice!=4 & choice!=5){
                        System.out.println("Такого задания нет! Выберите другое.");
                    }
                    lab.menu_task4();
                    choice = sc.nextInt();
                }
                break;
            }
            case(0):{
                break;
            }
            default:{
                System.out.println("Такого задания нет!");
                lab.menu_main();
                choice_task = sc.nextInt();
            }

            lab.menu_main();
            choice_task = sc.nextInt();
            break;
        }
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка! Введите дробное число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // Задание 1
    // 1.3 Букву в число
    public int charToNum(char x) {
        return (int) x;
    }

    private void runTask1_3() {
        System.out.println("--- 1.3 Букву в число ---");
        System.out.print("Введите цифру символом (0-9): ");
        char x = scanner.next().charAt(0);
        System.out.println("Результат: " + charToNum(x) + "\n");
    }

    // 1.4 Есть ли позитив
    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void runTask1_4() {
        System.out.println("--- 1.4 Есть ли позитив ---");
        System.out.print("Введите число: ");
        int x = readInt();
        System.out.println("Результат: " + isPositive(x) + "\n");
    }

    // 1.8 Делитель
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        if (a % b == 0 || b % a == 0) {
            return true;
        }
        return false;
    }

    private void runTask1_8() {
        System.out.println("--- 1.8 Делитель ---");
        System.out.print("Введите первое число (a): ");
        int a = readInt();
        System.out.print("Введите второе число (b): ");
        int b = readInt();
        System.out.println("Результат: " + isDivisor(a, b) + "\n");
    }

    // 1.9 Равенство
    public boolean isEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    private void runTask1_9() {
        System.out.println("--- 1.9 Равенство ---");
        System.out.print("Введите первое число (a): ");
        int a = readInt();
        System.out.print("Введите второе число (b): ");
        int b = readInt();
        System.out.print("Введите третье число (c): ");
        int c = readInt();
        System.out.println("Результат: " + isEqual(a, b, c) + "\n");
    }

    // 1.10 Многократный вызов
    public int lastNumSum(int a, int b) {
        // Берем последнюю цифру каждого числа
        int lastA = Math.abs(a) % 10;
        int lastB = Math.abs(b) % 10;
        return lastA + lastB;
    }

    private void runTask1_10() {
        System.out.println("--- 1.10 Многократный вызов ---");
        System.out.println("Введите 5 чисел для последовательного сложения:");

        System.out.print("Число 1: ");
        int result = readInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Число " + i + ": ");
            int nextNum = readInt();
            result = lastNumSum(result, nextNum);
        }

        System.out.println("Итоговый результат: " + result + "\n");
    }

    // Задание 2
    // 2.2 Безопасное деление
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    private void runTask2_2() {
        System.out.println("--- 2.2 Безопасное деление ---");
        System.out.print("Введите делимое (x): ");
        int x = readInt();
        System.out.print("Введите делитель (y): ");
        int y = readInt();
        System.out.println("Результат: " + safeDiv(x, y) + "\n");
    }

    // 2.5 Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    private void runTask2_5() {
        System.out.println("--- 2.5 Тройной максимум ---");
        System.out.print("Введите x: ");
        int x = readInt();
        System.out.print("Введите y: ");
        int y = readInt();
        System.out.print("Введите z: ");
        int z = readInt();
        System.out.println("Результат: " + max3(x, y, z) + "\n");
    }

    // 2.6 Тройная сумма
    public boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        }
        return false;
    }

    private void runTask2_6() {
        System.out.println("--- 2.6 Тройная сумма ---");
        System.out.print("Введите x: ");
        int x = readInt();
        System.out.print("Введите y: ");
        int y = readInt();
        System.out.print("Введите z: ");
        int z = readInt();
        System.out.println("Результат: " + sum3(x, y, z) + "\n");
    }

    // 2.7 Двойная сумма
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    private void runTask2_7() {
        System.out.println("--- 2.7 Двойная сумма ---");
        System.out.print("Введите x: ");
        int x = readInt();
        System.out.print("Введите y: ");
        int y = readInt();
        System.out.println("Результат: " + sum2(x, y) + "\n");
    }

    // 2.10 Вывод дней недели
    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник\nвторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "вторник":
                System.out.println("вторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "среда":
                System.out.println("среда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "четверг":
                System.out.println("четверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "пятница":
                System.out.println("пятница\nсуббота\nвоскресенье");
                break;
            case "суббота":
                System.out.println("суббота\nвоскресенье");
                break;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    private void runTask2_10() {
        System.out.println("--- 2.10 Вывод дней недели ---");
        System.out.print("Введите день недели: ");
        String day = scanner.next();
        printDays(day);
        System.out.println();
    }

    // Задание 3
    // 3.1 Числа подряд
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result;
    }

    private void runTask3_1() {
        System.out.println("--- 3.1 Числа подряд ---");
        System.out.print("Введите x: ");
        int x = readInt();
        System.out.println("Результат: " + listNums(x) + "\n");
    }

    // 3.4 Степень числа
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    private void runTask3_4() {
        System.out.println("--- 3.4 Степень числа ---");
        System.out.print("Введите основание (x): ");
        int x = readInt();
        System.out.print("Введите показатель (y): ");
        int y = readInt();
        System.out.println("Результат: " + pow(x, y) + "\n");
    }

    // 3.6 Одинаковость
    public boolean equalNum(int x) {
        if (x < 0) x = -x;
        if (x == 0) return true;

        int lastDigit = x % 10;

        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    private void runTask3_6() {
        System.out.println("--- 3.6 Одинаковость ---");
        System.out.print("Введите число: ");
        int x = readInt();
        System.out.println("Результат: " + equalNum(x) + "\n");
    }

    // 3.7 Квадрат
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void runTask3_7() {
        System.out.println("--- 3.7 Квадрат ---");
        System.out.print("Введите размер квадрата (x): ");
        int x = readInt();
        square(x);
        System.out.println();
    }

    // 3.9 Правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            // Выводим пробелы для выравнивания
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            // Выводим звездочки
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void runTask3_9() {
        System.out.println("--- 3.9 Правый треугольник ---");
        System.out.print("Введите высоту треугольника (x): ");
        int x = readInt();
        rightTriangle(x);
        System.out.println();
    }

    // Задание 4
    // 4.1 Поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private void runTask4_1() {
        System.out.println("--- 4.1 Поиск первого значения ---");
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.print("Что найти (x)? ");
        int x = readInt();
        System.out.println("Индекс первого вхождения: " + findFirst(arr, x) + "\n");
    }

    // 4.2 Поиск последнего значения
    public int findLast(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    private void runTask4_2() {
        System.out.println("--- 4.2 Поиск последнего значения ---");
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.print("Что найти (x)? ");
        int x = readInt();
        System.out.println("Индекс последнего вхождения: " + findLast(arr, x) + "\n");
    }

    // 4.5 Добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];
        int index = 0;

        for (int i = 0; i < pos; i++) {
            newArr[index++] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            newArr[index++] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            newArr[index++] = arr[i];
        }
        return newArr;
    }

    private void runTask4_5() {
        System.out.println("--- 4.5 Добавление массива в массив ---");
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println("Основной массив: " + Arrays.toString(arr));
        System.out.println("Вставляемый массив: " + Arrays.toString(ins));
        System.out.print("На какую позицию (pos, от 0)? ");
        int pos = readInt();
        System.out.println("Результат: " + Arrays.toString(add(arr, ins, pos)) + "\n");
    }

    // 4.8 Объединение
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[index++] = arr2[i];
        }
        return result;
    }

    private void runTask4_8() {
        System.out.println("--- 4.8 Объединение ---");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        System.out.println("Результат: " + Arrays.toString(concat(arr1, arr2)) + "\n");
    }

    // 4.10 Удалить негатив
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    private void runTask4_10() {
        System.out.println("--- 4.10 Удалить негатив ---");
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Результат: " + Arrays.toString(deleteNegative(arr)) + "\n");
    }

    private void menu_main(){
        System.out.println("Задания:");
        System.out.println("1) Задание 1");
        System.out.println("2) Задание 2");
        System.out.println("3) Задание 3");
        System.out.println("4) Задание 4");
        System.out.println("0) Выход ");
        System.out.println("Выберите задание: ");
    }
    private void menu_task1(){
        System.out.println("Подзадания:");
        System.out.println("1) Задание 1.3");
        System.out.println("2) Задание 1.4");
        System.out.println("3) Задание 1.8");
        System.out.println("4) Задание 1.9");
        System.out.println("5) Задание 1.10");
        System.out.println("0) Выход ");
        System.out.println("Выберите подзадание: ");
    }
    private void menu_task2(){
        System.out.println("Подзадания:");
        System.out.println("1) Задание 2.2");
        System.out.println("2) Задание 2.5");
        System.out.println("3) Задание 2.6");
        System.out.println("4) Задание 2.7");
        System.out.println("5) Задание 2.10");
        System.out.println("0) Выход ");
        System.out.println("Выберите подзадание: ");
    }
    private void menu_task3(){
        System.out.println("Подзадания:");
        System.out.println("1) Задание 3.1");
        System.out.println("2) Задание 3.4");
        System.out.println("3) Задание 3.6");
        System.out.println("4) Задание 3.7");
        System.out.println("5) Задание 3.9");
        System.out.println("0) Выход ");
        System.out.println("Выберите подзадание: ");
    }
    private void menu_task4(){
        System.out.println("Подзадания:");
        System.out.println("1) Задание 4.1");
        System.out.println("2) Задание 4.2");
        System.out.println("3) Задание 4.5");
        System.out.println("4) Задание 4.8");
        System.out.println("5) Задание 4.10");
        System.out.println("0) Выход ");
        System.out.println("Выберите подзадание: ");
    }
}


@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i-1) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i-1) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i +  " сумма накоплений равна " + total +  " рублей");
        }
        System.out.println("Задача 9");
        int bank = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + bank;
            System.out.println("Месяц " + i +  " сумма накоплений равна " + total1 +  " рублей");
        }
        System.out.println("Задача 10");
        int two = 2;
        int result = 1;
        for (int i = 1; i <= 10; i = i+1) {
            result = two * i;
            System.out.println( two + "*" + i + "=" + result);
        }
    }
}
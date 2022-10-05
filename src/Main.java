public class Main {
    public static void main(String[] args) {
        // Задания 1
        System.out.println(" //Задания 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(+i);
        }
        // Задания 2
        System.out.println(" //Задания 2");
        for (int i = 10; i >= +1; i--) {
            System.out.println(i);
            // Задания 3
            System.out.println(" //Задания 3 ");
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // Задания 4
        System.out.println(" //Задания 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задания 5
        System.out.println(" //Задания 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "Год является высокосным");
            }
            // Задания 6
            System.out.println(" //Задания 6");
            for (int i = 7; i <= 98; i += 7) {
                System.out.print(i + " ");
            }
            System.out.println();
            // Задания 7
            System.out.println(" //Задания 7");
        }
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
        }
        System.out.println();
        // Задания 8
        System.out.println(" //Задания 8");
        int cash = 2900;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += cash;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + " рублей");
        }
    }
}






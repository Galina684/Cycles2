
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int i = 1;
        int goalAchieved = 2_459_000;
        while (total < goalAchieved) {
            total = total + deposit;
            System.out.println("Месяц " + i++ + " Сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        int b = 10;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (; b >= 1; b = b - 1) {
            System.out.print(" " + b);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int reportingpPeriod = 10;
        for (int i = 1; i <= reportingpPeriod; i++) {
            population = population + (population / 1000 * birthRate) - (population / 1000 * deathRate);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int total = 0;
        int i = 1;
        int percentageOfSavings = 7;
        while (total < 12_000_000) {
            total = total + total / 100 * percentageOfSavings;
            total = total + deposit;
            System.out.println("Месяц " + i++ + " сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int total = 0;
        int i = 1;
        int percentageOfSavings = 7;
        for (; total < 12_000_000; i++) {
            total = total + total / 100 * percentageOfSavings;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        int i = 1;
        int percentageOfSavings = 7;
        int periodInYears = 9;
        int periodInMonths = periodInYears * 12;
        for (; i <= periodInMonths; i++) {
            total = total + total / 100 * percentageOfSavings;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 7;
        int monthIsOver = 31;
        for (; friday <= monthIsOver; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int now = 2023;
        int past = now - 200;
        int future = now + 100;
        int cometIsHere = 79;
        for (int i = 0; i <= future; i = i + cometIsHere) {
            if (i >= past) {
                System.out.println(i);
            }
        }
    }
}

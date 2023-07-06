
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
         task3();
        //task4();
        // task5();
        //task6();
        //task7();
        //task8();
    }
        public static void task1() {
            System.out.println("Задача 1");
            int deposit = 15000;
            int total = 0;
            int i = 1;
            while (total < 2_459_000) {
                total = total + deposit;
                System.out.println("Месяц " + i++ + " Сумма накоплений равна " + total + " рублей");
            }
        }
            public static void task2() {
                System.out.println("Задача 2");
                int a = 0;
                int b = 10;
                while(a<10){
                    a++;
                    System.out.print(" " + a);
                }
                System.out.println();
                for (; b >= 1; b = b - 1) {
                    System.out.print(" " + b);

                }
        }
            public static void task3() {
                System.out.println("Задача 3");
                int population = 12_000_000;
                int birthRate = 17;
                int deathRate = 8;
                for (int i = 1; i<=10; i++) {
                    population = population + (population/1000*birthRate) - (population/1000*deathRate);
                    System.out.println("Год " + i + ", численность населения составляет " + population);
                }
            }
}
public class Main {


        //  Задание 1
        public static void main(String[] args) {

    int contribution = 0;
    int total = 0;
    int i = 0;
            while (total < 2_459_000) {
        i++;
        total = total + 15000;
        total = total + total / 100;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
    }
            System.out.println(total + " рублей за " + i + " месяцев");

    // Задание 2
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
            System.out.println();
            for (i = 10; i > 0; i--) {
                System.out.print(i + " ");

                System.out.println();

                int i = 0;
                while (i < 10) {
                    i++;
                    System.out.print(i + " ");
                }
                System.out.println();
                for (i = 10; i > 0; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            {
                // Задание  3
                public static void main (String[]args){
                double populationCount = 12_000_000;
                double totalPopulationCount = populationCount;
                {
                    for (int i = 1; i <= 10; i++) {
                        populationCount = totalPopulationCount;
                        double birthPopulationCount = populationCount * 17 / 1000;
                        double deathPopulationCount = populationCount * 8 / 1000;
                        totalPopulationCount = (populationCount + birthPopulationCount - deathPopulationCount);
                        System.out.println("Год " + i + ", численность населения составляет " + totalPopulationCount);
                    }
                    // Задание 4

                    {
                        int salary = 15000;
                        int total = contribution;
                        int i = 0;
                        while (total < 12_000_000) {
                            i++;
                            total = total + total * 7 / 100;
                            System.out.println("Месяц " + i + " сумма накоплений " + total);


                            // ЗАдание 5
                            {
                                int contribution = 15000;
                                int total = contribution;
                                int i = 0;
                                while (total < 12_000_000) {
                                    i++;
                                    total = total + total * 7 / 100;
                                    if (i % 6 == 0) {
                                        System.out.println("Месяц " + i + " сумма накоплений " + total);
                                    }
                                }
                                System.out.println("За " + i + " месяцев будет накоплено " + total + " рублей");
                            }

                            //Задание 6

                        }
                        int contribution = 15000;
                        int total = contribution;
                        for (int i = 1; i <= (9 * 12); i++) {
                            total = total + total * 7 / 100;
                            if (i % 6 == 0) {
                                System.out.println("За " + i + " месяцев будет накоплено " + total + " рублей");
                            }

                            // Задание 7


                            for (int friday = 5; friday <= 31; friday += 7) {
                                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                            }
                        }
        \\Задание 8


                        int yearStart = 2022;
                        int yearBefor = yearStart - 200;
                        int yearAfter = yearStart + 100;
                        for (yearStart = yearBefor; yearStart <= yearAfter; yearStart++) {
                            if (yearStart % 79 == 0) {
                                System.out.println(yearStart);
                                System.out.println();
                            }
                        }
                    }
                }

                // Задание 9

                int x = 2;
                for (int y = 1; y <= 10; y++) {
                    int z = x * y;
                    System.out.println(x + "*" + y + "=" + z);
                }
            }
            }
        }

    }
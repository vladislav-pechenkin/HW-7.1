public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int theAmount = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_900) {
            month ++;
            total += theAmount;
            System.out.println("Месяц - " + month + " сумма накоплений равна " +  total + " рублей.");
        }
        System.out.println("Для накопления 2459000, потребуется "  + month + " месяцев.");

        System.out.println("Задача 2");

        int i = 1;
        while (i <=10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int o = 10; o >= 1; o--) {
            System.out.print(o + " ");
        }

        System.out.println("Задача 3");

        int thePopulationOfTheCountry = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (int forTheYear =1; forTheYear <= 10; forTheYear++) {
            int itWasBornInAYear = birthRate * thePopulationOfTheCountry / 1000;
            int diedInAYear = mortalityRate * thePopulationOfTheCountry / 1000;
            int populationGrowth = itWasBornInAYear - diedInAYear;
            thePopulationOfTheCountry += populationGrowth;
            System.out.println("Год " + forTheYear + ", численность населения составляет " + thePopulationOfTheCountry);
        }

        System.out.println("Задача 4");

        int month1 = 1;
        int total1 = 0;
        int salary = 15000;
        int maxSalary = 12_000_000;
        while (total1 < maxSalary) {
            total1 += total1 / 100 * 7;
            total1 += salary;
            System.out.println("За месяц № " + month1 + " сумма накопления = " + total1 + " рублей.");
            month1++;
        }
        System.out.println("Василий за " + month1 + " месяц, накопит  сумму в " + total1 + " рублей.");

        System.out.println("Задача 5");

        int month2 = 1;
        int total2 = 0;
        int salary1 = 15000;
        for (; total2 <= 12_000_000; month2++) {
            total2 += total2 / 100 * 7;
            total2 += salary1;
            if (month2 % 6 == 0) {
                System.out.println("За месяц № " + month2 + " сумма накопления = " + total2 + " рублей.");
            }
        }
        System.out.println("Василий за " + month2 + " месяц, накопит  сумму в " + total2 + " рублей.");

        System.out.println("Задача 6");

        int forTheYear1 = 9;
        int total3 = 0;
        int salary2 = 15000;
        int monthsInYear = 12;
        for (int month3 = 1; month3 <= forTheYear1 * monthsInYear; month3++) {
            total3 += total3 / 100 * 7;
            total3 += salary2;
            if (month3 % 6 == 0) {
                System.out.println("За каждые полгода сумма накопления = " + total3 + " рублей.");
            }
        }
        System.out.println("Василий за 9 лет накопит сумму в " + total3 + " рублей.");

        System.out.println("Задача 7");

        int firstFriday = 5;
        int daysMouth = 31;
        int friday = firstFriday;
        int week = 7;
        while (friday <= daysMouth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += week;
        }

        System.out.println("Задача 8");

        int kamets = 79;
        int date1 = 200;
        int date2 = 100;
        int currentYear = 2023;
        int pastBecentenary = currentYear - date1;
        for (int year = 0; year <= currentYear + date2; year = year + kamets) {
            if (year >= pastBecentenary) {
                System.out.println(year);
                if (year > currentYear) {
                    break;}
            }
        }
    }
}
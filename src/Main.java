import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Задача 1");

        int theAmount = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_900) {
            month ++;
            total += theAmount;
            System.out.println("Месяц - " + month + " сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Для накопления 2459000, потребуется " + month + " месяцев.");

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

        int salary = theAmount;
        int maxSalary = 12_000_000;
        double total1 = 1.07;
        int month1 = 0;
        while (salary < maxSalary) {
            salary *= total1;
            month1++;
            System.out.println("За месяц № " + month1 + " сумма накопления = " + salary + " рублей.");
        }
        System.out.println("Василий за " + month1 + " месяцев, накопит сумму в " + salary + " рублей.");

        System.out.println("Задача 5");

        int salary1 = theAmount;
        int maxSalary1 = 12_000_000;
        int month2 = 0;
        while (salary1 < maxSalary1){
            salary1 *= total1;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("За месяц № " + month2 + " сумма накопления = " + salary1 + " рублей.");
            }
        }
        System.out.println("Василий за " + month2 + " месяц, накопит сумму в " + salary1 + " рублей.");

        System.out.println("Задача 6");

        int salary2 = theAmount;
        for (int month3 = 1; month3 <= (9 * 12); month3++) {
            salary2 *= total1;
            if (month3 % 6 == 0) {
                System.out.println("За каждые полгода сумма накопления = " + salary2 + " рублей.");
            }
        }
        System.out.println("Василий за 9 лет накопит сумму в " + salary2 + " рублей.");

        System.out.println("Задача 7");

        System.out.println("Введите число первой пятницы: ");
        int firstFriday = read.nextInt();
        int day = 0;

        if (firstFriday > 7) {
            return;
        }
        System.out.println("Введите колличество дней в месяце: ");
        int daysMonth = read.nextInt();

        if (daysMonth <= 27 || daysMonth > 31) {
            return;
        }

        for (day = firstFriday; day <= daysMonth; day+= 7){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача 8");

        System.out.println("Введите год");
        int year = read.nextInt();
        int lastYear = year - 200;
        int nextYear = year + 100;
        int year2 = 0;
        for (year2 = lastYear; year2 <= nextYear; year2++) {
            if (year2 % 79 == 0) {
                System.out.println(year2);
            }
        }
        read.close();
    }
}
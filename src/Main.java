//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int target = 2_459_000;
        int totalDeposit = 0;
        int monthlyDeposit = 15_000;
        int month = 0;
        while (totalDeposit < target) {
            month++;
            totalDeposit += monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit);
        }
        System.out.println("Для достижения цели в " + target + " рублей потребуется " + month + " месяцев.");
        System.out.println();

        System.out.println("Task2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int j = 10;
        for (j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Task3");
        int population = 12_000_000;
        int fertilityPer1000 = 17;
        int mortalityPer1000 = 8;
        for (int year = 1; year <= 10; year++) {
            population += (population * (fertilityPer1000 - mortalityPer1000)) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Task4");
        double deposit = 15000;
        double goal = 12_000_000;
        double monthPercent = 0.07;
        double totalAmount = 0;
        int months = 0;
        while (totalAmount < goal) {
            totalAmount += deposit;
            totalAmount += totalAmount * monthPercent;
            months++;
        }
        System.out.printf("Месяц %d, cумма накоплений составляет %.2f%n", months, totalAmount);
        if (totalAmount >= goal) {
            System.out.printf("Количество месяцев, требующихся для достижения результата: %d%n", months);
        }
        System.out.println("task5");
        double deposit1 = 15000;
        double goal1 = 12_000_000;
        double monthPercent1 = 0.07;
        double totalAmount1 = 0;
        int months1 = 0;
        while (totalAmount1 < goal1) {
            totalAmount1 += deposit1;
            totalAmount1 += totalAmount1 * monthPercent1;
            months1++;
            if (months1 % 6 == 0) {
                System.out.printf("Месяц %d, cумма накоплений составляет %.2f%n", months1, totalAmount1);
            }
        }
        if (totalAmount1 >= goal1) {
            System.out.printf("Количество месяцев, требующихся для достижения результата: %d%n", months1);
        }
        System.out.println("task6");
        double deposit2 = 15000;
        double monthPercent2 = 0.07;
        double totalAmount2 = 0;
        int monthIn9Years = 12 * 9;
        int currentMonth = 0;
        while (currentMonth < monthIn9Years) {
            totalAmount2 += deposit2;
            totalAmount2 += totalAmount2 * (monthPercent2 / 12);
            currentMonth++;
            if (currentMonth % 6 == 0) {
                System.out.printf("Месяц %d, cумма накоплений составляет %.2f%n", currentMonth, totalAmount2);
            }
        }
        System.out.println("Task7");
        int firstFriday = 3;
        int dayMonth = 31;
        for (int day = firstFriday; day <= dayMonth; day += 7) {
            System.out.println("Сегодня пятница " + day + "е число. Необходимо подготовить отчет");
        }
        System.out.println("Task8");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);

            }
        }
    }
};



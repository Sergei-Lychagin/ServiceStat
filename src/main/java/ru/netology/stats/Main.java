package ru.netology.stats;

public class Main {
    public static void main(String[] args) throws Exception {

        StatsService service = new StatsService();
        int inputValues[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int itog = service.salesAmount(inputValues);

        System.out.println(itog);

        int averageSum = service.averageSalesAmount(inputValues);
        System.out.println(averageSum);

        int mount = service.picMonthNumber(inputValues);
        System.out.println(mount);

        int index = service.minMonthNumber(inputValues);
        System.out.println(index);

        int belowAverage = service.ofMonthsBelowAverage(inputValues);
        System.out.println(belowAverage);

        int aboveAverage = service.ofMonthsAboveAverage(inputValues);
        System.out.println(aboveAverage);

    }

}
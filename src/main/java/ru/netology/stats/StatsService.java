package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] inputValues) {

        int sum = 0;
        for (int i : inputValues) {
            sum = sum + i;
        }

        return sum;
    }

    public int averageSalesAmount(int[] inputValues) {

        int sum = salesAmount(inputValues);
        int averageSum = sum / 12;
        return averageSum;
    }

    public int picMonthNumber(int[] inputValues) {
        int month = 0;
        int maxSale = 0;
        for (int i = 0; i < inputValues.length; i++) {
            if (inputValues[i] >= maxSale) {
                maxSale = inputValues[i];
                month = i;

            }

        }
        return month;
    }

    public int minMonthNumber(int[] inputValues) {
        int index = 0;
        int minSale = picMonthNumber(inputValues);
        for (int i = 0; i < inputValues.length; i++) {
            if (inputValues[i] <= minSale) {
                minSale = inputValues[i];
                index = i;

            }
        }
        return index;
    }

    public int ofMonthsBelowAverage(int[] inputValues) {
        int belowAverage = 0;
        int averageSum = averageSalesAmount(inputValues);

        for (int i = 0; i < inputValues.length; i++) {
            if (inputValues[i] < averageSum) {
                belowAverage = belowAverage + 1;

            }
        }
        return belowAverage;
    }

    public int ofMonthsAboveAverage(int[] inputValues) {
        int aboveAverage = 0;
        int averageSum = averageSalesAmount(inputValues);

        for (int i = 0; i < inputValues.length; i++) {
            if (inputValues[i] < averageSum) {
                aboveAverage = aboveAverage + 1;

            }
        }
        return aboveAverage;
    }

}

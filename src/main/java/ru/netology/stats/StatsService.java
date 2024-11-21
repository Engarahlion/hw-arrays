package ru.netology.stats;

public class StatsService {
    public int amountSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int average = amountSales(sales) / sales.length;
        return average;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int average = averageSales(sales);
        int calc = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                calc++;
            }
        }
        return calc;
    }

    public int aboveAverageSales(long[] sales) {
        int average = averageSales(sales);
        int calc = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                calc++;
            }
        }
        return calc;
    }
}

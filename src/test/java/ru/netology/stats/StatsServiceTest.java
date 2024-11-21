package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void amountSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.amountSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void maxMonthSalesStatsServiceTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonthSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц, в котором был пик продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void minMonthSalesStatsServiceTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonthSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц, в котором был минимум продаж " + actual + " " + (expected == actual));
    }

    @Test
    public void belowAverageStatsServiceTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи ниже среднего " + actual + " " + (expected == actual));
    }

    @Test
    public void aboveAverageStatsServiceTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи выше среднего " + actual + " " + (expected == actual));
    }


}



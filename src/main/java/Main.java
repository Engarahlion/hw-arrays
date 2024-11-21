import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int amountSales = service.amountSales(sales);
        System.out.println(amountSales);

        int averageSales = service.averageSales(sales);
        System.out.println(averageSales);

        int maxMonthSales = service.maxMonthSales(sales);
        System.out.println(maxMonthSales);

        int minMonthSales = service.minMonthSales(sales);
        System.out.println(minMonthSales);

        int belowAverageSales = service.belowAverageSales(sales);
        System.out.println(belowAverageSales);

        int aboveAverageSales = service.aboveAverageSales(sales);
        System.out.println(aboveAverageSales);

    }
}
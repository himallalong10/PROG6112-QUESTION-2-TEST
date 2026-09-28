package consolesalesapplication;

public class RunApplication {

    public static void main(String[] args) {

        ConsoleSales consoleSales = new ConsoleSales(
                "PS5",
                "Number 1 Electronics",
                15000
        );

        consoleSales.printReport();
    }
}
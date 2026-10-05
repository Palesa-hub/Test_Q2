public class ConsoleSales extends Console implements IConsoles {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public String getConsoleType() {
        return super.getConsoleType();
    }

    @Override
    public String getStore() {
        return super.getStore();
    }

    @Override
    public int getTotalSales() {
        return super.getTotalSales();
    }

    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
    }
}
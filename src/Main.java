//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("CONSOLE SALES APPLICATION");
            System.out.println("-------------------------");

            System.out.print("Enter console type: ");
            String consoleType = input.nextLine();

            System.out.print("Enter store name: ");
            String store = input.nextLine();

            System.out.print("Enter total amount of sales: ");
            int totalSales = input.nextInt();

            ConsoleSales sales = new ConsoleSales (
                    consoleType,
                    store,
                    totalSales
            );

            System.out.println();
            sales.printReport();

            input.close();
        }
    }


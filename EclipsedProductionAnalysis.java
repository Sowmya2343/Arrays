import java.util.Scanner;

public class EclipsedProductionAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define categories and languages
        String[] categories = {"Action", "Comedy", "Drama"};
        String[] languages = {"Kannada", "Hindi", "Telugu"};

        // 3D array to store revenue for each movie
        double[][][] revenue = new double[3][3][1];

        double totalInvestment = 100.0; // in crores
        double totalRevenue = 0.0;

        // Collect revenue input from user
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            for (int j = 0; j < languages.length; j++) {
                System.out.print("Enter revenue for " + languages[j] + " movie: ");
                revenue[i][j][0] = sc.nextDouble();
                totalRevenue += revenue[i][j][0];
            }
            System.out.println("----------------------------");
        }

        // Calculate profit
        double profit = totalRevenue - totalInvestment;

        // Display report
        System.out.println("\n======= Movie Revenue Report =======");
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            for (int j = 0; j < languages.length; j++) {
                System.out.println("  Language: " + languages[j] + " → Revenue: Rs. " + revenue[i][j][0] + " Cr");
            }
        }

        // Final financial summary
        System.out.println("\nTotal Investment: Rs. " + totalInvestment + " Cr");
        System.out.println("Total Revenue: Rs. " + totalRevenue + " Cr");
        System.out.println("Profit: Rs. " + profit + " Cr");

        // Compare with last year
        double previousProfit = 80.0;
        if (profit > previousProfit) {
            System.out.println("Profit is higher than previous year by Rs. " + (profit - previousProfit) + " Cr");
        } else if (profit < previousProfit) {
            System.out.println("Profit is lower than previous year by Rs. " + (previousProfit - profit) + " Cr");
        } else {
            System.out.println("Profit is same as previous year: Rs. " + profit + " Cr");
        }

        // Profitability check
        if (profit > 0) {
            System.out.println("Status: PROFITABLE ✅");
        } else if (profit < 0) {
            System.out.println("Status: LOSS ❌");
        } else {
            System.out.println("Status: NO PROFIT, NO LOSS ⚖️");
        }
    }
}

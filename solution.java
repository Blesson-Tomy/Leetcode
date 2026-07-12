import java.util.Scanner;
import java.util.Arrays;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }
}

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] footwears = new Footwear[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Clear numeric buffer
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine(); // Clear numeric buffer

            footwears[i] = new Footwear(id, name, type, price);
        }

        String searchType = sc.nextLine();
        String searchBrand = sc.nextLine();

        // 1. Run getCountByType
        int count = getCountByType(footwears, searchType);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }

        // 2. Run getSecondHighestPriceByBrand
        Integer secondHighest = getSecondHighestPriceByBrand(footwears, searchBrand);
        if (secondHighest != null) {
            System.out.println(secondHighest);
        } else {
            System.out.println("Brand not available");
        }

        sc.close();
    }

    public static int getCountByType(Footwear[] arr, String type) {
        int count = 0;
        for (Footwear f : arr) {
            if (f.getFootwearType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public static Integer getSecondHighestPriceByBrand(Footwear[] arr, String brand) {
        // First count how many elements match the brand
        int matchCount = 0;
        for (Footwear f : arr) {
            if (f.getFootwearName().equalsIgnoreCase(brand)) {
                matchCount++;
            }
        }

        if (matchCount < 2) {
            return null; // Instantly return null if there aren't enough items
        }

        // Extract matching prices into a temporary array
        int[] prices = new int[matchCount];
        int index = 0;
        for (Footwear f : arr) {
            if (f.getFootwearName().equalsIgnoreCase(brand)) {
                prices[index++] = f.getPrice();
            }
        }

        // Sort the array in ascending order
        Arrays.sort(prices);

        // Filter out duplicate values to find the true second-highest distinct price
        // (Working backwards from the highest element)
        int highest = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] != highest) {
                return prices[i]; // Returns the second highest unique price
            }
        }

        return null; // Fallback if all matching prices were identical duplicates
    }
}

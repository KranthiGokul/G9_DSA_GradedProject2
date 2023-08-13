package skyScraper;

import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building : ");
        int N = sc.nextInt();

        SkyScraperBuilder skyscraper = new SkyScraperBuilder();

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the floor size given on day " + i + ": ");
            int size = sc.nextInt();
            skyscraper.addFloor(size, i);
        }

        System.out.println("\nThe order of construction is as follows :");

        skyscraper.construct();
    }
}

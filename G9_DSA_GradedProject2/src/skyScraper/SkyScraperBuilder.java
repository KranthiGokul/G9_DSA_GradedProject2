package skyScraper;

import java.util.*;

 class SkyScraperBuilder {
	 List<Floor> floors;

	 public SkyScraperBuilder() {
	        floors = new ArrayList<>();
	    }

	    public void addFloor(int size, int day) {
	    	floors.add(new Floor(size, day));
	    }

	    public void construct() {
	    	Collections.sort(floors, (a,b) -> b.size - a.size);
	    	int currentDay = 0;
	    	for (Floor floor : floors) {
	    		while (floor.day > currentDay) {
	    			currentDay++;
	    			System.out.println("\nDay : " + currentDay);
	    			
	    		}
	    		System.out.print(floor.size +" ");
	    	}
	    	while (currentDay <= floors.get(0).day) {
	    		
	    		System.out.println("\nDay : " + currentDay);
	    		currentDay++;
	    	}
	    }
}

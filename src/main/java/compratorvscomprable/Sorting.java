package compratorvscomprable;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		Movie m1= new Movie(7, "Terminator", 1999);
		Movie m2= new Movie(10, "Kantara", 2022);
		Movie m3= new Movie(6, "HeraPheri", 2008);
		
		
		ArrayList<Movie> data = new ArrayList<Movie>();
		data.add(m1);
		data.add(m2);
		data.add(m3);
		
		
		
		for (Movie movie : data) {
			System.out.println(movie.getRating());
			System.out.println(movie.getName());
			System.out.println(movie.getYear());
			
			
		}
		//SortByYear year= new SortByYear();
		SortByName name= new SortByName();
		
		Collections.sort(data , name);
		for (Movie movie : data) {
			System.out.println(movie.getRating());
			System.out.println(movie.getName());
			System.out.println(movie.getYear());
			
			
		}
	}

}

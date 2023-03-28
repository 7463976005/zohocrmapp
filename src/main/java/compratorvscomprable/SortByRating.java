package compratorvscomprable;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getRating()-o2.getRating();
	}

}

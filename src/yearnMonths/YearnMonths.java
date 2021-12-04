package yearnMonths;

public class YearnMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*[AVERAGE] 2.Calculate using formula and print answer in years and months.
		 Approx years for a movie release = (Last movie Release Year – First Movie Release year) / Total Number of Movies */
		int firstMovieReleaseYear = 2001;
		int lastMovieReleaseYear = 2011;

		int totalNoOfMovies = 8;
		double appYearMovieRelease = (lastMovieReleaseYear - firstMovieReleaseYear) / totalNoOfMovies;

		System.out.println("Approx Years for Movie Release is: " + appYearMovieRelease + " year");
		System.out.println("Approx years for movie Release in months is " + appYearMovieRelease * 12 + " months");


	}//End of Main

}//End of Class

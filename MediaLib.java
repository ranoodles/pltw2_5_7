public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  // //step6
	// private static String owner = "PLTW";
	public static String owner = "PLTW";
	// //step2
	// public static String getOwner() {
	// 	return owner;
	// }
	// //step7
	// public static void changeOwner(String own) {
	// 	owner = own;
	// }

	private static int numEntries;
	private static int numBooks;
	private static int numSongs;
	private static int numMovies;

	public static int getNumEntries() {
		//step18
		System.out.println("Test: Owner is "+ owner);
		return numEntries;
	}

  public void addBook(Book b)
  {
	if (book == null) {
		book = b;
		numEntries++;
		numBooks++;
	} else {
		System.out.println("A book has already been added.");
	}
  }

   public void addMovie(Movie m)
  {
	if (movie == null) {
		movie = m;
		numEntries++;
		numMovies++;
	} else {
		System.out.println("A book has already been added.");
	}
  }

  public void addSong(Song s)
  {
	if (song == null) {
		song = s;
		numEntries++;
		numSongs++;
	} else {
		System.out.println("A book has already been added.");
	}
  }
   
  // new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
	tester.setTitle("Animal Farm");
	// show state chagne with one of the following
	System.out.println(" in test: " + tester);
	System.out.println(" in test: " + tester.getTitle());
  }
  */
   
  public String toString()  
  {
	String info = "";
 
	// Step 5, avoid crashing by testing that book is not null before using its toString method
	if (book != null)
  	info += "Book: " + book + "\n";

	if (movie != null)
  	info += "Movie: " + movie + "\n";

	if (song != null)
  	info += "Song: " + song + "\n";
 
	return info;
  }
}

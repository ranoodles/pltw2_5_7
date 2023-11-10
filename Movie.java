/*************************************
 * Sample solution for Activity 2.5.7
 *  
 * A MediaLib class for the MediaLibrary program
 *  
 * See comments for each step
 **************************************/
public class Movie
{
  private int rating;
  private String title;
  private double duration;
 
  /*** Constructor ****/
  public Movie(String t, double d)
  {
	title = t;
	duration = d;
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
	return title;
  }
 
  public double getDuration() {
	return duration;
  }
 
  public int getRating() {
	return rating;
  }
 
  public String toString()  
  {
	String info = "\"" + title + "\", is " + duration + " hrs";
	if (rating != 0)  
 	info += ", rating is " + rating;
	 
	return info;
  }
 
  // Step 23 - 29
  public boolean equals(Movie m)
  {
	// variations of the if statement:
	// if(b.title.equals(getTitle()) && b.author.equals(getAuthor()))
	// if(title.equals(b.title) && author.equals(b.author))
	// if(b.title.equals(title) && b.author.equals(author))
	if(this.title.equals(m.title) && this.duration == m.duration)
  	return true;  
	return false;
 
  }
 
  /*** Mutator methods ***/
  public void setDuration(double d) {
	duration = d;
  }
	 
  public void setTitle(String t) {
	title = t;
  }
 
  // Step 7: create the method
  public void adjustRating(int r)
  {
	// Step 10-11 improve the method
	if ((rating + r >= 0) && (rating + r <= 10))
  	rating += r;
 
	r = 10;// Step 9: changing the param here has no effect in the runner
 
  }
 
}

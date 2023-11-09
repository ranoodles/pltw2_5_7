public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
	book = b;
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

  
  public String toString()  
  {
	String info = "";
 
	// Step 5, avoid crashing by testing that book is not null before using its toString method
	if (book != null)
  	info += "Book: " + book + "\n";
 
	return info;
  }
}

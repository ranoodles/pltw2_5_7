public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    //step1
    System.out.println(MediaLib.owner + "'s Library");
    // //step14
    // System.out.println(MediaLib.getNumEntries());
    //step 16
    MediaLib lib1 = new MediaLib();
    lib1.addBook(new Book("Lord of Rings", "JRR"));
    MediaLib lib2 = new MediaLib();
    lib2.addMovie(new Movie("Lord of Rings", 1.45));
    System.out.println(MediaLib.getNumEntries());
    //step28
    lib1.addSong(new Song("FEIN"));
    System.out.println(lib1);
  }
}
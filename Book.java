public class Book
{
  private String title;
  private String author;
  private int rating;

  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public String getAuthor()
  {
    return author;
  }

  public int getRating()
  {
    return rating;
  }

  public int adjustRating(int r)
  {
    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10)
    {
      rating = newRating;
    }
    return rating;
  }

  public boolean equals(Book b)
  {
    if (b == null)
      return false;

    return title.equals(b.title) && author.equals(b.author);
  }

  public String toString()
  {
    String info = "\"" + title + "\", written by " + author;

    if (rating != 0)
      info += ", rating is " + rating;

    return info;
  }
}

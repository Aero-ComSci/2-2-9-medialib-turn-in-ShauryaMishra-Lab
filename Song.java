public class Song
{
  private String title;
  private int rating;

  public Song(String t)
  {
    title = t;
    rating = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public int getRating()
  {
    return rating;
  }

  public int adjustRating(int r)
  {
    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10)
      rating = newRating;

    return rating;
  }

  public boolean equals(Song other)
  {
    return title.equals(other.title);
  }

  public String toString()
  {
    String info = "\"" + title + "\"";

    if (rating != 0)
      info += ", rating is " + rating;

    return info;
  }
}

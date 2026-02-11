public class Movie
{
  private String title;
  private double duration;
  private int rating;

  public Movie(String t, double d)
  {
    title = t;
    duration = d;
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

  public String toString()
  {
    String info = "\"" + title + "\", duration: " + duration + " hours";

    if (rating != 0)
      info += ", rating is " + rating;

    return info;
  }
}

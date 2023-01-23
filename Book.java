import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private int rating;

    public Book(String title, int rating) {
        this.title = Objects.requireNonNull(title, "title cannot be null");

        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("rating must be between 0 and 5");
        }

        this.rating = rating;
    }
    
    @Override
    public int compareTo(Book o){
        if(this.rating == o.rating){
            return this.title.compareTo(o.title);
        }
        return this.rating - o.rating;
    }
}

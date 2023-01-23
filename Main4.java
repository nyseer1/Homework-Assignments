import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Book file: ");
        Scanner input = new Scanner(System.in);
        File file = new File(input.next()); //File input
        Scanner scnr = new Scanner(System.in);
        boolean exists = true;
        do{
            try{
                scnr = new Scanner(file); //Scans input file
            } catch(FileNotFoundException ex){
                System.out.println("File does not exist; try again");
                file = new File(input.next());
                exists = false; 
            }
            exists = true; 
            
        }while(!exists);
        
        // while(!(file.exists())){
        //     System.out.println("File does not exist; try again");
        //      file = new File(input.next());
        // }
        System.out.println("Enter a sorting choice (or q to quit):");
        System.out.println("t - by title, n - by last name, r - by rating");

        String choice = scnr.next();
        
        ArrayList<Book> books = new ArrayList<>();

        while(scnr.hasNextLine()){
            String[] comma = scnr.nextLine().split(",");
            if(comma.length == 3){
                String[] names = comma[1].split(" ");
                if(names.length == 2){
                    if(Character.isDigit(comma[2].charAt(0)) && Character.isDigit(comma[2].charAt(2))){
                        double doubleR = Double.parseDouble(comma[2]); 
                        books.add(new Book(comma[0], names[0], names[1], doubleR));
                    }

                }
            }
        }
        //reads books into arraylist

        
        while(choice != "q"){
            //compares by title
            Comparator<Book> sortT = new Comparator<Book>() {
                @Override
                public int compare(Book b1, Book b2){
                    return b1.getTitle().compareTo(b2.getTitle());
                }
            };
            if(scnr.next().equals("t")){
                books.sort(sortT);
                System.out.println(books);
            }

            //rating
            Comparator<Book> sortR = new Comparator<Book>() {
                @Override
                public int compare(Book b1, Book b2){
                    return Double.compare(b1.getRating(), (b2.getRating()));
                }
            };
            if(scnr.next().equals("r")){
                books.sort(sortR);
            }

            //name
            Comparator<Book> sortN = new Comparator<Book>() {
                @Override
                public int compare(Book b1, Book b2){
                    return b1.getLast().compareTo(b2.getLast());
                }
            };
            if(scnr.next().equals("n")){
                books.sort(sortN);
            }

            //reloop
            System.out.println("Enter a sorting choice (or q to quit):");
            System.out.println("t - by title, n - by last name, r - by rating");

            choice = scnr.next();

        }  
     
        
        input.close();

        scnr.close();   
    }
}
class Book {
    private String title, first, last;
    private double rating;

    public Book(String title, String first, String last, double rating) {
        this.title = title;
        this.first = first;
        this.last = last;
        this.rating = rating;
    }
    public Book() {
        this.title = "";
        this.first = "";
        this.last = "";
        this.rating = 0.0;
    }

    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }

    public double getRating() {
        return rating;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title + "," + first + " " + last + "," + rating;
    }
}

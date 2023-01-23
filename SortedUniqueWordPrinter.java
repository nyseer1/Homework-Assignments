import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;


public class SortedUniqueWordPrinter {
    public static void main(String[] args) throws FileNotFoundException{
        TreeSet<String> set = new TreeSet<>();
        File file = new File("input.txt"); //File input
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            set.add(input.next());
        }
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            
        }



    }
}

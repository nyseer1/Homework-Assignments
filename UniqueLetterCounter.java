import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 /**
  * UniqueLetterCounter
  */
 public class UniqueLetterCounter { 
 
    public static void main(String[] args) throws FileNotFoundException{
        Set<Character> set = new HashSet<>();
        File file = new File("input.txt"); //File input
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String current = input.next();
            for(int i = 0; i < current.length(); i++){
                if(Character.isLetter(current.charAt(i))){
                    set.add(current.charAt(i));
                }
            }
        }

        System.out.print(set.size());
    }
 }
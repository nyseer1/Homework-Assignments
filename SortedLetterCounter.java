import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
 /**
  * UniqueLetterCounter
  */
 public class SortedLetterCounter { 
 
    public static void main(String[] args) throws FileNotFoundException{
        // TreeMap<String, Integer> map = new TreeMap<>();
        // File file = new File("input.txt"); //File input
        // Scanner input = new Scanner(file);

        // while(input.hasNext()){
        //     String current = input.next();
        //     for(int i = 0; i < current.length(); i++){
        //         if(Character.isLetter(current.charAt(i))){
        //             if(!map.containsKey("" + current.charAt(i))){
        //                 map.put("" + current.charAt(i), 1);
        //             }
        //             else{
        //                 int count = map.get("" + current.charAt(i));
        //                 map.put("" + current.charAt(i), count +1);
        //             }
        //         }
        //     }
        // }
        // while(!(map.isEmpty())){
        //     System.out.println(map.firstKey() + ": " + map.get(map.firstKey()));
        //     map.remove(map.firstKey());
        // }

        int[] array = { 5,7,1,5,1,7,1,2 };
        System.out.println(mode(array));

        
    }
    public static int mode(int[] array){
        TreeMap<Integer, Integer> tests = new TreeMap<>();
        int mode = -1;
        for(int i = 0; i < array.length; i++){
            if(!(tests.containsKey(array[i]))){
                tests.put(array[i], 1);
            }
            else{
                int count = tests.get(array[i]);
                tests.put(array[i], count + 1);
            }
        }
        while(!(tests.isEmpty())){
        if(tests.get(tests.firstKey()) >= mode){
            mode = tests.firstKey();
        }
        tests.remove(tests.firstKey());
        }
        return mode; 
    }
 }
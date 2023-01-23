
import java.util.ArrayList;

public class Methods {
	public static double average(ArrayList<Double> list){
        double sum = 0.0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum / list.size();
    }
    public static int maxLength(ArrayList<String> list){
        String max = "";
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > max.length()){
                max = list.get(i);
            }
        }
        return max.length();
    }
    public static String first(ArrayList<String> list){
        return list.get(0);
    }
    public static ArrayList<String> firstThree(ArrayList<String> list){
        ArrayList<String> newL = new ArrayList<>();
        newL.add(list.get(0));
        newL.add(list.get(1));
        newL.add(list.get(2));
        return newL;
    }
    public static ArrayList<String> firstN(ArrayList<String> list, int n){
        ArrayList<String> newL = new ArrayList<>();
        for(int i = 0; i < n; i++){
            newL.add(list.get(i));
        }
        return newL;
    }

    public static String last(ArrayList<String> list){
        return list.get(list.size() - 1);
    }
    
    public static ArrayList<String> lastThree(ArrayList<String> list){
        ArrayList<String> newL = new ArrayList<>();
        newL.add(list.get(list.size() - 3));
        newL.add(list.get(list.size() - 2));
        newL.add(list.get(list.size() - 1));
        return newL;
    }
    public static ArrayList<String> lastN(ArrayList<String> list, int n){
        ArrayList<String> newL = new ArrayList<>();
        for(int i = n; i > 0; i--){
            newL.add(list.get(list.size() - i));
        }
        return newL;
    }
    public static void swapFirstAndLast(ArrayList<String> list){
        String temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
    }
    public static int nthIndexOf(ArrayList<String> list, String s, int n){
        int index = -1;
        for(int i = n + 1; i < list.size(); i++){
            if(list.get(i).equals(s)){
                index = i;
                return index;
            }
        }
        return index;
    }
    


}
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] words = getWordsArray();
        Comparator<String> numVowelsComparator;

        // TODO - create the Comparator
        class numVowelsComparator implements Comparator<String>{
            @Override
            public int compare(String s1, String s2){
                int v1 = 0; //vowels 
                int v2 = 0;
                char c;
                for(int i = 0; i < s1.length(); i++){
                    c = s1.charAt(i);
                    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U'){    
                    v1++;
                    }
                }
                for(int i = 0; i < s2.length(); i++){
                    c = s2.charAt(i);
                    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U'){    
                    v2++;
                    }
                }
                return v1 - v2;
            }
        }
        numVowelsComparator comparator = new numVowelsComparator();
        

        Arrays.sort(words, comparator);
        System.out.println(Arrays.toString(words));
    }

    private static String[] getWordsArray() {
        return new String[]{
                "explain",
                "fist",
                "hike",
                "producer",
                "glance",
                "pile",
                "enhance",
                "detector",
                "reject",
                "soldier",
                "ideology",
                "attack",
                "reason",
                "wonder",
                "life",
                "college",
                "transportation",
                "highlight",
                "program",
                "tell"
        };
    }
}

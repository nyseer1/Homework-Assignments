import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Player> players = getPlayersList();

        // TODO 1 - sort the players by name in ascending order
        Comparator<Player> nameSort = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                return p1.getName().compareTo(p2.getName());
            }
        }; //one long assignment statement so we actually need a semi colon

        players.sort(nameSort);

        System.out.println("players sorted by name in ascending order: " + players);

        // TODO 2 - sort the players by name in descending order
               Comparator<Player> nameSortD = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                return - p1.getName().compareTo(p2.getName());
            }
        }; //one long assignment statement so we actually need a semi colon
        
        players.sort(nameSortD);


        System.out.println("players sorted by name in descending order: " + players);

        // TODO 3 - sort the players by score in ascending order
        Comparator<Player> scoreSort = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                return Integer.compare(p1.getScore(), (p2.getScore()));
            }
        }; //one long assignment statement so we actually need a semi colon
        
        players.sort(scoreSort);
        

        System.out.println("players sorted by score in ascending order: " + players);

        // TODO 4 - sort the players by score in descending order
        Comparator<Player> scoreSortD = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                return - Integer.compare(p1.getScore(), (p2.getScore()));
            }
        }; //one long assignment statement so we actually need a semi colon
        
        players.sort(scoreSortD);

        System.out.println("players sorted by score in descending order: " + players);
    }

    private static ArrayList<Player> getPlayersList() {
        return new ArrayList<>(List.of(
                new Player("Jane", 56),
                new Player("John", 34),
                new Player("Olivia", 47),
                new Player("Kate", 67),
                new Player("Adam", 39),
                new Player("Josh", 60)
        ));
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

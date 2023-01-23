import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Player> players = getPlayersList();

        // TODO 1 - sort the players in ascending order by name and then (if the names are equal) by score
        Comparator<Player> sortNS = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                if(p1.getName().compareTo(p2.getName()) == 0){
                    return Integer.compare(p1.getScore(), (p2.getScore()));
                }
                return p1.getName().compareTo(p2.getName());
            }
        };
        players.sort(sortNS);

        System.out.println("players sorted in ascending order by name and then by score: " + players);

        // TODO 2 - sort the players in ascending order by score and then (if the scores are equal) by name
        Comparator<Player> sortSN = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2){
                if(Integer.compare(p1.getScore(), (p2.getScore())) == 0){
                    return p1.getName().compareTo(p2.getName());
                }
                return Integer.compare(p1.getScore(), (p2.getScore()));
            }
        };
        players.sort(sortSN);

        System.out.println("players sorted in ascending order by score and then by name: " + players);

    }

    private static ArrayList<Player> getPlayersList() {
        return new ArrayList<>(List.of(
                new Player("Jane", 56),
                new Player("John", 34),
                new Player("Olivia", 47),
                new Player("Kate", 67),
                new Player("Adam", 39),
                new Player("Josh", 60),
                new Player("Jane", 67),
                new Player("Adam", 65),
                new Player("Olivia", 47),
                new Player("Dave", 39)
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

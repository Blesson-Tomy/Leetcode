import java.util.Scanner;
import java.util.Arrays;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Parameterized Constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class MyClass {
    // Static method to find player with lowest runs for a given player type
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int lowestRuns = 0;
        boolean found = false;

        for (Player player : players) {
            if (player.getPlayerType().equalsIgnoreCase(playerType)) {
                if (!found || player.getRuns() < lowestRuns) {
                    lowestRuns = player.getRuns();
                    found = true;
                }
            }
        }

        return lowestRuns;
    }

    // Static method to find players by match type in descending order of playerId
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        // Count players with the given match type
        int count = 0;
        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchType)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        // Create array for matching players
        Player[] result = new Player[count];
        int index = 0;
        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchType)) {
                result[index++] = player;
            }
        }

        // Sort by playerId in descending order
        Arrays.sort(result, (p1, p2) -> Integer.compare(p2.getPlayerId(), p1.getPlayerId()));

        return result;
    }

    public static void main(String[] args) {
        Player[] players = new Player[4];
        Scanner sc = new Scanner(System.in);

        // Read 4 Player objects
        for (int i = 0; i < 4; i++) {
            int playerId = sc.nextInt();
            sc.nextLine();
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        // Read player type and match type
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        // Call findPlayerWithLowestRuns
        int lowestRuns = findPlayerWithLowestRuns(players, playerType);
        if (lowestRuns > 0) {
            System.out.println(lowestRuns);
        } else {
            System.out.println("No such player");
        }

        // Call findPlayerByMatchType
        Player[] matchPlayers = findPlayerByMatchType(players, matchType);
        if (matchPlayers != null) {
            for (Player player : matchPlayers) {
                System.out.println(player.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }
    }
}
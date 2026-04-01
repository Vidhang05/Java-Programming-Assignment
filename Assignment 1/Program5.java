// Base Class
class Match {
    String team1;
    String team2;

    // Constructor
    Match(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Method to display teams
    void displayTeams() {
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
    }
}

// Derived Class
class CricketMatch extends Match {
    int score1;
    int score2;

    // Constructor
    CricketMatch(String team1, String team2, int score1, int score2) {
        super(team1, team2);
        this.score1 = score1;
        this.score2 = score2;
    }

    // Method to display scores
    void displayScores() {
        System.out.println(team1 + " Score: " + score1);
        System.out.println(team2 + " Score: " + score2);
    }

    // Method to display result
    void displayResult() {
        if (score1 > score2) {
            System.out.println(team1 + " wins by " + (score1 - score2) + " runs.");
        } else if (score2 > score1) {
            System.out.println(team2 + " wins by " + (score2 - score1) + " runs.");
        } else {
            System.out.println("Match is a Draw.");
        }
    }
}

// Main Class (Program5)
public class Program5 {
    public static void main(String[] args) {

        // Validate input
        if (args.length != 4) {
            System.out.println("Usage: java Program5 <Team1> <Team2> <Score1> <Score2>");
            return;
        }

        // Read command line arguments
        String team1 = args[0];
        String team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);

        // Create object
        CricketMatch match = new CricketMatch(team1, team2, score1, score2);

        // Display output
        match.displayTeams();
        match.displayScores();
        match.displayResult();
    }
}
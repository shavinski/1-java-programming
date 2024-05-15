package part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        int gameCount = 0;
        int winCount = 0;
        int loseCount = 0;

        try (Scanner scanner2 = new Scanner(Paths.get(fileName))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String[] data = line.split(",");

                if (line.contains(teamName)) {
                    gameCount++;
                }

                int win = determineWinOrLose(data, teamName);

                if (win == 1) {
                    winCount++;
                } else if (win == 0) {
                    loseCount++;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + loseCount);
    }

    // Will compare the teams win, a win returns true a loss will return false
    public static int determineWinOrLose(String[] data, String teamName) {
        String teamOne = data[0];
        String teamOneScore = data[2];
        int teamOneScoreInt = Integer.parseInt(teamOneScore);

        String teamTwo = data[1];
        String teamTwoScore = data[3];
        int teamTwoScoreInt = Integer.parseInt(teamTwoScore);

        // Gatekeeper check
        if (!teamName.equals(teamOne) && !teamName.equals(teamTwo)) {
            return 2;
        }

        if (teamOne.equals(teamName) && teamOneScoreInt > teamTwoScoreInt) {
            return 1;
        } else if (teamTwo.equals(teamName) && teamOneScoreInt < teamTwoScoreInt) {
            return 1;
        }

        return 0;
    }
}

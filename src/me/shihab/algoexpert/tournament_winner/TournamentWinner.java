package me.shihab.algoexpert.tournament_winner;

import java.util.*;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String, Integer> pointTable = new HashMap<>();
        String currentWinner = competitions.get(0).get(0);

        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);

            if (!pointTable.containsKey(homeTeam)) {
                pointTable.put(homeTeam, 0);
            }

            if (!pointTable.containsKey(awayTeam)) {
                pointTable.put(awayTeam, 0);
            }

            if (results.get(i) == 1) {
                pointTable.put(homeTeam, pointTable.get(homeTeam) + 3);
            } else {
                pointTable.put(awayTeam, pointTable.get(awayTeam) + 3);
            }

            if(pointTable.get(homeTeam) > pointTable.get(currentWinner)) {
                currentWinner = homeTeam;
            } else if(pointTable.get(awayTeam) > pointTable.get(currentWinner)) {
                currentWinner = awayTeam;
            }

        }
        // Write your code here.
        return currentWinner;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("Bulls", "Eagles"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("Bulls", "Bears"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Bears", "Eagles"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);

        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 0));

        System.out.println(tournamentWinner(competitions, results));
    }

}

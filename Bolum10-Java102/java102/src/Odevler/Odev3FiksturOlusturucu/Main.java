package Odevler.Odev3FiksturOlusturucu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FixtureGenerator generator = new FixtureGenerator();
        ArrayList<String> teams = new ArrayList<>();

        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Boluspor");

        if (teams.size() % 2 != 0) {
            teams.add("BAY");
        }

        System.out.println();

        ArrayList<ArrayList<Game>> rounds = new ArrayList<>(generator.generateFixture(teams));
        int counter = 1;

        for (ArrayList<Game> round : rounds) {
            System.out.println();
            System.out.println("Round " + counter);
            for (Game game : round) {
                System.out.println(game.getHomeTeam() + " vs " + game.getAwayTeam());
            }
            counter++;
        }

        for (ArrayList<Game> round : rounds) {
            System.out.println();
            System.out.println("Round " + counter);
            for (Game game : round) {
                System.out.println(game.getAwayTeam() + " vs " + game.getHomeTeam());

            }
            counter++;
        }
    }
}
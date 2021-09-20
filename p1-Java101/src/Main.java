
import Konular.OOP.BoksOyunu.Fighter;
import Konular.OOP.BoksOyunu.Match;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 20, 130, 90, 50);
        Fighter f2 = new Fighter("Henry", 35, 90, 120, 20);

        Match match = new Match(f1, f2, 90, 130);
        match.run();

    }
}

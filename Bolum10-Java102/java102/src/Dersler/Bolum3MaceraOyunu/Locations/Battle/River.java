package Dersler.Bolum3MaceraOyunu.Locations.Battle;

import Dersler.Bolum3MaceraOyunu.Obstacles.Bear;
import Dersler.Bolum3MaceraOyunu.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "Nehir", new Bear(), "water", 2);
    }
}

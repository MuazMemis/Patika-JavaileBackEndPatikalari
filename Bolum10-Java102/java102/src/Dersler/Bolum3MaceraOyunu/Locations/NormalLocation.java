package Dersler.Bolum3MaceraOyunu.Locations;

import Dersler.Bolum3MaceraOyunu.Player;

public class NormalLocation extends Location {

    public NormalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}

package Dersler.Bolum03MaceraOyunu.Locations.Normal;

import Dersler.Bolum03MaceraOyunu.Locations.Location;
import Dersler.Bolum03MaceraOyunu.Player;

public abstract class NormalLocation extends Location {

    public NormalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}

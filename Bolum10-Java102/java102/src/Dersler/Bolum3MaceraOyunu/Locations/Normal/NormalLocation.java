package Dersler.Bolum3MaceraOyunu.Locations.Normal;

import Dersler.Bolum3MaceraOyunu.Locations.Location;
import Dersler.Bolum3MaceraOyunu.Player;

public abstract class NormalLocation extends Location {

    public NormalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}

package bateau;

import coordonnees.Coordonnees;
import coordonnees.Direction;

import java.util.ArrayList;
import java.util.List;

public class Bateau {
    private List<Coordonnees> coordonnees = new ArrayList<>();
    private  int size;

    public Bateau ( Coordonnees Position, int size, Direction direction ) {
        this.size = size;
    }
}

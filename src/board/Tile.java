package board;

import unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class    Tile {

    private List<Unit> units;

    public Tile() {
        units = new ArrayList<>();
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public List<Unit> getUnit(int x, int y) {
        return this.units;
    }

    public List<Unit> getUnits() {
        return units;
    }
}

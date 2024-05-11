package board;

import unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int width, height;
    private List<ArrayList<Tile>> board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();

    }

    private void initialize() {
        this.board = new ArrayList<>(this.width);
        for (int i = 0; i < this.width; i++) {
            board.add(i, new ArrayList<>(this.height));
            for (int j = 0; j < this.height; j++) {
                board.get(i).add(j, new Tile());
            }
        }
    }

    public Tile getTile(int x, int y) {
        return this.board.get(x - 1).get(y - 1);
    }

    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }

    public List<Unit> getUnits(int x, int y) {
        return getTile(x, y).getUnits();
    }
}

package parking.space;

import parking.parker.Parker;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class Level {
    private int rows;
    private int cols;
    private Parker parker;
    private int levelIndex;
    private Spot[][] spotGrid;

    public Level(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        spotGrid = new Spot[this.rows][this.rows];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Parker getParker() {
        return parker;
    }

    public void setParker(Parker parker) {
        this.parker = parker;
    }

    public int getLevelIndex() {
        return levelIndex;
    }

    public void setLevelIndex(int levelIndex) {
        this.levelIndex = levelIndex;
    }

    public Spot[][] getSpotGrid() {
        return spotGrid;
    }

    public void setSpotGrid(Spot[][] spotGrid) {
        this.spotGrid = spotGrid;
    }
}

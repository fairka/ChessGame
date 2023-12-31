package com.chess.engine.board;

public class BoardUtils {

    public static final boolean[] FIRST_COLUMN = initCol(0);
    public static final boolean[] SECOND_COLUMN = initCol(1);
    public static final boolean[] SEVENTH_COLUMN = initCol(6);
    public static final boolean[] EIGHTH_COLUMN = initCol(7);
    public static final boolean[] SECOND_ROW = initRow(8);
    public static final boolean[] SEVENTH_ROW = initRow(48);

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    private BoardUtils() {
     throw new RuntimeException("You cannot instantiate me!");
    }

    private static boolean[] initCol(int colNum) {

        final boolean[] col = new boolean[NUM_TILES];
        do{
            col[colNum] = true;
            colNum += NUM_TILES_PER_ROW;
        }while(colNum < NUM_TILES);
        return col;
    }

    private static boolean[] initRow(int rowNum){
        final boolean[] row = new boolean[NUM_TILES];
        do{
            row[rowNum] = true;
            rowNum++;
        } while(rowNum % NUM_TILES_PER_ROW != 0);
        return row;
    }


    public static boolean isValidTileCoordinate(final int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }
}

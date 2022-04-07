package com.chess.engine.board;

import com.chess.engine.Board;

public class BoardUtils {

    public static final boolean[] FIRST_COLUMN = intColumn(0);
    public static final boolean[] SECOND_COLUMN = intColumn(1);
    public static final boolean[] SEVENTH_COLUMN = intColumn(6);
    public static final boolean[] EIGHTH_COLUMN = intColumn(7);

    public static final boolean[]  SECOND_ROW =null;
    public static final boolean[]  SEVENTH_ROW =null;


    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    private static boolean[] intColumn(int columnNumber) {
        final boolean[] column = new boolean[NUM_TILES];
        do {
            column[columnNumber] = true;
            columnNumber += NUM_TILES_PER_ROW;
        }while (columnNumber < NUM_TILES);
        return column;
    }
    private BoardUtils(){
        throw new RuntimeException("you cannot instantiate me!!");
    }

    public static boolean isValidTileCoordinate(final int coordinate) {
      return   coordinate >=0 && coordinate < NUM_TILES;
    }
}

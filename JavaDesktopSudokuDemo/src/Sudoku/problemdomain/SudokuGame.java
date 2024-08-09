package Sudoku.problemdomain;

import Sudoku.computationlogic.SudokuUtilities;
import Sudoku.constants.GameState;

import java.io.Serializable;

/*Serializable is used to read and write the game data file to the operating system */
public class SudokuGame implements Serializable {
    private final GameState gameState; /* 'GameState' is an enum */
    private final int[][] gridState; /* The grid of the sudoku as a two-dimensional array */

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState); /* We will build a called 'SudokuUtilities' which will have a static method to create a copy of a given array */
    }

}

package Sudoku;

import Sudoku.buildlogic.SudokuBuildLogic;
import Sudoku.userinterface.IUserInterfaceContract;
import Sudoku.userinterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class SudokuApplication extends Application{
    private IUserInterfaceContract.View uiImpl; /* Reference to the user interface */


    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl); /* Class having the build logic */
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch (args);
    }
}
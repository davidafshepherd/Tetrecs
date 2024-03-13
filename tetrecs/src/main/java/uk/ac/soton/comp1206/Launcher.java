package uk.ac.soton.comp1206;

/**
 * This Launcher class is used to allow the game to be built into a shaded jar file which then loads JavaFX.
 * This Launcher class is used when running as a shaded jar file.
 */
public class Launcher {

    /**
     * Launches the JavaFX Application, passing through the commandline arguments
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        App.main(args);
    }

}

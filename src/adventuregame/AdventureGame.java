package adventuregame;

import adventuregame.configuration.ConfigFileHandler;
import java.awt.BorderLayout;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel
 * @version 0.1
 * @since 13.10.2016
 */
public class AdventureGame {

    /**
     * The game loop
     */
    private GameLoop loop;

    /**
     * Thread pool excetutor. Used for its ability to restart the loop if
     * necessary
     */
    private ScheduledThreadPoolExecutor executor;

    /**
     * The Main Game Window
     */
    private JFrame window;

    /**
     * JPanle where the painting is done on
     */
    private GameSurface canvas;

    /**
     * Default constructor. Initializes the game loop and other objects
     */
    public AdventureGame() {

        this.loop = new GameLoop();
        this.executor = new ScheduledThreadPoolExecutor(3);
        this.executor.scheduleAtFixedRate(this.loop, 0L, 100L, TimeUnit.MILLISECONDS);
        this.window = new JFrame();
        this.canvas = new GameSurface();

    }

    /**
     * Initializes and displays the GUI
     */
    public void initAndShowGui() {

        this.window.add(this.canvas, BorderLayout.CENTER);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(500, 500);
        this.window.setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AdventureGame game = new AdventureGame();

        SwingUtilities.invokeLater(() -> {
            game.initAndShowGui();
        });
    }

}

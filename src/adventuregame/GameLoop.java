package adventuregame;

/**
 * Game loop.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class GameLoop implements Runnable {

  /**
   * Flag for checking running game.
   */
  private boolean running;

  /**
   * Default constructor. Starts the loop.
   */
  public GameLoop() {
    this.running = true;
  }

  /**
   * The main game loop which executes the tasks.
   */
  @Override
  public void run() {
    while (this.running) {

    }
  }
}

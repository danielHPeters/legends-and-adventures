package ch.peters.daniel.adventuregame;

/**
 * Main Game loop.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class GameLoop implements Runnable {
  private boolean running;

  public GameLoop() {
    running = true;
  }

  /**
   * The main game loop which executes the tasks.
   */
  @Override
  public void run() {
    while (running) {

    }
  }
}

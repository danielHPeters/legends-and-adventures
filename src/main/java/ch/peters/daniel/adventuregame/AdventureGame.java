package ch.peters.daniel.adventuregame;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Game application class.
 *
 * @author Daniel Peters
 * @version 0.1
 * @since 13.10.2016
 */
public class AdventureGame {
  private GameLoop loop;
  private ScheduledThreadPoolExecutor threadPoolExecutor;

  /**
   * Default constructor. Initializes the game loop and other objects
   */
  public AdventureGame() {
    loop = new GameLoop();
    threadPoolExecutor = new ScheduledThreadPoolExecutor(3);
    threadPoolExecutor.scheduleAtFixedRate(loop, 0L, 100L, TimeUnit.MILLISECONDS);
  }

  public GameLoop getLoop() {
    return loop;
  }

  public ScheduledThreadPoolExecutor getThreadPoolExecutor() {
    return threadPoolExecutor;
  }
}

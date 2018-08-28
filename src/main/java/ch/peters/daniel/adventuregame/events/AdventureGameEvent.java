package ch.peters.daniel.adventuregame.events;

import ch.peters.daniel.adventuregame.actions.GameAction;

/**
 * Game event.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class AdventureGameEvent {
  private String id;
  private String message;
  private GameAction action;

  public AdventureGameEvent(String id, String message, GameAction action) {
    this.id = id;
    this.message = message;
    this.action = action;
  }

  public String getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public GameAction getAction() {
    return action;
  }
}

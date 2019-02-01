package ch.peters.daniel.adventuregame.rooms.chests;

import ch.peters.daniel.adventuregame.items.Item;
import ch.peters.daniel.adventuregame.rooms.DoorState;
import ch.peters.daniel.adventuregame.rooms.Lock;
import ch.peters.daniel.adventuregame.rooms.Lockable;

/**
 * Chest implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Chest {
  private Lockable lock;
  private DoorState state;

  public Chest() {
    this.state = DoorState.CLOSED;
  }

  public Chest(String keyId) {
    lock = new Lock(keyId);
    state = DoorState.LOCKED;
  }

  /**
   * Open chest. Checks if it is locked.
   *
   * @return message
   */
  public String open() {
    String msg = "";

    switch (state) {
      case OPEN:
        msg = "The chest is already open.";
        break;
      case LOCKED:
        msg = "The chest is locked.";
        break;
      case CLOSED:
        msg = "Chest opened.";
        state = DoorState.OPEN;
        break;
      default:
        break;
    }
    return msg;
  }

  /**
   * Unlock the chest.
   *
   * @param key key item
   * @return message
   */
  public String unlock(Item key) {
    String msg;

    if (state.equals(DoorState.LOCKED) && lock.isLocked()) {
      lock.unlock(key);

      if (lock.isLocked()) {
        msg = "Failed to unlock chest.";
      } else {
        msg = "You successfully unlocked this chest.";
        state = DoorState.CLOSED;
      }
    } else {
      msg = "The chest has already been unlocked";
    }
    return msg;
  }
}

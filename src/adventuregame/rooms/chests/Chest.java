package adventuregame.rooms.chests;

import adventuregame.items.Item;
import adventuregame.rooms.EDoorState;
import adventuregame.rooms.ILockable;
import adventuregame.rooms.Lock;

/**
 * Chest implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Chest {
  private ILockable lock;
  private EDoorState state;

  public Chest() {
    this.state = EDoorState.CLOSED;
  }

  public Chest(String keyId) {
    this.lock = new Lock(keyId);
    this.state = EDoorState.LOCKED;
  }

  /**
   * Open chest. Checks if it is locked.
   *
   * @return message
   */
  public String open() {
    String msg = "";

    switch (this.state) {
      case OPEN:
        msg = "The chest is already open.";
        break;
      case LOCKED:
        msg = "The chest is locked.";
        break;
      case CLOSED:
        msg = "Chest opened.";
        this.state = EDoorState.OPEN;
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

    if (this.state.equals(EDoorState.LOCKED) && this.lock.isLocked()) {
      this.lock.unlock(key);

      if (this.lock.isLocked()) {
        msg = "Failed to unlock chest.";
      } else {
        msg = "You successfully unlocked this chest.";
        this.state = EDoorState.CLOSED;
      }
    } else {
      msg = "The chest has already been unlocked";
    }
    return msg;
  }
}

package ch.peters.daniel.adventuregame.rooms;

import ch.peters.daniel.adventuregame.items.Item;
import ch.peters.daniel.adventuregame.items.Key;

/**
 * Lock.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Lock implements Lockable {
  private boolean locked;
  private String keyId;

  public Lock(String keyId) {
    this.keyId = keyId;
  }

  @Override
  public boolean isLocked() {
    return this.locked;
  }

  @Override
  public void lock(Item key) {
    if (key instanceof Key) {
      this.locked = true;
    }
  }

  @Override
  public void unlock(Item key) {
    if (key instanceof Key) {
      this.locked = false;
    }
  }
}

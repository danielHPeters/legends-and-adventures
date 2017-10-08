package adventuregame.rooms;

import adventuregame.items.GameKey;
import adventuregame.items.Item;

/**
 * Lock.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Lock implements ILockable {
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
    if (key instanceof GameKey) {
      this.locked = true;
    }
  }

  @Override
  public void unlock(Item key) {
    if (key instanceof GameKey) {
      this.locked = false;
    }
  }
}

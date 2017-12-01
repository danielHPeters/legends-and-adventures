package adventuregame.rooms;

import adventuregame.items.Item;

/**
 * Interface for lockable objects.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public interface ILockable {
  boolean isLocked();

  void lock(Item key);

  void unlock(Item key);
}

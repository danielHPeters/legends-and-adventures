package ch.peters.daniel.adventuregame.rooms;

import ch.peters.daniel.adventuregame.items.Item;

/**
 * Interface for lockable objects.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public interface Lockable {
  boolean isLocked();

  void lock(Item key);

  void unlock(Item key);
}

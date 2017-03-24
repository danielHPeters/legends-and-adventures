package adventuregame.rooms;

import adventuregame.items.Item;

/**
 *
 * @author d.peters
 */
public interface ILockable {

    public boolean isLocked();

    public void lock(Item key);
    
    public void unlock(Item key);
}

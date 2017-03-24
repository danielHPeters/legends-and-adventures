package adventuregame.rooms;

import adventuregame.items.GameKey;
import adventuregame.items.Item;

/**
 *
 * @author Daniel
 */
public class Lock implements ILockable {

    /**
     *
     */
    private boolean locked;

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

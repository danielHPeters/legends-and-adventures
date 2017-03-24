package adventuregame.rooms.chests;

import adventuregame.items.Item;
import adventuregame.rooms.EDoorState;
import adventuregame.rooms.ILockable;
import adventuregame.rooms.Lock;

/**
 *
 * @author Daniel
 */
public class Chest {

    /**
     * 
     */
    private ILockable lock;

    /**
     * 
     */
    private EDoorState state;

    /**
     * 
     */
    public Chest() {
        this.state = EDoorState.CLOSED;
    }

    /**
     * 
     * @param keyId 
     */
    public Chest(String keyId) {
        this.lock = new Lock(keyId);
        this.state = EDoorState.LOCKED;
    }

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
        }

        return msg;
    }
    
    public String unlock(Item key){
        String msg = "";

        if (this.state.equals(EDoorState.LOCKED) && this.lock.isLocked()){

            this.lock.unlock(key);
            
            if (this.lock.isLocked()){
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

package adventuregame.events;

import adventuregame.actions.IGameAction;

/**
 *
 * @author daniel
 */
public class AdventureGameEvent {
    
    private String id;
    
    private String message;
    
    private IGameAction action;

    public AdventureGameEvent(String id, String message, IGameAction action) {
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

    public IGameAction getAction() {
        return action;
    }
    
}

package adventuregame.items;

import java.util.List;

/**
 *
 * @author daniel.peters
 */
public class Item {

	/**
	 * Name of the item
	 */
	private String name;
	
    /**
     * Description text of the item
     */
    private String description;

    /**
     * Item Properties
     */
    private List<String> properties;

    /**
     * Default constructor. Requires item name and description
     * @param name name of the item
     * @param description details of item
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Getter for item name
     * @return item name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for item description
     * @return the description
     */
	public String getDescription() {
		return description;
	}
	
}

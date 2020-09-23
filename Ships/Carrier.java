package Ships;

import Game.*;

/**
 * This class is a child class of Ship.
 */
public class Carrier extends Ship {
	private final String SHIP_NAME = "Carrier";
	private final int SHIP_SIZE = 5;

	/**
	 * Constructor with no parameter.
	 * Default constructor
	 * @Constructor
	 */
	public Carrier() {
		super();
		shipName = SHIP_NAME;
		shipSize = SHIP_SIZE;
	}

	/**
	 * Constructor with 3 parameters: start and end Tiles and player.
	 * 
	 * @Constructor
	 */
	public Carrier(Tile a, Tile b, String player) {
		super(a, b, player);
		shipName = SHIP_NAME;
		this.shipSize = SHIP_SIZE;
	}
}


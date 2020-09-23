package Ships;

import Game.*;

/**
 * This class is a child class of Ship.
 */
public class PatrolBoat extends Ship {
	private final String SHIP_NAME = "PatrolBoat";
	private final int SHIP_SIZE = 2;

	/**
	 * Constructor with no parameter.
	 * 
	 * @Constructor
	 */
	public PatrolBoat() {
		super();
		shipName = SHIP_NAME;
		shipSize = SHIP_SIZE;
	}

	/**
	 * Constructor with 3 parameters: start and end Tiles and player.
	 * 
	 * @Constructor
	 */
	public PatrolBoat(Tile a, Tile b, String player) {
		super(a, b, player);
		shipName = SHIP_NAME;
		this.shipSize = SHIP_SIZE;
	}
}

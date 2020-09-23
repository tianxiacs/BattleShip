package Ships;

import Game.Tile;

/**
 * This class is a child class of Ship.
 */
public class Destroyer extends Ship {
	private final String SHIP_NAME = "Destroyer";
	private final int SHIP_SIZE = 3;

	/**
	 * Constructor with no parameter.
	 * 
	 * @Constructor
	 */
	public Destroyer() {
		super();
		shipName = SHIP_NAME;
		shipSize = SHIP_SIZE;
	}

	/**
	 * Constructor with 3 parameters: start and end Tiles and player.
	 * 
	 * @Constructor
	 */
	public Destroyer(Tile a, Tile b, String player) {
		super(a, b, player);
		shipName = SHIP_NAME;
		this.shipSize = SHIP_SIZE;
	}
}

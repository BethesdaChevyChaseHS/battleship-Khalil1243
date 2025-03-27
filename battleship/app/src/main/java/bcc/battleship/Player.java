package bcc.battleship;
import bcc.battleship.Constants;


public class Player {
private Ship[] ships;
private Grid myGrid;
private Grid opponentGrid;

public Player() {
ships = new Ship[Constants.SHIP_LENGTHS.length];
for (int i = 0; i < Constants.SHIP_LENGTHS.length; i++) {
ships[i] = new Ship(Constants.SHIP_LENGTHS[i]);
}
myGrid = new Grid();
opponentGrid = new Grid();
}

public boolean chooseShipLocation(int index, Location location, int direction) {
ships[index].setLocation(location);
ships[index].setDirection(direction);
return myGrid.addShip(ships[index]);
}

public void recordOpponentGuess(Location location) {
if (myGrid.hasShip(location)) {
myGrid.markHit(location);
} else {
myGrid.markMiss(location);
}
}

public Ship[] getShips() {
return ships;
}

public Grid getMyGrid() {
return myGrid;
}

public Grid getOpponentGrid() {
return opponentGrid;
}

@Override
public String toString() {
return "Player{" +
"ships=" + Arrays.toString(ships) +
", myGrid=" + myGrid +
", opponentGrid=" + opponentGrid +
'}';
}
}

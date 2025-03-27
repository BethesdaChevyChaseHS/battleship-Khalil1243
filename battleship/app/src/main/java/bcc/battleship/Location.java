package bcc.battleship;

public class Location 
{

    // possible stata
    public static final int UNGUESSED = 0;
    public static final int HIT= 1;
    public static final int MISSED = 2;

    //Implement the Location class here
    private boolean shipHere = false;
    private int status = UNGUESSED;

    // Constructor. Initializes with no ship and status UNGUESSED.
    public Location() 
    {

    }

    // Was this Location a hit?
    public boolean checkHit() 
    {
        if(status == HIT)
        {
            return true;
        }
        return false;
    }

    // Was this location a miss?
    public boolean checkMiss() 
    {
        if(status == MISSED)
        {
            return true;
        }
        return false;
    }

    // Was this location unguessed?
    public boolean isUnguessed() 
    {
        if(status == UNGUESSED)
        {
            return true;
        }
        return false;
    }

    // Mark this location as a hit.
    public void markHit() 
    {
        status = HIT;

    }

    // Mark this location as a miss.
    public void markMiss() 
    {
        status = MISSED;

    }

    // Return whether or not this location has a ship.
    public boolean hasShip() 
    {
        return shipHere;
    }

    // Set whether this location has a ship.
    public void setShip(boolean val) 
    {
        shipHere = val;

    }

    // Set the status of this Location.
    public void setStatus(int theStatus) 
    {
        status = theStatus;

    }

    // Get the status of this Location.
    public int getStatus() 
    {
        return status;
    }
}


package bcc.battleship;

public class Grid 
{
    // Constants for number of row and columns.
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    public static final String ROW_NAMES = {"A","B","C","D","E","F","G","H","I","J"};

    // Write your Grid class here
    private Location [][] grid = new location[NUM_ROWS][NUM_COLS];

    // Create a new Grid and initialize each Location.
    public Grid() 
    {
        for(int i = 0; i < NUM_ROWS; i++)
        {
            for(int j = 0; j < NUMS_COLS; j++)
            {
                grid[i][j] = new location();
            }
        }
    }
    
    // Mark a hit in the specified location.
    public void markHit(int row, int col) 
    {
        grid[row][col].markHit();
    }
    
    // Mark a miss in the specified location.
    public void markMiss(int row, int col) 
    {
        grid[row][col].markMiss();
    }
    
    // Set the status of the Location at (row, col).
    public void setStatus(int row, int col, int status) 
    {
        grid[row][col].setStatus(status);
    }
    
    // Get the status of the Location at (row, col).
    public int getStatus(int row, int col)
    {
        return grid[row][col].getStatus();
    }
    
    // Return whether this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col)
    {
        return !grid[row][col].isUnguessed();
    }
    
    // Set whether there is a ship at this location.
    public void setShip(int row, int col, boolean val) 
    {
        grid[row][col].setShip(val);
    }
    
    // Return whether there is a ship at this location.
    public boolean hasShip(int row, int col) 
    {
        return grid[row][col].hasShip();
    }
    
    // Get the Location object at this row and column.
    public Location get(int row, int col)
    {
        return grid[row][col];
    }
    
    // Return the number of rows.
    public int numRows() 
    {
        return NUM_ROWS;
    }
    
    // Return the number of columns.
    public int numCols() 
    {
        return NUM_COLS;
    }
    
    public void printStatus()
    {
        System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
        for(int i = 0; i < NUM_ROWS; i++)
        {
            System.out.print(ROW_NAMES[i] + " ");
            for(int j = 0; j < NUM_COLS; j++)
            {
                if(!alreadyGuessed(i,j))
                {
                    System.out.print("- ");
                }
                if(getStatus(i,j) == HIT)
                {
                    System.out.print("X ");
                }
                if(getStatus(i,j) == MISSED)
                {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        
    }

    public void printShips()
    {
        System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
        for(int i = 0; i < NUM_ROWS; i++)
        {
            System.out.print(ROW_NAMES[i] + " ");
            for(int j = 0; j < NUM_COLS; j++)
            {
                if(hasSHip(i,j))
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }


}

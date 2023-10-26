package fr.pantheonsorbonne.cri;

public abstract class GameAbstract {
	Player player1;
	Player player2;
	int gridSize;
	int[][] grid;
	int[] availableNumbers;
	public GameAbstract(Player player1, Player player2,int gridSize,int[] availableNumbers) {
        this.player1 = player1;
		this.player2 = player2;
        this.gridSize=gridSize;
        this.availableNumbers=availableNumbers;
    }
	  public void printGrid() {
	        for (int i = 0; i < this.gridSize; i++) {
	            for (int j = 0; j < this.gridSize; j++) {
	                System.out.print(grid[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	public void placeNumber(int x, int y, int number) {
		this.grid[x][y]=number;
	}
	
	
}

import javax.swing.JOptionPane;

public class TicTacToe1 {
	
	public static char [][] board = new char[3][3];
	public static char turn = 'X';
	public static int row;
	public static int col;
	public static int inputInt;
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]= '_';
			}	
		}	
		printBoard();  //empty board 
		play();
	}	
					
	public static void play() {
		boolean playing= true;
		int count=0;
		while(playing) {
			inputInt=Integer.parseInt(JOptionPane.showInputDialog(null,"Player's Input: "));
			row=(inputInt-1)/3; 
			col=(inputInt-1)%3;
			if (isValid(row, col)){
				board[row][col]=turn;
				switchMarkers();
				count++;
			}
			printBoard();  //print board after every move
			System.out.println();
			if (count >= 9) {
				playing = false;
			}				
		}
	}
					
	public static void switchMarkers() {
		if(turn=='X'){
			turn='O';
		}
		else{
			turn='X';
		}
	}
	
	public static boolean isValid(int row, int col){
		boolean valid=true;
		if(board[row][col]!= '_'){
			valid= false;	
			if(turn=='X'){
			JOptionPane.showMessageDialog(null,"You Entered a position already occupied");
			}
		}
		return valid;
	}
	
	public static void printBoard() {
		System.out.println("Game Board: ");
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				if(j==0) 
				System.out.print( "| ");
				System.out.print( board[i][j] + " | ");
			}
		}
		System.out.println();
	}
	
}	//TicTacToe1 Ends 

		
	
		

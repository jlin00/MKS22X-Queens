public class QueenBoard{
  //instance variables
  private int[][] board;

  //constructor
  public QueenBoard(int size){
    board = new int[size][size]; //initializes square array
  }

  //private methods
  private boolean addQueen(int r, int c){
    if (board[r][c] != 0) return false; //if there is already a queen or position is threatened
    else board[r][c] = -1; //adds queen otherwise
    for (int x = 1; x < board.length - c; x++){ //x signifies the increment/decrement to row/column numbers
      board[r][c+x]++; //all positions in the same row as the queen are threatened
      if (r - x >= 0) board[r-x][c+x]++; //upwards diagonal are threatened
      if (r + x < board.length) board[r+x][c+x]++; //downwards diagonal are threatened
    }
    return true; //successfully placed down queen and added threatening positions
  }

  private boolean removeQueen(int r, int c){
    if (board[r][c] != -1) return false; //if there is no queen here
    else board[r][c] = 0; //removes queen otherwise
    for (int x = 1; x < board.length - c; x++){ //x signifies the increment/decrement to row/column numbers
      board[r][c+x]--; //all positions in the same row as the queen are no longer threatened
      if (r - x >= 0) board[r-x][c+x]--; //upwards diagonal are no longer threatened
      if (r + x < board.length) board[r+x][c+x]--; //downwards diagonal are no longer threatened
    }
    return true; //successfully removed queen and removed threatening positions
  }

  //public methods

  public boolean isEmpty(){
    for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[r].length; c++){
        if (board[r][c] != 0) return false;
      }
    }
    return true;
  }

  public void clearBoard(){
    for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[r].length; c++){
        board[r][c] = 0;
      }
    }
  }

  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _
  *_ _ _ Q
  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String output = "";
    for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[r].length; c++){
        if (board[r][c] == -1) output += "Q ";
        else output += "_ ";
        //else output += board[r][c]+ " "; //testing for threatened positions
        if (c == board[r].length - 1) output += "\n";
      }
    }
    return output;
  }


  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        true when the board is solveable, and leaves the board in a solved state
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public boolean solve(){
    if (!isEmpty()) throw new IllegalStateException(); //exception
    return solveHelper(0); //runs recursive function
  }

  public boolean solveHelper(int c){
    if (c >= board.length) return true; //if all the columns are filled in, board is solved
    for (int r = 0; r < board.length; r++){
      if (addQueen(r,c)){ //if queen can be added
        if (solveHelper(c+1)) return true; //try adding to next column
        removeQueen(r,c); //if cannot add to next columns, remove queen
      }
      if (c == 0 && r >= board.length / 2 + board.length % 2) return false; //if exhausted half of options from first column
    }
    return false; //if none of the rows work, board is unsolveable
  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){
    if (!isEmpty()) throw new IllegalStateException(); //exception
    int count = countHelper(0); //runs recursive function but does not return it
    clearBoard(); //leaves board filled with 0's after
    return count;
  }

  public int countHelper(int c){ //like solveHelper, but modified to return number of solutions
    if (c >= board.length) return 1; //if filled in, counts as one solution
    int count = 0; //counter
    for (int r = 0; r < board.length; r++){
      if (addQueen(r,c)){ //if queen is successfully placed
        count += countHelper(c+1); //recursive call to return either 0 or 1
        removeQueen(r,c); //removes queen after recursive call
      }
    }
    return count; //after every position has been tried
  }

}

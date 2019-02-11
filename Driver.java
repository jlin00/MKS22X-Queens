public class Driver{
  public static void main(String[] args) {
    QueenBoard x1 = new QueenBoard(1);
    QueenBoard x2 = new QueenBoard(2);
    QueenBoard x3 = new QueenBoard(3);
    QueenBoard x4 = new QueenBoard(4);
    QueenBoard x5 = new QueenBoard(5);
    QueenBoard x6 = new QueenBoard(6);
    QueenBoard x7 = new QueenBoard(7);
    QueenBoard x8 = new QueenBoard(8);
    QueenBoard x9 = new QueenBoard(9);
    QueenBoard x10 = new QueenBoard(10);
    QueenBoard x11 = new QueenBoard(11);

    //change addQueen to public to test
    /*
    System.out.println(x8.addQueen(3,2)); //true
    System.out.println(x8.addQueen(3,2)); //false
    System.out.println(x8.addQueen(3,4)); //false
    System.out.println(x8.addQueen(0,0)); //true
    System.out.println(x8);
    */

    //change removeQueen to public to test
    /*
    System.out.println(x8.removeQueen(3,2)); //true
    System.out.println(x8);
    System.out.println(x8.removeQueen(2,2)); //false
    System.out.println(x8.removeQueen(0,0)); //true
    System.out.println(x8.removeQueen(1,2)); //false
    System.out.println(x8);
    */

    //testing out solve
    System.out.println(x1.solve()); //true
    System.out.println(x1);
    System.out.println(x2.solve()); //false
    System.out.println(x2);
    System.out.println(x3.solve()); //false
    System.out.println(x3);
    System.out.println(x4.solve()); //true
    System.out.println(x4);
    System.out.println(x5.solve()); //true
    System.out.println(x5);
    System.out.println(x6.solve()); //true
    System.out.println(x6);
    System.out.println(x7.solve()); //true
    System.out.println(x7);
    System.out.println(x8.solve()); //true
    System.out.println(x8);
    System.out.println(x9.solve()); //true
    System.out.println(x9);
    System.out.println(x10.solve()); //true
    System.out.println(x10);
    System.out.println(x11.solve()); //true
    System.out.println(x11);

    //testing out count
    try {
      System.out.println(x1.countSolutions());
    }
    catch (IllegalStateException e){
      System.out.println("Board is not empty!");
    }

    x1.clearBoard();
    x2.clearBoard();
    x3.clearBoard();
    x4.clearBoard();
    x5.clearBoard();
    x6.clearBoard();
    x7.clearBoard();
    x8.clearBoard();
    x9.clearBoard();
    x10.clearBoard();
    x11.clearBoard();

    System.out.println(x1.countSolutions()); //1 unique, 1 total
    System.out.println(x2.countSolutions()); //0 unique, 0 total
    System.out.println(x3.countSolutions()); //0 unique, 0 total
    System.out.println(x4.countSolutions()); //1 unique, 2 total
    System.out.println(x5.countSolutions()); //2 unique, 10 total
    System.out.println(x6.countSolutions()); //1 unique, 4 total
    System.out.println(x7.countSolutions()); //6 unique, 40 total
    System.out.println(x8.countSolutions()); //12 unique, 92 total
    System.out.println(x9.countSolutions()); //46 unique, 352 total
    System.out.println(x10.countSolutions()); //92 unique, 724 total
    System.out.println(x11.countSolutions()); //341 unique, 2680 total

    QueenBoard x14 = new QueenBoard(14);
    System.out.println(x14.solve());
    System.out.println(x14);
    x14.clearBoard();
    System.out.println(x14.countSolutions());


  }
}

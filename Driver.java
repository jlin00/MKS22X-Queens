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


  }
}

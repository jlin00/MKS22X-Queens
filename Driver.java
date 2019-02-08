public class Driver{
  public static void main(String[] args) {
    QueenBoard x = new QueenBoard(5);

    System.out.println(x); //tests toString() method

    //change addQueen to public to test
    /*
    System.out.println(x.addQueen(3,2)); //true
    System.out.println(x.addQueen(3,2)); //false
    System.out.println(x.addQueen(3,4)); //false
    System.out.println(x.addQueen(0,0)); //true
    System.out.println(x);
    */

    //change removeQueen to public to test
    /*
    System.out.println(x.removeQueen(3,2)); //true
    System.out.println(x);
    System.out.println(x.removeQueen(2,2)); //false
    System.out.println(x.removeQueen(0,0)); //true
    System.out.println(x.removeQueen(1,2)); //false
    System.out.println(x);
    */

  }
}

public class Driver {
  public static void main (String [] args) {
    int [][] A = new int [][] {
      new int[] {1,1,1},
      new int[] {2,2,2},
      new int[] {3,3,3},
      new int[] {4,4,4},
    };
    System.out.println(ArrayMethods.rowSum(A, 2));
    System.out.println(ArrayMethods.rowSum(A, -1));
    System.out.println(ArrayMethods.rowSum(A, 5));
  }
}

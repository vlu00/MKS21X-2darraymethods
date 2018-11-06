import java.util.Arrays;
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
    System.out.println(ArrayMethods.rowSum(A, 4));

    int [][] B = new int [][] {
      new int[] {1,2,3,4},
      new int[] {1,2},
      new int[] {1,2,3},
      new int[] {1,2,3,4},
    };
    System.out.println(ArrayMethods.columnSum(B, -1));
    System.out.println(ArrayMethods.columnSum(B, 4));
    System.out.println(ArrayMethods.columnSum(B, 3));
    System.out.println(ArrayMethods.columnSum(B, 2));
    System.out.println(ArrayMethods.columnSum(B, 1));

    int [][] C = new int [][] {
      new int[] {1,2,3,4},
      new int[] {2,2,2},
      new int[] {3,4},
      new int[] {7},
    };
    System.out.println(Arrays.toString(ArrayMethods.allRowSums(A)));
    System.out.println(Arrays.toString(ArrayMethods.allRowSums(B)));
    System.out.println(Arrays.toString(ArrayMethods.allRowSums(C)));
    System.out.println(Arrays.toString(ArrayMethods.allColSums(A)));
    System.out.println(Arrays.toString(ArrayMethods.allColSums(B)));
    System.out.println(Arrays.toString(ArrayMethods.allColSums(C)));

  }
}

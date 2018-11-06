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
    System.out.println();

    int [][] D = new int [][] {
      new int[] {1,2,3,4},
      new int[] {5,5},
      new int[] {3,3,3,1},
      new int[] {4,4,0,2},
    };
    int [][] E = new int [][] {
      new int[] {1,3,4,9},
      new int[] {2,3},
      new int[] {3,3,6,1},
      new int[] {4,1,0,},
    };
    System.out.println(ArrayMethods.isRowMagic(A));
    System.out.println(ArrayMethods.isRowMagic(B));
    System.out.println(ArrayMethods.isRowMagic(C));
    System.out.println(ArrayMethods.isRowMagic(D));

    System.out.println();

    System.out.println(ArrayMethods.isColumnMagic(A));
    System.out.println(ArrayMethods.isColumnMagic(B));
    System.out.println(ArrayMethods.isColumnMagic(C));
    System.out.println(ArrayMethods.isColumnMagic(D));
    System.out.println(ArrayMethods.isColumnMagic(E));

  }
}

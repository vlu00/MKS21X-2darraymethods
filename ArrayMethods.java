public class ArrayMethods {
  public static int rowSum (int [][] ary, int x) {
    int sum = 0;
    if (x > ary.length -1 || x < 0) {
      return sum;
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum = sum + ary[x][i];
    }
    return sum;
  }

  public static int Great(int[][] ary) {
    int greatest = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > greatest) {
        greatest = ary[i].length;
      }
    }
    return greatest;
  }

  public static int columnSum(int [][] ary, int x) {
    if (x > Great(ary) || x < 0) {
      return 0;
    }
    else {
      int sum = 0;
      for (int i = 0; i < ary.length; i++) {
        if (ary[i].length > x) {
          sum = sum + ary[i][x];
        }
      }
      return sum;
    }
  }

  public static int[] allRowSums(int[][] ary){
    int [] sums = new int [ary.length];
    for (int i = 0; i < ary.length; i++) {
      sums[i] = rowSum(ary, i);
    }
    return sums;
  }

  public static int[] allColSums(int[][] ary){
    int x = Great(ary);
    int [] sums = new int [x];
    for (int i = 0; i < x; i++) {
      sums[i] = columnSum(ary, i);
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] ary){
    int [] sums = allRowSums(ary);
    boolean magic = true;
    for (int i = 0; i < sums.length - 1; i++) {
      if (sums[i] != sums[i+1]) {
        return false;
      }
    }
    return magic;
  }


}

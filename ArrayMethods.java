public class ArrayMethods {
  public static int rowSum (int [] [] ary, int x) {
    int sum = 0;
    if (x > ary.length -1 || x < 0) {
      return sum;
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum = sum + ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int [][] ary, int x) {
    int greatest = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > greatest) {
        greatest = ary[i].length;
      }
    }
    if (x > greatest || x < 0) {
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
}

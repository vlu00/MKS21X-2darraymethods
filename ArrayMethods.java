public class ArrayMethods {
  public static int rowSum (int [] [] ary, int x) {
    int sum = 0;
    if (x > ary.length || x < 0) {
      return sum;
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum = sum + ary[x][i];
    }
    return sum;
  }
}

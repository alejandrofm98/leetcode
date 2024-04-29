package Easy;

public class Exercise69 {

  public int mySqrt(int x) {
    long multiplier = 0;
    long result = 0;
    if (x == 0 || x == 1) {
      return x;
    }
    while (multiplier < x) {
      result++;
      multiplier =  result * result;
    }
    if (multiplier > x) {
      result--;
    }

    return (int)result;
  }

  public static void main(String[] args) {
    Exercise69 exercise69 = new Exercise69();
    System.out.println(exercise69.mySqrt(2147483647));
  }
}

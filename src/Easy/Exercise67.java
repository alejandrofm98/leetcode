package Easy;

public class Exercise67 {

  public String addBinary(String a, String b) {
    int sum = 0;
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;
    StringBuilder total = new StringBuilder();
    while (i >= 0 || j >= 0) {
      sum = carry;
      if (i >= 0) {
        sum += Character.getNumericValue(a.charAt(i));
      }
      if (j >= 0) {
        sum += Character.getNumericValue(b.charAt(j));
      }
      if (sum == 0 || sum == 1) {
        carry = 0;
        total.append(sum);
      } else if (sum == 2) {
        carry = 1;
        total.append('0');
      }
      else{
        carry = 1;
        total.append('1');
      }
      i--;
      j--;
    }
    if (carry == 1) {
      total.append('1');
    }

    return total.reverse().toString();
  }

  public static void main(String[] args) {
    Exercise67 exercise67 = new Exercise67();
    System.out.println(exercise67.addBinary("1010", "1011"));
  }
}

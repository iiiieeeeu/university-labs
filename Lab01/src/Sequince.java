public class Sequince {
  public  static void main() {
     double sum = 1;
     int sign = -1;
     long fact = 1;
      System.out.print("S = 1 ");
      for (int i = 1;  i <= 9; i++) {
          fact *= (2 * i) * (2 * i + 1);
          sum += (double) sign * 1.0/  fact;
          String op = (sign == 1) ? "+" : "-";
          System.out.print("" + op + "1 / " + (2*i+1) + "!");
          sign = -sign;

      }
      System.out.println(" = " + sum);
    }
}

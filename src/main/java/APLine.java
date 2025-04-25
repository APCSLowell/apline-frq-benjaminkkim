public class APLine {
  private int a, b, c;
  public APLine(int d, int e, int f) {
    a = d;
    b = e;
    c = f;
  }
  public double getSlope() {
    return (double)(-1 * a)/b;
  }
  public boolean isOnLine(int num1, int num2) {
    if(a * num1 + b * num2 + c == 0) {
      return true;
    }
    return false;
  }
}

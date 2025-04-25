public class APLine {
  //3 member variables
  private int a, b, c;
  //initializes the 3 member variables
  public APLine(int d, int e, int f) {
    a = d;
    b = e;
    c = f;
  }
  //returns the slope which is literally just -a/b
  public double getSlope() {
    return (double)(-1 * a)/b; //cast as a double to return double
  }
  //checks to see if the point is on the line
  public boolean isOnLine(int num1, int num2) {
    if(a * num1 + b * num2 + c == 0) {
      return true;
    }
    return false;
  }
}

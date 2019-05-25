package mn.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String [] args) {
	  hello("world");
	  hello("dear user");

	  double len = 11;
    System.out.println("Площадь квадрата со стороной "+ len + " равна "+ s(len));

    double a = 5;
    double b = 7;
    System.out.println("Площадь прямоугольника со сторонами "+ a + " и " + b + " равна "+ s(a, b));
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }
  public static double s (double a) {
    return a *a;
  }
  public static double s (double a, double b) {
    return a *b;
  }
}
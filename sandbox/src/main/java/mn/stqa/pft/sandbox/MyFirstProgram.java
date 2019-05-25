package mn.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String [] args) {
	  hello("world");
	  hello("dear user");

	  Square sq = new Square(6);
    System.out.println("Площадь квадрата со стороной "+ sq.l + " равна "+ s(sq));

    Rectangle r = new Rectangle(5, 7);

    System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b + " равна "+ s(r));
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }
  public static double s (Square sq) {
    return sq.l * sq.l;
  }
  public static double s (Rectangle r) {
    return r.a * r.b;
  }
}
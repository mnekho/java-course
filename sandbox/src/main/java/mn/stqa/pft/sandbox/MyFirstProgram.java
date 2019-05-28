package mn.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String [] args) {
	  hello("world");
	  hello("dear user");

	  Square sq = new Square(6);
    System.out.println("Площадь квадрата со стороной "+ sq.l + " равна "+ sq.area());

    Rectangle r = new Rectangle(5, 7);

    System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b + " равна "+ r.area());

  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb + "!");
  }
  public static double distance (Point p1, Point p2){
    return Math.sqrt((Math.pow((p1.x - p2.x), 2))+ Math.pow((p1.y - p2.y), 2));
  }
}
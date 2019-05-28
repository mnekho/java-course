package mn.stqa.pft.sandbox;

public class DistanceShow {
  public static void main (String [] args) {
    Point p1 = new Point(-4, -3);
    Point p2 = new Point(0, 0);
    //System.out.println("Расстояние между точками с координатами (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") равно " + distance(p1, p2));
    System.out.println("Расстояние между точками с координатами (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") равно " + p1.distance(p2));
  }
  public static double distance (Point p1, Point p2){
    return Math.sqrt((Math.pow((p1.x - p2.x), 2))+ Math.pow((p1.y - p2.y), 2));
  }

}

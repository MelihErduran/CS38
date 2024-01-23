import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point point_1 = new Point(3, 4);
        Point point_2 = new Point(-3, -4);
        point_1.translate(5,6);
        System.out.println(point_1.toString());
        System.out.println(point_1.distance(point_2));
    }
}

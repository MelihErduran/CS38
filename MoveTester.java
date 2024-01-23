import java.awt.Rectangle;

public class MoveTester {
    public static void main(String[] args) {
        System.out.println("Melih Erduran -- Part 2");
        Rectangle box = new Rectangle(0, 0, 25, 30);

        //Get information about box
        double width = box.getWidth();
        double height = box.getHeight();

        //Calculate perimeter and area
        double perimeter = (width * 2) + (height * 2);
        double area = width * height;

        //Print information about the moved rectangle
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Expected Perimeter is 110");
        System.out.println("Area is " + area);
        System.out.println("Expected Area is 750");
    }
}
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyRectangle using coordinates
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        System.out.println(rect1);

        // Test methods
        System.out.println("Top Left: " + rect1.getTopLeft());
        System.out.println("Bottom Right: " + rect1.getBottomRight());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Create MyRectangle using MyPoint instances
        MyPoint p1 = new MyPoint(2, 5);
        MyPoint p2 = new MyPoint(6, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 2: " + rect2);

        // Modify the rectangle
        rect2.setTopLeft(new MyPoint(3, 6));
        rect2.setBottomRight(new MyPoint(7, 3));
        System.out.println("After modifying rectangle 2:");
        System.out.println(rect2);
        System.out.println("New Area: " + rect2.getArea());
        System.out.println("New Perimeter: " + rect2.getPerimeter());
    }
}

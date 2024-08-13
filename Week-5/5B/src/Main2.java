public class Main2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

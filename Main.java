//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Red",true);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2,3);
        Rectangle rectangle3 = new Rectangle("Yellow",true,4,5);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle("black",true,4);
        Square square1 = new Square();
        Square square2 = new Square(6);
        Square square3 = new Square("purple",true,3);


        System.out.println(shape1.toString());
        System.out.println("================================");
        System.out.println(shape2.toString());
        System.out.println("================================");
        System.out.println(rectangle1.toString());
        System.out.println("================================");
        System.out.println(rectangle2.toString());
        System.out.println("================================");
        System.out.println(rectangle3.toString());
        System.out.println("================================");
        System.out.println(circle1.toString());
        System.out.println("================================");
        System.out.println(circle2.toString());
        System.out.println("================================");
        System.out.println(square1.toString());
        System.out.println("================================");
        System.out.println(square2.toString());
        System.out.println("================================");
        System.out.println(square3.toString());
        System.out.println("================================");


    }
}
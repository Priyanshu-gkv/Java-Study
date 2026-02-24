abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Rectangle : ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Triangle : ");
        return dim1 * dim2 / 2;
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        // Figure f = new Figure(5,6);

        Rectangle r = new Rectangle(5, 6);
        Triangle t = new Triangle(30, 5);

        // Figure figref;

        // figref = r;
        // System.out.println("Rectangle " + figref.area());
        // figref = t;
        // System.out.println("Triangle " + figref.area());
        System.out.println("Rectangle " + r.area());
        System.out.println("Rectangle " + t.area());

    }
}

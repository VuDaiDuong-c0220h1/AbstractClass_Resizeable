public class TestCircle {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(100);
        shapes[1] = new Square(100);
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.resize(50);
                System.out.println(resizeable);
            }
            if (shape instanceof Square){
                Resizeable resizeable = (Square) shape;
                resizeable.resize(50);
                System.out.println(resizeable);
            }
        }
    }
}

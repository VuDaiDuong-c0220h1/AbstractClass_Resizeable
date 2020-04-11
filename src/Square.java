public class Square extends Shape implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * percent/100;
    }

    @Override
    public String toString() {
        return "Rectangle {"
                + "side : " + this.side
                + "} "
                + "Area :" + this.getArea();
    }
}
